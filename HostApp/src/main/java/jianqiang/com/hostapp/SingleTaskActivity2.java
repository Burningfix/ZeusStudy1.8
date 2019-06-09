package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleTaskActivity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleTaskActivity2");
        TextView tv = new TextView(this);
        tv.setText("SingleTaskActivity2");
        setContentView(tv);

        Log.d("sanbo.page", "SingleTaskActivity2");
    }
}
