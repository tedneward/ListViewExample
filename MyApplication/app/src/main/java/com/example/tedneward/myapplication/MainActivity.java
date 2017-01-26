package com.example.tedneward.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.util.Log;

public class MainActivity extends Activity {

    Button button;
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final java.util.Date today = new java.util.Date();

        button = (Button)findViewById(R.id.btnPushMe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Button clicked!");
                button.setText("Button clicked " + (clickCount++) + " times on " + today);
            }
        });
    }
}
