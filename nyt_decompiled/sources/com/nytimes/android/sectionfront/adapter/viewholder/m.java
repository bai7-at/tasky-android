package com.nytimes.android.sectionfront.adapter.viewholder;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public interface m {

    public static class a {
        public static int a(View... viewArr) {
            if (viewArr == null) {
                return 0;
            }
            int i = 0;
            for (View view : viewArr) {
                if (view.getVisibility() != 8) {
                    i += view.getMeasuredHeight();
                    if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        i += marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                    }
                }
            }
            return i;
        }
    }

    int b();

    void c(int i);

    void d();

    boolean e();
}
