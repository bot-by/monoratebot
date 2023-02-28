package uk.bot_by.monoratebot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
@Tag("slow")
public class AppSlowTest {

/*  @Test
  void run() throws IOException, InterruptedException {
    // given
    Process testProcess = Runtime.getRuntime()
        .exec("mvn exec:java -Dexec.mainClass=uk.bot_by.monoratebot.App");

    // when
    testProcess.waitFor();

    // then
    String standardOutput = new BufferedReader(
        new InputStreamReader(testProcess.getInputStream())).lines()
        .collect(Collectors.joining("\n"));

    assertThat(standardOutput,
        containsString("[TRACE] NO REQUEST_ID uk.bot_by.monoratebot.App - Hello world!"));
  }

  @Test
  void runWithName() throws IOException, InterruptedException {
    // given
    Process testProcess = Runtime.getRuntime()
        .exec("mvn exec:java -Dexec.mainClass=uk.bot_by.monoratebot.App -Dexec.args=Jack");

    // when
    testProcess.waitFor();

    // then
    String standardOutput = new BufferedReader(
        new InputStreamReader(testProcess.getInputStream())).lines()
        .collect(Collectors.joining("\n"));

    assertThat(standardOutput, containsString(
        "[DEBUG] NO REQUEST_ID uk.bot_by.monoratebot.App - Hello Jack! /by monoratebot"));
  }*/

}
