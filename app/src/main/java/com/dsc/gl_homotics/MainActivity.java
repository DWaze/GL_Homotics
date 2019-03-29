package com.dsc.gl_homotics;

import android.app.Activity;
import android.os.Bundle;

import com.dsc.gl_homotics.Model.AccountUser;
import com.dsc.gl_homotics.Model.Action;
import com.dsc.gl_homotics.Model.ActionHistory;
import com.dsc.gl_homotics.Model.HObject;
import com.dsc.gl_homotics.Model.Home;
import com.dsc.gl_homotics.Model.Raspberry;
import com.dsc.gl_homotics.Model.Room;
import com.dsc.gl_homotics.Model.StateHistory;
import com.dsc.gl_homotics.Model.User;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Skeleton of an Android Things activity.
 * <p>
 * Android Things peripheral APIs are accessible through the class
 * PeripheralManagerService. For example, the snippet below will open a GPIO pin and
 * set it to HIGH:
 *
 * <pre>{@code
 * PeripheralManagerService service = new PeripheralManagerService();
 * mLedGpio = service.openGpio("BCM6");
 * mLedGpio.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW);
 * mLedGpio.setValue(true);
 * }</pre>
 * <p>
 * For more complex peripherals, look for an existing user-space driver, or implement one if none
 * is available.
 *
 * @see <a href="https://github.com/androidthings/contrib-drivers#readme">https://github.com/androidthings/contrib-drivers#readme</a>
 */
public class MainActivity extends Activity {

    List<Action> mActions = new ArrayList<>();

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TempThread tmp;
        GazThread gazThread;
        UltraThread ultraThread;
        databaseReference = FirebaseDatabase.getInstance().getReference();
        int a = 1;

