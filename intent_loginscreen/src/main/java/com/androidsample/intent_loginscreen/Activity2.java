package com.androidsample.intent_loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shifa on 24-04-2016.
 */
public class Activity2 extends MainActivity
{
TextView Name;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity2_layout);
            Name=(TextView)findViewById(R.id.name);


            Intent intentObject = getIntent();

            String userNameBundle = intentObject.getExtras().getString("BundleUserName");
            Name.setText(userNameBundle);

        }





}
