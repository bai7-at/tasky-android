package defpackage;

import android.content.Intent;
import java.util.List;

/* loaded from: classes4.dex */
public interface yc2 {

    public static final class a {
        public static /* synthetic */ void a(yc2 yc2Var, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            yc2Var.b(list);
        }
    }

    Intent a(List list);

    void b(List list);
}
