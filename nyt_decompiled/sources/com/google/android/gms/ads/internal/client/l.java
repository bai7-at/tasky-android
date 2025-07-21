package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.cgb;
import defpackage.fc5;
import defpackage.hgb;
import defpackage.igb;
import defpackage.k8b;
import defpackage.m8b;
import defpackage.mpa;
import defpackage.pla;
import defpackage.pta;
import defpackage.rva;
import defpackage.tta;
import defpackage.urd;

/* loaded from: classes2.dex */
final class l extends o {
    final /* synthetic */ FrameLayout b;
    final /* synthetic */ FrameLayout c;
    final /* synthetic */ Context d;
    final /* synthetic */ n e;

    l(n nVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
        this.e = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.o
    protected final /* bridge */ /* synthetic */ Object a() {
        n.p(this.d, "native_ad_view_delegate");
        return new urd();
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object b(cgb cgbVar) {
        return cgbVar.w2(fc5.l3(this.b), fc5.l3(this.c));
    }

    @Override // com.google.android.gms.ads.internal.client.o
    public final /* bridge */ /* synthetic */ Object c() {
        m8b m8bVar;
        rva rvaVar;
        mpa.a(this.d);
        if (!((Boolean) pla.c().a(mpa.ia)).booleanValue()) {
            n nVar = this.e;
            Context context = this.d;
            FrameLayout frameLayout = this.b;
            FrameLayout frameLayout2 = this.c;
            rvaVar = nVar.d;
            return rvaVar.a(context, frameLayout, frameLayout2);
        }
        try {
            return pta.w6(((tta) igb.b(this.d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new hgb() { // from class: bca
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    return sta.w6(obj);
                }
            })).b4(fc5.l3(this.d), fc5.l3(this.b), fc5.l3(this.c), 240304000));
        } catch (RemoteException | zzcef | NullPointerException e) {
            this.e.h = k8b.c(this.d);
            m8bVar = this.e.h;
            m8bVar.b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
