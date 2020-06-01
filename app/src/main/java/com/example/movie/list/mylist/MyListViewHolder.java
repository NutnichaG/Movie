package com.example.movie.list.mylist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyListViewHolder extends ViewModel {

    private MutableLiveData<String> mText;

    public MyListViewHolder() {
        mText = new MutableLiveData<>();
        mText.setValue("This is My List fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}