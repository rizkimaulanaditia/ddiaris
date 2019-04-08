package com.example.prototypeddiaris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
    private long tempTime= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    @Override
    public void onBackPressed() {
        long time = System.currentTimeMillis();
        if ((time - tempTime)>3000){
            Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();
            tempTime = System.currentTimeMillis();
        }else{
            super.onBackPressed();
        }
    }
}
