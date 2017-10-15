package com.example.iminhyeok.travewel;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by iminhyeok on 2017. 10. 15..
 */

public class NewActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.activity_new);
    }


}
