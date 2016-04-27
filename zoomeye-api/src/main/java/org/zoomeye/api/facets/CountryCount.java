package org.zoomeye.api.facets;

import java.util.List;
import org.zoomeye.api.search.City;

/**
 * Created by Donglua on 16/4/27.
 */
public class CountryCount extends FacetCount {

  private String country;
  private List<City> cities;

  @Override public String getName() {
    return country;
  }
}
