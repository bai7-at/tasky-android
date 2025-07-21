package com.google.android.gms.ads.internal.client;

import android.content.Context;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.nod;

/* loaded from: classes2.dex */
final class h extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ zzq c;
    final /* synthetic */ String d;
    final /* synthetic */ n e;

    h(n nVar, Context context, zzq zzqVar, String str) {
        this.b = context;
        this.c = zzqVar;
        this.d = str;
        this.e = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object a() {
        n.p(this.b, "search");
        return new nod();
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.c4(fc5.l3(this.b), this.c, this.d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        i0 i0Var;
        i0Var = this.e.a;
        return i0Var.a(this.b, this.c, this.d, null, 3);
    }
}
