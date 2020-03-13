package com.example.abia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class Vibration extends AppCompatActivity {
    Button shot,log;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);
        shot=findViewById(R.id.button2);
        log=findViewById(R.id.button3);
        vibrator=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // vibrate in millseconds
                vibrator.vibrate(50);

            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(5000);

            }
        });
    }
}
