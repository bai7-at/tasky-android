package defpackage;

import defpackage.bm5;
import defpackage.dm5;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class cm5 {
    public static final bm5 a(dm5 dm5Var) {
        zq3.h(dm5Var, "<this>");
        if (zq3.c(dm5Var, dm5.a.b)) {
            return bm5.a.c;
        }
        if (zq3.c(dm5Var, dm5.b.b)) {
            return bm5.b.c;
        }
        if (zq3.c(dm5Var, dm5.c.b)) {
            return bm5.c.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
