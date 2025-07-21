package defpackage;

import com.google.android.gms.internal.pal.b6;
import com.google.android.gms.internal.pal.e6;
import com.google.android.gms.internal.pal.g6;
import com.google.android.gms.internal.pal.h6;
import com.google.android.gms.internal.pal.j7;
import com.google.android.gms.internal.pal.k7;
import com.google.android.gms.internal.pal.q5;
import com.google.android.gms.internal.pal.r5;
import com.google.android.gms.internal.pal.t5;
import com.google.android.gms.internal.pal.u5;
import com.google.android.gms.internal.pal.w5;
import com.google.android.gms.internal.pal.x5;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class djf extends crf {
    private static final byte[] e = new byte[0];

    djf() {
        super(b6.class, e6.class, new xif(maf.class));
    }

    static /* bridge */ /* synthetic */ hof l(int i, int i2, int i3, xbf xbfVar, byte[] bArr, int i4) {
        t5 s = u5.s();
        g6 s2 = h6.s();
        int i5 = 4;
        s2.l(4);
        s2.m(5);
        s2.k(zzaby.u(bArr));
        h6 h6Var = (h6) s2.g();
        j7 s3 = k7.s();
        s3.k(xbfVar.a());
        s3.l(zzaby.u(xbfVar.b()));
        int c = xbfVar.c() - 1;
        if (c == 0) {
            i5 = 3;
        } else if (c != 1) {
            i5 = c != 2 ? 6 : 5;
        }
        s3.m(i5);
        k7 k7Var = (k7) s3.g();
        q5 s4 = r5.s();
        s4.k(k7Var);
        r5 r5Var = (r5) s4.g();
        w5 t = x5.t();
        t.l(h6Var);
        t.k(r5Var);
        t.m(i3);
        s.k((x5) t.g());
        return new hof((u5) s.g(), i4);
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new ajf(this, u5.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.ASYMMETRIC_PRIVATE;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return b6.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        b6 b6Var = (b6) zx9Var;
        if (b6Var.x().z()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        h7g.b(b6Var.s(), 0);
        ekf.a(b6Var.w().t());
    }
}
