package com.forbitbd.sultantracker.ui.listview.command;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.models.Command;
import com.forbitbd.sultantracker.models.Settings;
import com.forbitbd.sultantracker.ui.settings.SettignsClickListener;

import java.util.List;

public class CommandAdapter extends RecyclerView.Adapter<CommandAdapter.CommandHolder> {

    private List<Command> commandList;
    private CommandClickListener listener;

    public CommandAdapter(List<Command> commandList, CommandClickListener listener) {
        this.commandList = commandList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CommandAdapter.CommandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_settings,parent,false);
        return new CommandHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommandAdapter.CommandHolder holder, int position) {
        Command command = commandList.get(position);
        holder.bind(command);
    }

    @Override
    public int getItemCount() {
        return commandList.size();
    }

    public class CommandHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView text;

        public CommandHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.icon);
            text = itemView.findViewById(R.id.title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.ItemClick(getAdapterPosition());
                }
            });
        }

        public void bind(Command command) {
            img.setImageResource(command.getImage());
            text.setText(command.getTitle());
        }
    }
}
