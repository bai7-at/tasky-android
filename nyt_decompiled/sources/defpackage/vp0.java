package defpackage;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class vp0 {
    public static Comparator b(final ss2... ss2VarArr) {
        zq3.h(ss2VarArr, "selectors");
        if (ss2VarArr.length > 0) {
            return new Comparator() { // from class: up0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c;
                    c = vp0.c(ss2VarArr, obj, obj2);
                    return c;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(ss2[] ss2VarArr, Object obj, Object obj2) {
        zq3.h(ss2VarArr, "$selectors");
        return f(obj, obj2, ss2VarArr);
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int e(Object obj, Object obj2, ss2... ss2VarArr) {
        zq3.h(ss2VarArr, "selectors");
        if (ss2VarArr.length > 0) {
            return f(obj, obj2, ss2VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int f(Object obj, Object obj2, ss2[] ss2VarArr) {
        for (ss2 ss2Var : ss2VarArr) {
            int d = tp0.d((Comparable) ss2Var.invoke(obj), (Comparable) ss2Var.invoke(obj2));
            if (d != 0) {
                return d;
            }
        }
        return 0;
    }

    public static Comparator g() {
        h25 h25Var = h25.a;
        zq3.f(h25Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return h25Var;
    }
}
