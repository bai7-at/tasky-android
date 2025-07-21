package defpackage;

import com.google.android.gms.internal.pal.l5;
import com.google.android.gms.internal.pal.o5;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class sff extends dpf {
    sff() {
        super(l5.class, new pff(haf.class));
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new rff(this, o5.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return l5.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        l5 l5Var = (l5) zx9Var;
        h7g.b(l5Var.s(), 0);
        if (l5Var.w().e() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
