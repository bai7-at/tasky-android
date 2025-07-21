package com.nytimes.xwords.hybrid.view.spellingbee;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.nytimes.xwords.hybrid.view.BaseHybridFragment;
import defpackage.aq2;
import defpackage.f16;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.wy7;

/* loaded from: classes4.dex */
public abstract class a extends BaseHybridFragment {
    private ContextWrapper L;
    private boolean M;
    private boolean N;

    a(int i) {
        super(i);
        this.N = false;
    }

    private void b1() {
        if (this.L == null) {
            this.L = dagger.hilt.android.internal.managers.a.b(super.getContext(), this);
            this.M = aq2.a(super.getContext());
        }
    }

    @Override // com.nytimes.xwords.hybrid.view.b, com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.M) {
            return null;
        }
        b1();
        return this.L;
    }

    @Override // com.nytimes.xwords.hybrid.view.b, com.nytimes.xwords.hybrid.view.c
    protected void inject() {
        if (this.N) {
            return;
        }
        this.N = true;
        ((wy7) ((ix2) nx8.a(this)).generatedComponent()).o((SpellingBeeHybridFragment) nx8.a(this));
    }

    @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment, com.nytimes.xwords.hybrid.view.b, com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        b1();
        inject();
    }

    @Override // com.nytimes.xwords.hybrid.view.b, com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.a.c(onGetLayoutInflater, this));
    }

    @Override // com.nytimes.xwords.hybrid.view.b, com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.L;
        f16.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        b1();
        inject();
    }
}
