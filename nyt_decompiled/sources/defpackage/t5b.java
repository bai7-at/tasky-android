package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class t5b implements cp4 {
    final /* synthetic */ c5b a;
    final /* synthetic */ t3b b;

    t5b(e6b e6bVar, c5b c5bVar, t3b t3bVar) {
        this.a = c5bVar;
        this.b = t3bVar;
    }

    @Override // defpackage.cp4
    public final void a(c6 c6Var) {
        try {
            this.a.d(c6Var.d());
        } catch (RemoteException e) {
            fgb.e("", e);
        }
    }
}
