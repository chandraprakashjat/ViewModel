package com.example.viewmodelproject.viewModel;

import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;

public class ViewModelClass extends ViewModel
{
    private ArrayList<String> name;

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name)
    {
        this.name = name;
    }

    public  void addName( String name1)
    {

        if(name == null)
        {
         name = new ArrayList<>() ;
        }

        name.add(name1);
    }




}
