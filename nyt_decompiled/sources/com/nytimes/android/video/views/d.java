package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.p72;

/* loaded from: classes4.dex */
abstract class d extends FrameLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o();
    }

    public final ViewComponentManager b() {
        if (this.a == null) {
            this.a = n();
        }
        return this.a;
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    protected ViewComponentManager n() {
        return new ViewComponentManager(this, false);
    }

    protected void o() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((p72) generatedComponent()).o((ExoPlayerView) nx8.a(this));
    }
}
