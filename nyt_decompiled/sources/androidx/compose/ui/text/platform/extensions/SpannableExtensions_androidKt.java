package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import defpackage.dg4;
import defpackage.dk8;
import defpackage.ek8;
import defpackage.fd5;
import defpackage.fk8;
import defpackage.fm1;
import defpackage.gv1;
import defpackage.ho7;
import defpackage.hv1;
import defpackage.it2;
import defpackage.iu7;
import defpackage.j34;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.k34;
import defpackage.kt2;
import defpackage.l74;
import defpackage.li8;
import defpackage.lj8;
import defpackage.m60;
import defpackage.mo7;
import defpackage.n74;
import defpackage.ni8;
import defpackage.nn0;
import defpackage.o60;
import defpackage.om2;
import defpackage.ox7;
import defpackage.ph8;
import defpackage.qh8;
import defpackage.t44;
import defpackage.u44;
import defpackage.v44;
import defpackage.vu8;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.yc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class SpannableExtensions_androidKt {
    private static final MetricAffectingSpan a(long j, fm1 fm1Var) {
        long g = dk8.g(j);
        fk8.a aVar = fk8.b;
        if (fk8.g(g, aVar.b())) {
            return new k34(fm1Var.t0(j));
        }
        if (fk8.g(g, aVar.a())) {
            return new j34(dk8.h(j));
        }
        return null;
    }

    public static final void b(jy7 jy7Var, List list, it2 it2Var) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            it2Var.invoke(f(jy7Var, (jy7) ((a.b) list.get(0)).e()), Integer.valueOf(((a.b) list.get(0)).f()), Integer.valueOf(((a.b) list.get(0)).d()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            a.b bVar = (a.b) list.get(i3);
            numArr[i3] = Integer.valueOf(bVar.f());
            numArr[i3 + size] = Integer.valueOf(bVar.d());
        }
        d.F(numArr);
        int intValue = ((Number) d.a0(numArr)).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            Integer num = numArr[i4];
            int intValue2 = num.intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                jy7 jy7Var2 = jy7Var;
                for (int i5 = 0; i5 < size3; i5++) {
                    a.b bVar2 = (a.b) list.get(i5);
                    if (bVar2.f() != bVar2.d() && b.l(intValue, intValue2, bVar2.f(), bVar2.d())) {
                        jy7Var2 = f(jy7Var2, (jy7) bVar2.e());
                    }
                }
                if (jy7Var2 != null) {
                    it2Var.invoke(jy7Var2, Integer.valueOf(intValue), num);
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean c(jy7 jy7Var) {
        long g = dk8.g(jy7Var.q());
        fk8.a aVar = fk8.b;
        return fk8.g(g, aVar.b()) || fk8.g(dk8.g(jy7Var.q()), aVar.a());
    }

    private static final boolean d(j jVar) {
        return lj8.d(jVar.R()) || jVar.r() != null;
    }

    private static final boolean e(fm1 fm1Var) {
        return ((double) fm1Var.c1()) > 1.05d;
    }

    private static final jy7 f(jy7 jy7Var, jy7 jy7Var2) {
        return jy7Var == null ? jy7Var2 : jy7Var.A(jy7Var2);
    }

    private static final float g(long j, float f, fm1 fm1Var) {
        float h;
        long g = dk8.g(j);
        fk8.a aVar = fk8.b;
        if (fk8.g(g, aVar.b())) {
            if (!e(fm1Var)) {
                return fm1Var.t0(j);
            }
            h = dk8.h(j) / dk8.h(fm1Var.Q(f));
        } else {
            if (!fk8.g(g, aVar.a())) {
                return Float.NaN;
            }
            h = dk8.h(j);
        }
        return h * f;
    }

    public static final void h(Spannable spannable, long j, int i, int i2) {
        if (j != nn0.b.g()) {
            u(spannable, new BackgroundColorSpan(wn0.k(j)), i, i2);
        }
    }

    private static final void i(Spannable spannable, m60 m60Var, int i, int i2) {
        if (m60Var != null) {
            u(spannable, new o60(m60Var.h()), i, i2);
        }
    }

    private static final void j(Spannable spannable, yc0 yc0Var, float f, int i, int i2) {
        if (yc0Var != null) {
            if (yc0Var instanceof ox7) {
                k(spannable, ((ox7) yc0Var).b(), i, i2);
            } else if (yc0Var instanceof ho7) {
                u(spannable, new ShaderBrushSpan((ho7) yc0Var, f), i, i2);
            }
        }
    }

    public static final void k(Spannable spannable, long j, int i, int i2) {
        if (j != nn0.b.g()) {
            u(spannable, new ForegroundColorSpan(wn0.k(j)), i, i2);
        }
    }

    private static final void l(Spannable spannable, gv1 gv1Var, int i, int i2) {
        if (gv1Var != null) {
            u(spannable, new hv1(gv1Var), i, i2);
        }
    }

    private static final void m(final Spannable spannable, j jVar, List list, final kt2 kt2Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            a.b bVar = (a.b) obj;
            if (lj8.d((jy7) bVar.e()) || ((jy7) bVar.e()).o() != null) {
                arrayList.add(obj);
            }
        }
        b(d(jVar) ? new jy7(0L, 0L, jVar.s(), jVar.q(), jVar.r(), jVar.n(), (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65475, (DefaultConstructorMarker) null) : null, arrayList, new it2() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(jy7 jy7Var, int i2, int i3) {
                Spannable spannable2 = spannable;
                kt2 kt2Var2 = kt2Var;
                e k = jy7Var.k();
                o p = jy7Var.p();
                if (p == null) {
                    p = o.b.f();
                }
                l n = jy7Var.n();
                l c = l.c(n != null ? n.i() : l.b.b());
                m o = jy7Var.o();
                spannable2.setSpan(new vu8((Typeface) kt2Var2.invoke(k, p, c, m.e(o != null ? o.m() : m.b.a()))), i2, i3, 33);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                b((jy7) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return ww8.a;
            }
        });
    }

    private static final void n(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            u(spannable, new om2(str), i, i2);
        }
    }

    public static final void o(Spannable spannable, long j, fm1 fm1Var, int i, int i2) {
        long g = dk8.g(j);
        fk8.a aVar = fk8.b;
        if (fk8.g(g, aVar.b())) {
            u(spannable, new AbsoluteSizeSpan(dg4.d(fm1Var.t0(j)), false), i, i2);
        } else if (fk8.g(g, aVar.a())) {
            u(spannable, new RelativeSizeSpan(dk8.h(j)), i, i2);
        }
    }

    private static final void p(Spannable spannable, li8 li8Var, int i, int i2) {
        if (li8Var != null) {
            u(spannable, new ScaleXSpan(li8Var.b()), i, i2);
            u(spannable, new iu7(li8Var.c()), i, i2);
        }
    }

    public static final void q(Spannable spannable, long j, float f, fm1 fm1Var, u44 u44Var) {
        float g = g(j, f, fm1Var);
        if (Float.isNaN(g)) {
            return;
        }
        u(spannable, new v44(g, 0, (spannable.length() == 0 || h.j1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), u44.c.f(u44Var.c()), u44.c.g(u44Var.c()), u44Var.b()), 0, spannable.length());
    }

    public static final void r(Spannable spannable, long j, float f, fm1 fm1Var) {
        float g = g(j, f, fm1Var);
        if (Float.isNaN(g)) {
            return;
        }
        u(spannable, new t44(g), 0, spannable.length());
    }

    public static final void s(Spannable spannable, l74 l74Var, int i, int i2) {
        if (l74Var != null) {
            u(spannable, n74.a.a(l74Var), i, i2);
        }
    }

    private static final void t(Spannable spannable, jo7 jo7Var, int i, int i2) {
        if (jo7Var != null) {
            u(spannable, new mo7(wn0.k(jo7Var.c()), fd5.o(jo7Var.d()), fd5.p(jo7Var.d()), lj8.b(jo7Var.b())), i, i2);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void v(Spannable spannable, a.b bVar, fm1 fm1Var) {
        int f = bVar.f();
        int d = bVar.d();
        jy7 jy7Var = (jy7) bVar.e();
        i(spannable, jy7Var.g(), f, d);
        k(spannable, jy7Var.i(), f, d);
        j(spannable, jy7Var.h(), jy7Var.e(), f, d);
        x(spannable, jy7Var.u(), f, d);
        o(spannable, jy7Var.m(), fm1Var, f, d);
        n(spannable, jy7Var.l(), f, d);
        p(spannable, jy7Var.w(), f, d);
        s(spannable, jy7Var.r(), f, d);
        h(spannable, jy7Var.f(), f, d);
        t(spannable, jy7Var.t(), f, d);
        l(spannable, jy7Var.j(), f, d);
    }

    public static final void w(Spannable spannable, j jVar, List list, fm1 fm1Var, kt2 kt2Var) {
        MetricAffectingSpan a;
        m(spannable, jVar, list, kt2Var);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            a.b bVar = (a.b) list.get(i);
            int f = bVar.f();
            int d = bVar.d();
            if (f >= 0 && f < spannable.length() && d > f && d <= spannable.length()) {
                v(spannable, bVar, fm1Var);
                if (c((jy7) bVar.e())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a.b bVar2 = (a.b) list.get(i2);
                int f2 = bVar2.f();
                int d2 = bVar2.d();
                jy7 jy7Var = (jy7) bVar2.e();
                if (f2 >= 0 && f2 < spannable.length() && d2 > f2 && d2 <= spannable.length() && (a = a(jy7Var.q(), fm1Var)) != null) {
                    u(spannable, a, f2, d2);
                }
            }
        }
    }

    public static final void x(Spannable spannable, ph8 ph8Var, int i, int i2) {
        if (ph8Var != null) {
            ph8.a aVar = ph8.b;
            u(spannable, new qh8(ph8Var.d(aVar.d()), ph8Var.d(aVar.b())), i, i2);
        }
    }

    public static final void y(Spannable spannable, ni8 ni8Var, float f, fm1 fm1Var) {
        if (ni8Var != null) {
            if ((dk8.e(ni8Var.b(), ek8.g(0)) && dk8.e(ni8Var.c(), ek8.g(0))) || ek8.h(ni8Var.b()) || ek8.h(ni8Var.c())) {
                return;
            }
            long g = dk8.g(ni8Var.b());
            fk8.a aVar = fk8.b;
            float f2 = 0.0f;
            float t0 = fk8.g(g, aVar.b()) ? fm1Var.t0(ni8Var.b()) : fk8.g(g, aVar.a()) ? dk8.h(ni8Var.b()) * f : 0.0f;
            long g2 = dk8.g(ni8Var.c());
            if (fk8.g(g2, aVar.b())) {
                f2 = fm1Var.t0(ni8Var.c());
            } else if (fk8.g(g2, aVar.a())) {
                f2 = dk8.h(ni8Var.c()) * f;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(t0), (int) Math.ceil(f2)), 0, spannable.length());
        }
    }
}
