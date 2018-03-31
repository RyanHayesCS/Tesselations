package com.ryanhayes.android.tesselations.SafeLogging;

import android.util.Log;

import com.ryanhayes.android.tesselations.BuildConfig;

public abstract class SafeLog {

    protected abstract String getTag();

    public void error (String msg) {
        error(getTag(), msg);
    }
    public static void error (String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg);
        }
    }

    public void warning (String msg) {
        warning(getTag(), msg);
    }
    public static void warning (String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.w(tag, msg);
        }
    }

    public void info (String msg) {
        info(getTag(), msg);
    }
    public static void info (String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, msg);
        }
    }

    public void debug (String msg) {
        debug(getTag(), msg);
    }
    public static void debug (String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg);
        }
    }

    public void verbose (String msg) {
        verbose(getTag(), msg);
    }
    public static void verbose (String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, msg);
        }
    }
}
