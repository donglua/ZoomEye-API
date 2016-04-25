package org.zoomeye.api.auth;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Donglua on 16/4/20.
 */
public class AccessToken implements Parcelable {

  private String access_token;

  @Override public String toString() {
    return access_token;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.access_token);
  }

  public AccessToken() {
  }

  protected AccessToken(Parcel in) {
    this.access_token = in.readString();
  }

  public static final Parcelable.Creator<AccessToken> CREATOR =
      new Parcelable.Creator<AccessToken>() {
        @Override public AccessToken createFromParcel(Parcel source) {
          return new AccessToken(source);
        }

        @Override public AccessToken[] newArray(int size) {
          return new AccessToken[size];
        }
      };
}
