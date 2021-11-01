package com.forbitbd.sultantracker.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.fragment.DialogboxFragment;
import com.google.android.material.card.MaterialCardView;


public class HomeFragment extends Fragment {

    private MaterialCardView mtcard;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mtcard = view.findViewById(R.id.vehicle);
        mtcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogboxFragment dialogboxFragment = new DialogboxFragment();
                dialogboxFragment.setCancelable(true);
                dialogboxFragment.show(getFragmentManager(),"abcd");
            }
        });
        return view;
    }
}