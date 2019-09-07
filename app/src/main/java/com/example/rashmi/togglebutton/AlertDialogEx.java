package com.example.rashmi.togglebutton;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogEx extends AppCompatActivity {
Button  bclose;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog_ex);
        bclose=(Button)findViewById(R.id.closebutton);
        builder=new AlertDialog.Builder(this);
        bclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title);
                builder.setMessage("Do You want to Close?")
                .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplication(),"you choose yes",Toast.LENGTH_SHORT).show();


                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplication(),"you choose no",Toast.LENGTH_SHORT).show();

                            }
                        });
                AlertDialog alert=builder.create();
                alert.setTitle("Tite");
                alert.show();
            }
        });
    }
}
