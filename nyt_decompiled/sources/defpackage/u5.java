package defpackage;

import androidx.compose.runtime.Composer;

/* loaded from: classes.dex */
public abstract class u5 {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(Composer composer, gt2 gt2Var) {
        zq3.f(gt2Var, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((gt2) ku8.f(gt2Var, 2)).invoke(composer, 1);
    }
}
