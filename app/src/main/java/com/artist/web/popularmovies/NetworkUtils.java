package com.artist.web.popularmovies;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by User on 25-Feb-18.
 */

public class NetworkUtils {

    public final static String API_KEY = "";
    public static final String BASE_URL = "https://api.themoviedb.org/3/";


    public static boolean checkConnectivity(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return (networkInfo!= null && networkInfo.isConnected()) ;
    }
}
