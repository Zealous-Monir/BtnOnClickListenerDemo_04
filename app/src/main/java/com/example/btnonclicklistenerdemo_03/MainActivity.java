package com.example.btnonclicklistenerdemo_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        txtView = findViewById(R.id.txtView);

        Handler handler = new Handler();

        button1.setOnClickListener(handler);
        button2.setOnClickListener(handler);


    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            if (v.getId() == R.id.button1){
                txtView.setText("Loging Button is clicked");
            }
            else if (v.getId() == R.id.button2){
                txtView.setText("Logout Button is clicked");
            }


        }
    }

}