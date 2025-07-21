package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes3.dex */
final class lma implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ nma a;

    lma(nma nmaVar) {
        this.a = nmaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        vma vmaVar;
        vma vmaVar2;
        obj = this.a.c;
        synchronized (obj) {
            try {
                nma nmaVar = this.a;
                vmaVar = nmaVar.d;
                if (vmaVar != null) {
                    vmaVar2 = nmaVar.d;
                    nmaVar.f = vmaVar2.d();
                }
            } catch (DeadObjectException e) {
                fgb.e("Unable to obtain a cache service instance.", e);
                nma.h(this.a);
            }
            obj2 = this.a.c;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.a.c;
        synchronized (obj) {
            this.a.f = null;
            obj2 = this.a.c;
            obj2.notifyAll();
        }
    }
}
