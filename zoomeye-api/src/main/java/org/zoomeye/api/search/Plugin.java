package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/30.
 */
public class Plugin {

  /**
     "version": "1.6.5.1",
     "based": "WordPress",
     "name": "mesocolumn",
     "chinese": "mesocolumn"
   */

  private String version;
  private String based;
  private String name;
  private String chinese;

  public String getVersion() {
    return version;
  }

  public String getBased() {
    return based;
  }

  public String getName() {
    return name;
  }

  public String getChinese() {
    return chinese;
  }
}
