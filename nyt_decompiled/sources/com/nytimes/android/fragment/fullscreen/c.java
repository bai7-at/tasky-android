package com.nytimes.android.fragment.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import defpackage.aq2;
import defpackage.cs2;
import defpackage.f16;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.zk1;

/* loaded from: classes4.dex */
public abstract class c extends Fragment implements ix2 {
    private ContextWrapper a;
    private boolean b;
    private volatile dagger.hilt.android.internal.managers.a c;
    private final Object d = new Object();
    private boolean e = false;

    c() {
    }

    private void b1() {
        if (this.a == null) {
            this.a = dagger.hilt.android.internal.managers.a.b(super.getContext(), this);
            this.b = aq2.a(super.getContext());
        }
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.c;
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
        if (super.getContext() == null && !this.b) {
            return null;
        }
        b1();
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        return zk1.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((cs2) generatedComponent()).g((FullscreenAdFragment) nx8.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        b1();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.a.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        f16.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b1();
        inject();
    }
}
