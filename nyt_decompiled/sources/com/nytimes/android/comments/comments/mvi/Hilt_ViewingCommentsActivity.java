package com.nytimes.android.comments.comments.mvi;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t;
import defpackage.hx2;
import defpackage.ix2;
import defpackage.jk;
import defpackage.m4;
import defpackage.nx8;
import defpackage.pe5;
import defpackage.w97;
import defpackage.zk1;

/* loaded from: classes4.dex */
public abstract class Hilt_ViewingCommentsActivity extends jk implements ix2 {
    private volatile m4 componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private w97 savedStateHandleHolder;

    Hilt_ViewingCommentsActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new pe5() { // from class: com.nytimes.android.comments.comments.mvi.Hilt_ViewingCommentsActivity.1
            @Override // defpackage.pe5
            public void onContextAvailable(Context context) {
                Hilt_ViewingCommentsActivity.this.inject();
            }
        });
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
        ((ViewingCommentsActivity_GeneratedInjector) generatedComponent()).injectViewingCommentsActivity((ViewingCommentsActivity) nx8.a(this));
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // defpackage.jk, androidx.fragment.app.f, android.app.Activity
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

    Hilt_ViewingCommentsActivity(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
