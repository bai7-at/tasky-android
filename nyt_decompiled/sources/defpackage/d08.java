package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class d08 implements ub8 {
    private final List a;
    private final List b;

    public d08(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ub8
    public int a(long j) {
        int d = z19.d(this.b, Long.valueOf(j), false, false);
        if (d < this.b.size()) {
            return d;
        }
        return -1;
    }

    @Override // defpackage.ub8
    public List b(long j) {
        int g = z19.g(this.b, Long.valueOf(j), true, false);
        return g == -1 ? Collections.emptyList() : (List) this.a.get(g);
    }

    @Override // defpackage.ub8
    public long c(int i) {
        ur.a(i >= 0);
        ur.a(i < this.b.size());
        return ((Long) this.b.get(i)).longValue();
    }

    @Override // defpackage.ub8
    public int d() {
        return this.b.size();
    }
}
