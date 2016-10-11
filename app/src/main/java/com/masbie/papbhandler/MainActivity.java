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
        final ToggleButton[] toggle = new ToggleButton[11];
        toggle[0] = (ToggleButton) findViewById(R.id.tgbutton);
        toggle[1] = (ToggleButton) findViewById(R.id.tgbutton1);
        toggle[2] = (ToggleButton) findViewById(R.id.tgbutton2);
        toggle[3] = (ToggleButton) findViewById(R.id.tgbutton3);
        toggle[4] = (ToggleButton) findViewById(R.id.tgbutton4);
        toggle[5] = (ToggleButton) findViewById(R.id.tgbutton5);
        toggle[6] = (ToggleButton) findViewById(R.id.tgbutton6);
        toggle[7] = (ToggleButton) findViewById(R.id.tgbutton7);
        toggle[8] = (ToggleButton) findViewById(R.id.tgbutton8);
        toggle[9] = (ToggleButton) findViewById(R.id.tgbutton9);
        toggle[10] = (ToggleButton) findViewById(R.id.tgbutton10);
        final ImageView[] image = new ImageView[11];
        image[0] = (ImageView) findViewById(R.id.image);
        image[1] = (ImageView) findViewById(R.id.image1);
        image[2] = (ImageView) findViewById(R.id.image2);
        image[3] = (ImageView) findViewById(R.id.image3);
        image[4] = (ImageView) findViewById(R.id.image4);
        image[5] = (ImageView) findViewById(R.id.image5);
        image[6] = (ImageView) findViewById(R.id.image6);
        image[7] = (ImageView) findViewById(R.id.image7);
        image[8] = (ImageView) findViewById(R.id.image8);
        image[9] = (ImageView) findViewById(R.id.image9);
        image[10] = (ImageView) findViewById(R.id.image10);


        toggle[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[0].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[0].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[1].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[1].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[1].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[2].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[2].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[2].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[3].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[3].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[3].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[4].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[4].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[4].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[5].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[5].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[5].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[6].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[6].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[6].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[7].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[7].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[7].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[8].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[8].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[8].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[9].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[9].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[9].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });
        toggle[10].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    image[10].setVisibility(View.VISIBLE);
                    // The toggle is enabled
                } else {
                    image[10].setVisibility(View.INVISIBLE);
                    // The toggle is disabled
                }
            }
        });


    }
}
