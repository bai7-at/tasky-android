package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.fc5;

/* loaded from: classes2.dex */
public final class zzqo {

    @VisibleForTesting
    final zzqr zza;

    @VisibleForTesting
    final boolean zzb;

    private zzqo(zzqr zzqrVar) {
        this.zza = zzqrVar;
        this.zzb = zzqrVar != null;
    }

    public static zzqo zzb(Context context, String str, String str2) {
        zzqr zzqpVar;
        try {
            try {
                try {
                    IBinder d = DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        zzqpVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzqpVar = queryLocalInterface instanceof zzqr ? (zzqr) queryLocalInterface : new zzqp(d);
                    }
                    zzqpVar.zze(fc5.l3(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzqo(zzqpVar);
                } catch (Exception e) {
                    throw new zzps(e);
                }
            } catch (RemoteException | zzps | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzqo(new zzqs());
            }
        } catch (Exception e2) {
            throw new zzps(e2);
        }
    }

    public static zzqo zzc() {
        zzqs zzqsVar = new zzqs();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzqo(zzqsVar);
    }

    public final zzqn zza(byte[] bArr) {
        return new zzqn(this, bArr, null);
    }
}
