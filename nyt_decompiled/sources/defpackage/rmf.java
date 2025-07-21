package defpackage;

import com.google.android.gms.internal.pal.d7;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class rmf extends dpf {
    public rmf() {
        super(d7.class, new omf(naf.class));
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.ASYMMETRIC_PUBLIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return d7.x(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        d7 d7Var = (d7) zx9Var;
        h7g.b(d7Var.s(), 0);
        if (!d7Var.H()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        umf.a(d7Var.t());
    }
}
