package com.chong.widget.verticalviewpager.example.adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chong.widget.verticalviewpager.DummyViewPager;
import com.chong.widget.verticalviewpager.VerticalVPOnTouchListener;
import com.chong.widget.verticalviewpager.example.R;

public class ContentFragment extends Fragment {

    private static final String TAG = "ContentFragment";

    public ContentFragment() {
    }

    public static Fragment newInstance(String title, int position, DummyViewPager dummyViewPager) {
        Bundle args = new Bundle();
        args.putString("title", title);
        args.putInt("position", position);
        args.putSerializable("viewpager", dummyViewPager);
        ContentFragment fragment = new ContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        initRecyclerView(view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, this + " onResume " + getUserVisibleHint());
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onstart " + getUserVisibleHint());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, this + " onPause " + getUserVisibleHint());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, this + " ondestroy");
    }


    private void initRecyclerView(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_list);
        recyclerView.setOnTouchListener(new VerticalVPOnTouchListener((DummyViewPager) getArguments().getSerializable("viewpager")));//set the vertical scroll controller
        recyclerView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new ContentAdapter(getPosition()));
    }


    public String getTitle() {
        return getArguments().getString("title");
    }

    public int getPosition() {
        return getArguments().getInt("position");
    }


}
