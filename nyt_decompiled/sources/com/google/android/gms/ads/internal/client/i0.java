package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzcef;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.h3b;
import defpackage.hgb;
import defpackage.igb;
import defpackage.k8b;
import defpackage.m8b;
import defpackage.mpa;
import defpackage.pla;
import defpackage.q4b;

/* loaded from: classes2.dex */
public final class i0 extends RemoteCreator {
    private m8b a;

    public i0() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final q4b a(Context context, zzq zzqVar, String str, h3b h3bVar, int i) {
        mpa.a(context);
        if (!((Boolean) pla.c().a(mpa.ia)).booleanValue()) {
            try {
                IBinder s4 = ((t) getRemoteCreatorInstance(context)).s4(fc5.l3(context), zzqVar, str, h3bVar, 240304000, i);
                if (s4 == null) {
                    return null;
                }
                IInterface queryLocalInterface = s4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof q4b ? (q4b) queryLocalInterface : new s(s4);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                fgb.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder s42 = ((t) igb.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new hgb() { // from class: com.google.android.gms.ads.internal.client.h0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof t ? (t) queryLocalInterface2 : new t(obj);
                }
            })).s4(fc5.l3(context), zzqVar, str, h3bVar, 240304000, i);
            if (s42 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = s42.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof q4b ? (q4b) queryLocalInterface2 : new s(s42);
        } catch (RemoteException | zzcef | NullPointerException e2) {
            m8b c = k8b.c(context);
            this.a = c;
            c.b(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            fgb.i("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof t ? (t) queryLocalInterface : new t(iBinder);
    }
}
