package com.dsc.gl_homotics;

import android.support.annotation.NonNull;

import com.dsc.gl_homotics.Model.HObject;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

class EventListeners {
    private DatabaseReference databaseReference;
    private HObject mObject;

    EventListeners() {
        this.databaseReference = FirebaseDatabase.getInstance().getReference();
    }


    void gazEventListener() {
        ValueEventListener valueEventListenerGaz = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mObject = dataSnapshot.getValue(HObject.class);
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
