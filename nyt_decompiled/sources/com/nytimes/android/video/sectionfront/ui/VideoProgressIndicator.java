package com.nytimes.android.video.sectionfront.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public class VideoProgressIndicator extends ProgressBar {
    public VideoProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.progressBarStyle);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(4);
    }

    public VideoProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
