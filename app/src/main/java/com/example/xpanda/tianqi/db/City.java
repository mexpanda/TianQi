package com.example.xpanda.tianqi.db;



import org.litepal.crud.DataSupport;

/**
 * Created by xpanda on 17-12-6.
 */

public class City extends DataSupport{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private String cityName;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    private int cityCode;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private int provinceId;
}
