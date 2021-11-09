package com.forbitbd.sultantracker.api;

public interface ApiClient {

    /* @POST("/api/users")
    Call<User> register(@Header("Authorization") String token,@Body User data);
    @GET("/api/users/{email}")
    Call<User> getUser(@Header("Authorization") String token, @Path("email") String email);
    @PUT("/api/users/{user_id}")
    @Multipart
    Call<User> updateProfile(@Header("Authorization") String token,@Path("user_id") String user_id,
                             @Part MultipartBody.Part file,
                             @PartMap() Map<String, RequestBody> partMap);
    @GET("/api/users/query/{query}")
    Call<List<User>> getQueryUsers(@Header("Authorization") String token,@Path("query") String query);
    @GET("/api/fences/{id}")
    Call<Fence> getFence(@Header("Authorization") String token,@Path("id") String deviceId);
    @DELETE("/api/fences/{id}")
    Call<Void> deleteFence(@Header("Authorization") String token,@Path("id") String deviceId);
    @POST("/api/fences")
    Call<Fence> applyFence(@Header("Authorization") String token,@Body Fence fence);
    @POST("/api/commands")
    Call<Command> saveCommand(@Header("Authorization") String token,@Body Command command);
    @PUT("/api/devices/{imei}")
    @Multipart
    Call<Device> updateDevice(@Header("Authorization") String token,@Path("imei") String imei,
                              @Part MultipartBody.Part file,
                              @PartMap() Map<String, RequestBody> partMap);
    @GET("/api/devices/{uid}")
    Call<List<Device>> getUserDevices (@Path("uid") String uid);
    @POST("/api/shareddevices")
    Call<Void> sharedDevice(@Header("Authorization") String token,@Body ShareDeviceRequest request);
    @GET("/api/shareddevices/sharedusers/{device_id}")
    Call<List<SharedUser>> getSharedUser(@Header("Authorization") String token,@Path("device_id") String deviceID);
    @GET("/api/shareddevices/shareddevices/{uid}")
    Call<List<SharedDevice>> getSharedDevices(@Header("Authorization") String token,@Path("uid") String uid);
    @DELETE("/api/shareddevices/{id}")
    Call<Void> deleteSharedUser(@Header("Authorization") String token,@Path("id") String sharedUserID);
    @GET("/api/alerts/{uid}")
    Call<List<Alert>> getAllAlerts(@Header("Authorization") String token,@Path("uid") String uid);
    @DELETE("/api/alerts/{id}")
    Call<Void> deleteAlert(@Header("Authorization") String token,@Path("id") String id);
    @GET("/api/notifications/{email}")
    Call<List<Alert>> getAllNotifications(@Path("email") String email);
    @DELETE("/api/notifications/{id}")
    Call<Void> deleteNotification(@Path("id") String id);
    @POST("/api/locations/daily")
    Call<List<Location>> getDailyLocations(@Header("Authorization") String token,@Body RBody data);
    @POST("/api/locations/monthly")
    Call<List<MonthlyData>> getMonthlyData(@Header("Authorization") String token,@Body MonthlyRequestBody monthlyRequestBody);
    @POST("/api/locations/monthly/pdf")
    Call<ResponseBody> getMonthlyPdf (@Header("Authorization") String token,@Body MonthlyFileRequest monthlyFileRequest);
    @GET("/api/transactions/{uid}")
    Call<List<Transaction>> getTransactions(@Path("uid") String uid);
    @DELETE("/api/transactions/{id}")
    Call<Void> deleteTransaction(@Path("id") String id);
    @POST("/api/transactions")
    Call<Transaction> saveTransaction(@Body Transaction transaction);
    @PUT("/api/transactions/{id}")
    Call<Transaction> updateTransaction(@Path("id") String id,@Body Transaction transaction);
    @GET("/api/heads/{uid}")
    Call<List<Head>> getHeads(@Path("uid") String uid);
    @POST("/api/heads")
    Call<Head> saveHead(@Body Head head);*/



//    @POST("/api/api/users")
//    Call<User> register(@Header("Authorization") String token,@Body User data);
//
//    @GET("/api/api/users/{email}")
//    Call<User> getUser(@Header("Authorization") String token, @Path("email") String email);
//
//    @PUT("/api/api/users/{user_id}")
//    @Multipart
//    Call<User> updateProfile(@Header("Authorization") String token,@Path("user_id") String user_id,
//                             @Part MultipartBody.Part file,
//                             @PartMap() Map<String, RequestBody> partMap);
//
//    @GET("/api/api/users/query/{query}")
//    Call<List<User>> getQueryUsers(@Header("Authorization") String token,@Path("query") String query);
//
//    @GET("/api/api/fences/{id}")
//    Call<Fence> getFence(@Header("Authorization") String token,@Path("id") String deviceId);
//
//    @DELETE("/api/api/fences/{id}")
//    Call<Void> deleteFence(@Header("Authorization") String token,@Path("id") String deviceId);
//
//    @POST("/api/api/fences")
//    Call<Fence> applyFence(@Header("Authorization") String token,@Body Fence fence);
//
//
//    @POST("/api/api/commands")
//    Call<Command> saveCommand(@Header("Authorization") String token,@Body Command command);
//
//
//    @PUT("/api/api/devices/{imei}")
//    @Multipart
//    Call<Device> updateDevice(@Header("Authorization") String token,@Path("imei") String imei,
//                              @Part MultipartBody.Part file,
//                              @PartMap() Map<String, RequestBody> partMap);
//
//
//    @GET("/api/api/devices/{uid}")
//    Call<List<Device>> getUserDevices (@Path("uid") String uid);
//
//    @GET("/api/api/users/{id}/devices")
//    Call<List<Device>> getFirebaseUserDevices (@Path("id") String id);
//
//    @POST("/api/api/shareddevices")
//    Call<Void> sharedDevice(@Header("Authorization") String token,@Body ShareDeviceRequest request);
//
//    @GET("/api/api/shareddevices/sharedusers/{device_id}")
//    Call<List<SharedUser>> getSharedUser(@Header("Authorization") String token,@Path("device_id") String deviceID);
//
//    @GET("/api/api/shareddevices/shareddevices/{uid}")
//    Call<List<SharedDevice>> getSharedDevices(@Header("Authorization") String token,@Path("uid") String uid);
//
//    @DELETE("/api/api/shareddevices/{id}")
//    Call<Void> deleteSharedUser(@Header("Authorization") String token,@Path("id") String sharedUserID);
//
//
//
//
//    @GET("/api/api/alerts/{uid}")
//    Call<List<Alert>> getAllAlerts(@Header("Authorization") String token,@Path("uid") String uid);
//
//    @DELETE("/api/api/alerts/{id}")
//    Call<Void> deleteAlert(@Header("Authorization") String token,@Path("id") String id);
//
//    @GET("/api/api/notifications/{email}")
//    Call<List<Alert>> getAllNotifications(@Path("email") String email);
//
//    @DELETE("/api/api/notifications/{id}")
//    Call<Void> deleteNotification(@Path("id") String id);
//
//
//    @POST("/api/api/locations/daily")
//    Call<List<Location>> getDailyLocations(@Header("Authorization") String token,@Body RBody data);
//
//    @POST("/api/api/locations/monthly")
//    Call<List<MonthlyData>> getMonthlyData(@Header("Authorization") String token,@Body MonthlyRequestBody monthlyRequestBody);
//
//    @POST("/api/api/locations/monthly/pdf")
//    Call<ResponseBody> getMonthlyPdf (@Header("Authorization") String token,@Body MonthlyFileRequest monthlyFileRequest);
//
//
//    @GET("/api/api/transactions/{uid}")
//    Call<List<Transaction>> getTransactions(@Path("uid") String uid);
//
//    @DELETE("/api/api/transactions/{id}")
//    Call<Void> deleteTransaction(@Path("id") String id);
//
//    @POST("/api/api/transactions")
//    Call<Transaction> saveTransaction(@Body Transaction transaction);
//
//    @PUT("/api/api/transactions/{id}")
//    Call<Transaction> updateTransaction(@Path("id") String id,@Body Transaction transaction);
//
//    @GET("/api/api/heads/{uid}")
//    Call<List<Head>> getHeads(@Path("uid") String uid);
//
//    @POST("/api/api/heads")
//    Call<Head> saveHead(@Body Head head);
//
//    @GET("/api/api/restrictboundary/{device_id}")
//    Call<Boundary> getBoundary(@Path("device_id") String device_id);
//
//    @POST("/api/api/restrictboundary")
//    Call<Boundary> saveRestrictBoundary(@Body Boundary boundary);
}
