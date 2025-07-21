package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class nnd implements gqd {
    private final kke a;

    public nnd(kke kkeVar) {
        this.a = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 24;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: mnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", dyf.q().b());
                return new ond(bundle);
            }
        });
    }
}
