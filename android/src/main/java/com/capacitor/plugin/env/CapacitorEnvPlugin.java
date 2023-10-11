package com.capacitor.plugin.env;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONObject;
import java.util.Iterator;

@CapacitorPlugin(name = "CapacitorEnv")
public class CapacitorEnvPlugin extends Plugin {

    private CapacitorEnv implementation = new CapacitorEnv();

    // @PluginMethod
    // public void echo(PluginCall call) {
    //     String value = call.getString("value");

    //     JSObject ret = new JSObject();
    //     ret.put("value", implementation.echo(value));
    //     call.resolve(ret);
    // }

    @PluginMethod
    public void get(PluginCall call) {
        try {
            call.success(getConfig().getConfigJSON());
        } catch (Exception e) {
            call.error("Error reading CapacitorEnv values: " + e.getMessage());
        }
    }
}
