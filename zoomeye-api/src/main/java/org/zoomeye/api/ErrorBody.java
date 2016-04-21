package org.zoomeye.api;

public class ErrorBody {
/*
  "url": "https://www.zoomeye.org/api/doc#authenticate",
  "message": "Invalid JWT header, May miss JWT prefix",
  "error": "unauthorized"
 */
  private String url;
  private String message;
  private String error;

  public String getUrl() {
    return url;
  }

  public String getMessage() {
    return message;
  }

  public String getError() {
    return error;
  }

  public ErrorBody() {
  }

  public ErrorBody(String url, String message, String error) {
    this.url = url;
    this.message = message;
    this.error = error;
  }
}
