package org.zoomeye.api.info;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Donglua on 16/4/27.
 */
public class Resources {

  @SerializedName("host-search") private int hostSearch;
  @SerializedName("web-search")  private int webSearch;

  public int getWebSearch() {
    return webSearch;
  }

  public int getHostSearch() {
    return hostSearch;
  }
}
