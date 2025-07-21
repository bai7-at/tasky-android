package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class l extends j {
    private static final WeakReference c = new WeakReference(null);
    private WeakReference b;

    l(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    @Override // com.google.android.gms.common.j
    final byte[] Q1() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.b.get();
                if (bArr == null) {
                    bArr = l3();
                    this.b = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] l3();
}
