package com.example.juancho.lab3;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_1 extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        context = getApplicationContext();

        getCredencials();


    }

    public void getCredencials() {
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView password = (TextView) findViewById(R.id.password);
                TextView user = (TextView) findViewById(R.id.user);
                String username = user.getText().toString();;
                String pass =  password.getText().toString();;
                Toast MyToast = new Toast(context);
                MyToast.makeText(context, "Redirecting", Toast.LENGTH_LONG).show();
                Intent vistahijo = new Intent(Activity_1.this, childActivity.class);
                vistahijo.putExtra("username", username);
                vistahijo.putExtra("pass", pass);
                startActivity(vistahijo);


            }
        });
    }



}
