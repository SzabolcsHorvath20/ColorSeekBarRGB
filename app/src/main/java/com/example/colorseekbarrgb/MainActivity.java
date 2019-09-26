package com.example.colorseekbarrgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textRGB;
    private RelativeLayout layoutRGB;
    private int red,green,blue = 0;
    private SeekBar seekBarRED;
    private SeekBar seekBarGREEN;
    private SeekBar seekBarBLUE;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        seekBarRED = (SeekBar)findViewById(R.id.seekBar_RED);
        textRGB.setText("(0,0,0)");
        textRGB.setTextColor(Color.rgb(255,255,255));
        layoutRGB.setBackgroundColor(Color.rgb(0,0,0));
        seekBarRED.setBackgroundColor(Color.rgb(255,255,255));
        seekBarRED.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressRED,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                red = progressRED;
                textRGB.setText("(" + red + "," + green + "," + blue + ")");
                textRGB.setTextColor(Color.rgb(Math.abs(red-255), Math.abs(green-255), Math.abs(blue-255)));
                layoutRGB.setBackgroundColor(Color.rgb(red,green,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        seekBarGREEN = (SeekBar)findViewById(R.id.seekBar_GREEN);
        seekBarGREEN.setBackgroundColor(Color.rgb(255,255,255));
        seekBarGREEN.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressGREEN,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                green = progressGREEN;
                textRGB.setText("(" + red + "," + green + "," + blue + ")");
                textRGB.setTextColor(Color.rgb(Math.abs(red-255), Math.abs(green-255), Math.abs(blue-255)));
                layoutRGB.setBackgroundColor(Color.rgb(red,green,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        seekBarBLUE = (SeekBar)findViewById(R.id.seekBar_BLUE);
        seekBarBLUE.setBackgroundColor(Color.rgb(255,255,255));
        seekBarBLUE.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressBLUE,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                blue = progressBLUE;
                textRGB.setText("(" + red + "," + green + "," + blue + ")");
                textRGB.setTextColor(Color.rgb(Math.abs(red-255), Math.abs(green-255), Math.abs(blue-255)));
                layoutRGB.setBackgroundColor(Color.rgb(red,green,blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

    }




    public void init()
    {
        textRGB = findViewById(R.id.text_RGB);
        layoutRGB = findViewById(R.id.layout_RGB);
    }
}
