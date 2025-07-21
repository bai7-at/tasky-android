package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.RemoteCreator;
import defpackage.fc5;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzmv extends RemoteCreator {
    private static final zzmv zza = new zzmv();

    private zzmv() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static zzmy zza(Context context, Executor executor, zzm zzmVar) {
        zzmy zzmyVar = null;
        if (zzmVar.zzh() && GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12800000) == 0) {
            zzmyVar = zza.zzb(context, executor, zzmVar);
        }
        return zzmyVar == null ? new zzmu(context, executor, zzmVar) : zzmyVar;
    }

    private final zzmy zzb(Context context, Executor executor, zzm zzmVar) {
        try {
            IBinder zze = ((zzmz) getRemoteCreatorInstance(context)).zze(fc5.l3(context), fc5.l3(executor), zzmVar.zzav());
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return queryLocalInterface instanceof zzmy ? (zzmy) queryLocalInterface : new zzmw(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | IllegalArgumentException | LinkageError unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof zzmz ? (zzmz) queryLocalInterface : new zzmz(iBinder);
    }
}
