package defpackage;

import defpackage.b90;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class c49 {
    private static final List a = i.l();
    private static final int b = v48.a.a();
    private static final int c = x48.a.b();
    private static final int d = b90.a.z();
    private static final long e = nn0.b.f();
    private static final int f = np5.a.b();

    public static final List a(String str) {
        return str == null ? a : new zp5().a(str).b();
    }

    public static final int b() {
        return f;
    }

    public static final int c() {
        return b;
    }

    public static final int d() {
        return c;
    }

    public static final List e() {
        return a;
    }

    public static final boolean f(long j, long j2) {
        return nn0.y(j) == nn0.y(j2) && nn0.x(j) == nn0.x(j2) && nn0.v(j) == nn0.v(j2);
    }

    public static final boolean g(qn0 qn0Var) {
        if (qn0Var instanceof c90) {
            c90 c90Var = (c90) qn0Var;
            int b2 = c90Var.b();
            b90.a aVar = b90.a;
            if (b90.E(b2, aVar.z()) || b90.E(c90Var.b(), aVar.B())) {
                return true;
            }
        } else if (qn0Var == null) {
            return true;
        }
        return false;
    }
}
