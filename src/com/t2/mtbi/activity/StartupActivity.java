package com.t2.mtbi.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartupActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(this, SplashActivity.class));
        this.finish();
    }
}