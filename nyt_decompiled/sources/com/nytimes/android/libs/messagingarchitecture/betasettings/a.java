package com.nytimes.android.libs.messagingarchitecture.betasettings;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.t;
import defpackage.gs4;
import defpackage.hx2;
import defpackage.ix2;
import defpackage.m4;
import defpackage.nx8;
import defpackage.pe5;
import defpackage.w97;
import defpackage.zk1;

/* loaded from: classes4.dex */
public abstract class a extends ComponentActivity implements ix2 {
    private w97 a;
    private volatile m4 b;
    private final Object c = new Object();
    private boolean d = false;

    /* renamed from: com.nytimes.android.libs.messagingarchitecture.betasettings.a$a, reason: collision with other inner class name */
    class C0339a implements pe5 {
        C0339a() {
        }

        @Override // defpackage.pe5
        public void onContextAvailable(Context context) {
            a.this.inject();
        }
    }

    a() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new C0339a());
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
        ((gs4) generatedComponent()).I((MessagingBetaSettingsActivity) nx8.a(this));
    }

    @Override // androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w97 w97Var = this.a;
        if (w97Var != null) {
            w97Var.a();
        }
    }
}
