package com.nytimes.android.comments.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.menu.view.RealMenuCommentsView;
import defpackage.f99;

/* loaded from: classes4.dex */
public final class MenuCommentsBinding implements f99 {
    private final RealMenuCommentsView rootView;

    private MenuCommentsBinding(RealMenuCommentsView realMenuCommentsView) {
        this.rootView = realMenuCommentsView;
    }

    public static MenuCommentsBinding bind(View view) {
        if (view != null) {
            return new MenuCommentsBinding((RealMenuCommentsView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static MenuCommentsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MenuCommentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.menu_comments, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.f99
    public RealMenuCommentsView getRoot() {
        return this.rootView;
    }
}
