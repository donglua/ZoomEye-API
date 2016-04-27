package org.zoomeye.api.facets;

/**
 * Created by Donglua on 16/4/27.
 */
public class VersionCount extends FacetCount {
  private String version;

  @Override public String getName() {
    return version;
  }
}
