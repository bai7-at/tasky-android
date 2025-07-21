package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class hs8 implements fs8 {
    private static volatile is8 e;
    private final ul0 a;
    private final ul0 b;
    private final fb7 c;
    private final py8 d;

    hs8(ul0 ul0Var, ul0 ul0Var2, fb7 fb7Var, py8 py8Var, hj9 hj9Var) {
        this.a = ul0Var;
        this.b = ul0Var2;
        this.c = fb7Var;
        this.d = py8Var;
        hj9Var.c();
    }

    private c42 b(qj7 qj7Var) {
        return c42.a().i(this.a.a()).k(this.b.a()).j(qj7Var.g()).h(new x02(qj7Var.b(), qj7Var.d())).g(qj7Var.c().a()).d();
    }

    public static hs8 c() {
        is8 is8Var = e;
        if (is8Var != null) {
            return is8Var.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(en1 en1Var) {
        return en1Var instanceof w02 ? Collections.unmodifiableSet(((w02) en1Var).a()) : Collections.singleton(f12.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (hs8.class) {
                try {
                    if (e == null) {
                        e = s71.d().a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.fs8
    public void a(qj7 qj7Var, ks8 ks8Var) {
        this.c.a(qj7Var.f().f(qj7Var.c().c()), b(qj7Var), ks8Var);
    }

    public py8 e() {
        return this.d;
    }

    public bs8 g(en1 en1Var) {
        return new cs8(d(en1Var), as8.a().b(en1Var.getName()).c(en1Var.getExtras()).a(), this);
    }
}
