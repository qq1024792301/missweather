package com.missweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 超 on 2016/12/21.
 */

public class City extends DataSupport {
    private int id;
    //记录市的名字
    private String cityName;
    //记录市的代号
    private int cityCode;
    //记录当前市所属省的Id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
