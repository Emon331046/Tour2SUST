package com.example.android.tour2sust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class View_places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewplaces);

       //iict images page
        ImageButton iict = (ImageButton)findViewById(R.id.IICT);
        iict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_places.this,IictBuilding.class);
                startActivity(intent);
            }
        });

        //move to central mosque page
        ImageButton mosque = (ImageButton)findViewById(R.id.CentralMosque);
        mosque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_places.this,CentralMosque.class);
                startActivity(intent);
            }
        });

        // move to chetona71 page
        ImageButton chetona71 = (ImageButton)findViewById(R.id.chetona71);
        chetona71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_places.this,Chetona71.class);
                startActivity(intent);
            }
        });

        // move to shahid minar page
        ImageButton shahidminar = (ImageButton)findViewById(R.id.ShahidMinar);
        shahidminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_places.this,ShahidMinar.class);
                startActivity(intent);
            }
        });

        // move to kilo road page
        ImageButton kiloroad = (ImageButton)findViewById(R.id.KiloRoad);
        kiloroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_places.this,KiloRoad.class);
                startActivity(intent);
            }
        });

        // move to auditorium page
        ImageButton auditorium = (ImageButton)findViewById(R.id.Auditorium);
        auditorium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(View_places.this,Auditorium.class);
                startActivity(intent);
            }
        });
    }
}
