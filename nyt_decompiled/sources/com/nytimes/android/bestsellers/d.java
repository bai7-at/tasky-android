package com.nytimes.android.bestsellers;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t;
import com.nytimes.android.BaseAppCompatActivity;
import defpackage.hx2;
import defpackage.ix2;
import defpackage.ka0;
import defpackage.m4;
import defpackage.nx8;
import defpackage.pe5;
import defpackage.w97;
import defpackage.zk1;

/* loaded from: classes.dex */
abstract class d extends BaseAppCompatActivity implements ix2 {
    private w97 a;
    private volatile m4 b;
    private final Object c = new Object();
    private boolean d = false;

    class a implements pe5 {
        a() {
        }

        @Override // defpackage.pe5
        public void onContextAvailable(Context context) {
            d.this.inject();
        }
    }

    d() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof hx2) {
            w97 b = componentManager().b();
            this.a = b;
            if (b.b()) {
                this.a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final m4 componentManager() {
        if (this.b == null) {
            synchronized (this.c) {
                try {
                    if (this.b == null) {
                        this.b = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    protected m4 createComponentManager() {
        return new m4(this);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        return zk1.a(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((ka0) generatedComponent()).k((BooksBestSellersActivity) nx8.a(this));
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w97 w97Var = this.a;
        if (w97Var != null) {
            w97Var.a();
        }
    }
}
