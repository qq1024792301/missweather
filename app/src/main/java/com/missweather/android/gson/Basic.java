package com.missweather.android.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 超 on 2016/12/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}