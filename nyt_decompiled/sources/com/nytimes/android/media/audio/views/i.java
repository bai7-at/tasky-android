package com.nytimes.android.media.audio.views;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t;
import defpackage.aq2;
import defpackage.f16;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.sw;
import defpackage.zk1;

/* loaded from: classes4.dex */
abstract class i extends com.google.android.material.bottomsheet.b implements ix2 {
    private ContextWrapper b;
    private boolean c;
    private volatile dagger.hilt.android.internal.managers.a d;
    private final Object e = new Object();
    private boolean f = false;

    i() {
    }

    private void h1() {
        if (this.b == null) {
            this.b = dagger.hilt.android.internal.managers.a.b(super.getContext(), this);
            this.c = aq2.a(super.getContext());
        }
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.d = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    protected dagger.hilt.android.internal.managers.a createComponentManager() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.c) {
            return null;
        }
        h1();
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        return zk1.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((sw) generatedComponent()).l((AudioDrawerDialogFragment) nx8.a(this));
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        h1();
        inject();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.a.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.b;
        f16.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h1();
        inject();
    }
}
