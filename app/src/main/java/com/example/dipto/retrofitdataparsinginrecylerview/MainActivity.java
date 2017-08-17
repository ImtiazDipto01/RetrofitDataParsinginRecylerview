package com.example.dipto.retrofitdataparsinginrecylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dipto.retrofitdataparsinginrecylerview.Networking.ApiClient;
import com.example.dipto.retrofitdataparsinginrecylerview.Networking.ApiInterface;
import com.example.dipto.retrofitdataparsinginrecylerview.model.RecylerNetworkModel;
import com.example.dipto.retrofitdataparsinginrecylerview.model.ServerResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    RecylerAdapter recylerAdapter ;
    LinearLayoutManager layoutManager ;
    ApiInterface apiInterface ;
    List<ServerResponse> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>() ;
        recyclerView = (RecyclerView) findViewById(R.id.recylerview);
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class) ;

        Call<RecylerNetworkModel> call = apiInterface.getDetailList() ;

        call.enqueue(new Callback<RecylerNetworkModel>() {
            @Override
            public void onResponse(Call<RecylerNetworkModel> call, Response<RecylerNetworkModel> response) {

                Log.d("+++TAG+++", "asche") ;
                list = response.body().getServer_response() ;
                recylerAdapter = new RecylerAdapter(getApplicationContext(), list) ;
                recyclerView.setAdapter(recylerAdapter);
            }

            @Override
            public void onFailure(Call<RecylerNetworkModel> call, Throwable t) {
                Log.d("+++TAG+++", "ashe nai") ;
            }
        });

    }
}
