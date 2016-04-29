package org.zoomeye.api.search;

import java.util.List;

/**
 * Created by Donglua on 16/4/30.
 */
public class MatchWeb {

  private GeoInfo geoinfo;
  private List<String> language;
  private List<String> ip;
  private List<Db> db;
  private Plugin plugin;
  private String check_time; // 2016-2-23T14:58:41.979769
  private String site;
  private List<WebApp> webapp;
  private List<String> domains;
  private String headers;
  private String description;
  private String title;

  public GeoInfo getGeoinfo() {
    return geoinfo;
  }

  public List<String> getLanguage() {
    return language;
  }

  public List<String> getIp() {
    return ip;
  }

  public List<Db> getDb() {
    return db;
  }

  public Plugin getPlugin() {
    return plugin;
  }

  public String getCheckTime() {
    return check_time;
  }

  public String getSite() {
    return site;
  }

  public List<WebApp> getWebapp() {
    return webapp;
  }

  public List<String> getDomains() {
    return domains;
  }

  public String getHeaders() {
    return headers;
  }

  public String getDescription() {
    return description;
  }

  public String getTitle() {
    return title;
  }
}
