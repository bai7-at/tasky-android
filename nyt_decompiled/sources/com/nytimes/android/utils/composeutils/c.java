package com.nytimes.android.utils.composeutils;

import android.content.Context;
import android.util.AttributeSet;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.ks0;
import defpackage.nx8;

/* loaded from: classes4.dex */
public abstract class c extends a implements ix2 {
    private ViewComponentManager i;
    private boolean j;

    c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n();
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return l().generatedComponent();
    }

    public final ViewComponentManager l() {
        if (this.i == null) {
            this.i = m();
        }
        return this.i;
    }

    protected ViewComponentManager m() {
        return new ViewComponentManager(this, true);
    }

    protected void n() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((ks0) generatedComponent()).a((ComposeViewWithFragment) nx8.a(this));
    }
}
