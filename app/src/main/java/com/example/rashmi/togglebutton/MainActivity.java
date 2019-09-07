package com.example.rashmi.togglebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b2=(Button)findViewById(R.id.second);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AlertDialogEx.class);
                startActivity(i);
            }
        });
        addListenerButtonclick();
    }
    public void addListenerButtonclick(){
        final ToggleButton tg1=(ToggleButton)findViewById(R.id.toggle1);
       final ToggleButton tg2=(ToggleButton)findViewById(R.id.toggle2);
        Button b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                result.append("Toggle button is").append(tg1.getText());
                result.append("\ntoggle 2 is ").append(tg2.getText());
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();


            }
        });

    }
}
