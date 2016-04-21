package org.zoomeye.api.auth;

/**
 * Created by Donglua on 16/4/20.
 */
public class AccessToken {

  private String access_token;

  @Override public String toString() {
    return "JWT " + access_token;
  }
}
