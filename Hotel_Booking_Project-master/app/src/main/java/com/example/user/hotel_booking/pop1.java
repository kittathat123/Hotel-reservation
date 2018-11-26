package com.example.user.hotel_booking;


import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class pop1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dbpopinfo);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        double w = width * .8;
        double h = height * .7;
        getWindow().setLayout((int)w,(int)h );

    }
}