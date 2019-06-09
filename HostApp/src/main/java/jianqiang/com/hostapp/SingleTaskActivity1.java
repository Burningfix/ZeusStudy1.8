package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleTaskActivity1 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleTaskActivity1");
        TextView tv = new TextView(this);
        tv.setText("SingleTaskActivity1");
        setContentView(tv);

        Log.d("sanbo.page", "SingleTaskActivity1");
    }
}
