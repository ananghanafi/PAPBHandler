package com.masbie.papbhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton toggle = (ToggleButton) findViewById(R.id.tgbutton);
        final ImageView image = (ImageView) findViewById(R.id.image1);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    image.setVisibility(View.INVISIBLE);
                    // The toggle is enabled
                } else {
                    image.setVisibility(View.VISIBLE);
                    //toggle.setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
    }
}
