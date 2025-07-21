package com.nytimes.android.readerhybrid;

import android.content.Context;
import android.util.AttributeSet;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.wd3;

/* loaded from: classes4.dex */
public abstract class b extends a implements ix2 {
    private ViewComponentManager j;
    private boolean k;

    b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f();
    }

    public final ViewComponentManager d() {
        if (this.j == null) {
            this.j = e();
        }
        return this.j;
    }

    protected ViewComponentManager e() {
        return new ViewComponentManager(this, false);
    }

    protected void f() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((wd3) generatedComponent()).c((HybridWebView) nx8.a(this));
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return d().generatedComponent();
    }
}
