package org.zoomeye.api.facets;

/**
 * Created by Donglua on 16/4/27.
 */
public class ServiceCount extends FacetCount {

  private String service;

  @Override public String getName() {
    return service;
  }
}
