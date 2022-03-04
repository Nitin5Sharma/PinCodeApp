package com.example.pincodeapp;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface myapi {
   @GET("pincode/{pin}")
   Call<List<Model>> getmodel(@Path("pin")String pin);
}
