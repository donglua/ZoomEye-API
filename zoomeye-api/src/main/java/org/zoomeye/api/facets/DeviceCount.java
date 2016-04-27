package org.zoomeye.api.facets;

/**
 * Created by Donglua on 16/4/27.
 */
public class DeviceCount extends FacetCount {

  private String device;

  @Override public String getName() {
    return device;
  }
}
