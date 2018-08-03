package net.hellobye.gohajj_ware2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

public class alart extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alart);


        // Enables Always-on
        setAmbientEnabled();
    }
}
