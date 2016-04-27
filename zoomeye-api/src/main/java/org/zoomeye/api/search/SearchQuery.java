package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/21.
 */
public class SearchQuery {

  public static final String APP = "app";
  public static final String VERSION = "version";
  public static final String DEVICE = "device";
  public static final String OS = "os";
  public static final String SERVICE = "service";
  public static final String IP = "ip";
  public static final String CIDR = "cidr";
  public static final String HOSTNAME = "hostname";
  public static final String PORT = "port";
  public static final String CITY = "city";
  public static final String COUNTRY = "country";
  public static final String ASN = "asn";

  private String query;
  private String filter;

  public SearchQuery() {
  }

  public SearchQuery(String query) {
    this.query = query;
  }

  public SearchQuery(String filter, String query) {
    this.filter = filter;
    this.query = query;
  }

  @Override public String toString() {
    if (filter == null) {
      return query;
    }
    return filter + ":" + query;
  }
}
