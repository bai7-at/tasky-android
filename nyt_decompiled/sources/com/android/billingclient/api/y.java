package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import defpackage.cc;
import defpackage.lja;
import defpackage.o86;

/* loaded from: classes2.dex */
final class y {
    private final Context a;
    private final x b;

    /* JADX WARN: Multi-variable type inference failed */
    y(Context context, lja ljaVar, l lVar) {
        this.a = context;
        this.b = new x(this, null, lVar, 0 == true ? 1 : 0);
    }

    final lja b() {
        x.a(this.b);
        return null;
    }

    final o86 c() {
        o86 o86Var;
        o86Var = this.b.a;
        return o86Var;
    }

    final void d() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.b.c(this.a, intentFilter);
    }

    y(Context context, o86 o86Var, cc ccVar, l lVar) {
        this.a = context;
        this.b = new x(this, o86Var, ccVar, lVar, null);
    }
}
