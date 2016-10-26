package com.example.bridgeit.dynamicfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = null;
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        int display = getResources().getConfiguration().orientation;
// get the display mode
        if(display == 1) {
            fragment = new Fragment1();
            fragmentTransaction.replace(android.R.id.content,fragment);

        } else {
            fragment = new Fragment2();
            fragmentTransaction.replace(android.R.id.content,fragment);
        }
        fragmentTransaction.commit();
    }
}


