package jianqiang.com.hostapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SingleInstanceActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SingleInstanceActivity1");
        TextView tv = new TextView(this);
        tv.setText("SingleInstanceActivity1");
        setContentView(tv);

        Log.d("sanbo.page", "SingleInstanceActivity1");
    }
}
