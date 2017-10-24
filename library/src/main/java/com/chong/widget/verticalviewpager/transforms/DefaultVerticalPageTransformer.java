package com.chong.widget.verticalviewpager.transforms;

import android.view.View;

public class DefaultVerticalPageTransformer extends VerticalPageTransformer {

    @Override
    protected void customTransformPage(View page, float position) {
        float alpha = 0;
        if (0 <= position && position <= 1) {
            alpha = 1 - position;
        } else if (-1 < position && position < 0) {
            alpha = position + 1;
        }
        page.setAlpha(alpha);
    }
}
