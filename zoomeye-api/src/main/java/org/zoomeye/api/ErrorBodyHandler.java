package org.zoomeye.api;

import java.io.IOException;
import java.lang.annotation.Annotation;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class ErrorBodyHandler {

  private final Retrofit retrofit;
  public ErrorBodyHandler(Retrofit retrofit) {
    this.retrofit = retrofit;
  }

  public ErrorBody parseError(ResponseBody responseBody) {
    return ErrorBodyHandler.parseError(retrofit, responseBody);
  }

  public static ErrorBody parseError(Retrofit retrofit, ResponseBody responseBody) {
    Converter<ResponseBody, ErrorBody>
        converter = retrofit.responseBodyConverter(ErrorBody.class, new Annotation[0]);
    try {
      return converter.convert(responseBody);
    } catch (IOException e) {
      e.printStackTrace();
      return new ErrorBody(null, e.getMessage(), e.getMessage());
    }
  }

}
