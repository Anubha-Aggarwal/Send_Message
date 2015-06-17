package com.example.android.sendmessage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    EditText eus,eps;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eus = (EditText) findViewById(R.id.Us);
        eps = (EditText) findViewById(R.id.Lg);
        b1=(Button)findViewById(R.id.Gt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String us = eus.getText().toString();
                String lg = eps.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                //intent.setData(Uri.parse("https:\\www.google.com"));
                intent.putExtra()
                startActivity(intent);

            }
        });

    }


}
