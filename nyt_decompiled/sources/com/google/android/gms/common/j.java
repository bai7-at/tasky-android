package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzz;
import defpackage.ee3;
import defpackage.fc5;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class j extends zzz {
    private final int a;

    protected j(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] O(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    abstract byte[] Q1();

    public final boolean equals(Object obj) {
        ee3 zzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.a && (zzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(Q1(), (byte[]) fc5.Q1(zzd));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final ee3 zzd() {
        return fc5.l3(Q1());
    }
}
