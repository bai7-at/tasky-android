package com.nytimes.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eg6;
import defpackage.f99;
import defpackage.g99;
import defpackage.wh6;

/* loaded from: classes4.dex */
public final class RecentsEmptyViewBinding implements f99 {
    public final Button recentLoginButton;
    public final Button recentSubscribeButton;
    public final TextView recentsEmptyDesc;
    public final TextView recentsEmptyTitle;
    public final ConstraintLayout recentsEmptyView;
    private final ConstraintLayout rootView;

    private RecentsEmptyViewBinding(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.recentLoginButton = button;
        this.recentSubscribeButton = button2;
        this.recentsEmptyDesc = textView;
        this.recentsEmptyTitle = textView2;
        this.recentsEmptyView = constraintLayout2;
    }

    public static RecentsEmptyViewBinding bind(View view) {
        int i = eg6.recent_login_button;
        Button button = (Button) g99.a(view, i);
        if (button != null) {
            i = eg6.recent_subscribe_button;
            Button button2 = (Button) g99.a(view, i);
            if (button2 != null) {
                i = eg6.recents_empty_desc;
                TextView textView = (TextView) g99.a(view, i);
                if (textView != null) {
                    i = eg6.recents_empty_title;
                    TextView textView2 = (TextView) g99.a(view, i);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new RecentsEmptyViewBinding(constraintLayout, button, button2, textView, textView2, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static RecentsEmptyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RecentsEmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(wh6.recents_empty_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // defpackage.f99
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
