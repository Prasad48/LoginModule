package com.bhavaniprasad.loginmodule.remote;

public class ApiUtils {

    public static final String BASE_URL = "https://ctisconnect.com:8181/CTIS/";

    public static UserService getUserService(){
        return Retrofitclient.getClient(BASE_URL).create(UserService.class);
    }
}
