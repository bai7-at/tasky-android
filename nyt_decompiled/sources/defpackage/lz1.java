package defpackage;

import defpackage.tb5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class lz1 implements tb5 {
    private final kz1 a;

    public lz1(kz1 kz1Var) {
        zq3.h(kz1Var, "interceptor");
        this.a = kz1Var;
    }

    @Override // defpackage.tb5
    public int a() {
        return tb5.a.a(this);
    }

    @Override // defpackage.tb5
    public List b() {
        return i.e(this.a);
    }
}
