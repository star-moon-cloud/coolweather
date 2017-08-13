package com.example.s.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by s on 2017/8/13.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
