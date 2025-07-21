package defpackage;

import com.google.android.gms.internal.pal.a7;
import com.google.android.gms.internal.pal.x6;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class nlf implements maf {
    private final zlf a;
    private final tlf b;
    private final tkf c;
    private final qkf d;

    private nlf(zlf zlfVar, tlf tlfVar, qkf qkfVar, tkf tkfVar, int i, byte[] bArr) {
        this.a = zlfVar;
        this.b = tlfVar;
        this.d = qkfVar;
        this.c = tkfVar;
    }

    static nlf a(a7 a7Var) {
        zlf a;
        if (!a7Var.G()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!a7Var.w().H()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (a7Var.x().z()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        x6 t = a7Var.w().t();
        tlf b = cmf.b(t);
        qkf c = cmf.c(t);
        tkf a2 = cmf.a(t);
        int x = t.x();
        int i = 1;
        if (x - 2 != 1) {
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(g0g.a(x)));
        }
        int x2 = a7Var.w().t().x() - 2;
        if (x2 == 1) {
            a = gnf.a(a7Var.x().A());
        } else {
            if (x2 != 2 && x2 != 3 && x2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            byte[] A = a7Var.x().A();
            byte[] A2 = a7Var.w().C().A();
            int x3 = a7Var.w().t().x() - 2;
            if (x3 != 2) {
                if (x3 == 3) {
                    i = 2;
                } else {
                    if (x3 != 4) {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    i = 3;
                }
            }
            a = anf.a(A, A2, i);
        }
        return new nlf(a, b, c, a2, 32, null);
    }
}
