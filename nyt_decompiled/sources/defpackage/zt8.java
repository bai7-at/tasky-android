package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zt8 implements ub8 {
    private final vt8 a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public zt8(vt8 vt8Var, Map map, Map map2, Map map3) {
        this.a = vt8Var;
        this.d = map2;
        this.e = map3;
        this.c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.b = vt8Var.j();
    }

    @Override // defpackage.ub8
    public int a(long j) {
        int e = z19.e(this.b, j, false, false);
        if (e < this.b.length) {
            return e;
        }
        return -1;
    }

    @Override // defpackage.ub8
    public List b(long j) {
        return this.a.h(j, this.c, this.d, this.e);
    }

    @Override // defpackage.ub8
    public long c(int i) {
        return this.b[i];
    }

    @Override // defpackage.ub8
    public int d() {
        return this.b.length;
    }
}
