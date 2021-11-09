package com.forbitbd.sultantracker.ui.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.fragment.DialogboxFragment;
import com.forbitbd.sultantracker.models.Device;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

import info.androidhive.fontawesome.FontTextView;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.ListViewHolder> {


    private List<Device> deviceList;
    private ListViewClickListener listener;

    public ListViewAdapter(List<Device> deviceList, ListViewClickListener listener) {
        this.deviceList = deviceList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListViewAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_device, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewAdapter.ListViewHolder holder, int position) {
        Device device = deviceList.get(position);
        holder.bind(device);
    }

    @Override
    public int getItemCount() {
        return deviceList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private CircularImageView imageView;
        private TextView reg, status, mileage, location;
        private LinearLayout maplayout, commandlayout, detaillayout;
        private FontTextView more;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.icon);
            reg = itemView.findViewById(R.id.vehicle_reg);
            status = itemView.findViewById(R.id.engine_status);
            mileage = itemView.findViewById(R.id.mileage);
            location = itemView.findViewById(R.id.location);

            maplayout = itemView.findViewById(R.id.map);
            commandlayout = itemView.findViewById(R.id.command);
            detaillayout = itemView.findViewById(R.id.details);
            more = itemView.findViewById(R.id.more);

            maplayout.setOnClickListener(this);
            commandlayout.setOnClickListener(this);
            detaillayout.setOnClickListener(this);
            more.setOnClickListener(this);
        }

        public void bind(Device device) {


            imageView.setCircleColor(R.color.green);
            imageView.setImageResource(R.drawable.cng);
            reg.setText(device.getRegistration_number());
            status.setText("ON");
            mileage.setText(device.getMileage());
            location.setText("Paikpara, Ahmed Nagar, Mirpur-1, Dhaka, Bangladesh");
        }

        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id==R.id.map){
                listener.OnMapClick(getAdapterPosition());
            }else if (id == R.id.command){
                listener.OnCommandClick(getAdapterPosition());
            }else if (id == R.id.details){
                listener.OnDetailClick(getAdapterPosition());
            }else if (id == R.id.more){
                listener.OnMoreClick(getAdapterPosition());
            }
        }
    }
}
