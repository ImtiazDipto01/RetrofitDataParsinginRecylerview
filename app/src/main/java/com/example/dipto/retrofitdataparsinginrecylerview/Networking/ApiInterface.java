package com.example.dipto.retrofitdataparsinginrecylerview.Networking;

import com.example.dipto.retrofitdataparsinginrecylerview.model.RecylerNetworkModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Dipto on 8/14/2017.
 */

public interface ApiInterface {

    @POST("retrofitpractice.php")
    Call<List<RecylerNetworkModel>> getDetailList();
}
