package org.zoomeye.api.search;

import android.text.TextUtils;

/**
 * Created by Donglua on 16/4/21.
 */
public enum HostSearchFilters {
  /*
    app    - application\software\product and etc.)	app: ProFTD
    version    - versions	version:2.1
    device    - device type	device:router
    os    - operating system	os:windows
    service    - service	service:http
    ip    - ip address	ip:192.168.1.1
    cidr    - CIDR Address prefix	cidr:192.168.1.1/24
    hostname    - hostname	hostname:google.com
    port    - port number	port:80
    city    - city name	city:beijing
    country    - country name	country:china
    asn    - asn number	asn:AS8978
   */

  APP("app"),
  VERSION("version"),
  DEVICE("device"),
  OS("os"),
  SERVICE("service"),
  IP("ip"),
  CIDR("cidr"),
  HOSTNAME("hostname"),
  PORT("port"),
  CITY("city"),
  COUNTRY("country"),
  ASN("asn");

  private final String value;

  HostSearchFilters(String value) {
    this.value = value;
  }

  @Override public String toString() {
    return TextUtils.isEmpty(value) ? "" : (value + ":");
  }
}
