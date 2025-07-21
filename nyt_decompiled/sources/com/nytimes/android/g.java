package com.nytimes.android;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t;
import com.nytimes.android.articlefront.BaseArticleActivity;
import defpackage.bt7;
import defpackage.hx2;
import defpackage.ix2;
import defpackage.m4;
import defpackage.nx8;
import defpackage.pe5;
import defpackage.w97;
import defpackage.zk1;

/* loaded from: classes2.dex */
public abstract class g extends BaseArticleActivity implements ix2 {
    private w97 b;
    private volatile m4 c;
    private final Object d = new Object();
    private boolean e = false;

    class a implements pe5 {
        a() {
        }

        @Override // defpackage.pe5
        public void onContextAvailable(Context context) {
            g.this.inject();
        }
    }

    g() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof hx2) {
            w97 b = componentManager().b();
            this.b = b;
            if (b.b()) {
                this.b.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final m4 componentManager() {
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
        if (this.e) {
            return;
        }
        this.e = true;
        ((bt7) generatedComponent()).p0((SingleArticleActivity) nx8.a(this));
    }

    @Override // com.nytimes.android.articlefront.BaseArticleActivity, com.nytimes.android.BaseAppCompatActivity, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.nytimes.android.BaseAppCompatActivity, defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w97 w97Var = this.b;
        if (w97Var != null) {
            w97Var.a();
        }
    }
}
