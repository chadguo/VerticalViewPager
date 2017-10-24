package com.chong.widget.verticalviewpager.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chong.widget.verticalviewpager.DummyViewPager;
import com.chong.widget.verticalviewpager.example.adapter.ContentFragment;
import com.chong.widget.verticalviewpager.example.adapter.ContentFragmentAdapter;


public class MainActivity extends AppCompatActivity {
    DummyViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        initViewPager();
    }

    private void initViewPager() {
        viewPager = (DummyViewPager) findViewById(R.id.vertical_viewpager);
        String title = "ContentFragment";
        viewPager.setAdapter(new ContentFragmentAdapter.Holder(getSupportFragmentManager())
                .add(ContentFragment.newInstance(title, 1, viewPager))
                .add(ContentFragment.newInstance(title, 2, viewPager))
                .add(ContentFragment.newInstance(title, 3, viewPager))
                .add(ContentFragment.newInstance(title, 4, viewPager))
                .add(ContentFragment.newInstance(title, 5, viewPager))
                .set());
        //If you setting other scroll mode, the scrolled fade is shown from either side of display.
        viewPager.setOverScrollMode(View.OVER_SCROLL_ALWAYS);
    }

    @Override
    public void onBackPressed() {
        viewPager.setCurrentItem(0, false);
    }
}
