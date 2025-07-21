package defpackage;

import com.google.android.gms.internal.pal.d7;
import com.google.android.gms.internal.pal.x6;

/* loaded from: classes3.dex */
final class qlf implements naf {
    private static final byte[] e = new byte[0];
    private final d7 a;
    private final tlf b;
    private final tkf c;
    private final qkf d;

    private qlf(d7 d7Var, tlf tlfVar, qkf qkfVar, tkf tkfVar, byte[] bArr) {
        this.a = d7Var;
        this.b = tlfVar;
        this.d = qkfVar;
        this.c = tkfVar;
    }

    static qlf a(d7 d7Var) {
        if (d7Var.C().z()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        x6 t = d7Var.t();
        return new qlf(d7Var, cmf.b(t), cmf.c(t), cmf.a(t), null);
    }

    @Override // defpackage.naf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        d7 d7Var = this.a;
        tlf tlfVar = this.b;
        qkf qkfVar = this.d;
        tkf tkfVar = this.c;
        wlf a = tlfVar.a(d7Var.C().A());
        wkf c = wkf.c(a.a(), a.b(), tlfVar, qkfVar, tkfVar, bArr3);
        return q4g.c(c.a(), c.b(bArr, e));
    }
}
