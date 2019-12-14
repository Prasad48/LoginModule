package com.bhavaniprasad.loginmodule.remote;
import com.bhavaniprasad.loginmodule.model.RESobj;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {
    @POST("userDetails/{username}/{password}")
    Call<RESobj> login(@Path("username") String username, @Path("password") String password);
}
