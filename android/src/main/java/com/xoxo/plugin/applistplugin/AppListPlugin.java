package com.xoxo.plugin.applistplugin;

import android.util.Log;

public class AppListPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
