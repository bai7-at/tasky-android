package defpackage;

import androidx.compose.animation.core.VectorConvertersKt;
import defpackage.bu1;
import defpackage.fd5;
import defpackage.hn3;
import defpackage.kt6;
import defpackage.vm3;
import defpackage.zt7;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class ic9 {
    private static final kt6 a;
    private static final Map b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        a = new kt6(0.5f, 0.5f, 0.5f, 0.5f);
        hu8 e = VectorConvertersKt.e(om3.a);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair a2 = du8.a(e, valueOf2);
        Pair a3 = du8.a(VectorConvertersKt.g(hn3.b), valueOf2);
        Pair a4 = du8.a(VectorConvertersKt.f(vm3.b), valueOf2);
        Pair a5 = du8.a(VectorConvertersKt.d(wk2.a), Float.valueOf(0.01f));
        Pair a6 = du8.a(VectorConvertersKt.i(kt6.e), valueOf);
        Pair a7 = du8.a(VectorConvertersKt.j(zt7.b), valueOf);
        Pair a8 = du8.a(VectorConvertersKt.h(fd5.b), valueOf);
        hu8 b2 = VectorConvertersKt.b(bu1.b);
        Float valueOf3 = Float.valueOf(0.1f);
        b = t.m(a2, a3, a4, a5, a6, a7, a8, du8.a(b2, valueOf3), du8.a(VectorConvertersKt.c(eu1.b), valueOf3));
    }

    public static final float a(bu1.a aVar) {
        return bu1.g(0.1f);
    }

    public static final int b(om3 om3Var) {
        return 1;
    }

    public static final long c(vm3.a aVar) {
        return wm3.a(1, 1);
    }

    public static final long d(hn3.a aVar) {
        return in3.a(1, 1);
    }

    public static final long e(fd5.a aVar) {
        return hd5.a(0.5f, 0.5f);
    }

    public static final long f(zt7.a aVar) {
        return du7.a(0.5f, 0.5f);
    }

    public static final kt6 g(kt6.a aVar) {
        return a;
    }

    public static final Map h() {
        return b;
    }
}
