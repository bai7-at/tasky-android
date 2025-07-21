package defpackage;

import android.graphics.Typeface;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import defpackage.fk8;
import defpackage.ij8;
import defpackage.nn0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class lj8 {
    public static final jy7 a(mg mgVar, jy7 jy7Var, kt2 kt2Var, fm1 fm1Var, boolean z) {
        long g = dk8.g(jy7Var.m());
        fk8.a aVar = fk8.b;
        if (fk8.g(g, aVar.b())) {
            mgVar.setTextSize(fm1Var.t0(jy7Var.m()));
        } else if (fk8.g(g, aVar.a())) {
            mgVar.setTextSize(mgVar.getTextSize() * dk8.h(jy7Var.m()));
        }
        if (d(jy7Var)) {
            e k = jy7Var.k();
            o p = jy7Var.p();
            if (p == null) {
                p = o.b.f();
            }
            l n = jy7Var.n();
            l c = l.c(n != null ? n.i() : l.b.b());
            m o = jy7Var.o();
            mgVar.setTypeface((Typeface) kt2Var.invoke(k, p, c, m.e(o != null ? o.m() : m.b.a())));
        }
        if (jy7Var.r() != null && !zq3.c(jy7Var.r(), l74.c.a())) {
            n74.a.b(mgVar, jy7Var.r());
        }
        if (jy7Var.l() != null && !zq3.c(jy7Var.l(), "")) {
            mgVar.setFontFeatureSettings(jy7Var.l());
        }
        if (jy7Var.w() != null && !zq3.c(jy7Var.w(), li8.c.a())) {
            mgVar.setTextScaleX(mgVar.getTextScaleX() * jy7Var.w().b());
            mgVar.setTextSkewX(mgVar.getTextSkewX() + jy7Var.w().c());
        }
        mgVar.d(jy7Var.i());
        mgVar.c(jy7Var.h(), zt7.b.a(), jy7Var.e());
        mgVar.f(jy7Var.t());
        mgVar.g(jy7Var.u());
        mgVar.e(jy7Var.j());
        if (fk8.g(dk8.g(jy7Var.q()), aVar.b()) && dk8.h(jy7Var.q()) != 0.0f) {
            float textSize = mgVar.getTextSize() * mgVar.getTextScaleX();
            float t0 = fm1Var.t0(jy7Var.q());
            if (textSize != 0.0f) {
                mgVar.setLetterSpacing(t0 / textSize);
            }
        } else if (fk8.g(dk8.g(jy7Var.q()), aVar.a())) {
            mgVar.setLetterSpacing(dk8.h(jy7Var.q()));
        }
        return c(jy7Var.q(), z, jy7Var.f(), jy7Var.g());
    }

    public static final float b(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    private static final jy7 c(long j, boolean z, long j2, m60 m60Var) {
        long j3 = j2;
        boolean z2 = false;
        boolean z3 = z && fk8.g(dk8.g(j), fk8.b.b()) && dk8.h(j) != 0.0f;
        nn0.a aVar = nn0.b;
        boolean z4 = (nn0.t(j3, aVar.g()) || nn0.t(j3, aVar.f())) ? false : true;
        if (m60Var != null) {
            if (!m60.e(m60Var.h(), m60.b.a())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long a = z3 ? j : dk8.b.a();
        if (!z4) {
            j3 = aVar.g();
        }
        return new jy7(0L, 0L, (o) null, (l) null, (m) null, (e) null, (String) null, a, z2 ? m60Var : null, (li8) null, (l74) null, j3, (ph8) null, (jo7) null, (f) null, (gv1) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean d(jy7 jy7Var) {
        return (jy7Var.k() == null && jy7Var.n() == null && jy7Var.p() == null) ? false : true;
    }

    public static final void e(mg mgVar, ij8 ij8Var) {
        if (ij8Var == null) {
            ij8Var = ij8.c.a();
        }
        mgVar.setFlags(ij8Var.c() ? mgVar.getFlags() | 128 : mgVar.getFlags() & (-129));
        int b = ij8Var.b();
        ij8.b.a aVar = ij8.b.a;
        if (ij8.b.e(b, aVar.b())) {
            mgVar.setFlags(mgVar.getFlags() | 64);
            mgVar.setHinting(0);
        } else if (ij8.b.e(b, aVar.a())) {
            mgVar.getFlags();
            mgVar.setHinting(1);
        } else if (!ij8.b.e(b, aVar.c())) {
            mgVar.getFlags();
        } else {
            mgVar.getFlags();
            mgVar.setHinting(0);
        }
    }
}
