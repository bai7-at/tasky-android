package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.kw;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class g extends LinearLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n();
    }

    public final ViewComponentManager b() {
        if (this.a == null) {
            this.a = j();
        }
        return this.a;
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    protected ViewComponentManager j() {
        return new ViewComponentManager(this, false);
    }

    protected void n() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((kw) generatedComponent()).r((AudioControlView) nx8.a(this));
    }
}
