package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class hxc implements gke {
    final /* synthetic */ jxc a;

    hxc(jxc jxcVar) {
        this.a = jxcVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        long j;
        ugb ugbVar;
        synchronized (this) {
            this.a.c = true;
            jxc jxcVar = this.a;
            long elapsedRealtime = dyf.b().elapsedRealtime();
            j = this.a.d;
            jxcVar.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            ugbVar = this.a.e;
            ugbVar.d(new Exception());
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.a.c = true;
            jxc jxcVar = this.a;
            long elapsedRealtime = dyf.b().elapsedRealtime();
            j = this.a.d;
            jxcVar.v("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.a.i;
            executor.execute(new Runnable() { // from class: gxc
                @Override // java.lang.Runnable
                public final void run() {
                    jxc.j(hxc.this.a, str);
                }
            });
        }
    }
}
