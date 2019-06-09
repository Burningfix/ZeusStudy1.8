package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleTaskActivity3 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleTaskActivity3");
        TextView tv = new TextView(this);
        tv.setText("SingleTaskActivity3");
        setContentView(tv);

        Log.d("sanbo.page", "SingleTaskActivity3");
    }
}
