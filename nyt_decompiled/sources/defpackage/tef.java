package defpackage;

import com.google.android.gms.internal.pal.s4;
import com.google.android.gms.internal.pal.u4;
import com.google.android.gms.internal.pal.v4;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;

/* loaded from: classes3.dex */
public final class tef extends dpf {
    tef() {
        super(s4.class, new qef(haf.class));
    }

    static /* bridge */ /* synthetic */ hof k(int i, int i2) {
        u4 t = v4.t();
        t.k(i);
        return new hof((v4) t.g(), i2);
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new ref(this, v4.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return s4.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        s4 s4Var = (s4) zx9Var;
        h7g.b(s4Var.s(), 0);
        h7g.a(s4Var.w().e());
    }

    @Override // defpackage.dpf
    public final int f() {
        return 2;
    }
}
