package com.aeonve;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单测试
 *
 * @author aeonve
 * @version 2020年05月24日 21:40
 * @since 1.0.0
 */
public class SimpleTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(SimpleTest.class);

  @Test
  public void demo() {
    LOGGER.info("hi, {}! this is a test demo.", "you man");
  }

}
