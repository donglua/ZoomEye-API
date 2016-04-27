package org.zoomeye.api.facets;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Facets {

  @SerializedName("country") private List<CountryCount> country;
  @SerializedName("service") private List<ServiceCount> service;
  @SerializedName("city")    private List<CityCount> city;
  @SerializedName("os")      private List<OsCount> os;
  @SerializedName("app")     private List<AppCount> app;
  @SerializedName("device")  private List<DeviceCount> device;
  @SerializedName("port")    private List<PortCount> port;
  @SerializedName("version") private List<VersionCount> version;

  public List<ServiceCount> getService() {
    return service;
  }

  public List<CityCount> getCity() {
    return city;
  }

  public List<CountryCount> getCountry() {
    return country;
  }

  public List<OsCount> getOs() {
    return os;
  }

  public List<AppCount> getApp() {
    return app;
  }

  public List<DeviceCount> getDevice() {
    return device;
  }

  public List<PortCount> getPort() {
    return port;
  }

  public List<VersionCount> getVersion() {
    return version;
  }
}
