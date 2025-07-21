package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.z69;

/* loaded from: classes4.dex */
abstract class g extends FrameLayout implements ix2 {
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
        ((z69) generatedComponent()).j((VideoControlView) nx8.a(this));
    }
}
