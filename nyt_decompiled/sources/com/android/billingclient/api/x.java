package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.zzu;
import defpackage.cc;
import defpackage.lja;
import defpackage.o86;
import defpackage.otd;
import defpackage.yaa;
import java.util.List;

/* loaded from: classes2.dex */
final class x extends BroadcastReceiver {
    private final o86 a;
    private final l b;
    private boolean c;
    final /* synthetic */ y d;

    /* synthetic */ x(y yVar, lja ljaVar, l lVar, otd otdVar) {
        this.d = yVar;
        this.a = null;
        this.b = lVar;
    }

    static /* bridge */ /* synthetic */ lja a(x xVar) {
        xVar.getClass();
        return null;
    }

    private final void d(Bundle bundle, d dVar, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.b.b(yaa.a(23, i, dVar));
            return;
        }
        try {
            this.b.b(p1.w(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.r.a()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.k.i("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final void c(Context context, IntentFilter intentFilter) {
        if (this.c) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this.d.b, intentFilter, 2);
        } else {
            context.registerReceiver(this.d.b, intentFilter);
        }
        this.c = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i = 1;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.k.i("BillingBroadcastManager", "Bundle is null.");
            l lVar = this.b;
            d dVar = m.j;
            lVar.b(yaa.a(11, 1, dVar));
            o86 o86Var = this.a;
            if (o86Var != null) {
                o86Var.a(dVar, null);
                return;
            }
            return;
        }
        d d = com.google.android.gms.internal.play_billing.k.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        if (string == "LAUNCH_BILLING_FLOW" || (string != null && string.equals("LAUNCH_BILLING_FLOW"))) {
            i = 2;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            List g = com.google.android.gms.internal.play_billing.k.g(extras);
            if (d.b() == 0) {
                this.b.c(yaa.b(i));
            } else {
                d(extras, d, i);
            }
            this.a.a(d, g);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (d.b() != 0) {
                d(extras, d, i);
                this.a.a(d, zzu.p());
                return;
            }
            com.google.android.gms.internal.play_billing.k.i("BillingBroadcastManager", "AlternativeBillingListener is null.");
            l lVar2 = this.b;
            d dVar2 = m.j;
            lVar2.b(yaa.a(15, i, dVar2));
            this.a.a(dVar2, zzu.p());
        }
    }

    /* synthetic */ x(y yVar, o86 o86Var, cc ccVar, l lVar, otd otdVar) {
        this.d = yVar;
        this.a = o86Var;
        this.b = lVar;
    }
}
