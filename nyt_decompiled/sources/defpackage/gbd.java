package defpackage;

import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes3.dex */
final class gbd implements gke {
    final /* synthetic */ hbd a;

    gbd(hbd hbdVar) {
        this.a = hbdVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        nzb nzbVar;
        y6c y6cVar;
        nzbVar = this.a.a;
        zze a = nzbVar.d().a(th);
        y6cVar = this.a.d;
        y6cVar.n(a);
        r2e.b(a.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // defpackage.gke
    public final /* synthetic */ void zzb(Object obj) {
        ((nyb) obj).b();
    }
}
