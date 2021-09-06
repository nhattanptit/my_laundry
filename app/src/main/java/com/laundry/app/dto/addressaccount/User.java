package com.laundry.app.dto.addressaccount;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    public int id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("username")
    @Expose
    public String username;

    @SerializedName("phoneNumber")
    @Expose
    public String phoneNumber;

    @SerializedName("email")
    @Expose
    public String email;
}
