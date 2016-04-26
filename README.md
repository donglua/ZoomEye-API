# ZoomEye-API
ZoomEye Android API  

## Gradle

```gradle
compile 'org.droiders:zoomeye-api:0.0.4'
```
## Usage
* Create <code>ZoomEyeApiService</code> object
```Java
Retrofit retrofit = new Retrofit.Builder() //
      .client(client) //
      .baseUrl("http://api.zoomeye.org") //
      .addConverterFactory(GsonConverterFactory.create(gson)) //
      .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) //
      .build();
ZoomEyeApiService api = retrofit.create(ZoomEyeApiService.class);
```
* Request and error handle
```java
ErrorBodyHandler errorHandler = new ErrorBodyHandler(retrofit);

api.login(new LoginRequest(email, password))
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(tokenResponse -> {
      if (tokenResponse.isSuccessful()) {
        String accessToken = tokenResponse.body().toString();
        Log.d("ZoomEye", "accessToken = " + accessToken);
        ...
      } else {
        ErrorBody errorBody = errorHandler.parseError(tokenResponse.errorBody());
        Log.d("ZoomEye", errorBody.getMessage());
        ...
      }
    });
```
