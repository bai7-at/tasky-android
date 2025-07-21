package defpackage;

import com.google.android.gms.internal.pal.a4;
import com.google.android.gms.internal.pal.d4;
import com.google.android.gms.internal.pal.z3;
import com.google.android.gms.internal.pal.zzaby;

/* loaded from: classes3.dex */
final class kef extends kof {
    final /* synthetic */ mef b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kef(mef mefVar, Class cls) {
        super(cls);
        this.b = mefVar;
    }

    public static final a4 g(d4 d4Var) {
        z3 t = a4.t();
        t.l(d4Var.x());
        t.k(zzaby.u(d7g.a(d4Var.s())));
        t.m(0);
        return (a4) t.g();
    }

    @Override // defpackage.kof
    public final /* bridge */ /* synthetic */ zx9 a(zx9 zx9Var) {
        return g((d4) zx9Var);
    }

    @Override // defpackage.kof
    public final /* synthetic */ zx9 b(zzaby zzabyVar) {
        return d4.w(zzabyVar, ev9.a());
    }

    @Override // defpackage.kof
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void d(d4 d4Var) {
        h7g.a(d4Var.s());
        mef mefVar = this.b;
        mef.m(d4Var.x());
    }
}
