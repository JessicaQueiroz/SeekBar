package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        resultado = findViewById(R.id.tv_resultado);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresso, boolean b) {
                //resultado.setText("onProgressChanged");
                resultado.setText("Progresso: " + seekBar.getProgress() + " / " + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //resultado.setText("onStartTrackingTouch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //resultado.setText("onStopTrackingTouch");
            }
        });
    }
    public void recuperarProgresso(View v){
        resultado.setText("Escolhido: " + seekBar.getProgress());
    }
}