package com.xoxo.plugin.applistplugin;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

@CapacitorPlugin(name = "AppListPlugin")
public class AppListPluginPlugin extends Plugin {

    @PluginMethod
    public void getInstalledApps(PluginCall call) {
        try {
            PackageManager pm = getContext().getPackageManager();
            List<PackageInfo> packages = pm.getInstalledPackages(0);

            JSONArray appsArray = new JSONArray();

            for (PackageInfo packageInfo : packages) {
                if ((packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                    JSObject appInfo = new JSObject();
                    appInfo.put("packageName", packageInfo.packageName);
                    appInfo.put("appName", pm.getApplicationLabel(packageInfo.applicationInfo).toString());
                    appInfo.put("versionName", packageInfo.versionName);
                    appInfo.put("versionCode", packageInfo.versionCode);
                    appsArray.put(appInfo);
                }
            }

            JSObject result = new JSObject();
            result.put("apps", appsArray);
            call.resolve(result);
        } catch (Exception e) {
            call.reject("Error getting installed apps", e);
        }
    }

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", value);
        call.resolve(ret);
    }
}
