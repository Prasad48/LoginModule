package com.bhavaniprasad.loginmodule;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserInterface {
    @GET("login/{username}/{password}")
    Call login(@Path("username") String username, @Path("password") String password);
}
