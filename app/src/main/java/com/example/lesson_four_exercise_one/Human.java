package com.example.lesson_four_exercise_one;

import android.util.Log;

public class Human {
    public double height;
    public int age;
    public String name;


    public Human(String name, int age, double height) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        Log.d("myLog", "Hello!");
    }

    public String sayText(String text) {
        return "Person said: " + text;
    }

    public void growthInCm(int years) {
        age++;

        for (int i = age; i <= years; i++) {

                if (age <= 12) {
                    height += 8;
                    Log.d("myLog", "Growth is: " + height + " cm.");
                }

                    if (age == 13 || age <= 25) {
                    height += 3;
                    Log.d("myLog", "Growth is: " + height + " cm.");
                }
                else if (age >= 60) {
                    height -= 2;
                    Log.d("myLog", "Height Decreased in: " + height + " cm.");
                }

                else {
                    Log.d("myLog", "No Growth Happening");
                }

        }
    }


    public void changeName(String name) {
        if (age >= 18) {
            this.name = name;
            Log.d("myLog", "My new name is: " + name);
        }
        else {
            Log.d("myLog", "You are too young to change your name!");
        }

    }

}


