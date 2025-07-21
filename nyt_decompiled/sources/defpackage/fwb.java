package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class fwb implements gke {
    final /* synthetic */ d8e a;
    final /* synthetic */ String b;
    final /* synthetic */ gwb c;

    fwb(gwb gwbVar, d8e d8eVar, String str) {
        this.a = d8eVar;
        this.b = str;
        this.c = gwbVar;
    }

    @Override // defpackage.gke
    public final void zza(final Throwable th) {
        kke kkeVar;
        kkeVar = this.c.e;
        final d8e d8eVar = this.a;
        final String str = this.b;
        kkeVar.l(new Runnable() { // from class: dwb
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) pla.c().a(mpa.T9)).booleanValue();
                fwb fwbVar = fwb.this;
                Throwable th2 = th;
                if (booleanValue) {
                    gwb gwbVar = fwbVar.c;
                    context2 = gwbVar.a;
                    gwbVar.i = k8b.e(context2);
                    fwbVar.c.i.b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    gwb gwbVar2 = fwbVar.c;
                    context = gwbVar2.a;
                    gwbVar2.h = k8b.c(context);
                    fwbVar.c.h.b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                }
                d8eVar.c(str, null);
            }
        });
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        kke kkeVar;
        gwb gwbVar = this.c;
        final d8e d8eVar = this.a;
        final String str = (String) obj;
        kkeVar = gwbVar.e;
        kkeVar.l(new Runnable() { // from class: ewb
            @Override // java.lang.Runnable
            public final void run() {
                d8e.this.c(str, null);
            }
        });
    }
}
