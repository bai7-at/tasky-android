package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ey;
import defpackage.ix2;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class j extends CardView implements ix2 {
    private ViewComponentManager j;
    private boolean k;

    j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o();
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return j().generatedComponent();
    }

    public final ViewComponentManager j() {
        if (this.j == null) {
            this.j = n();
        }
        return this.j;
    }

    protected ViewComponentManager n() {
        return new ViewComponentManager(this, false);
    }

    protected void o() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((ey) generatedComponent()).f((AudioIndicator) nx8.a(this));
    }
}
