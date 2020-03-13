package com.example.abia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.view.Gravity;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast toast=Toast.makeText(context,"Dont panik but your time is up!!",Toast.LENGTH_SHORT);
        //position your toast on the screen,parameters taken
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        //vibrate the mobile device
        Vibrator vibrator=(Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(4000);
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
