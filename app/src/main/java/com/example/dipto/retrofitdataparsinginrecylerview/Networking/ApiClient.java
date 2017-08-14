package com.example.dipto.retrofitdataparsinginrecylerview.Networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dipto on 8/14/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "http://programmerimtiaz.000webhostapp.com/" ;

    public static Retrofit retrofit = null ;

    public static Retrofit getApiClient(){

        if(retrofit == null){

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build() ;
        }
        return retrofit ;
    }
}
