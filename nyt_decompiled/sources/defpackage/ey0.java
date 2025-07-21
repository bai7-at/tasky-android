package defpackage;

import kotlin.Result;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes5.dex */
public abstract class ey0 {
    public static final by0 a(gt2 gt2Var, Object obj, by0 by0Var) {
        zq3.h(gt2Var, "<this>");
        zq3.h(by0Var, "completion");
        return new k77(a.d(a.b(gt2Var, obj, by0Var)), a.h());
    }

    public static final void b(gt2 gt2Var, Object obj, by0 by0Var) {
        zq3.h(gt2Var, "<this>");
        zq3.h(by0Var, "completion");
        by0 d = a.d(a.b(gt2Var, obj, by0Var));
        Result.a aVar = Result.a;
        d.resumeWith(Result.b(ww8.a));
    }
}
