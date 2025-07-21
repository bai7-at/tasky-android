package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class k0e implements ae5 {
    final /* synthetic */ j9c a;
    final /* synthetic */ m0e b;

    k0e(m0e m0eVar, j9c j9cVar) {
        this.a = j9cVar;
        this.b = m0eVar;
    }

    @Override // defpackage.ae5
    public final void l() {
        uqc uqcVar;
        uqcVar = this.b.i;
        if (uqcVar != null) {
            try {
                this.a.zze();
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
    }
}
