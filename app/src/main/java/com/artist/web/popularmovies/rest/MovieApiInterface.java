package com.artist.web.popularmovies.rest;


import com.artist.web.popularmovies.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by User on 19-Feb-18.
 */

public interface MovieApiInterface {



      @GET("movie/{preference}")
      Call<MovieResponse> getMovies(@Path("preference") String preference,
                                           @Query("api_key") String apiKey);

// --Commented out by Inspection START (25-Feb-18 10:44 PM):
//      @GET("movie/{id}")
//      Call<MovieResponse> getMovieDetails(@Path("id") int id,
//                                          @Query("api_key") String apiKey);
// --Commented out by Inspection STOP (25-Feb-18 10:44 PM)

}
