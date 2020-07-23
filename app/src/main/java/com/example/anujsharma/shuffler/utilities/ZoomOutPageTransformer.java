package com.example.anujsharma.shuffler.utilities;

import androidx.viewpager.widget.ViewPager;
import android.view.View;

/**
 * Created by anuj5 on 09-01-2018.
 */

public class ZoomOutPageTransformer implements ViewPager.PageTransformer {

    public void transformPage(View view, float position) {

        final float normalizedposition = Math.abs(Math.abs(position) - 1);

        view.setScaleX(normalizedposition * 0.15f + 0.85f);
        view.setScaleY(normalizedposition * 0.15f + 0.85f);

        view.setAlpha(normalizedposition * 0.5f + 0.5f);
    }
}

