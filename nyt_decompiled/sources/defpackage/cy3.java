package defpackage;

import androidx.activity.ComponentActivity;

/* loaded from: classes4.dex */
public interface cy3 {

    public static final class a {
        public static /* synthetic */ void a(cy3 cy3Var, n73 n73Var, f46 f46Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: headerImpressions");
            }
            if ((i & 2) != 0) {
                f46Var = null;
            }
            cy3Var.e(n73Var, f46Var);
        }
    }

    void a();

    void b(f46 f46Var);

    void c(zc5 zc5Var, f46 f46Var);

    void d(f46 f46Var);

    void e(n73 n73Var, f46 f46Var);

    void f(ComponentActivity componentActivity, boolean z);
}
