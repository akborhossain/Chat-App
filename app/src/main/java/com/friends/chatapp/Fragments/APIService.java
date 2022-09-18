package com.friends.chatapp.Fragments;

import com.friends.chatapp.Notifications.MyResponse;
import com.friends.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAXpb1HV8:APA91bG5vqHsbsUaqi6VwgGiaD7ZKZrBqGZtSzvoDyBaxrX0uz6ST1Smju7ePpiKY79qcdH_EptbUyBi0PuSV6YzLoeS9rU9hzG8PXwjyzXPgPs_bM1IGJ0RsCNrY2f2qAIBLEOkxl10\t\n"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
