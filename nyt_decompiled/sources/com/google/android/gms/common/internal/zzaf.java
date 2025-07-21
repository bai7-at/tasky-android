package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.tka;

/* loaded from: classes2.dex */
public abstract class zzaf extends tka implements zzag {
    public static zzag zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof zzag ? (zzag) queryLocalInterface : new zzae(iBinder);
    }
}
