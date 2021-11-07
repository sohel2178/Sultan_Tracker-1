package com.forbitbd.sultantracker.ui.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.models.Device;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

import info.androidhive.fontawesome.FontDrawable;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.DeviceHolder>{

    private List<Device> deviceList;

    public DeviceAdapter(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    @NonNull
    @Override
    public DeviceAdapter.DeviceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_device,parent,false);
        return new DeviceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DeviceAdapter.DeviceHolder holder, int position) {
        Device device = deviceList.get(position);
        holder.bind(device);
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public class DeviceHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private FoldingCell mFoldingCell;

        private LinearLayout gtDeviceLayout;

        private FloatingActionButton ivEdit,ivCall,ivAt,ivView,ivShare,ivSharedUsers;
        private ImageView ivIndicator;

        private TextView tvDriverName,tvDriverPhone,tvModel
                ,tvVehicleType,getTvVehicleTypeTwo,tvLocation,tvRegistrationNumber,tvMilage,
                tvEngineStatus,tvCharging,tvFuelLine,tvVoltageLevel;

        private CircularImageView driverImage;
        private Context mContext;

        public DeviceHolder(@NonNull View itemView) {
            super(itemView);
            this.mContext = itemView.getContext();
//
//            mFoldingCell = itemView.findViewById(R.id.folding_cell);
//
//            driverImage = itemView.findViewById(R.id.driver_image);
//            gtDeviceLayout = itemView.findViewById(R.id.gt_device);

//            tvDriverName = itemView.findViewById(R.id.driver_name);
//            tvDriverPhone = itemView.findViewById(R.id.driver_phone_txt);
//            tvModel = itemView.findViewById(R.id.model);
//            tvRegistrationNumber = itemView.findViewById(R.id.registration_number);
//            tvVehicleType = itemView.findViewById(R.id.vehicle_type);
//            getTvVehicleTypeTwo = itemView.findViewById(R.id.vehicle_type_two);
//            tvLocation = itemView.findViewById(R.id.current_location);
//            tvMilage = itemView.findViewById(R.id.mileage);
//            tvEngineStatus = itemView.findViewById(R.id.engine_status);
//            tvFuelLine = itemView.findViewById(R.id.fuel_line);
//            tvCharging = itemView.findViewById(R.id.charging);
//            tvVoltageLevel = itemView.findViewById(R.id.voltage_level);

//            ivIndicator =  itemView.findViewById(R.id.indicator);
//            ivEdit = itemView.findViewById(R.id.edit);
//            ivCall = itemView.findViewById(R.id.driver_phone);
//            ivAt = itemView.findViewById(R.id.at);
//            ivView = itemView.findViewById(R.id.view);
//            ivShare = itemView.findViewById(R.id.share);
//            ivSharedUsers = itemView.findViewById(R.id.shared_users);

//            FontDrawable marker = new FontDrawable(mContext, R.string.fa_eye_solid, true, false);
//            marker.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
//            FontDrawable indicator = new FontDrawable(mContext, R.string.fa_circle_solid, true, false);
//            FontDrawable edit = new FontDrawable(mContext, R.string.fa_pen_solid, true, false);
//            edit.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
//            FontDrawable phone = new FontDrawable(mContext, R.string.fa_phone_solid, true, false);
//            phone.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
//            FontDrawable action = new FontDrawable(mContext, R.string.fa_cog_solid, true, false);
//            action.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
//
//            FontDrawable share = new FontDrawable(mContext,R.string.fa_share_solid,true,false);
//            FontDrawable users = new FontDrawable(mContext,R.string.fa_users_solid,true,false);
//            share.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
//            users.setTextColor(ContextCompat.getColor(mContext, android.R.color.white));
//
//            ivView.setImageDrawable(marker);
//            ivIndicator.setImageDrawable(indicator);
//            ivEdit.setImageDrawable(edit);
//            ivCall.setImageDrawable(phone);
//            ivAt.setImageDrawable(action);
//            ivShare.setImageDrawable(share);
//            ivSharedUsers.setImageDrawable(users);
//
//            mFoldingCell.setOnClickListener(this);
//            ivView.setOnClickListener(this);
//            ivEdit.setOnClickListener(this);
//            ivCall.setOnClickListener(this);
//            ivAt.setOnClickListener(this);
//            ivShare.setOnClickListener(this);
//            ivSharedUsers.setOnClickListener(this);

        }

        public void bind(Device device) {

        }

        @Override
        public void onClick(View v) {

        }
    }
}
