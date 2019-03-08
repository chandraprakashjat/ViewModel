package com.example.livedata.StringViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ViewModelString extends ViewModel
{
    private MutableLiveData<String> name;

    public LiveData<String> getName()
    {

        if(name == null)
        {
            name = new MutableLiveData<>();
        }
        return name;
    }





    public void updateValue(String value)
    {

        name.postValue(value);
    }

}
