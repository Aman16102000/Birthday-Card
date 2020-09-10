package com.example.happpybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void cardActivity(View view)
    {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        TextView F=findViewById(R.id.from);
        String From=F.getText().toString();
        TextView T=findViewById(R.id.to);
        String To=T.getText().toString();

       intent.putExtra("message_key",From);
       intent.putExtra("message_key2",To);

        startActivity(intent);
    }
}