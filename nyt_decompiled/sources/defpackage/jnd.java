package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class jnd implements Runnable {
    final /* synthetic */ nod a;

    jnd(nod nodVar) {
        this.a = nodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pqa pqaVar;
        pqa pqaVar2;
        nod nodVar = this.a;
        pqaVar = nodVar.a;
        if (pqaVar != null) {
            try {
                pqaVar2 = nodVar.a;
                pqaVar2.i(1);
            } catch (RemoteException e) {
                fgb.h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
