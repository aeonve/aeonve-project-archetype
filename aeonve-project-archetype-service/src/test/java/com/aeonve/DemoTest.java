package com.aeonve;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * demo test.
 *
 * @author aeonve
 * @date 2020年05月20日 23:36
 * @since 1.0.0
 */
public class DemoTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(DemoTest.class);

  @Test
  public void log() {
    LOGGER.info("this is a log test.");
  }

}
