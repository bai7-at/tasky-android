package com.google.android.gms.ads.internal.client;

import android.content.Context;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.h3b;
import defpackage.nod;

/* loaded from: classes2.dex */
final class f extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ zzq c;
    final /* synthetic */ String d;
    final /* synthetic */ h3b e;
    final /* synthetic */ n f;

    f(n nVar, Context context, zzq zzqVar, String str, h3b h3bVar) {
        this.b = context;
        this.c = zzqVar;
        this.d = str;
        this.e = h3bVar;
        this.f = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object a() {
        n.p(this.b, "banner");
        return new nod();
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.A0(fc5.l3(this.b), this.c, this.d, this.e, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        i0 i0Var;
        i0Var = this.f.a;
        return i0Var.a(this.b, this.c, this.d, this.e, 1);
    }
}
