package defpackage;

import com.google.android.gms.internal.pal.c4;
import com.google.android.gms.internal.pal.d4;
import com.google.android.gms.internal.pal.f4;
import com.google.android.gms.internal.pal.g4;
import com.google.android.gms.internal.pal.m6;
import com.google.android.gms.internal.pal.n6;
import com.google.android.gms.internal.pal.p6;
import com.google.android.gms.internal.pal.q6;
import com.google.android.gms.internal.pal.t3;
import com.google.android.gms.internal.pal.v3;
import com.google.android.gms.internal.pal.w3;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;

/* loaded from: classes3.dex */
public final class ief extends dpf {
    ief() {
        super(t3.class, new gef(haf.class));
    }

    static /* bridge */ /* synthetic */ hof k(int i, int i2, int i3, int i4, int i5, int i6) {
        c4 t = d4.t();
        f4 t2 = g4.t();
        t2.k(16);
        t.l((g4) t2.g());
        t.k(i);
        d4 d4Var = (d4) t.g();
        m6 t3 = n6.t();
        p6 t4 = q6.t();
        t4.l(5);
        t4.k(i4);
        t3.l((q6) t4.g());
        t3.k(32);
        n6 n6Var = (n6) t3.g();
        v3 s = w3.s();
        s.k(d4Var);
        s.l(n6Var);
        return new hof((w3) s.g(), i6);
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new hef(this, w3.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return t3.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        t3 t3Var = (t3) zx9Var;
        h7g.b(t3Var.s(), 0);
        new mef();
        mef.l(t3Var.w());
        new auf();
        auf.l(t3Var.x());
    }

    @Override // defpackage.dpf
    public final int f() {
        return 2;
    }
}
