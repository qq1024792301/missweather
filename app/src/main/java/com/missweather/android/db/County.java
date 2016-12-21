package com.missweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 超 on 2016/12/21.
 */

public class County extends DataSupport {
    private int id;
    //记录当前县的名字
    private String countyName;
    //记录当前县所对应的天气Id
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
