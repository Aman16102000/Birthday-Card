package com.example.happpybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView recieve_msg=findViewById(R.id.from);
        TextView recieve_msg2=findViewById(R.id.secondparent);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message_key");
        String str2=intent.getStringExtra("message_key2");
        recieve_msg.setText("from "+str);
        recieve_msg2.setText("Happy Birthday "+str2);
    }
}