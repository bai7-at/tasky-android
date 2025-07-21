package com.nytimes.android.messaging.dock;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;

/* loaded from: classes4.dex */
public abstract class Hilt_DockView extends ConstraintLayout implements ix2 {
    private ViewComponentManager componentManager;
    private boolean injected;

    Hilt_DockView(Context context) {
        super(context);
        inject();
    }

    protected ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return m598componentManager().generatedComponent();
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((DockView_GeneratedInjector) generatedComponent()).injectDockView((DockView) nx8.a(this));
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ViewComponentManager m598componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    Hilt_DockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    Hilt_DockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }

    @TargetApi(21)
    Hilt_DockView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inject();
    }
}
