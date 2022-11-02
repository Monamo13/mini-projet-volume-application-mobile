package com.example.tp2ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekbar;
    Button max;
    Button min;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar=(SeekBar) findViewById(R.id.seekbar);
        max=(Button) findViewById(R.id.btnmax);
        min=(Button) findViewById(R.id.btnmin);
        text=(TextView) findViewById(R.id.volume);

        seekbar.setOnSeekBarChangeListener(this);



    }

    @Override
    public void onProgressChanged(SeekBar seekbar, int i, boolean b) {
        text.setText(i+"%");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekbar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekbar) {

    }

    public void min(View vue) {
        seekbar.setProgress(0);
    }


    public void max(View vue){
        seekbar.setProgress(seekbar.getMax());
    }
}
