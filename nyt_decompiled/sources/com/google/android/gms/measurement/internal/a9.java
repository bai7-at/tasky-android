package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.erf;
import defpackage.slf;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class a9 {
    final /* synthetic */ b9 a;

    a9(b9 b9Var) {
        this.a = b9Var;
    }

    final void a() {
        this.a.c();
        if (this.a.a.E().u(this.a.a.p().currentTimeMillis())) {
            this.a.a.E().l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.a.o().u().a("Detected application was in foreground");
                c(this.a.a.p().currentTimeMillis(), false);
            }
        }
    }

    final void b(long j, boolean z) {
        this.a.c();
        this.a.r();
        if (this.a.a.E().u(j)) {
            this.a.a.E().l.a(true);
            erf.b();
            if (this.a.a.y().A(null, m3.K0)) {
                this.a.a.A().u();
            }
        }
        this.a.a.E().o.b(j);
        if (this.a.a.E().l.b()) {
            c(j, z);
        }
    }

    final void c(long j, boolean z) {
        this.a.c();
        if (this.a.a.k()) {
            this.a.a.E().o.b(j);
            this.a.a.o().u().b("Session started, time", Long.valueOf(this.a.a.p().elapsedRealtime()));
            long j2 = j / 1000;
            this.a.a.H().N(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", Long.valueOf(j2), j);
            this.a.a.E().l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            if (this.a.a.y().A(null, m3.c0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.a.H().v(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j, bundle);
            slf.b();
            if (this.a.a.y().A(null, m3.f0)) {
                String a = this.a.a.E().t.a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a);
                this.a.a.H().v(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j, bundle2);
            }
        }
    }
}
