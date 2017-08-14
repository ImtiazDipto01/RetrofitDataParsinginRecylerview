package com.example.dipto.retrofitdataparsinginrecylerview.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dipto on 8/14/2017.
 */

public class RecylerNetworkModel {

    @SerializedName("name")
    String name ;

    @SerializedName("email")
    String email ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
