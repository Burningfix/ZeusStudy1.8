package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleInstanceActivity3 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleInstanceActivity3");
        TextView tv = new TextView(this);
        tv.setText("SingleInstanceActivity3");
        setContentView(tv);

        Log.d("sanbo.page", "SingleInstanceActivity3");
    }
}
