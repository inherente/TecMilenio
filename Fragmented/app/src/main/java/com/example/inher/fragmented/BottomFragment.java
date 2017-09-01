package com.example.inher.fragmented;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.logging.Logger;

/**
 * Created by inher on 8/31/2017.
 */

public class BottomFragment extends Fragment {
    Logger log= Logger.getLogger(BottomFragment.class.getName());
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.info("inflating bottom view");
        View view = inflater.inflate(R.layout.bottomfragment,container,false);
        textView= (TextView) view.findViewById(R.id.bottomEditText);
        return view; //super.onCreateView(inflater, container, savedInstanceState)
    }

    public void changeText (String text) {
        textView.setText(text);
    }
}
