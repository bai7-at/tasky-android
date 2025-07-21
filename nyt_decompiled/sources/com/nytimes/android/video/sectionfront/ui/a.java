package com.nytimes.android.video.sectionfront.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.f79;
import defpackage.ix2;
import defpackage.nx8;

/* loaded from: classes4.dex */
public abstract class a extends ConstraintLayout implements ix2 {
    private ViewComponentManager a;
    private boolean b;

    a(Context context, AttributeSet attributeSet, int i) {
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
        return new ViewComponentManager(this, false);
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
        ((f79) generatedComponent()).a((VideoCover) nx8.a(this));
    }
}
