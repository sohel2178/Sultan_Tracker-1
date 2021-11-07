package com.forbitbd.sultantracker.ui.listview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.fragment.DialogboxFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

public class ListViewFragment extends Fragment implements ListViewContract.View{

    private MaterialCardView mtcard;
    private ListViewPresenter mPresenter;
    private MaterialToolbar toolbar;

    public ListViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new ListViewPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);

        toolbar =  view.findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.main_menu);

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