package com.nytimes.android.bestsellers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.s90;

/* loaded from: classes.dex */
abstract class c extends CardView implements ix2 {
    private ViewComponentManager j;
    private boolean k;

    c(Context context, AttributeSet attributeSet, int i) {
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
        ((s90) generatedComponent()).e((BookDialogView) nx8.a(this));
    }
}
