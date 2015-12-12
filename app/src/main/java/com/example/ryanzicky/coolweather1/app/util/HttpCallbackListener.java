package com.example.ryanzicky.coolweather1.app.util;

/**
 * Created by ryanzicky on 2015/12/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
