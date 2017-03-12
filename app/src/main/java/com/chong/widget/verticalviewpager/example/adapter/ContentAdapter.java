package com.chong.widget.verticalviewpager.example.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chong.widget.verticalviewpager.example.R;

public class ContentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = "ContentAdapter";
    private int index;

    public ContentAdapter(int index) {
        this.index = index;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContentView(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ContentView content = (ContentView) holder;
        content.textView.setText(index + " content" + position);
        if (index == 2) {
            content.textView.setVisibility(View.GONE);
            content.imageView.setVisibility(View.VISIBLE);
        }else{
            content.textView.setVisibility(View.VISIBLE);
        }
//        Log.i(TAG, "bind view " + index + "," + position);
    }

    @Override
    public int getItemCount() {
        if (index == 2) {
            return 1;//for img
        }
        if (index % 2 == 0) {
            return 5;
        }
        return 15;
    }


    public class ContentView extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public ContentView(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.context_text);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }

}
