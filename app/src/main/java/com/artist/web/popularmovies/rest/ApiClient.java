package com.artist.web.popularmovies.rest;

import android.content.Context;

import com.artist.web.popularmovies.NetworkUtils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 21-Feb-18.
 */

public class ApiClient {

    // --Commented out by Inspection (25-Feb-18 10:44 PM):private static final String TAG = ApiClient.class.getSimpleName();

    private static Retrofit sRetrofit = null;

    public static Retrofit getClient(Context context) throws SecurityException{

        if(!NetworkUtils.checkConnectivity(context)){
            throw new SecurityException("No Internet Connection");
        }
        if(sRetrofit == null) {
            sRetrofit = new Retrofit.Builder()
                        .baseUrl(NetworkUtils.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
        }
        return sRetrofit;
    }
}
