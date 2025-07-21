package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.cgb;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.h3b;
import defpackage.hgb;
import defpackage.igb;
import defpackage.k8b;
import defpackage.mpa;
import defpackage.pla;

/* loaded from: classes2.dex */
final class c extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ h3b c;

    c(n nVar, Context context, h3b h3bVar) {
        this.b = context;
        this.c = h3bVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        n.p(this.b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        Context context = this.b;
        ee3 l3 = fc5.l3(context);
        mpa.a(context);
        if (((Boolean) pla.c().a(mpa.m9)).booleanValue()) {
            return cgbVar.z5(l3, this.c, 240304000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        Context context = this.b;
        ee3 l3 = fc5.l3(context);
        mpa.a(context);
        if (!((Boolean) pla.c().a(mpa.m9)).booleanValue()) {
            return null;
        }
        try {
            return ((w) igb.b(this.b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new hgb() { // from class: com.google.android.gms.ads.internal.client.b
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return queryLocalInterface instanceof w ? (w) queryLocalInterface : new w(obj);
                }
            })).s4(l3, this.c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException e) {
            k8b.c(this.b).b(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
