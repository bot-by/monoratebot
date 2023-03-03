/*
 * Copyright 2023 Witalij Berdinskich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.bot_by.monorate.aws_lambda;

import com.amazonaws.services.lambda.runtime.Context;
import org.slf4j.MDC;
import uk.bot_by.cloud_bot.aws_lambda.BotHandler;
import uk.bot_by.monorate.telegram_bot.RateUpdateFactory;

public class MonoRateHandler extends BotHandler {

  public MonoRateHandler() {
    super(new RateUpdateFactory());
  }

  @Override
  protected void setContext(Context context) {
    MDC.put("@aws-request-id@", context.getAwsRequestId());
  }

}
