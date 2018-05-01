package com.example.android.tour2sust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //view place button
        Button ViewPlace = (Button)findViewById(R.id.ViewPlacesButton);
        ViewPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,View_places.class);
                startActivity(intent);
            }
        });

        //history of sust button works through
        Button HistoryOfSust = (Button)findViewById(R.id.HistoryOfSUSTButton);
        HistoryOfSust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,history_of_sust.class);
                startActivity(intent);
            }
        });
    }
}
