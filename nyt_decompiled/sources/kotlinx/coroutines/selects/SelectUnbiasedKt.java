package kotlinx.coroutines.selects;

import defpackage.bk3;
import defpackage.by0;
import defpackage.ss2;

/* loaded from: classes5.dex */
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(ss2 ss2Var, by0<? super R> by0Var) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(by0Var.getContext());
        ss2Var.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(by0Var);
    }

    private static final <R> Object selectUnbiased$$forInline(ss2 ss2Var, by0<? super R> by0Var) {
        bk3.c(3);
        throw null;
    }
}
