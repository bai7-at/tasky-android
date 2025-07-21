package defpackage;

import com.google.android.gms.internal.pal.r8;
import com.google.android.gms.internal.pal.u8;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class lgf extends dpf {
    lgf() {
        super(r8.class, new igf(haf.class));
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new jgf(this, u8.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return r8.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        r8 r8Var = (r8) zx9Var;
        h7g.b(r8Var.s(), 0);
        if (r8Var.w().e() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
