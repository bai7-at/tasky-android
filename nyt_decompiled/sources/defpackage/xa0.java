package defpackage;

import defpackage.va0;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class xa0 {
    public static final boolean b(va0 va0Var, ss2 ss2Var) {
        zq3.h(va0Var, "<this>");
        zq3.h(ss2Var, "block");
        if (zq3.c(va0Var, va0.c.a)) {
            return true;
        }
        if (zq3.c(va0Var, va0.b.a)) {
            return false;
        }
        if (va0Var instanceof va0.a) {
            return ((Boolean) ss2Var.invoke(((va0.a) va0Var).a())).booleanValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(va0 va0Var, final Set set, final String str, final Set set2, List list) {
        zq3.h(va0Var, "<this>");
        final List e0 = list != null ? i.e0(list, 1) : null;
        return b(va0Var, new ss2() { // from class: wa0
            @Override // defpackage.ss2
            public final Object invoke(Object obj) {
                boolean d;
                d = xa0.d(set, set2, e0, str, (g30) obj);
                return Boolean.valueOf(d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Set set, Set set2, List list, String str, g30 g30Var) {
        zq3.h(g30Var, "it");
        if (g30Var instanceof f30) {
            return i.c0(((f30) g30Var).a(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final va0 e(String... strArr) {
        zq3.h(strArr, "typenames");
        return new va0.a(new f30(d.F0(strArr)));
    }
}
