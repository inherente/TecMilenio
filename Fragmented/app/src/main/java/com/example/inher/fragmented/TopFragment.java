package com.example.inher.fragmented;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.logging.Logger;

/**
 * Created by inher on 8/31/2017.
 */

public class TopFragment extends Fragment {
    private EditText editText;
    private Button button;
    ToolBarListener activityCallback;
    Logger log = Logger.getLogger(TopFragment.class.getName());
 // public interface ToolbarListener { public void onButtonClick(String text); }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        log.info("Attaching to Context");
        try {
            activityCallback = (ToolBarListener) context;
        }catch (ClassCastException error){
            log.info("error " + error.getMessage());
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.info("inflating view");
        View view= inflater.inflate(R.layout.topfragment,container, false);
        editText= view.findViewById(R.id.editText);
        button= view.findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonClicked(view);
                    }
                }
        );
        return view; //super.onCreateView(inflater, container, savedInstanceState)
    }
    public void buttonClicked(View view){
        if(activityCallback== null){
            log.info("Object initialization Skipped");
        } else {
            activityCallback.onButtonClick(editText.getText().toString());
        }
    }
}
