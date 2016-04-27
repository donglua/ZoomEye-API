# ZoomEye-API
[ ![Download](https://api.bintray.com/packages/donglua/maven/zoomeye-api/images/download.svg) ](https://bintray.com/donglua/maven/zoomeye-api/_latestVersion)

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

api.login(new LoginRequest(username, password))
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
## License
```
Copyright 2016 Huang Donglu

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
