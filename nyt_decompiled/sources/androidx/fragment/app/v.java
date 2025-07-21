package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.t;
import defpackage.aa7;
import defpackage.sa9;
import defpackage.t21;
import defpackage.xx4;
import defpackage.z97;

/* loaded from: classes.dex */
class v implements androidx.lifecycle.d, aa7, sa9 {
    private final Fragment a;
    private final androidx.lifecycle.u b;
    private final Runnable c;
    private t.b d;
    private androidx.lifecycle.h e = null;
    private z97 f = null;

    v(Fragment fragment, androidx.lifecycle.u uVar, Runnable runnable) {
        this.a = fragment;
        this.b = uVar;
        this.c = runnable;
    }

    void a(Lifecycle.Event event) {
        this.e.i(event);
    }

    void b() {
        if (this.e == null) {
            this.e = new androidx.lifecycle.h(this);
            z97 a = z97.a(this);
            this.f = a;
            a.c();
            this.c.run();
        }
    }

    boolean c() {
        return this.e != null;
    }

    void d(Bundle bundle) {
        this.f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f.e(bundle);
    }

    void f(Lifecycle.State state) {
        this.e.n(state);
    }

    @Override // androidx.lifecycle.d
    public t21 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        xx4 xx4Var = new xx4();
        if (application != null) {
            xx4Var.c(t.a.h, application);
        }
        xx4Var.c(SavedStateHandleSupport.a, this.a);
        xx4Var.c(SavedStateHandleSupport.b, this);
        if (this.a.getArguments() != null) {
            xx4Var.c(SavedStateHandleSupport.c, this.a.getArguments());
        }
        return xx4Var;
    }

    @Override // androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        Application application;
        t.b defaultViewModelProviderFactory = this.a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.a.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = this.a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.a;
            this.d = new androidx.lifecycle.o(application, fragment, fragment.getArguments());
        }
        return this.d;
    }

    @Override // defpackage.d44
    public Lifecycle getLifecycle() {
        b();
        return this.e;
    }

    @Override // defpackage.aa7
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f.b();
    }

    @Override // defpackage.sa9
    public androidx.lifecycle.u getViewModelStore() {
        b();
        return this.b;
    }
}
