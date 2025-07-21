package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class qi0 implements ub8 {
    private final List a;

    public qi0(List list) {
        this.a = list;
    }

    @Override // defpackage.ub8
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.ub8
    public List b(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    @Override // defpackage.ub8
    public long c(int i) {
        ur.a(i == 0);
        return 0L;
    }

    @Override // defpackage.ub8
    public int d() {
        return 1;
    }
}
