package com.example.nuvo.myobservabaledatabinding2;


import android.databinding.ObservableArrayList;

public class MyModel {
    public final ObservableArrayList<String> lst = new ObservableArrayList<>();

    public MyModel() {
        lst.add("aa");
        lst.add("bb");
    }

    public void update(String s0, String s1){
        lst.set(0, s0);
        lst.set(1, s1);
    }
}
