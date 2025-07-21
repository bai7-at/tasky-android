package com.nytimes.abtests;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.d44;
import defpackage.es7;
import defpackage.jk;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class a implements es7 {
    private final AbraManager a;
    private final ET2Scope b;
    private final C0226a c;

    /* renamed from: com.nytimes.abtests.a$a, reason: collision with other inner class name */
    public static final class C0226a extends FragmentManager.k {
        C0226a() {
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public void f(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            zq3.h(fragmentManager, "fm");
            zq3.h(fragment, QueryKeys.VISIT_FREQUENCY);
            ReaderABReporter.d.a(fragment, a.this.a, a.this.b);
        }
    }

    public a(AbraManager abraManager, ET2Scope eT2Scope) {
        zq3.h(abraManager, "abraManager");
        zq3.h(eT2Scope, "et2Scope");
        this.a = abraManager;
        this.b = eT2Scope;
        this.c = new C0226a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        if (activity instanceof jk) {
            ((jk) activity).getSupportFragmentManager().m1(this.c, true);
            ReaderABReporter.d.a((d44) activity, this.a, this.b);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        zq3.h(activity, "activity");
        if (activity instanceof jk) {
            ((jk) activity).getSupportFragmentManager().E1(this.c);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        es7.a.c(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        es7.a.d(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        es7.a.e(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        es7.a.f(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        es7.a.g(this, activity);
    }
}
