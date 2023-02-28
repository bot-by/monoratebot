package uk.bot_by.monoratebot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * Unit test for simple App.
 */
@Tag("fast")
public class AppFastTest {


/*	void testApp() {
		// when
		App.main(new String[]{});

		// then
		verify(appender).doAppend(captorLoggingEvent.capture());

		final List<LoggingEvent> loggingEvents = captorLoggingEvent.getAllValues();

		assertAll("Write to the log a trace message",
				() -> assertEquals(1, loggingEvents.size()),
				() -> assertEquals("Hello world!", loggingEvents.get(0).getFormattedMessage()),
				() -> assertEquals(Level.TRACE, loggingEvents.get(0).getLevel()));
	}

	@Test
	void testAppWithName() {
		// when
		App.main(new String[]{"John"});

		// then
		verify(appender).doAppend(captorLoggingEvent.capture());

		final List<LoggingEvent> loggingEvents = captorLoggingEvent.getAllValues();

		assertAll("Write to the log a debug message",
				() -> assertEquals(1, loggingEvents.size()),
				() -> assertEquals("Hello John! /by monoratebot", loggingEvents.get(0).getFormattedMessage()),
				() -> assertEquals(Level.DEBUG, loggingEvents.get(0).getLevel()));
	}

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);

		Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

		logger.addAppender(appender);
	}*/

}
