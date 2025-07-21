package com.nytimes.android.video.sectionfront.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.nytimes.android.media.util.VideoDateUtil;
import defpackage.e79;
import defpackage.gd6;
import defpackage.mx0;
import defpackage.nl6;
import defpackage.ud6;

/* loaded from: classes4.dex */
public class VideoCoverTimeTextView extends AppCompatTextView {
    private final String h;
    private final int i;
    private final int j;
    private final float k;
    private final float l;

    public VideoCoverTimeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void r(int i, float f) {
        setTextColor(i);
        setTextSize(0, f);
    }

    public void s(e79 e79Var) {
        if (e79Var.i()) {
            r(this.j, this.l);
            setText(this.h);
            setVisibility(0);
        } else {
            r(this.i, this.k);
            if (e79Var.c() == 0) {
                setVisibility(8);
            } else {
                setText(VideoDateUtil.getDurationString(e79Var.c()));
                setVisibility(0);
            }
        }
    }

    public VideoCoverTimeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = getResources().getString(nl6.live_video_cover_text);
        this.i = mx0.c(context, gd6.static_white);
        this.j = mx0.c(context, gd6.signal_breaking);
        this.k = getResources().getDimension(ud6.video_cover_default_text_size);
        this.l = getResources().getDimension(ud6.video_cover_live_text_size);
    }
}
