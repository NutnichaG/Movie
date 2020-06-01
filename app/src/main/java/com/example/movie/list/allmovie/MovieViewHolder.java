package com.example.movie.list.allmovie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MovieViewHolder extends ViewModel {

    private MutableLiveData<String> mText;

    public MovieViewHolder() {
        mText = new MutableLiveData<>();
        mText.setValue("This is All Movie fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}