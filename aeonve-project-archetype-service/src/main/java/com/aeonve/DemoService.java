package com.aeonve;

/**
 * demo service
 *
 * @author aeonve
 * @version 2020年05月18日 19:43
 * @since 1.0.0
 */
public class DemoService {

  /**
   * hello to guest.
   *
   * @param name guest name
   * @return greet to guest statement.
   */
  public String hello(String name) {
    return "hello, sir: " + name + " ! Nice to server for you.";
  }

}
