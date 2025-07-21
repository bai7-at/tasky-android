package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* loaded from: classes3.dex */
final class h5d implements gke {
    final /* synthetic */ i9b a;

    h5d(i5d i5dVar, i9b i9bVar) {
        this.a = i9bVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        try {
            this.a.a0(zzbb.G0(th));
        } catch (RemoteException e) {
            pzc.l("Ad service can't call client", e);
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.a.f0((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            pzc.l("Ad service can't call client", e);
        }
    }
}
