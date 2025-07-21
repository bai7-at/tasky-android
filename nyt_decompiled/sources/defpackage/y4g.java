package defpackage;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes3.dex */
public final class y4g implements maf {
    private final ECPrivateKey a;
    private final c5g b;
    private final String c;
    private final byte[] d;
    private final w4g e;

    public y4g(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, w4g w4gVar) {
        this.a = eCPrivateKey;
        this.b = new c5g(eCPrivateKey);
        this.d = bArr;
        this.c = str;
        this.e = w4gVar;
    }
}
