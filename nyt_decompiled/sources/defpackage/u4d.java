package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
final class u4d implements gke {
    final /* synthetic */ q9b a;

    u4d(y4d y4dVar, q9b q9bVar) {
        this.a = q9bVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        try {
            this.a.a0(zzbb.G0(th));
        } catch (RemoteException e) {
            pzc.l("Service can't call client", e);
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.a.f0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            pzc.l("Service can't call client", e);
        }
    }
}
