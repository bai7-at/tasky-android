package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class d6b implements cp4 {
    final /* synthetic */ l5b a;
    final /* synthetic */ t3b b;
    final /* synthetic */ e6b c;

    d6b(e6b e6bVar, l5b l5bVar, t3b t3bVar) {
        this.a = l5bVar;
        this.b = t3bVar;
        this.c = e6bVar;
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
