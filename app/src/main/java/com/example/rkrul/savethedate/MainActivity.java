package com.example.rkrul.savethedate;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.calendar;
import layout.event;


public class MainActivity extends AppCompatActivity
    implements calendar.OnFragmentInteractionListener, event.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, calendar.newInstance())
                .addToBackStack(null)
                .commit();
    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }
}
