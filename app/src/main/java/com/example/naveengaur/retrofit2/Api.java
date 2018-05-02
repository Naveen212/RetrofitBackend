package com.example.naveengaur.retrofit2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by naveengaur on 2/5/18.
 */

public interface Api {
    String BASE_URL="https://hixel-server-prototype.herokuapp.com/";
    @GET("companydata?")
    Call<companyData> getExamples(@Query("ticker") String ticker,@Query("years") int years);
}