        if (a == 0) {


//            FireBase Database definition Homotics

//            GAZ SENSOR

            ActionHistory actionHistoryG1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Gaz Information");
            ActionHistory actionHistoryG2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Gaz Information");
            ActionHistory actionHistoryG3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Gaz Information");

            List<ActionHistory> actionHistoriesGaz = new ArrayList<>();
            actionHistoriesGaz.add(actionHistoryG1);
            actionHistoriesGaz.add(actionHistoryG2);
            actionHistoriesGaz.add(actionHistoryG3);

            Action actionGaz = new Action("Get Gaz Information", "Get the latest gas information from the sensor", "get_status"
                    , actionHistoriesGaz);
            List<Action> actionsGaz = new ArrayList<>();
            actionsGaz.add(actionGaz);

            StateHistory stateHistoryGaz = new StateHistory("222", "Detecting Gas Values", System.currentTimeMillis());
            StateHistory stateHistoryGaz1 = new StateHistory("230", "Detecting Gas Values", System.currentTimeMillis());
            StateHistory stateHistoryGaz2 = new StateHistory("200", "Detecting Gas Values", System.currentTimeMillis());
            StateHistory stateHistoryGaz3 = new StateHistory("240", "Detecting Gas Values", System.currentTimeMillis());
            StateHistory stateHistoryGaz4 = new StateHistory("210", "Detecting Gas Values", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesGaz = new ArrayList<>();
            stateHistoriesGaz.add(stateHistoryGaz);
            stateHistoriesGaz.add(stateHistoryGaz1);
            stateHistoriesGaz.add(stateHistoryGaz2);
            stateHistoriesGaz.add(stateHistoryGaz3);
            stateHistoriesGaz.add(stateHistoryGaz4);

            HObject gazSensor = new HObject("Gaz Sensor", "MQ-2", "5cm", "Detecting", "Sensor"
                    , 2, actionsGaz, stateHistoriesGaz);


//            LED Control

            ActionHistory actionHistoryLED1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Turning the light On");
            ActionHistory actionHistoryLED2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Turning the light Off");
            ActionHistory actionHistoryLED3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Turning the light On");

            List<ActionHistory> actionHistoriesLED = new ArrayList<>();
            actionHistoriesLED.add(actionHistoryLED1);
            actionHistoriesLED.add(actionHistoryLED3);

            Action actionLED1 = new Action("Turning the light On", "Turn the light On", "light_on"
                    , actionHistoriesLED);

            Action actionLED2 = new Action("Turning the light Off", "Turn the light Off", "light_off"
                    , actionHistoriesLED);


            List<Action> actionsLED = new ArrayList<>();
            actionsLED.add(actionLED1);
            actionsLED.add(actionLED2);

            StateHistory stateHistoryLED = new StateHistory("On", "Light Turned On", System.currentTimeMillis());
            StateHistory stateHistoryLED1 = new StateHistory("Off", "Light Turned Off", System.currentTimeMillis());
            StateHistory stateHistoryLED2 = new StateHistory("On", "Light Turned On", System.currentTimeMillis());
            StateHistory stateHistoryLED3 = new StateHistory("Off", "Light Turned Off", System.currentTimeMillis());
            StateHistory stateHistoryLED4 = new StateHistory("On", "Light Turned On", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesLED = new ArrayList<>();
            stateHistoriesLED.add(stateHistoryLED);
            stateHistoriesLED.add(stateHistoryLED1);
            stateHistoriesLED.add(stateHistoryLED2);
            stateHistoriesLED.add(stateHistoryLED3);
            stateHistoriesLED.add(stateHistoryLED4);


            HObject ledControl = new HObject("Light Control", "led", "5cm", "On", "Actuator", 2
                    , actionsLED, stateHistoriesLED);

//            Relay Control

            ActionHistory actionHistoryRel1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Turning the Object On");
            ActionHistory actionHistoryRel2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Turning the Object Off");
            ActionHistory actionHistoryRel3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Turning the Object On");

            List<ActionHistory> actionHistoriesRel = new ArrayList<>();
            actionHistoriesRel.add(actionHistoryRel1);
            actionHistoriesRel.add(actionHistoryRel2);
            actionHistoriesRel.add(actionHistoryRel3);

            Action actionRel1 = new Action("Turning the Object On", "Turn the Object On", "object_on"
                    , actionHistoriesRel);

            Action actionRel2 = new Action("Turning the Object Off", "Turn the Object Off", "objectt_off"
                    , actionHistoriesLED);


            List<Action> actionsRel = new ArrayList<>();
            actionsRel.add(actionRel1);
            actionsRel.add(actionRel2);

            StateHistory stateHistoryRel = new StateHistory("On", "Object Turned On", System.currentTimeMillis());
            StateHistory stateHistoryRel1 = new StateHistory("Off", "Object Turned Off", System.currentTimeMillis());
            StateHistory stateHistoryRel2 = new StateHistory("On", "Object Turned On", System.currentTimeMillis());
            StateHistory stateHistoryRel3 = new StateHistory("Off", "Object Turned Off", System.currentTimeMillis());
            StateHistory stateHistoryRel4 = new StateHistory("On", "Object Turned On", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesRel = new ArrayList<>();
            stateHistoriesRel.add(stateHistoryRel);
            stateHistoriesRel.add(stateHistoryRel1);
            stateHistoriesRel.add(stateHistoryRel2);
            stateHistoriesRel.add(stateHistoryRel3);
            stateHistoriesRel.add(stateHistoryRel4);


            HObject RelControl = new HObject("Object Control", "relay_module", "5cm", "On", "Actuator", 2
                    , actionsRel, stateHistoriesRel);


//            RGB Control

            ActionHistory actionHistoryRGB1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Changing Lamp Color");
            ActionHistory actionHistoryRGB2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Lamp Off");
            ActionHistory actionHistoryRGB3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Changing Lamp Color");

            List<ActionHistory> actionHistoriesRGB = new ArrayList<>();
            actionHistoriesRGB.add(actionHistoryRGB1);
            actionHistoriesRGB.add(actionHistoryRGB2);
            actionHistoriesRGB.add(actionHistoryRGB3);

            Action actionRGB1 = new Action("Changing the lamp color", "Change the color of the lamp with rgb colors", "ch_color"
                    , actionHistoriesRGB);

            Action actionRGB2 = new Action("Turning the lamp Off", "Turn the lamp Off", "lamp_off"
                    , actionHistoriesRGB);


            List<Action> actionsRGB = new ArrayList<>();
            actionsRGB.add(actionRGB1);
            actionsRGB.add(actionRGB2);

            StateHistory stateHistoryRGB = new StateHistory("On", "#001156", System.currentTimeMillis());
            StateHistory stateHistoryRGB1 = new StateHistory("Off", "#000000", System.currentTimeMillis());
            StateHistory stateHistoryRGB2 = new StateHistory("On", "#A0B156", System.currentTimeMillis());
            StateHistory stateHistoryRGB3 = new StateHistory("On", "#AB1Z56", System.currentTimeMillis());
            StateHistory stateHistoryRGB4 = new StateHistory("On", "#CX1T56", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesRGB = new ArrayList<>();
            stateHistoriesRGB.add(stateHistoryRGB);
            stateHistoriesRGB.add(stateHistoryRGB1);
            stateHistoriesRGB.add(stateHistoryRGB2);
            stateHistoriesRGB.add(stateHistoryRGB3);
            stateHistoriesRGB.add(stateHistoryRGB4);


            HObject RGBControl = new HObject("RGB Control", "RGB_LED", "5cm", "On", "Actuator", 2
                    , actionsRGB, stateHistoriesRGB);

//            DC Motor

            ActionHistory actionHistoryWIN1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Opening Shelf");
            ActionHistory actionHistoryWIN2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Closing Shelf");
            ActionHistory actionHistoryWIN3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Opening Shelf");

            List<ActionHistory> actionHistoriesWIN = new ArrayList<>();
            actionHistoriesWIN.add(actionHistoryWIN1);
            actionHistoriesWIN.add(actionHistoryWIN2);
            actionHistoriesWIN.add(actionHistoryWIN3);

            Action actionWIN1 = new Action("Opening Shelf", "Opening the shelves", "shelve_op"
                    , actionHistoriesWIN);

            Action actionWIN2 = new Action("Closing Shelf", "Closing the Shelves", "shelve_cl"
                    , actionHistoriesWIN);


            List<Action> actionsWIN = new ArrayList<>();
            actionsWIN.add(actionWIN1);
            actionsWIN.add(actionWIN2);

            StateHistory stateHistoryWIN = new StateHistory("Shelve Open", "motor_on", System.currentTimeMillis());
            StateHistory stateHistoryWIN1 = new StateHistory("Shelve Closed", "motor_off", System.currentTimeMillis());
            StateHistory stateHistoryWIN2 = new StateHistory("Shelve Open", "motor_on", System.currentTimeMillis());
            StateHistory stateHistoryWIN3 = new StateHistory("Shelve Closed", "motor_off", System.currentTimeMillis());
            StateHistory stateHistoryWIN4 = new StateHistory("Shelve Open", "motor_on", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesWIN = new ArrayList<>();
            stateHistoriesWIN.add(stateHistoryWIN);
            stateHistoriesWIN.add(stateHistoryWIN1);
            stateHistoriesWIN.add(stateHistoryWIN2);
            stateHistoriesWIN.add(stateHistoryWIN3);
            stateHistoriesWIN.add(stateHistoryWIN4);

            HObject dcMotor = new HObject("DC Motor", "dc_motor", "5cm", "On", "Actuator", 3
                    , actionsWIN, stateHistoriesWIN);

//            Temperature Sensor

            ActionHistory actionHistoryTMP1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Temperature Information");
            ActionHistory actionHistoryTMP2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Temperature Information");
            ActionHistory actionHistoryTMP3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Temperature Information");

            List<ActionHistory> actionHistoriesTMP = new ArrayList<>();
            actionHistoriesTMP.add(actionHistoryTMP1);
            actionHistoriesTMP.add(actionHistoryTMP2);
            actionHistoriesTMP.add(actionHistoryTMP3);

            Action actionTMP = new Action("Get Temperature Information", "Get the latest Temperature information from the sensor",
                    "get_temperature"
                    , actionHistoriesTMP);
            List<Action> actionsTMP = new ArrayList<>();
            actionsTMP.add(actionTMP);

            StateHistory stateHistoryTMP = new StateHistory("20", "Detecting temperature Values", System.currentTimeMillis());
            StateHistory stateHistoryTMP1 = new StateHistory("22", "Detecting temperature Values", System.currentTimeMillis());
            StateHistory stateHistoryTMP2 = new StateHistory("23", "Detecting temperature Values", System.currentTimeMillis());
            StateHistory stateHistoryTMP3 = new StateHistory("21", "Detecting temperature Values", System.currentTimeMillis());
            StateHistory stateHistoryTMP4 = new StateHistory("26", "Detecting temperature Values", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesTMP = new ArrayList<>();
            stateHistoriesTMP.add(stateHistoryTMP);
            stateHistoriesTMP.add(stateHistoryTMP1);
            stateHistoriesTMP.add(stateHistoryTMP2);
            stateHistoriesTMP.add(stateHistoryTMP3);
            stateHistoriesTMP.add(stateHistoryTMP4);

            HObject temperatureSensor = new HObject("Temperature Sensor", "ds18b20", "5cm", "Detecting", "Sensor"
                    , 2
                    , actionsTMP, stateHistoriesTMP);

//            Ultra Sonic Module

            ActionHistory actionHistoryUSM1 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Obstacle Distance Information");
            ActionHistory actionHistoryUSM2 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Obstacle Distance Information");
            ActionHistory actionHistoryUSM3 = new ActionHistory(System.currentTimeMillis(), System.currentTimeMillis(), "Get Obstacle Distance Information");

            List<ActionHistory> actionHistoriesUSM = new ArrayList<>();
            actionHistoriesUSM.add(actionHistoryUSM1);
            actionHistoriesUSM.add(actionHistoryUSM2);
            actionHistoriesUSM.add(actionHistoryUSM3);

            Action actionUSM = new Action("Get Obstacle Distance Information", "Get the obstacle distance information from the sensor",
                    "get_distance"
                    , actionHistoriesUSM);
            List<Action> actionsUSM = new ArrayList<>();
            actionsUSM.add(actionUSM);

            StateHistory stateHistoryUSM = new StateHistory("50", "Detecting Obstacle Distance Values", System.currentTimeMillis());
            StateHistory stateHistoryUSM1 = new StateHistory("52", "Detecting Obstacle Distance Values", System.currentTimeMillis());
            StateHistory stateHistoryUSM2 = new StateHistory("53", "Detecting Obstacle Distance Values", System.currentTimeMillis());
            StateHistory stateHistoryUSM3 = new StateHistory("54", "Detecting Obstacle Distance Values", System.currentTimeMillis());
            StateHistory stateHistoryUSM4 = new StateHistory("55", "Detecting Obstacle Distance Values", System.currentTimeMillis());
            ArrayList<StateHistory> stateHistoriesUSM = new ArrayList<>();
            stateHistoriesUSM.add(stateHistoryUSM);
            stateHistoriesUSM.add(stateHistoryUSM1);
            stateHistoriesUSM.add(stateHistoryUSM2);
            stateHistoriesUSM.add(stateHistoryUSM3);
            stateHistoriesUSM.add(stateHistoryUSM4);

            HObject USMSensor = new HObject("USM Sensor", "HC-SR04", "5cm", "Detecting", "Sensor"
                    , 2
                    , actionsUSM, stateHistoriesUSM);

            List<HObject> hObjects = new ArrayList<>();
            hObjects.add(gazSensor);
            hObjects.add(dcMotor);
            hObjects.add(ledControl);
            hObjects.add(temperatureSensor);
            hObjects.add(RGBControl);
            hObjects.add(USMSensor);
            hObjects.add(RelControl);

            Room room = new Room(1, "Salon", "Salon", hObjects);
            List<Room> rooms = new ArrayList<>();
            rooms.add(room);


            Raspberry raspberry = new Raspberry("192.168.0.101", "pi", "raspberry", "admin", rooms);
            List<Raspberry> raspberries = new ArrayList<>();
            raspberries.add(raspberry);

            AccountUser accountUser = new AccountUser("mail@mail.com", true, "10/10/2018", "18/02/2018", "redha123"
                    , "za6z1ef6z1efz6ef1z18fz7efzfe9z8", "12/02/2019", "admin");

            User user = new User("boulbard raoul duval", 23, System.currentTimeMillis(), "Mohamed Redha", "ABBASSEN", "0752532356", "france", "saint-etienne", accountUser);
            List<User> users = new ArrayList<>();
            users.add(user);

            Home home = new Home(users, raspberries);


            databaseReference.setValue(home);

        } else {
            if (a == 1) {
                EventListeners mEventListeners = new EventListeners(getApplicationContext());
                tmp = new TempThread(getApplicationContext());
                tmp.start();
                gazThread = new GazThread(getApplicationContext());
                gazThread.start();
                ultraThread = new UltraThread(getApplicationContext());
                ultraThread.start();

                mEventListeners.dcMotorEventListener();
                mEventListeners.ledEventListener();
                mEventListeners.rgbEventListener();
                mEventListeners.relEventListener();

            } else {
                databaseReference.child("1").removeValue();
            }
        }
    }

}
