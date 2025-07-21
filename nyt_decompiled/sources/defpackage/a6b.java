package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class a6b implements cp4 {
    final /* synthetic */ i5b a;
    final /* synthetic */ t3b b;

    a6b(e6b e6bVar, i5b i5bVar, t3b t3bVar) {
        this.a = i5bVar;
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
