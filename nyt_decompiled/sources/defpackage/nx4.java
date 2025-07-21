package defpackage;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.lu4;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class nx4 {
    private a a;
    private j b;
    private e.b c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private List h;
    private lu4 i;
    private long j;
    private fm1 k;
    private MultiParagraphIntrinsics l;
    private LayoutDirection m;
    private aj8 n;
    private int o;
    private int p;

    public /* synthetic */ nx4(a aVar, j jVar, e.b bVar, int i, boolean z, int i2, int i3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, bVar, i, z, i2, i3, list);
    }

    private final MultiParagraph e(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics l = l(layoutDirection);
        return new MultiParagraph(l, zz3.a(j, this.e, this.d, l.a()), zz3.b(this.e, this.d, this.f), kj8.e(this.d, kj8.a.b()), null);
    }

    private final void g() {
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    private final boolean j(aj8 aj8Var, long j, LayoutDirection layoutDirection) {
        if (aj8Var == null || aj8Var.w().j().c() || layoutDirection != aj8Var.l().d()) {
            return true;
        }
        if (fv0.g(j, aj8Var.l().a())) {
            return false;
        }
        return fv0.n(j) != fv0.n(aj8Var.l().a()) || ((float) fv0.m(j)) < aj8Var.w().h() || aj8Var.w().f();
    }

    private final MultiParagraphIntrinsics l(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.l;
        if (multiParagraphIntrinsics == null || layoutDirection != this.m || multiParagraphIntrinsics.c()) {
            this.m = layoutDirection;
            a aVar = this.a;
            j d = ak8.d(this.b, layoutDirection);
            fm1 fm1Var = this.k;
            zq3.e(fm1Var);
            e.b bVar = this.c;
            List list = this.h;
            if (list == null) {
                list = i.l();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(aVar, d, list, fm1Var, bVar);
        }
        this.l = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    private final aj8 m(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.j().a(), multiParagraph.z());
        a aVar = this.a;
        j jVar = this.b;
        List list = this.h;
        if (list == null) {
            list = i.l();
        }
        List list2 = list;
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        fm1 fm1Var = this.k;
        zq3.e(fm1Var);
        return new aj8(new g(aVar, jVar, list2, i, z, i2, fm1Var, layoutDirection, this.c, j, (DefaultConstructorMarker) null), multiParagraph, iv0.d(j, in3.a(th8.a(min), th8.a(multiParagraph.h()))), null);
    }

    public final fm1 a() {
        return this.k;
    }

    public final aj8 b() {
        return this.n;
    }

    public final aj8 c() {
        aj8 aj8Var = this.n;
        if (aj8Var != null) {
            return aj8Var;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i, LayoutDirection layoutDirection) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = th8.a(e(iv0.a(0, i, 0, Integer.MAX_VALUE), layoutDirection).h());
        this.o = i;
        this.p = a;
        return a;
    }

    public final boolean f(long j, LayoutDirection layoutDirection) {
        if (this.g > 1) {
            lu4.a aVar = lu4.h;
            lu4 lu4Var = this.i;
            j jVar = this.b;
            fm1 fm1Var = this.k;
            zq3.e(fm1Var);
            lu4 a = aVar.a(lu4Var, layoutDirection, jVar, fm1Var, this.c);
            this.i = a;
            j = a.c(j, this.g);
        }
        if (j(this.n, j, layoutDirection)) {
            this.n = m(layoutDirection, j, e(j, layoutDirection));
            return true;
        }
        aj8 aj8Var = this.n;
        zq3.e(aj8Var);
        if (fv0.g(j, aj8Var.l().a())) {
            return false;
        }
        aj8 aj8Var2 = this.n;
        zq3.e(aj8Var2);
        this.n = m(layoutDirection, j, aj8Var2.w());
        return true;
    }

    public final int h(LayoutDirection layoutDirection) {
        return th8.a(l(layoutDirection).a());
    }

    public final int i(LayoutDirection layoutDirection) {
        return th8.a(l(layoutDirection).b());
    }

    public final void k(fm1 fm1Var) {
        fm1 fm1Var2 = this.k;
        long d = fm1Var != null ? ak3.d(fm1Var) : ak3.a.a();
        if (fm1Var2 == null) {
            this.k = fm1Var;
            this.j = d;
        } else if (fm1Var == null || !ak3.e(this.j, d)) {
            this.k = fm1Var;
            this.j = d;
            g();
        }
    }

    public final void n(a aVar, j jVar, e.b bVar, int i, boolean z, int i2, int i3, List list) {
        this.a = aVar;
        this.b = jVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        g();
    }

    private nx4(a aVar, j jVar, e.b bVar, int i, boolean z, int i2, int i3, List list) {
        this.a = aVar;
        this.b = jVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        this.j = ak3.a.a();
        this.o = -1;
        this.p = -1;
    }
}
