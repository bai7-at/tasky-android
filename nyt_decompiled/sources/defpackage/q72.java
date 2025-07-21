package defpackage;

import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import java.util.List;

/* loaded from: classes2.dex */
public interface q72 extends aq8 {

    public static final class a {
        public final up8 a;
        public final int[] b;
        public final int c;

        public a(up8 up8Var, int... iArr) {
            this(up8Var, iArr, 0);
        }

        public a(up8 up8Var, int[] iArr, int i) {
            if (iArr.length == 0) {
                a84.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = up8Var;
            this.b = iArr;
            this.c = i;
        }
    }

    public interface b {
        q72[] a(a[] aVarArr, l40 l40Var, o.b bVar, g2 g2Var);
    }

    boolean a(int i, long j);

    int b();

    void c();

    void d();

    default boolean e(long j, ok0 ok0Var, List list) {
        return false;
    }

    boolean h(int i, long j);

    void i(float f);

    Object j();

    default void k() {
    }

    void m(long j, long j2, long j3, List list, qh4[] qh4VarArr);

    default void o(boolean z) {
    }

    int p(long j, List list);

    int r();

    t0 s();

    int t();

    default void u() {
    }
}
