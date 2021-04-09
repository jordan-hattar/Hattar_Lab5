package com.example.lab5.ui.background_radio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RadioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RadioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Notification");
    }

    public LiveData<String> getText() {
        return mText;
    }
}