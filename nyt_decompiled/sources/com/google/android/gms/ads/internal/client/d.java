package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.h3b;
import defpackage.hgb;
import defpackage.igb;
import defpackage.reb;

/* loaded from: classes2.dex */
final class d extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ h3b c;

    d(n nVar, Context context, h3b h3bVar) {
        this.b = context;
        this.c = h3bVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.B2(fc5.l3(this.b), this.c, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((reb) igb.b(this.b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new hgb() { // from class: cw9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    return qeb.w6(obj);
                }
            })).Y(fc5.l3(this.b), this.c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
