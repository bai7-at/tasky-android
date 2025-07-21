package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface r08 {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public static /* synthetic */ r08 c(a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return aVar.b(z);
        }

        public final r08 a() {
            return c(this, false, 1, null);
        }

        public final r08 b(boolean z) {
            s08 s08Var = new s08();
            return z ? new pd8(s08Var) : s08Var;
        }
    }

    static r08 a() {
        return a.a();
    }

    static r08 d(boolean z) {
        return a.b(z);
    }

    default q08 b(dk9 dk9Var) {
        zq3.h(dk9Var, "spec");
        return f(ik9.a(dk9Var));
    }

    q08 c(ej9 ej9Var);

    boolean e(ej9 ej9Var);

    q08 f(ej9 ej9Var);

    List remove(String str);
}
