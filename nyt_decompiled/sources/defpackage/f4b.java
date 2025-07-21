package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class f4b implements cp4 {
    final /* synthetic */ t3b a;
    final /* synthetic */ g8 b;
    final /* synthetic */ m4b c;

    f4b(m4b m4bVar, t3b t3bVar, g8 g8Var) {
        this.a = t3bVar;
        this.b = g8Var;
        this.c = m4bVar;
    }

    @Override // defpackage.cp4
    public final void a(c6 c6Var) {
        try {
            fgb.b(this.b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + c6Var.a() + ". ErrorMessage = " + c6Var.c() + ". ErrorDomain = " + c6Var.b());
            this.a.R0(c6Var.d());
            this.a.K0(c6Var.a(), c6Var.c());
            this.a.zzg(c6Var.a());
        } catch (RemoteException e) {
            fgb.e("", e);
        }
    }
}
