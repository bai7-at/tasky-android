package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class b4e implements gke {
    final /* synthetic */ e4e a;
    final /* synthetic */ f4e b;

    b4e(f4e f4eVar, e4e e4eVar) {
        this.a = e4eVar;
        this.b = f4eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        synchronized (this.b) {
            this.b.e = null;
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.b) {
            try {
                this.b.e = null;
                arrayDeque = this.b.d;
                arrayDeque.addFirst(this.a);
                f4e f4eVar = this.b;
                i = f4eVar.f;
                if (i == 1) {
                    f4eVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
