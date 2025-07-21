package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.vy;

/* loaded from: classes4.dex */
abstract class l extends RelativeLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    l(Context context, AttributeSet attributeSet, int i) {
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
        ((vy) generatedComponent()).m((AudioOnboardingBar) nx8.a(this));
    }
}
