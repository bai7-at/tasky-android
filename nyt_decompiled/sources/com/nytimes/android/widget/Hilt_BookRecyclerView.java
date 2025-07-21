package com.nytimes.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.ix2;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class Hilt_BookRecyclerView extends RecyclerView implements ix2 {
    private ViewComponentManager componentManager;
    private boolean injected;

    Hilt_BookRecyclerView(Context context) {
        super(context);
        inject();
    }

    protected ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return m781componentManager().generatedComponent();
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((BookRecyclerView_GeneratedInjector) generatedComponent()).injectBookRecyclerView((BookRecyclerView) nx8.a(this));
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ViewComponentManager m781componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    Hilt_BookRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inject();
    }

    Hilt_BookRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inject();
    }
}
