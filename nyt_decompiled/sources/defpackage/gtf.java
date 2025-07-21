package defpackage;

import com.google.android.gms.internal.pal.k3;
import com.google.android.gms.internal.pal.n3;
import com.google.android.gms.internal.pal.q3;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class gtf extends dpf {
    gtf() {
        super(k3.class, new btf(ecf.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(q3 q3Var) {
        if (q3Var.s() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (q3Var.s() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new etf(this, n3.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return k3.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        k3 k3Var = (k3) zx9Var;
        h7g.b(k3Var.s(), 0);
        n(k3Var.x().e());
        m(k3Var.w());
    }
}
