package defpackage;

import androidx.constraintlayout.compose.c;

/* loaded from: classes.dex */
public interface ca3 {

    public static final class a {
        public static /* synthetic */ void a(ca3 ca3Var, c.b bVar, float f, float f2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i & 2) != 0) {
                f = bu1.g(0);
            }
            if ((i & 4) != 0) {
                f2 = bu1.g(0);
            }
            ca3Var.a(bVar, f, f2);
        }
    }

    void a(c.b bVar, float f, float f2);
}
