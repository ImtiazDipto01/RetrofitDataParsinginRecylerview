package com.example.dipto.retrofitdataparsinginrecylerview.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Dipto on 8/14/2017.
 */

public class RecylerNetworkModel {


    @SerializedName("server_response")
    private ArrayList<ServerResponse> server_response ;

    public ArrayList<ServerResponse> getServer_response() {
        return server_response;
    }

    public void setServer_response(ArrayList<ServerResponse> server_response) {
        this.server_response = server_response;
    }


}



