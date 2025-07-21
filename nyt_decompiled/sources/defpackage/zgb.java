package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class zgb implements gke {
    final /* synthetic */ hhb a;

    zgb(hhb hhbVar) {
        this.a = hhbVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.b;
        atomicInteger.set(-1);
    }

    @Override // defpackage.gke
    public final void zzb(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.b;
        atomicInteger.set(1);
    }
}
