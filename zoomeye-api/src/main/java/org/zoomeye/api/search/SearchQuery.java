package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/21.
 */
public class SearchQuery {

  private String query;
  private HostSearchFilters hostSearchFilter;

  public SearchQuery() {
  }

  public SearchQuery(String query) {
    this.query = query;
  }

  public SearchQuery(String query, HostSearchFilters hostSearchFilter) {
    this.query = query;
    this.hostSearchFilter = hostSearchFilter;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public void setHostSearchFilters(HostSearchFilters hostSearchFilters) {
    this.hostSearchFilter = hostSearchFilters;
  }

  @Override public String toString() {
    if (hostSearchFilter == null) {
      return query;
    }
    return hostSearchFilter.toString() + query;
  }
}
