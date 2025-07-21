package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.c0b;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.gmd;
import defpackage.h3b;
import defpackage.hgb;
import defpackage.igb;
import defpackage.k8b;
import defpackage.m8b;
import defpackage.mpa;
import defpackage.pla;

/* loaded from: classes2.dex */
final class k extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ String c;
    final /* synthetic */ h3b d;
    final /* synthetic */ n e;

    k(n nVar, Context context, String str, h3b h3bVar) {
        this.b = context;
        this.c = str;
        this.d = h3bVar;
        this.e = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        n.p(this.b, "native_ad");
        return new gmd();
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.H3(fc5.l3(this.b), this.c, this.d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        g0 g0Var;
        m8b m8bVar;
        mpa.a(this.b);
        if (!((Boolean) pla.c().a(mpa.ia)).booleanValue()) {
            n nVar = this.e;
            Context context = this.b;
            String str = this.c;
            h3b h3bVar = this.d;
            g0Var = nVar.b;
            return g0Var.a(context, str, h3bVar);
        }
        try {
            IBinder s4 = ((r) igb.b(this.b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new hgb() { // from class: com.google.android.gms.ads.internal.client.j
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(obj);
                }
            })).s4(fc5.l3(this.b), this.c, this.d, 240304000);
            if (s4 == null) {
                return null;
            }
            IInterface queryLocalInterface = s4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof c0b ? (c0b) queryLocalInterface : new q(s4);
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.e.h = k8b.c(this.b);
            m8bVar = this.e.h;
            m8bVar.b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
