package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.jy;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class k extends RelativeLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public final ViewComponentManager a() {
        if (this.a == null) {
            this.a = b();
        }
        return this.a;
    }

    protected ViewComponentManager b() {
        return new ViewComponentManager(this, false);
    }

    protected void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((jy) generatedComponent()).i((AudioLayoutFooter) nx8.a(this));
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return a().generatedComponent();
    }
}
