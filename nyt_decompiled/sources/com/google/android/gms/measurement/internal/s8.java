package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.wbf;

/* loaded from: classes3.dex */
public final class s8 {
    private final Context a;

    public s8(Context context) {
        Preconditions.checkNotNull(context);
        this.a = context;
    }

    private final x3 k() {
        return a5.G(this.a, null, null).o();
    }

    public final int a(final Intent intent, int i, final int i2) {
        a5 G = a5.G(this.a, null, null);
        final x3 o = G.o();
        if (intent == null) {
            o.v().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        G.q();
        o.u().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.q8
                @Override // java.lang.Runnable
                public final void run() {
                    s8.this.c(i2, o, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().n().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new t5(r9.d0(this.a), null);
        }
        k().v().b("onBind received unknown action", action);
        return null;
    }

    final /* synthetic */ void c(int i, x3 x3Var, Intent intent) {
        if (((wbf) this.a).a(i)) {
            x3Var.u().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            k().u().a("Completed wakeful intent.");
            ((wbf) this.a).b(intent);
        }
    }

    final /* synthetic */ void d(x3 x3Var, JobParameters jobParameters) {
        x3Var.u().a("AppMeasurementJobService processed last upload request.");
        ((wbf) this.a).c(jobParameters, false);
    }

    public final void e() {
        a5 G = a5.G(this.a, null, null);
        x3 o = G.o();
        G.q();
        o.u().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        a5 G = a5.G(this.a, null, null);
        x3 o = G.o();
        G.q();
        o.u().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().n().a("onRebind called with null intent");
        } else {
            k().u().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) {
        r9 d0 = r9.d0(this.a);
        d0.e().y(new r8(this, d0, runnable));
    }

    public final boolean i(final JobParameters jobParameters) {
        a5 G = a5.G(this.a, null, null);
        final x3 o = G.o();
        String string = jobParameters.getExtras().getString("action");
        G.q();
        o.u().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        h(new Runnable() { // from class: com.google.android.gms.measurement.internal.p8
            @Override // java.lang.Runnable
            public final void run() {
                s8.this.d(o, jobParameters);
            }
        });
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().n().a("onUnbind called with null intent");
            return true;
        }
        k().u().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
