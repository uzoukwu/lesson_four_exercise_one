package com.example.lesson_four_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Human oleg = new Human("Oleg", 5, 1.50);
       oleg.growthInCm(10);
       oleg.changeName("Mark Zuckenberg");

       Human dasha = new Human("Darina", 10, 1.20);
       dasha.growthInCm(20);
       dasha.changeName("Ekaterina");



    }
}