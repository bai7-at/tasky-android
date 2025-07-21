package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.g7b;
import defpackage.h3b;
import defpackage.hgb;
import defpackage.igb;

/* loaded from: classes2.dex */
final class e extends o {
    final /* synthetic */ Context b;
    final /* synthetic */ h3b c;

    e(n nVar, Context context, h3b h3bVar) {
        this.b = context;
        this.c = h3bVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.X0(fc5.l3(this.b), this.c, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((g7b) igb.b(this.b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new hgb() { // from class: dz9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    return f7b.w6(obj);
                }
            })).Y(fc5.l3(this.b), this.c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
