package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes3.dex */
final class mma implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ nma a;

    mma(nma nmaVar) {
        this.a = nmaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        vma vmaVar;
        Object obj2;
        obj = this.a.c;
        synchronized (obj) {
            try {
                this.a.f = null;
                nma nmaVar = this.a;
                vmaVar = nmaVar.d;
                if (vmaVar != null) {
                    nmaVar.d = null;
                }
                obj2 = this.a.c;
                obj2.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
