package com.dsc.gl_homotics;

import android.content.Context;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class UltraThread extends Thread {
    private Context mContext;
    private DatabaseReference databaseReference;

    public UltraThread(Context mContext) {
        databaseReference = FirebaseDatabase.getInstance().getReference();
        this.mContext = mContext;
    }

    @Override
    public void run() {

        while (true){

            String url = "http://192.168.0.101:8000/api/UltraDetection";

            JsonObject json = new JsonObject();
            json.addProperty("token", "28aa93c3251a4dd696a060cd50ece759");
            json.addProperty("id", 2);


            Ion.with(mContext)
                    .load(url)
                    .setJsonObjectBody(json)
                    .asJsonObject()
                    .setCallback(new FutureCallback<JsonObject>() {
                        @Override
                        public void onCompleted(Exception e, JsonObject result) {
                            DatabaseReference temp =databaseReference.child("raspberries").child("0").child("rooms").child("0").child("hObjects").child("5");
                            Map<String,Object> temperatureValue = new HashMap<String,Object>();
                            String ultra_value = result.get("Response").toString();
                            temperatureValue.put("state", ultra_value);
                            temp.updateChildren(temperatureValue);

                            Log.d(TAG, "onCompleted: "+ result);
                        }
                    });
            try {
                sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
