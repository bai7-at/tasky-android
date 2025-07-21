package defpackage;

import com.google.android.gms.internal.pal.e6;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;

/* loaded from: classes3.dex */
final class jjf extends dpf {
    public jjf() {
        super(e6.class, new gjf(naf.class));
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.ASYMMETRIC_PUBLIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return e6.x(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        e6 e6Var = (e6) zx9Var;
        h7g.b(e6Var.s(), 0);
        ekf.a(e6Var.t());
    }
}
