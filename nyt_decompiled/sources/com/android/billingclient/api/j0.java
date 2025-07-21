package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import defpackage.ata;
import defpackage.n86;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class j0 implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ n86 b;
    final /* synthetic */ b c;

    j0(b bVar, String str, n86 n86Var) {
        this.c = bVar;
        this.a = str;
        this.b = n86Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ata v = b.v(this.c, this.a, 9);
        if (v.b() != null) {
            this.b.a(v.a(), v.b());
            return null;
        }
        this.b.a(v.a(), zzu.p());
        return null;
    }
}
