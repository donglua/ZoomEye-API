package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/21.
 */
public class City {

  /*
     "city": {
          "geoname_id": 2671392,
          "names": {
            "zh-CN": "斯特兰奈斯",
            "en": "Strangnas"
          }
        }
   */

  private String geoname_id;
  private Names names;

  public String getGeoNameId() {
    return geoname_id;
  }

  public Names getNames() {
    return names;
  }

}
