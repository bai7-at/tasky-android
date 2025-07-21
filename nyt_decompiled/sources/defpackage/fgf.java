package defpackage;

import com.google.android.gms.internal.pal.g8;
import com.google.android.gms.internal.pal.h8;
import com.google.android.gms.internal.pal.k8;
import com.google.android.gms.internal.pal.zzaby;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class fgf extends kof {
    final /* synthetic */ hgf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fgf(hgf hgfVar, Class cls) {
        super(cls);
        this.b = hgfVar;
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        g8 t = h8.t();
        t.k((k8) zx9Var);
        t.l(0);
        return (h8) t.g();
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return k8.u(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ void d(zx9 zx9Var) {
        k8 k8Var = (k8) zx9Var;
        if (k8Var.v().isEmpty() || !k8Var.w()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
