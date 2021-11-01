package com.forbitbd.sultantracker.ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.forbitbd.sultantracker.R;

import java.util.List;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.SettingsHolder> {

    private List<Settings> settingsList;
    private SettignsClickListener listener;

    public SettingsAdapter(List<Settings> settingsList, SettignsClickListener listener) {
        this.settingsList = settingsList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SettingsAdapter.SettingsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_settings,parent,false);
        return new SettingsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsAdapter.SettingsHolder holder, int position) {
        Settings settings = settingsList.get(position);
        holder.bind(settings);
    }

    @Override
    public int getItemCount() {
        return settingsList.size();
    }

    public class SettingsHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView text;

        public SettingsHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.icon);
            text = itemView.findViewById(R.id.title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.ItemClick(settingsList.get(getAdapterPosition()));
                }
            });
        }

        public void bind(Settings settings) {
            img.setImageResource(settings.getImage());
            text.setText(settings.getTitle());
        }
    }
}
