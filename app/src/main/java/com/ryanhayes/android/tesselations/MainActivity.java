package com.ryanhayes.android.tesselations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ryanhayes.android.tesselations.SafeLogging.SafeLog;

public class MainActivity extends AppCompatActivity {

    private SafeLog logger_ = new SafeLog() {
        @Override
        protected String getTag() {
            return "MainActivity";
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        logger_.debug("onCreate called");


        super.onCreate(savedInstanceState);
        setContentView(new CanvasView(this));
    }


}
