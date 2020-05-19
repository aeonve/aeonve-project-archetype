package com.aeonve;

import java.io.Serializable;

/**
 * demo mojo结构
 *
 * @author aeonve
 * @version 2020年05月18日 19:41
 * @since 1.0.0
 */
public class DemoMojo implements Serializable {

  private static final long serialVersionUID = -7024350953629338246L;
  
  private String id;
  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
