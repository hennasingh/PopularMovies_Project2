package com.artist.web.popularmovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 21-Feb-18.
 */

public class MovieResponse {

    @SerializedName("page")
    private int mPage;
    @SerializedName("results")
    private List<Movies> results;
    @SerializedName("total_results")
    private int mTotalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return mPage;
    }

    public void setPage(int page) {
        mPage = page;
    }

    public List<Movies> getResults() {
        return results;
    }

    public void setResults(List<Movies> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return mTotalResults;
    }

    public void setTotalResults(int totalResults) {
        mTotalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
