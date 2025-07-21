package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* loaded from: classes3.dex */
final class zzape extends zzapf {
    private final byte[] zza;

    public zzape(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
