package com.example.viewmodelproject;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.viewmodelproject.viewModel.ViewModelClass;

public class SecondActivity extends AppCompatActivity {
    Button button,button2,button3;
    private ViewModelClass viewModelClass;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button3 = findViewById(R.id.button3);


        viewModelClass = ViewModelProviders.of(this).get(ViewModelClass.class);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewModelClass.addName(String.valueOf(System.currentTimeMillis()));
            }
        });


        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(viewModelClass.getName()!=null)
                {
                    Log.e("SecondDetail",viewModelClass.getName().size()+"");
                }else
                {
                    Log.e("SecondDetailDetail","view model is null");
                }

            }
        });




    }
}
