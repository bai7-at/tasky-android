package defpackage;

import com.google.android.gms.internal.pal.a4;
import com.google.android.gms.internal.pal.d4;
import com.google.android.gms.internal.pal.g4;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class mef extends dpf {
    mef() {
        super(a4.class, new jef(r6g.class));
    }

    public static final void l(a4 a4Var) {
        h7g.b(a4Var.s(), 0);
        h7g.a(a4Var.C().e());
        m(a4Var.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(g4 g4Var) {
        if (g4Var.s() < 12 || g4Var.s() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new kef(this, d4.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return a4.w(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        l((a4) zx9Var);
    }
}
