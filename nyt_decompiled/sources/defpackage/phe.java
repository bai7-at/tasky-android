package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class phe extends she {
    phe() {
        super(null);
    }

    static final she k(int i) {
        she sheVar;
        she sheVar2;
        she sheVar3;
        if (i < 0) {
            sheVar3 = she.b;
            return sheVar3;
        }
        if (i > 0) {
            sheVar2 = she.c;
            return sheVar2;
        }
        sheVar = she.a;
        return sheVar;
    }

    @Override // defpackage.she
    public final int a() {
        return 0;
    }

    @Override // defpackage.she
    public final she b(int i, int i2) {
        return k(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.she
    public final she c(long j, long j2) {
        return k(j < j2 ? -1 : j > j2 ? 1 : 0);
    }

    @Override // defpackage.she
    public final she d(Object obj, Object obj2, Comparator comparator) {
        return k(comparator.compare(obj, obj2));
    }

    @Override // defpackage.she
    public final she e(boolean z, boolean z2) {
        return k(mje.a(z, z2));
    }

    @Override // defpackage.she
    public final she f(boolean z, boolean z2) {
        return k(mje.a(z2, z));
    }
}
