package com.example.inher.touch.core;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.example.inher.touch.MainActivity;

import java.util.logging.Logger;

/**
 * Created by inher on 8/27/2017.
 */

public class TouchListenerHandler implements View.OnTouchListener ,GestureDetector.OnGestureListener {
    MainActivity mainActivity;
    public TouchListenerHandler(MainActivity reference){
        super();
        mainActivity=reference;

    }
    public static Logger log = Logger.getLogger(TouchListenerHandler.class.getName());
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        String message;
        log.info("event");
        message= String.valueOf(motionEvent.getAction()) ;
        mainActivity.showMessage(String.valueOf(motionEvent.toString()) );
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        mainActivity.showMessage("on down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        mainActivity.showMessage("on Show press");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        mainActivity.showMessage("on Single tap");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        mainActivity.showMessage("on Scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        mainActivity.showMessage("on long Press");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        mainActivity.showMessage("on fling");
        return false;
    }
}
