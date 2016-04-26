package org.zoomeye.api.info;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Donglua on 16/4/27.
 */
public class ResourcesInfo {

  /*
    {"plan": "developer", "resources": {"host-search": 9, "web-search": 40}}
   */

  @SerializedName("plan")
  private String plan;

  @SerializedName("resources")
  private Resources resources;

  public String getPlan() {
    return plan;
  }

  public Resources getResources() {
    return resources;
  }
}
