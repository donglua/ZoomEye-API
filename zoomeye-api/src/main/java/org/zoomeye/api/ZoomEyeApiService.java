package org.zoomeye.api;

import org.zoomeye.api.auth.AccessToken;
import org.zoomeye.api.auth.LoginRequest;
import org.zoomeye.api.info.ResourcesInfo;
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

  @GET("/host/search") Observable<Response<SearchResult>> search(@Query(value = "query", encoded = true) String query);
  @GET("/host/search") Observable<Response<SearchResult>> search(@Query(value = "query", encoded = true) String query,
                                                                 @Query("page")  int page);
  @GET("/host/search") Observable<Response<SearchResult>> search(@Query(value = "query", encoded = true) String query,
                                                                 @Query("page")  int page,
                                                                 @Query("facets") String facets);

  @GET("/host/search") Observable<Response<SearchResult>> search(@Header("Authorization") String token,
                                                                 @Query(value = "query", encoded = true) String query);
  @GET("/host/search") Observable<Response<SearchResult>> search(@Header("Authorization") String token,
                                                                 @Query(value = "query", encoded = true) String query,
                                                                 @Query("page") int page,
                                                                 @Query("facets") String facets);

  @GET("/resources-info") Observable<Response<ResourcesInfo>> getResourcesInfo();
  @GET("/resources-info") Observable<Response<ResourcesInfo>> getResourcesInfo(@Header("Authorization") String token);
}