package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.sab;
import defpackage.vp9;

/* loaded from: classes2.dex */
public final class zzw extends vp9 implements IAccountAccessor {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) sab.a(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
