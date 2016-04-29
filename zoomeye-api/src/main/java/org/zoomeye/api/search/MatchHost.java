package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/21.
 */
public class MatchHost {

  private GeoInfo geoinfo;
  private String ip;
  private PortInfo portinfo;
  private String timestamp; // 2016-04-19T16:34:28

  public GeoInfo getGeoinfo() {
    return geoinfo;
  }

  public String getIp() {
    return ip;
  }

  public PortInfo getPortInfo() {
    return portinfo;
  }

  public String getTimestamp() {
    return timestamp;
  }
}
