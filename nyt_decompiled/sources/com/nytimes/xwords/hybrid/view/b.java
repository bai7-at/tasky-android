package com.nytimes.xwords.hybrid.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.aq2;
import defpackage.f16;
import defpackage.ix2;
import defpackage.m50;
import defpackage.nx8;

/* loaded from: classes4.dex */
public abstract class b extends a {
    private ContextWrapper h;
    private boolean i;
    private boolean j;

    b(int i) {
        super(i);
        this.j = false;
    }

    private void b1() {
        if (this.h == null) {
            this.h = dagger.hilt.android.internal.managers.a.b(super.getContext(), this);
            this.i = aq2.a(super.getContext());
        }
    }

    @Override // com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.i) {
            return null;
        }
        b1();
        return this.h;
    }

    @Override // com.nytimes.xwords.hybrid.view.c
    protected void inject() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((m50) ((ix2) nx8.a(this)).generatedComponent()).s((BaseHybridFragment) nx8.a(this));
    }

    @Override // com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        b1();
        inject();
    }

    @Override // com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.a.c(onGetLayoutInflater, this));
    }

    @Override // com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.h;
        f16.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b1();
        inject();
    }
}
