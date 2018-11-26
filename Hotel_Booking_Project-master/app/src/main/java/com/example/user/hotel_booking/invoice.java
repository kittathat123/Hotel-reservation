package com.example.user.hotel_booking;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

import org.w3c.dom.Text;

public class invoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);



        //---------------- Get information from first page ------------------//
        //-------------------------------------------------------------------//
        //-------------------------------------------------------------------//


        // get The name and save
        SharedPreferences name = getSharedPreferences("NAME_AND_LAST_NAME",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_name = name.edit(); // not nescessary when we only use not edit or put

        TextView nameView = (TextView)findViewById(R.id.Name_TextView);
        nameView.setText("Name: " + name.getString("FIRST_NAME" , ""));
        nameView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_name.putString("FIRST_NAME", s.toString());
                editor_name.commit();
            }
        });

        // get The surname and save
        TextView surnameView = (TextView)findViewById(R.id.Surname_TextView);
        surnameView.setText("Surname: " + name.getString("LAST_NAME" , ""));
        surnameView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_name.putString("FIRST_NAME", s.toString());
                editor_name.commit();
            }
        });





        // get the Phone number and save
        SharedPreferences phone_number = getSharedPreferences("PHONE_NUMBER", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_phone_number = phone_number.edit();

        TextView phoneView = (TextView)findViewById(R.id.Phone_TextView);
        phoneView.setText("Phone number: " + phone_number.getString("PHONE_NUMBER" , ""));
        phoneView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_phone_number.putString("PHONE_NUMBER" , s.toString());
                editor_phone_number.commit();
            }
        });


        // get The Email and save
        SharedPreferences email = getSharedPreferences("EMAIL", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_email = email.edit();

        TextView emailView = (TextView)findViewById(R.id.Email_TextView);
        emailView.setText("Email: " + email.getString("EMAIL" , ""));
        emailView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_email.putString("EMAIL" , s.toString());
                editor_email.commit();
            }
        });

        // get the number of people and save
        SharedPreferences room_and_family = getSharedPreferences("room_and_family", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_people = room_and_family.edit();

        TextView peopleView = (TextView)findViewById(R.id.People_TextView);
        peopleView.setText("Room: " + room_and_family.getInt("ROOM" , 1) + "    " + "Adults: " + room_and_family.getInt("ADULT" , 2) + "    " + "Children: " +  room_and_family.getInt("CHILDREN" , 3));
        peopleView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_people.putString("room_and_family" , s.toString());
                editor_people.commit();
            }
        });

        // get the room type  and save
        SharedPreferences Room = getSharedPreferences("Room", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_room = Room.edit();

        TextView roomView = (TextView)findViewById(R.id.Room_TextView);
        roomView.setText("Room type: " + Room.getString("Room" , ""));
        roomView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_room.putString("Room" , s.toString());
                editor_room.commit();
            }
        });



        // get The Check in date and save
        SharedPreferences checkin = getSharedPreferences("check_in", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_check_in = checkin.edit();

        TextView checkInView = (TextView)findViewById(R.id.Check_In_TextView);
        checkInView.setText("Check in date: " + checkin.getString("check_in_day" , "") + " " + checkin.getString("check_in_month_string" , "") + " " + checkin.getString("check_in_year" , ""));
        checkInView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_check_in.putString("check_in" , s.toString());
                editor_check_in.commit();
            }
        });

        // get The check out date and save
        SharedPreferences checkout = getSharedPreferences("check_out", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor_check_out = checkout.edit();

        TextView checkOutView = (TextView)findViewById(R.id.Check_Out_TextView);
        checkOutView.setText("Check out date: "  + checkout.getString("check_out_day" , "")+ " " + checkout.getString("check_out_month_string" , "") + " " + checkout.getString("check_out_year" , ""));
        checkOutView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                editor_check_out.putString("check_out" , s.toString());
                editor_check_out.commit();
            }
        });

        // The to total price
        TextView paymentView = (TextView)findViewById(R.id.Payment_TextView);

        if(Room.getString("Room" , "").equals( "Double Bed Room"))
        {

            int price = 700;
            String first = checkin.getString("check_in_day" , "") + " " + checkin.getInt("check_in_month_int" , 1) + " " + checkin.getString("check_in_year" , "") ;
            String second = checkout.getString("check_out_day" , "") + " " + checkout.getInt("check_out_month_int" , 1) + " " + checkout.getString("check_out_year" , "") ;
            SimpleDateFormat sdf = new SimpleDateFormat("dd mm yy");
            Date day1 = null;
            try {
                day1 = sdf.parse(first);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date day2 = null;
            try {
                day2 = sdf.parse(second);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long diff = day2.getTime() - day1.getTime();
            float daybetween = (diff / (1000*60*60*24));
            int finalprice = (int)daybetween * price * room_and_family.getInt("ROOM" , 1);
            paymentView.setText(finalprice + "Baths");


        }


        if(Room.getString("Room" , "").equals( "Twin Bed Room"))
        {

            int price = 700;
            String first = checkin.getString("check_in_day" , "") + " " + checkin.getInt("check_in_month_int" , 1) + " " + checkin.getString("check_in_year" , "") ;
            String second = checkout.getString("check_out_day" , "") + " " + checkout.getInt("check_out_month_int" , 1) + " " + checkout.getString("check_out_year" , "") ;
            SimpleDateFormat sdf = new SimpleDateFormat("dd mm yy");
            Date day1 = null;
            try {
                day1 = sdf.parse(first);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date day2 = null;
            try {
                day2 = sdf.parse(second);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long diff = day2.getTime() - day1.getTime();
            float daybetween = (diff / (1000*60*60*24));
            int finalprice = (int)daybetween * price * room_and_family.getInt("ROOM" , 1);
            paymentView.setText(finalprice + "Baths");


        }
        if(Room.getString("Room" , "").equals( "Suite Room"))
        {

            int price = 1500;
            String first = checkin.getString("check_in_day" , "") + " " + checkin.getInt("check_in_month_int" , 1) + " " + checkin.getString("check_in_year" , "") ;
            String second = checkout.getString("check_out_day" , "") + " " + checkout.getInt("check_out_month_int" , 1) + " " + checkout.getString("check_out_year" , "") ;
            SimpleDateFormat sdf = new SimpleDateFormat("dd mm yy");
            Date day1 = null;
            try {
                day1 = sdf.parse(first);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Date day2 = null;
            try {
                day2 = sdf.parse(second);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long diff = day2.getTime() - day1.getTime();
            float daybetween = (diff / (1000*60*60*24));
            int finalprice = (int)daybetween * price * room_and_family.getInt("ROOM" , 1);
            paymentView.setText(finalprice + " Baths");


        }







        // Confirm botton to the first page
        Button confirmbtn = (Button)findViewById(R.id.Confirm_Button);
        confirmbtn.setText("Confirm");
        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(startIntent);
            }
        });


    }
}
