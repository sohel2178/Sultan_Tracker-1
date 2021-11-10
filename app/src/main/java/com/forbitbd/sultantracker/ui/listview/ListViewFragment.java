package com.forbitbd.sultantracker.ui.listview;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.fragment.DialogboxFragment;
import com.forbitbd.sultantracker.models.Device;
import com.forbitbd.sultantracker.ui.listview.command.CommandActivity;
import com.forbitbd.sultantracker.ui.listview.editdevice.EditDeviceActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class ListViewFragment extends Fragment implements ListViewContract.View{

    private ListViewPresenter mPresenter;
    private MaterialToolbar toolbar;
    private ListViewAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Device> deviceList;

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

        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        deviceList = new ArrayList<>();
        deviceList.add(new Device("Saimul Hoque","01881269553",R.drawable.ic_baseline_person_24,"Dhk-Metro Cha-13-6425", "Car", "01821465858", "Car", "0.5", false));
        deviceList.add(new Device("Saimul Hoque","01881269553",R.drawable.ic_baseline_person_24,"Dhk-Metro Cha-13-6425", "Cng", "01821465858", "Car", "0.5", true));
        deviceList.add(new Device("Saimul Hoque","01881269553",R.drawable.ic_baseline_person_24,"Dhk-Metro Cha-13-6425", "Scooty", "01821465858", "Car", "0.5", true));

        adapter = new ListViewAdapter(deviceList, new ListViewClickListener() {
            @Override
            public void OnMapClick(Device device) {

            }

            @Override
            public void OnCommandClick(Device device) {

            }

            @Override
            public void OnDetailClick(Device device) {

            }

            @Override
            public void OnMoreClick(Device device) {
                showPopUp(view);
            }
        });


//        adapter = new ListViewAdapter(deviceList, new ListViewClickListener() {
//            @Override
//            public void OnMoreClick(int adapterPosition) {

//            }
//
//            @Override
//            public void OnDetailClick(int adapterPosition) {
//                startActivity(new Intent(getContext(), EditDeviceActivity.class));
//            }
//
//            @Override
//            public void OnCommandClick(int adapterPosition) {
//                startActivity(new Intent(getContext(), CommandActivity.class));
//            }
//
//            @Override
//            public void OnMapClick(int adapterPosition) {
//
//            }
//        });

        recyclerView.setAdapter(adapter);

        return view;
    }

    private void showPopUp(View view) {
        PopupMenu popup = new PopupMenu(getContext(), view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.item_menu, popup.getMenu());
        popup.show();

    }

}