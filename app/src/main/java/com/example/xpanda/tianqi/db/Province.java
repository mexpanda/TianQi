package com.example.xpanda.tianqi.db;


import android.drm.DrmSupportInfo;

import org.litepal.crud.DataSupport;

/**
 * Created by xpanda on 17-12-6.
 */

public class Province extends DataSupport{


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private String provinceName;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int provinceCode;

}
