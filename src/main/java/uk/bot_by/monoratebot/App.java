/*
 * Copyright 2023 Witalij Berdinskich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.bot_by.monoratebot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App implements Runnable {

	protected static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages");

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		App app = new App();

		Stream.of(args).findFirst().ifPresentOrElse(app::logHello, app);
	}

	@Override
	public void run() {
		logger.trace("Hello world!");
	}

	void logHello(String name) {
		logger.debug("{} {}! /by {}", MESSAGES.getString("hello"), name, MESSAGES.getString("artifactId"));
	}

}
