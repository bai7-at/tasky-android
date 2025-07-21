package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.i69;
import defpackage.ix2;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class f extends RelativeLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    f(Context context, AttributeSet attributeSet, int i) {
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
        ((i69) generatedComponent()).q((VideoBottomActionsView) nx8.a(this));
    }
}
