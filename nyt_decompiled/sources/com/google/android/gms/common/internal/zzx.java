package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import defpackage.vp9;

/* loaded from: classes2.dex */
public final class zzx extends vp9 implements ICancelToken {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
