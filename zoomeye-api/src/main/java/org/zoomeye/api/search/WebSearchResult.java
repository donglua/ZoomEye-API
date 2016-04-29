package org.zoomeye.api.search;

import java.util.List;
import org.zoomeye.api.facets.Facets;

/**
 * Created by Donglua on 16/4/29.
 */
public class WebSearchResult {
  private List<MatchHost> matches;
  private Facets facets;
  private int total;

  public List<MatchHost> getMatches() {
    return matches;
  }

  public int getTotal() {
    return total;
  }

  public Facets getFacets() {
    return facets;
  }
}
