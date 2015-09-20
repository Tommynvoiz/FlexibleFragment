package com.app.tomas.flexiblefragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {

        FragmentManager manager= getFragmentManager();
        FragmentB f2 = (FragmentB) manager.findFragmentById(R.id.fragmentb);
        f2.changeData(i);
    }
}
