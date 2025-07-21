package com.google.android.gms.internal.play_billing;

import defpackage.sbc;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b implements sbc {
    protected int zza = 0;

    abstract int b(w0 w0Var);

    public final byte[] c() {
        try {
            int zze = zze();
            byte[] bArr = new byte[zze];
            o A = o.A(bArr, 0, zze);
            a(A);
            A.a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
