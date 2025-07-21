package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.h7b;
import defpackage.hgb;
import defpackage.igb;
import defpackage.j7b;
import defpackage.k8b;
import defpackage.m8b;
import defpackage.mpa;
import defpackage.n7b;
import defpackage.pla;

/* loaded from: classes2.dex */
final class a extends o {
    final /* synthetic */ Activity b;
    final /* synthetic */ n c;

    a(n nVar, Activity activity) {
        this.b = activity;
        this.c = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        n.p(this.b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.zzm(fc5.l3(this.b));
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        m8b m8bVar;
        h7b h7bVar;
        mpa.a(this.b);
        if (!((Boolean) pla.c().a(mpa.ia)).booleanValue()) {
            n nVar = this.c;
            Activity activity = this.b;
            h7bVar = nVar.f;
            return h7bVar.a(activity);
        }
        try {
            return j7b.w6(((n7b) igb.b(this.b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new hgb() { // from class: f8g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    return m7b.w6(obj);
                }
            })).zze(fc5.l3(this.b)));
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.c.h = k8b.c(this.b.getApplicationContext());
            m8bVar = this.c.h;
            m8bVar.b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
