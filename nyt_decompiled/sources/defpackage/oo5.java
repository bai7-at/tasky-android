package defpackage;

import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dh8;
import defpackage.q44;
import defpackage.yd3;

/* loaded from: classes.dex */
public abstract class oo5 {
    private static final long a = dk8.b.a();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x003d, code lost:
    
        if (defpackage.dk8.e(r12, r24.e()) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.no5 a(defpackage.no5 r24, int r25, int r26, long r27, defpackage.ni8 r29, defpackage.uu5 r30, defpackage.u44 r31, int r32, int r33, defpackage.ij8 r34) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo5.a(no5, int, int, long, ni8, uu5, u44, int, int, ij8):no5");
    }

    public static final no5 b(no5 no5Var, no5 no5Var2, float f) {
        int n = ((dh8) SpanStyleKt.d(dh8.h(no5Var.h()), dh8.h(no5Var2.h()), f)).n();
        int m = ((uh8) SpanStyleKt.d(uh8.g(no5Var.i()), uh8.g(no5Var2.i()), f)).m();
        long f2 = SpanStyleKt.f(no5Var.e(), no5Var2.e(), f);
        ni8 j = no5Var.j();
        if (j == null) {
            j = ni8.c.a();
        }
        ni8 j2 = no5Var2.j();
        if (j2 == null) {
            j2 = ni8.c.a();
        }
        return new no5(n, m, f2, oi8.a(j, j2, f), c(no5Var.g(), no5Var2.g(), f), (u44) SpanStyleKt.d(no5Var.f(), no5Var2.f(), f), ((q44) SpanStyleKt.d(q44.c(no5Var.d()), q44.c(no5Var2.d()), f)).l(), ((yd3) SpanStyleKt.d(yd3.d(no5Var.c()), yd3.d(no5Var2.c()), f)).j(), (ij8) SpanStyleKt.d(no5Var.k(), no5Var2.k(), f), null);
    }

    private static final uu5 c(uu5 uu5Var, uu5 uu5Var2, float f) {
        if (uu5Var == null && uu5Var2 == null) {
            return null;
        }
        if (uu5Var == null) {
            uu5Var = uu5.c.a();
        }
        if (uu5Var2 == null) {
            uu5Var2 = uu5.c.a();
        }
        return og.b(uu5Var, uu5Var2, f);
    }

    private static final uu5 d(no5 no5Var, uu5 uu5Var) {
        return no5Var.g() == null ? uu5Var : uu5Var == null ? no5Var.g() : no5Var.g().d(uu5Var);
    }

    public static final no5 e(no5 no5Var, LayoutDirection layoutDirection) {
        int h = no5Var.h();
        dh8.a aVar = dh8.b;
        int f = dh8.k(h, aVar.g()) ? aVar.f() : no5Var.h();
        int e = ak8.e(layoutDirection, no5Var.i());
        long e2 = ek8.h(no5Var.e()) ? a : no5Var.e();
        ni8 j = no5Var.j();
        if (j == null) {
            j = ni8.c.a();
        }
        ni8 ni8Var = j;
        uu5 g = no5Var.g();
        u44 f2 = no5Var.f();
        int d = no5Var.d();
        q44.a aVar2 = q44.b;
        int a2 = q44.f(d, aVar2.b()) ? aVar2.a() : no5Var.d();
        int c = no5Var.c();
        yd3.a aVar3 = yd3.b;
        int b = yd3.g(c, aVar3.c()) ? aVar3.b() : no5Var.c();
        ij8 k = no5Var.k();
        if (k == null) {
            k = ij8.c.a();
        }
        return new no5(f, e, e2, ni8Var, g, f2, a2, b, k, null);
    }
}
