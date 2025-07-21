package com.google.android.gms.ads.internal.client;

import android.content.Context;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.h3b;
import defpackage.ocb;
import defpackage.wvd;

/* loaded from: classes2.dex */
final class m extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ String c;
    final /* synthetic */ h3b d;
    final /* synthetic */ n e;

    m(n nVar, Context context, String str, h3b h3bVar) {
        this.b = context;
        this.c = str;
        this.d = h3bVar;
        this.e = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        n.p(this.b, "rewarded");
        return new wvd();
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.h2(fc5.l3(this.b), this.c, this.d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        return ocb.a(this.b, this.c, this.d);
    }
}
