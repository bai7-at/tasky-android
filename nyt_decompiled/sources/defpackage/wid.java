package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class wid implements Runnable {
    final /* synthetic */ bld a;

    wid(bld bldVar) {
        this.a = bldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pqa pqaVar;
        pqa pqaVar2;
        gmd gmdVar = this.a.a;
        pqaVar = gmdVar.a;
        if (pqaVar != null) {
            try {
                pqaVar2 = gmdVar.a;
                pqaVar2.i(1);
            } catch (RemoteException e) {
                fgb.h("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
