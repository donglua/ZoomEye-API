package org.zoomeye.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import okhttp3.HttpUrl;
import org.zoomeye.api.ErrorBody;
import org.zoomeye.api.ErrorBodyHandler;
import org.zoomeye.api.ZoomEyeApiService;
import org.zoomeye.api.auth.AccessToken;
import org.zoomeye.api.auth.LoginRequest;
import org.zoomeye.api.search.HostSearchResult;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
  AccessToken accessToken;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Timber.plant(new Timber.DebugTree());

    final Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(HttpUrl.parse("http://api.zoomeye.org"))
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
        .build();
    final ZoomEyeApiService service = retrofit.create(ZoomEyeApiService.class);
    service.login(new LoginRequest("YOUR EMAIL", "YOUR PASSWORD"))
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(new Action1<Response<AccessToken>>() {
          @Override public void call(Response<AccessToken> response) {
            if (response.isSuccessful()) {
              accessToken = response.body();
              Timber.d("accessToken = %s", accessToken);
              Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();
            } else {
              ErrorBody errorBody = ErrorBodyHandler.parseError(retrofit, response.errorBody());
              Toast.makeText(MainActivity.this, errorBody.getMessage(), Toast.LENGTH_LONG).show();
            }
          }
        });

    View view = findViewById(R.id.button);
    assert view != null;
    view.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        service.searchHost("JWT " + accessToken.toString(), "port:21", 1,
            "app,device,service,os,port,country,city")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Action1<Response<HostSearchResult>>() {
              @Override public void call(Response<HostSearchResult> listResponse) {
                if (listResponse.isSuccessful()) {
                  Timber.d("response : Total = " + listResponse.body().getTotal());
                } else {
                  ErrorBody errorBody = ErrorBodyHandler.parseError(retrofit, listResponse.errorBody());
                  Toast.makeText(MainActivity.this, errorBody.getMessage(), Toast.LENGTH_LONG).show();
                }
              }
            }, new Action1<Throwable>() {
              @Override public void call(Throwable throwable) {
                Timber.e(throwable, "");
              }
            });
      }
    });

  }
}
