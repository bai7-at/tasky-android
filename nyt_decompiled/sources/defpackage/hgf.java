package defpackage;

import com.google.android.gms.internal.pal.h8;
import com.google.android.gms.internal.pal.k8;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;

/* loaded from: classes3.dex */
public final class hgf extends dpf {
    hgf() {
        super(h8.class, new agf(haf.class));
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new fgf(this, k8.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.REMOTE;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return h8.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        h7g.b(((h8) zx9Var).s(), 0);
    }
}
