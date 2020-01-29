package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lqd17 on 2020/1/28.
 */

public class Basic {

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
