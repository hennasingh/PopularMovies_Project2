package com.artist.web.popularmovies.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.artist.web.popularmovies.R;
import com.artist.web.popularmovies.model.Movies;
import com.squareup.picasso.Picasso;

public class DetailMovieActivity extends AppCompatActivity {


    private TextView mMovieHeading;
    private TextView mMovieRating;
    private TextView mMovieDate;
    private TextView mOverview;
    private ImageView mImagePoster;
    private ImageView mImageHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        Bundle extras = getIntent().getExtras();
        mMovieHeading = findViewById(R.id.textViewMovieHeading);
        mMovieRating = findViewById(R.id.textViewRating);
        mMovieDate = findViewById(R.id.textViewDate);
        mOverview = findViewById(R.id.textViewOverview);
        mImagePoster = findViewById(R.id.imageViewPoster);
        mImageHeader = findViewById(R.id.imageViewHeader);

        if(extras!=null){
            int position = extras.getInt("position");
            displayMovieDetails(position);
        }
    }

    private void displayMovieDetails(int clickedPosition){
        Movies mMovie = MainActivity.movieList.get(clickedPosition);

        mMovieHeading.setText(mMovie.getOriginalTitle());
        mMovieRating.setText(String.valueOf(mMovie.getVoteAverage()));
        mMovieDate.setText(mMovie.getReleaseDate());
        mOverview.setText(mMovie.getOverView());

        Picasso.with(this)
                .load(mMovie.getBackdropPath())
                .into(mImageHeader);

        Picasso.with(this)
                .load(mMovie.getPosterPath())
                .into(mImagePoster);
    }
}
