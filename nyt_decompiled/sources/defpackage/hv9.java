package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class hv9 {
    private final gv9 a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public hv9(gv9 gv9Var) {
        this.a = gv9Var;
    }

    public final nv9 a(Object... objArr) {
        Constructor zza;
        synchronized (this.b) {
            if (!this.b.get()) {
                try {
                    zza = this.a.zza();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (nv9) zza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
