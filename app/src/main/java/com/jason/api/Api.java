package com.jason.api;


import com.jason.library.net.XApi;

public class Api {
    public static final String API_BASE_URL = "http://gank.io/api/";

    private static ApiService gankService;

    public static ApiService getGankService() {
        if (gankService == null) {
            synchronized (Api.class) {
                if (gankService == null) {
                    gankService = XApi.getInstance().getRetrofit(true).create(ApiService.class);
                }
            }
        }
        return gankService;
    }
}
