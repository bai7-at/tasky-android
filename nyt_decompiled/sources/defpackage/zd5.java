package defpackage;

import java.util.List;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class zd5 implements zr4 {
    private final cr4 a;

    public zd5(cr4 cr4Var) {
        zq3.h(cr4Var, "omaMessageDao");
        this.a = cr4Var;
    }

    @Override // defpackage.zr4
    public Object a(by0 by0Var) {
        return this.a.a(by0Var);
    }

    @Override // defpackage.zr4
    public Object b(by0 by0Var) {
        Object b = this.a.b(by0Var);
        return b == a.h() ? b : ww8.a;
    }

    @Override // defpackage.zr4
    public Object c(String str, by0 by0Var) {
        return this.a.c(str, by0Var);
    }

    @Override // defpackage.zr4
    public Object d(List list, List list2, by0 by0Var) {
        Object d = this.a.d(list, by0Var);
        return d == a.h() ? d : ww8.a;
    }

    @Override // defpackage.zr4
    public Object e(String str, by0 by0Var) {
        return this.a.e(str, by0Var);
    }
}
