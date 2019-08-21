package site.samplecode.samplerecyclerviewjava;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMainAdapter extends RecyclerView.Adapter<RecyclerMainAdapter.ViewHolder> {

    public interface RecyclerViewClickListener {

        void onClick(View view, int position);
    }

    private Context mContext;
    private List<ModelDataMain> mData;
    private RecyclerViewClickListener mListener;

    public RecyclerMainAdapter(Context mContext, List<ModelDataMain> mData, RecyclerViewClickListener mListener) {
        this.mContext = mContext;
        this.mData = mData;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Create new view
        View view;
        // Define and initialize LayoutInflater
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        // Initialize this view and inflate on inflater
        view = inflater.inflate(R.layout.layout_each_item, viewGroup, false);

        return new ViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.txt_item.setText(mData.get(i).getTitle()); // This code specifies the title for each item

        Drawable drawable = mData.get(i).getImage();
        viewHolder.icon_item.setImageDrawable(drawable); // This code specifies the icon for each item

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private RecyclerViewClickListener mListener;

        ConstraintLayout view_container;
        TextView txt_item;
        ImageView icon_item;

        ViewHolder(@NonNull View itemView, RecyclerViewClickListener listener) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            txt_item = itemView.findViewById(R.id.txt_item);
            icon_item = itemView.findViewById(R.id.icon_item);

            mListener = listener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }
}
