package com.example.user.hotel_booking;


import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.SharedPreferences;

public class roomselect extends AppCompatActivity {

    private Button dbinfo;
    private Button tbinfo;
    private Button srinfo;

    private ImageButton dbbutton;
    private ImageButton tbbutton;
    private ImageButton srbutton;
    private ImageButton flbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomselect);
        TextView t1 = (TextView) findViewById(R.id.doublebed);
        TextView t2 = (TextView) findViewById(R.id.twinbed);
        TextView t3 = (TextView) findViewById(R.id.suiteroom);
        t1.setPaintFlags(t1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        t2.setPaintFlags(t2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        t3.setPaintFlags(t3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        SharedPreferences room = getSharedPreferences("Room",0);
        final SharedPreferences.Editor editor = room.edit();

        dbinfo = (Button)findViewById(R.id.dbinfo);
        dbinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo1();
            }
        });

        tbinfo = (Button)findViewById(R.id.tbinfo);
        tbinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo2();
            }
        });

        srinfo = (Button)findViewById(R.id.srinfo);
        srinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfo3();
            }
        });

        dbbutton = (ImageButton)findViewById(R.id.DoubleBedButton);
        dbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("Room","Double Bed Room");
                editor.commit();
                openresult();
            }
        });

        tbbutton = (ImageButton)findViewById(R.id.TwinBedButton);
        tbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("Room","Twin Bed Room");
                editor.commit();
                openresult();
            }
        });

        srbutton = (ImageButton)findViewById(R.id.SuiteRoom);
        srbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("Room","Suite Room");
                editor.commit();
                openresult();
            }
        });

        flbutton = (ImageButton)findViewById(R.id.FacilityButton);
        flbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacility();
            }
        });

    }

    public void openresult()
    {
        Intent intent = new Intent(this,invoice.class);
        startActivity(intent);
    }

    public void openInfo1()
    {
        Intent intent = new Intent(this, pop1.class);
        startActivity(intent);
    }

    public void openInfo2()
    {
        Intent intent = new Intent(this, pop2.class);
        startActivity(intent);
    }

    public void openInfo3()
    {
        Intent intent = new Intent(this, pop3.class);
        startActivity(intent);
    }
    public void openFacility()
    {
        Intent intent = new Intent(this, FacilityList.class);
        startActivity(intent);
    }
}
