package com.aeonve;

/**
 * demo 示例： greet服务
 *
 * @author aeonve
 * @version 2020年5月17日 15:32
 * @since 1.0.0
 */
public interface GreetService {

  /**
   * hello to guest.
   *
   * @param name guest name
   * @return greet to guest statement.
   */
  default String hello(String name) {
    return "hello, sir: " + name + " ! Nice to server for you.";
  }

}
