package com.example.session4.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.session4.R;
import com.example.session4.model.Item;
import com.example.session4.ui.AnswerActivity;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.ViewHolder>{

    private List<Item> items;

    public AnswerAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item_1, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(items.get(position).getOwner().getDisplayName());
        holder.is_accepted.setText(String.valueOf(items.get(position).getIs_accepted()));
        holder.user_type.setText(items.get(position).getOwner().getUserType());

        Picasso.get().load(items.get(position).getOwner().getProfileImage()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), AnswerActivity.class);
                intent.putExtra("id", items.get(position).getAnswer_id());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // view holder
    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.imageView)
        ImageView imageView;

        @BindView(R.id.name)
        TextView name;

        @BindView(R.id.user_type)
        TextView user_type;

        @BindView(R.id.is_accepted)
        TextView is_accepted;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
