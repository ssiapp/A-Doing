package com.maximintegrated.ibuttonreader;

import android.annotation.SuppressLint;
import android.util.Log;


public class L {
    @SuppressLint("LongLogTag")
    public static void d(Object o) {
        Log.d(">==< USB Controller >==<", String.valueOf(o));
    }

    @SuppressLint("LongLogTag")
    public static void e(Object o) {
        Log.e(">==< USB Controller >==<", String.valueOf(o));
    }
}
