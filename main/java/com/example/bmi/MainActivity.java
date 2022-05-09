package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.bmi.ui.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private TextView height;
    private  Button nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar=(SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(300);
        height=(TextView) findViewById(R.id.textView7);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                height.setText(Integer.toString(i)+"cms");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        nav=(Button) findViewById(R.id.nav);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLogin();
            }
        });


    }

    @SuppressLint("SetTextI18n")
    public void wplus(View view){
        TextView weight = findViewById(R.id.textView3);
        int w=Integer.parseInt(weight.getText().toString().substring(0,2));
        w=w+1;
        weight.setText(Integer.toString(w)+"kgs");

    }
    @SuppressLint("SetTextI18n")
    public void wminus(View view){
        TextView weight = findViewById(R.id.textView3);
        int w=Integer.parseInt(weight.getText().toString().substring(0,2));
        w=w-1;
        weight.setText(Integer.toString(w)+"kgs");
    }
    @SuppressLint("SetTextI18n")
    public void aplus(View view){
        TextView age = findViewById(R.id.textView5);
        int a=Integer.parseInt(age.getText().toString().substring(0,2));
        a=a+1;
        age.setText(Integer.toString(a)+"yrs");
    }
    @SuppressLint("SetTextI18n")
    public void aminus(View view){
        TextView age = findViewById(R.id.textView5);
        int a=Integer.parseInt(age.getText().toString().substring(0,2));
        a=a-1;
        age.setText(Integer.toString(a)+"yrs");
    }
    public void openActivityLogin(){
        Intent intent=new Intent(this, LoginActivity.class);
        startActivity(intent);
    }




}