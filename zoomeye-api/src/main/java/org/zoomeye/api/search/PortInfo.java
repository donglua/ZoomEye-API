package org.zoomeye.api.search;

/**
 * Created by Donglua on 16/4/21.
 */
public class PortInfo {
  /*
      "portinfo": {
        "product": "",
        "hostname": "",
        "service": "sip",
        "os": "",
        "extrainfo": "SIP end point; Status: 404 Not Found",
        "version": "",
        "device": "",
        "banner": "\t\t\tSIP/2.0 404 Not Found\r\nVia: SIP/2.0/UDP nm;branch=foo;received=255.255.255.255;rport=0\r\nFrom: <sip:nm@nm>;tag=root\r\nTo: <sip:nm2@nm2>;tag=466747091\r\nCall-ID: 50000\r\nCSeq: 42 OPTIONS\r\nContent-Length: 0\r\n\r\n\n",
        "port": 5060
      },
   */

  private String product;
  private String hostname;
  private String service;
  private String os;
  private String extrainfo;
  private String version;
  private String device;
  private String banner;
  private String port;

  public String getProduct() {
    return product;
  }

  public String getHostName() {
    return hostname;
  }

  public String getService() {
    return service;
  }

  public String getOs() {
    return os;
  }

  public String getExtraInfo() {
    return extrainfo;
  }

  public String getVersion() {
    return version;
  }

  public String getDevice() {
    return device;
  }

  public String getBanner() {
    return banner;
  }

  public String getPort() {
    return port;
  }
}
