package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class n6d {
    private final j6d a;
    private final kke b;

    public n6d(j6d j6dVar, kke kkeVar) {
        this.a = j6dVar;
        this.b = kkeVar;
    }

    public final void a(f5e f5eVar) {
        final j6d j6dVar = this.a;
        Objects.requireNonNull(j6dVar);
        zb.r(this.b.j(new Callable() { // from class: l6d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j6d.this.getWritableDatabase();
            }
        }), new m6d(this, f5eVar), this.b);
    }
}
