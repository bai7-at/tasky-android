package com.nytimes.android.comments.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.nytimes.android.comments.R;
import defpackage.f99;
import defpackage.g99;

/* loaded from: classes4.dex */
public final class ViewActionCommentsBinding implements f99 {
    public final TextView btnCommentsAction;
    private final View rootView;

    private ViewActionCommentsBinding(View view, TextView textView) {
        this.rootView = view;
        this.btnCommentsAction = textView;
    }

    public static ViewActionCommentsBinding bind(View view) {
        int i = R.id.btnCommentsAction;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            return new ViewActionCommentsBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ViewActionCommentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_action_comments, viewGroup);
        return bind(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.rootView;
    }
}
