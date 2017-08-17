package com.example.dipto.retrofitdataparsinginrecylerview.Networking;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dipto on 8/14/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "http://programmerimtiaz.000webhostapp.com/retrofit/" ;

    public static Retrofit retrofit = null ;

    public static Retrofit getApiClient(){

        if(retrofit == null){

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            OkHttpClient client = new OkHttpClient();

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).client(client).
                    addConverterFactory(GsonConverterFactory.create(gson)).build() ;
        }
        return retrofit ;
    }
}
