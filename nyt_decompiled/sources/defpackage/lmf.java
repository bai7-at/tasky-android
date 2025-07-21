package defpackage;

import com.google.android.gms.internal.pal.a7;
import com.google.android.gms.internal.pal.d7;
import com.google.android.gms.internal.pal.s6;
import com.google.android.gms.internal.pal.u6;
import com.google.android.gms.internal.pal.w6;
import com.google.android.gms.internal.pal.x6;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class lmf extends crf {
    public lmf() {
        super(a7.class, d7.class, new fmf(maf.class));
    }

    static /* bridge */ /* synthetic */ hof k(int i, int i2, int i3, int i4) {
        w6 s = x6.s();
        s.m(i);
        s.l(i2);
        s.k(i3);
        x6 x6Var = (x6) s.g();
        s6 s2 = u6.s();
        s2.k(x6Var);
        return new hof((u6) s2.g(), i4);
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new imf(this, u6.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.ASYMMETRIC_PRIVATE;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return a7.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        a7 a7Var = (a7) zx9Var;
        if (a7Var.x().z()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!a7Var.G()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        h7g.b(a7Var.s(), 0);
        umf.a(a7Var.w().t());
    }
}
