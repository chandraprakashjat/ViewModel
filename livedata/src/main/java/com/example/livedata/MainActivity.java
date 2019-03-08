package com.example.livedata;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.livedata.StringViewModel.ViewModelString;

public class MainActivity extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        final ViewModelString viewModelString = ViewModelProviders.of(this).get(ViewModelString.class);


         Observer<String> observer = new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                Log.e("updateValue",s+" is update");
                Toast.makeText(MainActivity.this,s+"",Toast.LENGTH_SHORT).show();
            }
        };


         viewModelString.getName().observe(this,observer);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v)
             {
                 new CountDownTimer(120000, 3000) {

                     public void onTick(long millisUntilFinished) {

                         viewModelString.updateValue("is New Value "+System.currentTimeMillis());
                     }

                     public void onFinish() {



                     }

                 }.start();
             }
         });
    }
}
