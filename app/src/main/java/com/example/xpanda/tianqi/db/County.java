package com.example.xpanda.tianqi.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xpanda on 17-12-6.
 */

public class County extends DataSupport {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    private int cityId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    private String countyName;

    public String getWestherId() {
        return westherId;
    }

    public void setWestherId(String westherId) {
        this.westherId = westherId;
    }

    private String westherId;

}
