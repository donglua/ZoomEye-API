package org.zoomeye.api.search;

public class GeoInfo {

  private City city;
  private Country country;
  private String isp;
  private Continent continent;
  private Subdivisions subdivisions;
  private Location location;

  public City getCity() {
    return city;
  }

  public Country getCountry() {
    return country;
  }

  public String getIsp() {
    return isp;
  }

  public Continent getContinent() {
    return continent;
  }

  public Subdivisions getSubdivisions() {
    return subdivisions;
  }

  public Location getLocation() {
    return location;
  }
}
