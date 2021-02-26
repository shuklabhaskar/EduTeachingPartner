package com.gtech.eduteachingpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profile(View view) {
        Intent profilepeja = new Intent(MainActivity.this, Profile.class);
        startActivity(profilepeja);
    }

    public void college(View view) {
        Intent collegepeja = new Intent(MainActivity.this, Colllegeprofile.class);
        startActivity(collegepeja);
    }
}