package com.perfectweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Boss on 2017/8/20.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
