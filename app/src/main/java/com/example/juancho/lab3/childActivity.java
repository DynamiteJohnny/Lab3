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

public class childActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Intent targetIntent = getIntent();
        String username = targetIntent.getStringExtra("username");
        String pass = targetIntent.getStringExtra("pass");
        TextView myTextView = (TextView)findViewById(R.id.textView2);


        if (username.equals("juan") && pass.equals("lab3")) {
            myTextView.setText("Welcome "+ username);
            myTextView.setVisibility(View.VISIBLE);
            //Toast MyToast = new Toast(context);
            //MyToast.makeText(context, "Redirecting", Toast.LENGTH_LONG).show();
        } else {
            myTextView.setText("WRONG!");
            myTextView.setVisibility(View.VISIBLE);

            AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
            DialogConf.setTitle("ALERT");
            DialogConf.setMessage("Password not OK");
            DialogConf.setIcon(R.mipmap.ic_launcher);

            DialogConf.setNeutralButton("Retry",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent vistapadre = new Intent(childActivity.this, Activity_1.class);
                        startActivity(vistapadre);
                    }
                });


        AlertDialog MyDialog = DialogConf.create();
        MyDialog.show();
        }





         // Demo of visibility


    }
}
