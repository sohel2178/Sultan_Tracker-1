package com.forbitbd.sultantracker.ui.settings.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.models.Step;

import java.util.List;

public class StepAdapter extends RecyclerView.Adapter<StepAdapter.StepHolder> {

    private Context context;
    private List<Step> stepList;

    public StepAdapter(Context context, List<Step> stepList) {
        this.context = context;
        this.stepList = stepList;

        initList();

    }

    private void initList() {
        String[] titleArr = context.getResources().getStringArray(R.array.title_list);
        String[] contentArr = context.getResources().getStringArray(R.array.content_list);

        for (int i = 0;i<titleArr.length;i++){
            stepList.add(new Step(titleArr[i],contentArr[i]));
        }
    }

    @NonNull
    @Override
    public StepAdapter.StepHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_step,parent,false);
        return new StepHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StepAdapter.StepHolder holder, int position) {
        Step step = stepList.get(position);

        holder.tvTitle.setText(step.getTitle());
        holder.tvContent.setText(step.getContent());
    }

    @Override
    public int getItemCount() {
        return stepList.size();
    }

    public class StepHolder extends RecyclerView.ViewHolder {

        TextView tvTitle,tvContent;

        public StepHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.title);
            tvContent = itemView.findViewById(R.id.content);
        }
    }
}
