package com.nytimes.android.sectionfront.ui;

import android.content.Context;
import android.util.AttributeSet;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.a1;
import defpackage.hg1;
import defpackage.ix2;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class a extends a1 implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    public final ViewComponentManager e() {
        if (this.a == null) {
            this.a = f();
        }
        return this.a;
    }

    protected ViewComponentManager f() {
        return new ViewComponentManager(this, false);
    }

    protected void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((hg1) generatedComponent()).k((DefaultArticleSummary) nx8.a(this));
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return e().generatedComponent();
    }
}
