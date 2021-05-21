package com.example.trueproject.ui.notifications;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.trueproject.R;
import com.example.trueproject.custom_classes.Allergies;

import java.util.ArrayList;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");


    }

    public LiveData<String> getText() {
        return mText;
    }
}