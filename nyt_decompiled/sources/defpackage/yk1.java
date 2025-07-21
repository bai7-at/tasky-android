package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class yk1 implements nz8 {
    private final String a;
    private final b13 b;

    yk1(Set set, b13 b13Var) {
        this.a = e(set);
        this.b = b13Var;
    }

    public static nq0 c() {
        return nq0.c(nz8.class).b(km1.l(s34.class)).f(new ar0() { // from class: xk1
            @Override // defpackage.ar0
            public final Object a(uq0 uq0Var) {
                nz8 d;
                d = yk1.d(uq0Var);
                return d;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nz8 d(uq0 uq0Var) {
        return new yk1(uq0Var.c(s34.class), b13.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            s34 s34Var = (s34) it2.next();
            sb.append(s34Var.b());
            sb.append('/');
            sb.append(s34Var.c());
            if (it2.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.nz8
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + e(this.b.b());
    }
}
