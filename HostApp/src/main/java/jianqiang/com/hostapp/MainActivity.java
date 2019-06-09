package jianqiang.com.hostapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.jianqiang.mypluginlibrary.PluginManager;
import com.hostapp.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService1InPlugin1(View view) {
        try {
            Intent intent = new Intent();
            String serviceName = PluginManager.plugins.get(0).packageInfo.packageName + ".TestService1";
            intent.setClass(this, getClassLoader().loadClass(serviceName));
            startService(intent);
        } catch (Exception e) {
            Log.i("sanbo", Log.getStackTraceString(e));
        }


    }

    public void startActivityInPlugin1(View view) {
        try {
            Intent intent = new Intent();
            String activityName = PluginManager.plugins.get(0).packageInfo.packageName + ".TestActivity1";
            intent.setComponent(new ComponentName(PluginManager.plugins.get(0).packageInfo.packageName, activityName));

            startActivity(intent);

        } catch (Exception e) {
            Log.i("sanbo", Log.getStackTraceString(e));
        }
    }
}