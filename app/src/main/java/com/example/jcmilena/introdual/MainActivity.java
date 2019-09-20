package com.example.jcmilena.introdual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("DUAL","Primer log de mi App");
        Log.i("DUAL","Segundo log de mi App");
    }
}
