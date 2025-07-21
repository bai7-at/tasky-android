package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.v7f;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class y6 implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ z6 a;

    /* synthetic */ y6(z6 z6Var, v7f v7fVar) {
        this.a = z6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a5 a5Var;
        try {
            try {
                this.a.a.o().u().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    a5Var = this.a.a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.a.a.M();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        this.a.a.e().y(new x6(this, bundle == null, data, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO, data.getQueryParameter("referrer")));
                        a5Var = this.a.a;
                    }
                    a5Var = this.a.a;
                }
            } catch (RuntimeException e) {
                this.a.a.o().n().b("Throwable caught in onActivityCreated", e);
                a5Var = this.a.a;
            }
            a5Var.J().y(activity, bundle);
        } catch (Throwable th) {
            this.a.a.J().y(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.a.J().z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.a.J().A(activity);
        b9 L = this.a.a.L();
        L.a.e().y(new u8(L, L.a.p().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b9 L = this.a.a.L();
        L.a.e().y(new t8(L, L.a.p().elapsedRealtime()));
        this.a.a.J().B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.a.J().C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
