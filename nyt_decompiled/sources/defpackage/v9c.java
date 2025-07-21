package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class v9c implements Runnable {
    private final WeakReference a;

    @Override // java.lang.Runnable
    public final void run() {
        w9c w9cVar = (w9c) this.a.get();
        if (w9cVar != null) {
            w9cVar.G0(new kdc() { // from class: t9c
                @Override // defpackage.kdc
                public final void zza(Object obj) {
                    ((x9c) obj).zza();
                }
            });
        }
    }
}
