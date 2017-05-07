package com.example.nuvo.myobservabaledatabinding2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.nuvo.myobservabaledatabinding2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyModel myModel = new MyModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(myModel);

        binding.update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myModel.update(binding.editText00.getText().toString(), binding.editText01.getText().toString());
            }
        });
    }
}
