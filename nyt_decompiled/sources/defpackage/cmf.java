package defpackage;

import com.google.android.gms.internal.pal.x6;

/* loaded from: classes3.dex */
abstract class cmf {
    static tkf a(x6 x6Var) {
        if (x6Var.v() == 3) {
            return new kkf(16);
        }
        if (x6Var.v() == 4) {
            return new kkf(32);
        }
        if (x6Var.v() == 5) {
            return new nkf();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static tlf b(x6 x6Var) {
        if (x6Var.x() == 3) {
            return new dnf(new qkf("HmacSha256"));
        }
        if (x6Var.x() == 4) {
            return xmf.b(1);
        }
        if (x6Var.x() == 5) {
            return xmf.b(2);
        }
        if (x6Var.x() == 6) {
            return xmf.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static qkf c(x6 x6Var) {
        if (x6Var.w() == 3) {
            return new qkf("HmacSha256");
        }
        if (x6Var.w() == 4) {
            return new qkf("HmacSha384");
        }
        if (x6Var.w() == 5) {
            return new qkf("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
