package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class ju8 implements ub8 {
    public static final ju8 b = new ju8();
    private final List a;

    public ju8(y31 y31Var) {
        this.a = Collections.singletonList(y31Var);
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

    private ju8() {
        this.a = Collections.emptyList();
    }
}
