package com.androidsample.intent_loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.Password);
        login=(Button)findViewById(R.id.login);
   }
   public void loginClick(View v)
   {

        String username = String.valueOf(user.getText());
        String password = String.valueOf(pass.getText());

       if (!isValidUserName(username))
       {
           user.setError("Invalid Username");
           user.setText("");
           pass.setText("");
       }

       if (!isValidPassword(password))
       {
           pass.setError("Invalid Password");
          // user.setText("");
           pass.setText("");
        }

       if(isValidUserName(username)==true && isValidPassword(password)==true) {
           Intent openNewActivity = new Intent(getApplicationContext(), Activity2.class);
           Bundle dataBundle = new Bundle();
           dataBundle.putString("BundleUserName", username);
           openNewActivity.putExtras(dataBundle);

           startActivity(openNewActivity);
       }
       else {
           Toast.makeText(this, "Enter Correct Username and Password", Toast.LENGTH_LONG).show();
       }
 }

    private boolean isValidUserName(String user) {
        if (user != null && user.length() > 4) {
            return true;
        }
        return false;
    }


    private boolean isValidPassword(String pass) {
        if (pass != null && pass.length() > 8) {
            return true;
        }
        return false;
    }

}
