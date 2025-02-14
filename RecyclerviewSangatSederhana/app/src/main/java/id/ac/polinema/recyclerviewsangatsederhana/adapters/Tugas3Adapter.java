package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.ItemContent;

public class Tugas3Adapter extends RecyclerView.Adapter<Tugas3Adapter.MyViewHolder>{
    private ArrayList<ItemContent> itemContents;
    private LayoutInflater inflater;

    public Tugas3Adapter(ArrayList<ItemContent> itemContents, Context context) {
        this.itemContents = itemContents;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Tugas3Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_gadget_tugas3, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Tugas3Adapter.MyViewHolder holder, int position) {
        holder.title.setText(itemContents.get(position).getTitle());
        holder.image.setImageResource(itemContents.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return (itemContents != null) ? itemContents.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_t3);
            image = itemView.findViewById(R.id.image_t3);
        }
    }
}
