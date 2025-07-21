package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import defpackage.c0b;
import defpackage.fc5;
import defpackage.fgb;
import defpackage.h3b;

/* loaded from: classes2.dex */
public final class g0 extends RemoteCreator {
    public g0() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final c0b a(Context context, String str, h3b h3bVar) {
        try {
            IBinder s4 = ((r) getRemoteCreatorInstance(context)).s4(fc5.l3(context), str, h3bVar, 240304000);
            if (s4 == null) {
                return null;
            }
            IInterface queryLocalInterface = s4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof c0b ? (c0b) queryLocalInterface : new q(s4);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            fgb.h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(iBinder);
    }
}
