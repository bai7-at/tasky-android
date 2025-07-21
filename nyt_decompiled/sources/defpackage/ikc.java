package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
final class ikc implements gke {
    final /* synthetic */ View a;
    final /* synthetic */ jkc b;

    ikc(jkc jkcVar, View view) {
        this.a = view;
        this.b = jkcVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        if (((Boolean) pla.c().a(mpa.b5)).booleanValue()) {
            dyf.q().v(th, "omid native display exp");
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.b.K(this.a, (k8e) obj);
    }
}
