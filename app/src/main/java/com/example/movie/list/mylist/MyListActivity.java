package com.example.movie.list.mylist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.movie.R;

public class MyListActivity extends Fragment {

    private MyListViewHolder mylistViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mylistViewModel =
                ViewModelProviders.of(this).get(MyListViewHolder.class);
        View root = inflater.inflate(R.layout.fragment_allmovie, container, false);
        final TextView textView = root.findViewById(R.id.text_allmovie);
        mylistViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
