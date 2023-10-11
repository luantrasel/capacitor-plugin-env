package com.capacitor.plugin.env;

import android.util.Log;

public class CapacitorEnv {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
