package uk.bot_by.cloud_bot.aws_lambda;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.bot_by.cloud_bot.telegram_bot.Update;
import uk.bot_by.cloud_bot.telegram_bot.UpdateFactory;

@ExtendWith(MockitoExtension.class)
@Tag("slow")
class BotHandlerSlowTest {

  @Mock
  private Context context;
  @Mock
  private APIGatewayProxyRequestEvent requestEvent;
  @Mock
  private Update update;
  @Mock
  private UpdateFactory updateFactory;

  private BotHandler handler;

  @BeforeEach
  void setUp() {
    handler = spy(new BotHandler(updateFactory) {

      @Override
      protected void setContext(Context context) {
        // dp nothing
      }

    });
  }

  @DisplayName("Happy path")
  @Test
  void happyPath() throws Exception {
    // given
    when(requestEvent.getBody()).thenReturn("test body");
    when(updateFactory.parseUpdate(anyString())).thenReturn(update);
    when(update.call()).thenReturn("{\"test\":\"pass\"}");

    // when
    var responseEvent = handler.handleRequest(requestEvent, context);

    // then
    verify(handler).setContext(context);

    assertAll("Response", () -> assertEquals("{\"test\":\"pass\"}", responseEvent.getBody()),
        () -> assertEquals("application/json", responseEvent.getHeaders().get("Content-Type")),
        () -> assertEquals(200, responseEvent.getStatusCode()));
  }

}
