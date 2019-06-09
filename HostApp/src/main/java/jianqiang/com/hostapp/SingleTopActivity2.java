package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleTopActivity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleTopActivity2");
        TextView tv = new TextView(this);
        tv.setText("SingleTopActivity2");
        setContentView(tv);

        Log.d("sanbo.page", "SingleTopActivity2");
    }
}
