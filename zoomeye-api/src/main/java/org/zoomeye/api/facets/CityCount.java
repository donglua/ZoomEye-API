package org.zoomeye.api.facets;

/**
 * Created by Donglua on 16/4/27.
 */
public class CityCount extends FacetCount {

  private String city;

  @Override public String getName() {
    return city;
  }
}
