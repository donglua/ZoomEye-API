package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/30.
 */
public class Db {

  /*
    "version": null,
    "name": "MySQL",
    "chinese": "MySQL"
   */

  private String version;
  private String name;
  private String chinese;

  public String getName() {
    return name;
  }

  public String getVersion() {
    return version;
  }

  public String getChinese() {
    return chinese;
  }
}
