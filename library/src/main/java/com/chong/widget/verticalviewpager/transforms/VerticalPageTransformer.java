package com.chong.widget.verticalviewpager.transforms;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Make {@link ViewPager} vertical scroll <br>
 * Created by chadguo on 17/10/15.
 */

public abstract class VerticalPageTransformer implements ViewPager.PageTransformer {
    /**
     * make it final for vertical scroll implementation
     * @see #customTransformPage(View, float)
     * @param page
     * @param position
     */
    @Override
    public final void transformPage(View page, float position) {
        customTransformPage(page, position);
        scrollVertical(page, position);
    }

    /**
     * Apply a property transformation to the given page.
     *
     * @param page Apply the transformation to this page
     * @param position Position of page relative to the current front-and-center
     *                 position of the pager. 0 is front and center. 1 is one full
     *                 page position to the right, and -1 is one page position to the left.
     */
    protected abstract void customTransformPage(View page, float position);


    final void scrollVertical(View page, float position) {
        page.setTranslationX(page.getWidth() * -position);
        float yPosition = position * page.getHeight();
        page.setTranslationY(yPosition);
    }
}
