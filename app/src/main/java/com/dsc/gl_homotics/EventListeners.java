package com.dsc.gl_homotics;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.dsc.gl_homotics.Model.HObject;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import static android.content.ContentValues.TAG;

class EventListeners {
    private DatabaseReference databaseReference;
    private HObject mObject;
    private Context context;
    private String response;

    EventListeners(Context context) {
        this.context = context;
        this.databaseReference = FirebaseDatabase.getInstance().getReference();
    }


    void gazEventListener() {

        ValueEventListener valueEventListenerGaz = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mObject = dataSnapshot.getValue(HObject.class);
//                Gaz
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        DatabaseReference databaseReferenceGaz = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("0");
        databaseReferenceGaz.addValueEventListener(valueEventListenerGaz);
    }

    void dcMotorEventListener() {
        ValueEventListener valueEventListenerDCM = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                HObject mObject = dataSnapshot.getValue(HObject.class);
                String state = mObject.getState();
                if(state.equals("On") || state.equals("on")){
                    state = "on";
                }else{
                    state = "off";
                }
                String url = "http://192.168.0.101:8000/api/motor/"+state;

                JsonObject json = new JsonObject();
                json.addProperty("token", "28aa93c3251a4dd696a060cd50ece759");
                json.addProperty("id", "2");

                Ion.with(context)
                        .load(url)
                        .setJsonObjectBody(json)
                        .asJsonObject()
                        .setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {
                                Log.d(TAG, "onCompleted: "+ result);
                            }
                        });
//                DC Motor
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        DatabaseReference databaseReferenceDCM = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("1");
        databaseReferenceDCM.addValueEventListener(valueEventListenerDCM);
    }

    void ledEventListener() {
        ValueEventListener valueEventListenerLED = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                HObject mObject = dataSnapshot.getValue(HObject.class);
//                Light Control
                String state = mObject.getState();
                if(state.equals("On") || state.equals("on")){
                    state = "on";
                }else{
                    state = "off";
                }
                String url = "http://192.168.0.101:8000/api/light/"+state;

                JsonObject json = new JsonObject();
                json.addProperty("token", "28aa93c3251a4dd696a060cd50ece759");
                json.addProperty("id", "1");

                Ion.with(context)
                        .load(url)
                        .setJsonObjectBody(json)
                        .asJsonObject()
                        .setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {
                                Log.d(TAG, "onCompleted: "+ result);
                            }
                        });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        DatabaseReference databaseReferenceLED = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("2");
        databaseReferenceLED.addValueEventListener(valueEventListenerLED);
    }

    void tmpEventListener() {
        ValueEventListener valueEventListenerTMP = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                HObject mObject = dataSnapshot.getValue(HObject.class);
//                Temperature Sensor
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        DatabaseReference databaseReferenceTmp = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("3");
        databaseReferenceTmp.addValueEventListener(valueEventListenerTMP);
    }

    void rgbEventListener() {
        ValueEventListener valueEventListenerRGB = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                HObject mObject = dataSnapshot.getValue(HObject.class);
//                RGB Color
                String state = mObject.getState();
                if(state.equals("") || state.equals("Off") || state.equals("off")){
                    state = "000000";
                }
                String url = "http://192.168.0.101:8000/api/rgbControl";

                JsonObject json = new JsonObject();
                json.addProperty("token", "28aa93c3251a4dd696a060cd50ece759");
                json.addProperty("color", ""+state);

                Ion.with(context)
                        .load(url)
                        .setJsonObjectBody(json)
                        .asJsonObject()
                        .setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {
                                Log.d(TAG, "onCompleted: "+ result);
                            }
                        });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };

        DatabaseReference databaseReferenceRGB = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("4");
        databaseReferenceRGB.addValueEventListener(valueEventListenerRGB);
    }

    void usmEventListener() {
        ValueEventListener valueEventListenerUSM = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                HObject mObject = dataSnapshot.getValue(HObject.class);
//                USM Sensor
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };

        DatabaseReference databaseReferenceUSM = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("5");
        databaseReferenceUSM.addValueEventListener(valueEventListenerUSM);
    }

    void relEventListener() {
        ValueEventListener valueEventListenerRel = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                HObject mObject = dataSnapshot.getValue(HObject.class);
//                Relay Module
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };

        DatabaseReference databaseReferenceRel = databaseReference.child("raspberries").child("0").child("rooms").child("0")
                .child("hObjects").child("6");
        databaseReferenceRel.addValueEventListener(valueEventListenerRel);
    }

}
