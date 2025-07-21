package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.k2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.t1;

/* loaded from: classes2.dex */
final class n implements l {
    private final a2 a;
    private final o b;

    n(Context context, a2 a2Var) {
        this.b = new o(context);
        this.a = a2Var;
    }

    @Override // com.android.billingclient.api.l
    public final void a(p2 p2Var) {
        try {
            k2 u = l2.u();
            a2 a2Var = this.a;
            if (a2Var != null) {
                u.i(a2Var);
            }
            u.k(p2Var);
            this.b.a((l2) u.c());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.k.i("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.l
    public final void b(p1 p1Var) {
        try {
            k2 u = l2.u();
            a2 a2Var = this.a;
            if (a2Var != null) {
                u.i(a2Var);
            }
            u.g(p1Var);
            this.b.a((l2) u.c());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.k.i("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.l
    public final void c(t1 t1Var) {
        try {
            k2 u = l2.u();
            a2 a2Var = this.a;
            if (a2Var != null) {
                u.i(a2Var);
            }
            u.h(t1Var);
            this.b.a((l2) u.c());
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.k.i("BillingLogger", "Unable to log.");
        }
    }
}
