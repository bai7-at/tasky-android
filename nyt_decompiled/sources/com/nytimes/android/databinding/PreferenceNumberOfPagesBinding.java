package com.nytimes.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eg6;
import defpackage.f99;
import defpackage.g99;
import defpackage.wh6;

/* loaded from: classes4.dex */
public final class PreferenceNumberOfPagesBinding implements f99 {
    public final TextView numberOfRecentsLoaded;
    public final TextView numberOfRecentsLoadedCaption;
    public final SeekBar numberOfRecentsLoadedSeekbar;
    private final ConstraintLayout rootView;

    private PreferenceNumberOfPagesBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, SeekBar seekBar) {
        this.rootView = constraintLayout;
        this.numberOfRecentsLoaded = textView;
        this.numberOfRecentsLoadedCaption = textView2;
        this.numberOfRecentsLoadedSeekbar = seekBar;
    }

    public static PreferenceNumberOfPagesBinding bind(View view) {
        int i = eg6.number_of_recents_loaded;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = eg6.number_of_recents_loaded_caption;
            TextView textView2 = (TextView) g99.a(view, i);
            if (textView2 != null) {
                i = eg6.number_of_recents_loaded_seekbar;
                SeekBar seekBar = (SeekBar) g99.a(view, i);
                if (seekBar != null) {
                    return new PreferenceNumberOfPagesBinding((ConstraintLayout) view, textView, textView2, seekBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PreferenceNumberOfPagesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PreferenceNumberOfPagesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(wh6.preference_number_of_pages, viewGroup, false);
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
