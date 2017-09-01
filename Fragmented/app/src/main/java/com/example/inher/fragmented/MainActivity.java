package com.example.inher.fragmented;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity implements ToolBarListener {
    Logger log = Logger.getLogger(MainActivity.class.getName());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String text) {
        log.info("Should change text to {" + text+ "}");
        BottomFragment fragment= (BottomFragment) getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.changeText(text);
    }
}
