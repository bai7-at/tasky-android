package defpackage;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes3.dex */
public final class a5g implements naf {
    private static final byte[] f = new byte[0];
    private final f5g a;
    private final String b;
    private final byte[] c;
    private final w4g d;
    private final int e;

    public a5g(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, w4g w4gVar) {
        h5g.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.a = new f5g(eCPublicKey);
        this.c = bArr;
        this.b = str;
        this.e = i;
        this.d = w4gVar;
    }

    @Override // defpackage.naf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        e5g a = this.a.a(this.b, this.c, bArr2, this.d.zza(), this.e);
        byte[] a2 = this.d.a(a.b()).a(bArr, f);
        byte[] a3 = a.a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
