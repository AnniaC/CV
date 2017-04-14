package com.sda.a.cichosz.cv.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sda.a.cichosz.cv.R;


public class ThirdFragment extends Fragment {



    public ThirdFragment() {
        // Required empty public constructor
    }


    public static ThirdFragment newInstance() {
        ThirdFragment fragment = new ThirdFragment();

        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_third, container, false);
    }


}
