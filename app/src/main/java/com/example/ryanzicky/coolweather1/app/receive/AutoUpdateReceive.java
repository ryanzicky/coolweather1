package com.example.ryanzicky.coolweather1.app.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ryanzicky on 2015/12/12.
 */
public class AutoUpdateReceive extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateReceive.class);
        context.startService(i);
    }
}
