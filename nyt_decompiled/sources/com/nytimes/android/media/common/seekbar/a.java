package com.nytimes.android.media.common.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.bl;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.wn4;

/* loaded from: classes4.dex */
abstract class a extends bl implements ix2 {
    private ViewComponentManager b;
    private boolean c;

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n();
    }

    public final ViewComponentManager b() {
        if (this.b == null) {
            this.b = j();
        }
        return this.b;
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    protected ViewComponentManager j() {
        return new ViewComponentManager(this, false);
    }

    protected void n() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((wn4) generatedComponent()).h((MediaSeekBar) nx8.a(this));
    }
}
