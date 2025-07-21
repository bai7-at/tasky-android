package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public interface nu7 {

    public static final class a {
        public static Object a(nu7 nu7Var, mu7 mu7Var, boolean z, by0 by0Var) {
            if (z) {
                Object d = nu7Var.d(mu7Var, by0Var);
                return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
            }
            Object a = nu7Var.a(mu7Var, by0Var);
            return a == kotlin.coroutines.intrinsics.a.h() ? a : ww8.a;
        }
    }

    Object a(mu7 mu7Var, by0 by0Var);

    Object b(String str, by0 by0Var);

    Object c(mu7 mu7Var, boolean z, by0 by0Var);

    Object d(mu7 mu7Var, by0 by0Var);

    Object e(Set set, by0 by0Var);

    Object f(by0 by0Var);
}
