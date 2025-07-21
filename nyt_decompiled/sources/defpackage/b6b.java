package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class b6b implements cp4 {
    final /* synthetic */ z4b a;
    final /* synthetic */ t3b b;
    final /* synthetic */ e6b c;

    b6b(e6b e6bVar, z4b z4bVar, t3b t3bVar) {
        this.a = z4bVar;
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
