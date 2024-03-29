package com.projectcrescendo.pianotest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.twobard.pianoview.Piano;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mainContent = (RelativeLayout) findViewById(R.id.main_content);
        Piano piano = new Piano(this);
        piano.setPianoKeyListener(new Piano.PianoKeyListener() {
            @Override
            public void keyPressed(int id, int action) {
                if (action == MotionEvent.ACTION_DOWN) {
                    Log.d("Piano key pressed", "key number " + id + " pressed down");

                } else if (action == MotionEvent.ACTION_UP) {
                    Log.d("Piano key pressed", "key number " + id + " released");

                }
            }
        });
        mainContent.addView(piano);

    }
}
