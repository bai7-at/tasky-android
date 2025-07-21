package defpackage;

import defpackage.mf5;

/* loaded from: classes4.dex */
public final class f54 {
    public final gz8 a(pf5 pf5Var) {
        zq3.h(pf5Var, "onShareCodeError");
        return new gz8(pf5Var.a(), pf5Var.b());
    }

    public final hz8 b(mf5 mf5Var) {
        zq3.h(mf5Var, "onShareCodeData");
        mf5.a b = mf5Var.b();
        return new hz8(mf5Var.d(), mf5Var.a(), b != null ? new qp7(b.d(), b.e(), b.a(), b.b(), b.c()) : null, mf5Var.c());
    }
}
