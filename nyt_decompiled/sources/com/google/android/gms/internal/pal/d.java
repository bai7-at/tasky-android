package com.google.android.gms.internal.pal;

import defpackage.zx9;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class d implements zx9 {
    protected int zza = 0;

    @Override // defpackage.zx9
    public final byte[] D() {
        try {
            byte[] bArr = new byte[B()];
            s c = s.c(bArr);
            A(c);
            c.d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    abstract int b();

    abstract void c(int i);

    @Override // defpackage.zx9
    public final zzaby z() {
        try {
            int B = B();
            zzaby zzabyVar = zzaby.a;
            byte[] bArr = new byte[B];
            s c = s.c(bArr);
            A(c);
            c.d();
            return new zzabv(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
