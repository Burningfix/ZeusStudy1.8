package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleTopActivity1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleTopActivity1");
        TextView tv = new TextView(this);
        tv.setText("SingleTopActivity1");
        setContentView(tv);

        Log.d("sanbo.page", "SingleTopActivity1");
    }
}
