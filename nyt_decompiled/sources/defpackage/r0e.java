package defpackage;

import android.os.RemoteException;

/* loaded from: classes3.dex */
final class r0e implements ae5 {
    final /* synthetic */ r8b a;
    final /* synthetic */ s0e b;

    r0e(s0e s0eVar, r8b r8bVar) {
        this.a = r8bVar;
        this.b = s0eVar;
    }

    @Override // defpackage.ae5
    public final void l() {
        uqc uqcVar;
        uqcVar = this.b.d;
        if (uqcVar != null) {
            try {
                this.a.zze();
            } catch (RemoteException e) {
                fgb.i("#007 Could not call remote method.", e);
            }
        }
    }
}
