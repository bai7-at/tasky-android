package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface yu4 {

    public static class a {
        public final ov3 a;
        public final List b;
        public final k91 c;

        public a(ov3 ov3Var, k91 k91Var) {
            this(ov3Var, Collections.emptyList(), k91Var);
        }

        public a(ov3 ov3Var, List list, k91 k91Var) {
            this.a = (ov3) z06.d(ov3Var);
            this.b = (List) z06.d(list);
            this.c = (k91) z06.d(k91Var);
        }
    }

    a a(Object obj, int i, int i2, sk5 sk5Var);

    boolean b(Object obj);
}
