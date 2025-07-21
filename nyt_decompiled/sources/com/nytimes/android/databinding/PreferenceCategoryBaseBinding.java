package com.nytimes.android.databinding;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.f99;
import defpackage.g99;
import defpackage.wh6;

/* loaded from: classes4.dex */
public final class PreferenceCategoryBaseBinding implements f99 {
    private final FrameLayout rootView;
    public final TextView title;

    private PreferenceCategoryBaseBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.title = textView;
    }

    public static PreferenceCategoryBaseBinding bind(View view) {
        TextView textView = (TextView) g99.a(view, R.id.title);
        if (textView != null) {
            return new PreferenceCategoryBaseBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.title)));
    }

    public static PreferenceCategoryBaseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceCategoryBaseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(wh6.preference_category_base, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.f99
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
