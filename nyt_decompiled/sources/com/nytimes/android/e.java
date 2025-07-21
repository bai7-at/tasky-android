package com.nytimes.android;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t;
import defpackage.hx2;
import defpackage.ix2;
import defpackage.m4;
import defpackage.nx8;
import defpackage.pe5;
import defpackage.w97;
import defpackage.xd4;
import defpackage.zk1;

/* loaded from: classes2.dex */
public abstract class e extends BaseAppCompatActivity implements ix2 {
    private volatile m4 componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private w97 savedStateHandleHolder;

    class a implements pe5 {
        a() {
        }

        @Override // defpackage.pe5
        public void onContextAvailable(Context context) {
            e.this.inject();
        }
    }

    e() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof hx2) {
            w97 b = componentManager().b();
            this.savedStateHandleHolder = b;
            if (b.b()) {
                this.savedStateHandleHolder.c(getDefaultViewModelCreationExtras());
            }
        }
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
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((xd4) generatedComponent()).h((MainActivity) nx8.a(this));
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w97 w97Var = this.savedStateHandleHolder;
        if (w97Var != null) {
            w97Var.a();
        }
    }

    public final m4 componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }
}
