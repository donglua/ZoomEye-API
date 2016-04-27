package org.zoomeye.api.facets;

import java.util.List;

/**
 * Created by Donglua on 16/4/27.
 */
public class AppCount extends FacetCount {

  private String app;
  private List<VersionCount> versions;

  @Override public String getName() {
    return app;
  }
}
