package com.ryanhayes.android.tesselations;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

import com.ryanhayes.android.tesselations.SafeLogging.SafeLog;

public class Artist {

    private SafeLog logger_ = new SafeLog() {
        @Override
        protected String getTag() {
            return "Artist";
        }
    };

    private Canvas canvas_;
    private Paint paint_;

    public Artist () {
        logger_.debug("Constructor called");

        canvas_ = new Canvas();
        paint_ = new Paint();

    }

    public void drawPath(Path path) {
        logger_.debug("drawPath called");

        canvas_.drawPath(path, paint_);
    }
}
