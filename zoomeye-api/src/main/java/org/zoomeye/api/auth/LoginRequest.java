package org.zoomeye.api.auth;

import android.os.Parcel;
import android.os.Parcelable;

public class LoginRequest implements Parcelable {
  final String username;
  final String password;

  public LoginRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.username);
    dest.writeString(this.password);
  }

  protected LoginRequest(Parcel in) {
    this.username = in.readString();
    this.password = in.readString();
  }

  public static final Parcelable.Creator<LoginRequest> CREATOR =
      new Parcelable.Creator<LoginRequest>() {
        @Override public LoginRequest createFromParcel(Parcel source) {
          return new LoginRequest(source);
        }

        @Override public LoginRequest[] newArray(int size) {
          return new LoginRequest[size];
        }
      };

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
