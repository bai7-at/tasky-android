package defpackage;

import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public interface zr4 {

    public static final class a {
        public static /* synthetic */ Object a(zr4 zr4Var, List list, List list2, by0 by0Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertAll");
            }
            if ((i & 1) != 0) {
                list = i.l();
            }
            if ((i & 2) != 0) {
                list2 = i.l();
            }
            return zr4Var.d(list, list2, by0Var);
        }
    }

    Object a(by0 by0Var);

    Object b(by0 by0Var);

    Object c(String str, by0 by0Var);

    Object d(List list, List list2, by0 by0Var);

    Object e(String str, by0 by0Var);
}
