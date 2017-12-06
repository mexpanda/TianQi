package com.example.xpanda.tianqi.util;

import android.text.TextUtils;

import com.example.xpanda.tianqi.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by xpanda on 17-12-6.
 */

public class Utility {


    //
    /**public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceName(provinceObject.getInt("id"));
                    province.save();

                } catch(JSONException e){
                    e.printStackTrace();
                }
    }
    return false;
    }**/


        }