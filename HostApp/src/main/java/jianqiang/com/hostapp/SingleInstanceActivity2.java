package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleInstanceActivity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleInstanceActivity2");
        TextView tv = new TextView(this);
        tv.setText("SingleInstanceActivity2");
        setContentView(tv);

        Log.d("sanbo.page", "SingleInstanceActivity2");
    }
}
