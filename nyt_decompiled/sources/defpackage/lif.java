package defpackage;

import com.google.android.gms.internal.pal.f5;
import com.google.android.gms.internal.pal.i5;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class lif extends dpf {
    lif() {
        super(f5.class, new gif(kaf.class));
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new iif(this, i5.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return f5.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        f5 f5Var = (f5) zx9Var;
        h7g.b(f5Var.s(), 0);
        if (f5Var.w().e() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + f5Var.w().e() + ". Valid keys must have 64 bytes.");
    }
}
