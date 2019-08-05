package com.example.ungdungdautien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // toan cuc
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa
//        tv1= findViewById(R.id.tvHello);

        tv1.setText("Main set text");
    }
}
