package defpackage;

import defpackage.rr1;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class xr1 implements rr1.a {
    private final long a;
    private final a b;

    public interface a {
        File a();
    }

    public xr1(a aVar, long j) {
        this.a = j;
        this.b = aVar;
    }

    @Override // rr1.a
    public rr1 build() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return yr1.c(a2, this.a);
        }
        return null;
    }
}
