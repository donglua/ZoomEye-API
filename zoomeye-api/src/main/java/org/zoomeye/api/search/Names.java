package org.zoomeye.api.search;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Donglua on 16/4/21.
 */
public class Names {
  @SerializedName("zh-CN") String zhCN;
  @SerializedName("en") String en;

  public String getZhCN() {
    return zhCN;
  }

  public String getEn() {
    return en;
  }

  @Override public String toString() {
    return zhCN;
  }
}
