package com.example.timely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> time;
    Button recordTime;
    Button recordTime2;
    ListView listView;
    ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = new ArrayList<String>();
        recordTime = (Button) findViewById(R.id.recordTime);
        recordTime2 = (Button) findViewById(R.id.recordTime2);
        listView = (ListView) findViewById(R.id.listView);
        listView2 = (ListView) findViewById(R.id.listView);
    }
    public void time(View view){
        int orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            long time = System.currentTimeMillis();
            long timesec = time/1000;
            


        }
    }

}