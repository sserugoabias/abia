package com.example.abia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

//public class BroadCast extends BroadcastReceiver{

//}
   private BroadcastReceiver myReceiver=new BroadcastReceiver(){
        @Override
    public void onReceive(Context context,Intent intent){

            int x= intent.getIntExtra("level",0);
            ProgressBar progressBar=(ProgressBar)findViewById(R.id.progress);
            progressBar.setProgress(x);
            TextView textView=(TextView)findViewById(R.id.textView2);
            textView.setText("Battery level"+ Integer.toString(x)+"%");
        }

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerReceiver(myReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }


    public void sendMessage(View view) {
EditText message=(EditText)findViewById(R.id.message);
        Toast.makeText(this,"sending message"+message.getText().toString(),Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        intent.putExtra("MESSAGE",message.getText().toString());
        startActivity(intent);
        message.setText("");
        EditText mymessage=(EditText)findViewById(R.id.onc);
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.men,menu);
        return true;
        //getMenuInflater().inflate(R.menu.);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.abias:
                startActivity(new Intent(this, musicActivity.class));
                return true;
            case R.id.sserugo:
                startActivity(new Intent(this,cprogram.class));
                return true;
            case R.id.rec:
                startActivity(new Intent(this,recycler.class));
                return true;
            case R.id.broad:
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String to []={"abiasperfect411@gmail.com","rkimera@must.ac.ug","robertbreen@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"hey, how are you");
                intent.putExtra(Intent.EXTRA_TEXT,"you are lost");
                intent.setType("message/rfc 822");

                startActivity(intent);
                return true;
            case R.id.call:
                try {
                    //check for call permissions
                    int permission = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
                    if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
                            Toast.makeText(this, "This is to make a phone call", Toast.LENGTH_LONG).show();
                        } else {
                            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                        }
                    }
                    Intent inte = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0705588912"));
                    startActivity(inte);
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
                return true;
               // Intent intent2=new Intent(Intent.ACTION_CALL,Uri.);
               // startActivity(intent2);

            case R.id.list:
                startActivity(new Intent(this,listview.class));
                return true;


            default:

                return super.onOptionsItemSelected(item);
        }
    }
}
