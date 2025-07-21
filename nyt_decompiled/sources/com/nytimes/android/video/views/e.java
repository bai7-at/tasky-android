package com.nytimes.android.video.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.rk3;

/* loaded from: classes4.dex */
public abstract class e extends ConstraintLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }

    public final ViewComponentManager componentManager() {
        if (this.a == null) {
            this.a = createComponentManager();
        }
        return this.a;
    }

    protected ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, true);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected void inject() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((rk3) generatedComponent()).b((InlineVideoView) nx8.a(this));
    }
}
