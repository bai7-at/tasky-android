package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes2.dex */
public interface f91 {

    public static final class a {
        public static /* synthetic */ Map a(f91 f91Var, Map map, String str, String str2, Set set, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateAttributes");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                set = b0.e();
            }
            return f91Var.a(map, str, str2, set);
        }
    }

    Map a(Map map, String str, String str2, Set set);

    List b(List list);
}
