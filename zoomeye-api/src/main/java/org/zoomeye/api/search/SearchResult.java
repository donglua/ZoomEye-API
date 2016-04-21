package org.zoomeye.api.search;

import java.util.List;

/**
 * Created by Donglua on 16/4/21.
 */
public class SearchResult {
  private List<Match> matches;
  private int total;

  public List<Match> getMatches() {
    return matches;
  }

  public int getTotal() {
    return total;
  }
}
