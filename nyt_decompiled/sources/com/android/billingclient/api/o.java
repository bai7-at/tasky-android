package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.l2;
import defpackage.b32;
import defpackage.br8;
import defpackage.f12;
import defpackage.hs8;
import defpackage.yr8;

/* loaded from: classes2.dex */
final class o {
    private boolean a;
    private yr8 b;

    o(Context context) {
        try {
            hs8.f(context);
            this.b = hs8.c().g(com.google.android.datatransport.cct.a.g).a("PLAY_BILLING_LIBRARY", l2.class, f12.b("proto"), new br8() { // from class: eha
                @Override // defpackage.br8
                public final Object apply(Object obj) {
                    return ((l2) obj).c();
                }
            });
        } catch (Throwable unused) {
            this.a = true;
        }
    }

    public final void a(l2 l2Var) {
        if (this.a) {
            com.google.android.gms.internal.play_billing.k.i("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.b.b(b32.d(l2Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.k.i("BillingLogger", "logging failed.");
        }
    }
}
