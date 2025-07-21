package com.nytimes.android.sectionfront;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.aq2;
import defpackage.f16;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.o97;

/* loaded from: classes4.dex */
abstract class a extends SectionFrontFragment {
    private boolean B = false;
    private ContextWrapper x;
    private boolean y;

    a() {
    }

    private void c1() {
        if (this.x == null) {
            this.x = dagger.hilt.android.internal.managers.a.b(super.getContext(), this);
            this.y = aq2.a(super.getContext());
        }
    }

    @Override // com.nytimes.android.sectionfront.b, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.y) {
            return null;
        }
        c1();
        return this.x;
    }

    @Override // com.nytimes.android.sectionfront.b
    protected void inject() {
        if (this.B) {
            return;
        }
        this.B = true;
        ((o97) ((ix2) nx8.a(this)).generatedComponent()).y((SavedSectionFrontFragment) nx8.a(this));
    }

    @Override // com.nytimes.android.sectionfront.b, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        c1();
        inject();
    }

    @Override // com.nytimes.android.sectionfront.b, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.a.c(onGetLayoutInflater, this));
    }

    @Override // com.nytimes.android.sectionfront.b, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.x;
        f16.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c1();
        inject();
    }
}
