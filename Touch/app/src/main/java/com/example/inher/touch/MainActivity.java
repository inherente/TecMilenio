package com.example.inher.touch;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.inher.touch.core.TouchListenerHandler;

public class MainActivity extends AppCompatActivity {
    GestureDetector.OnGestureListener touchListenerHandler;
    GestureDetector detector ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        touchListenerHandler= new TouchListenerHandler(this);
        detector= new GestureDetector(touchListenerHandler);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);
     // linearLayout.setOnTouchListener(touchListenerHandler);
    }

    public boolean showMessage(String message){
        EditText text = (EditText) findViewById(R.id.editText);
        text.setText(message);
        return false;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        detector.onTouchEvent(event);
        return false;

    }

}
