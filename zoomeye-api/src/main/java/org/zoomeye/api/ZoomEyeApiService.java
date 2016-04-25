package org.zoomeye.api;

import org.zoomeye.api.auth.AccessToken;
import org.zoomeye.api.auth.LoginRequest;
import org.zoomeye.api.search.SearchQuery;
import org.zoomeye.api.search.SearchResult;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


public interface ZoomEyeApiService {

  @POST("/user/login") Observable<Response<AccessToken>> login(@Body LoginRequest body);

  @GET("/host/search") Observable<Response<SearchResult>> search(@Query("query") SearchQuery query);
  @GET("/host/search") Observable<Response<SearchResult>> search(@Query("query") SearchQuery query, @Header("Authorization") String token);


}