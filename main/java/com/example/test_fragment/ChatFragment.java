package com.example.test_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ChatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_chat, container, false);

        Button btn_main = rootView.findViewById(R.id.button_main);
        Button btn_chat = rootView.findViewById(R.id.button_chat);
        Button btn_calendar = rootView.findViewById(R.id.button_calendar);
        Button btn_set = rootView.findViewById(R.id.button_set);

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(2);
            }
        });
        btn_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(3);
            }
        });


        return rootView;
    }
}
