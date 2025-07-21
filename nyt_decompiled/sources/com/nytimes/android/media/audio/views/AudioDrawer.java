package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cx;
import defpackage.fg6;
import defpackage.fy;
import defpackage.ww;
import defpackage.xw;
import defpackage.yh6;

/* loaded from: classes4.dex */
public class AudioDrawer extends h implements xw {
    private AudioInfoView l;
    private AudioLayoutFooter m;
    ww presenter;

    public AudioDrawer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.xw
    public void I(cx cxVar) {
        this.m.g(cxVar);
    }

    @Override // defpackage.xw
    public void P(fy fyVar) {
        this.l.b(fyVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.a0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.L();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.l = (AudioInfoView) findViewById(fg6.audio_info);
        this.m = (AudioLayoutFooter) findViewById(fg6.audio_footer);
    }

    public AudioDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), yh6.audio_drawer_contents, this);
    }
}
