package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.p2;
import defpackage.g5c;
import defpackage.h80;
import defpackage.sx9;
import defpackage.yaa;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class k implements ServiceConnection {
    private final Object a = new Object();
    private boolean b = false;
    private h80 c;
    final /* synthetic */ b d;

    /* synthetic */ k(b bVar, h80 h80Var, sx9 sx9Var) {
        this.d = bVar;
        this.c = h80Var;
    }

    private final void c(d dVar) {
        synchronized (this.a) {
            try {
                h80 h80Var = this.c;
                if (h80Var != null) {
                    h80Var.a(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.k.a():java.lang.Object");
    }

    final /* synthetic */ void b() {
        l lVar;
        this.d.a = 0;
        this.d.g = null;
        lVar = this.d.f;
        d dVar = m.n;
        lVar.b(yaa.a(24, 6, dVar));
        c(dVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler w;
        Future A;
        d y;
        l lVar;
        com.google.android.gms.internal.play_billing.k.h("BillingClient", "Billing service connected.");
        this.d.g = g5c.O(iBinder);
        b bVar = this.d;
        Callable callable = new Callable() { // from class: com.android.billingclient.api.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                k.this.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.j
            @Override // java.lang.Runnable
            public final void run() {
                k.this.b();
            }
        };
        w = bVar.w();
        A = bVar.A(callable, 30000L, runnable, w);
        if (A == null) {
            y = this.d.y();
            lVar = this.d.f;
            lVar.b(yaa.a(25, 6, y));
            c(y);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l lVar;
        com.google.android.gms.internal.play_billing.k.i("BillingClient", "Billing service disconnected.");
        lVar = this.d.f;
        lVar.a(p2.u());
        this.d.g = null;
        this.d.a = 0;
        synchronized (this.a) {
            try {
                h80 h80Var = this.c;
                if (h80Var != null) {
                    h80Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
