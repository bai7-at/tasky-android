package androidx.compose.ui.text;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.cg;
import defpackage.fd5;
import defpackage.fv0;
import defpackage.gv1;
import defpackage.io5;
import defpackage.ip5;
import defpackage.iv0;
import defpackage.jo5;
import defpackage.jo7;
import defpackage.ko5;
import defpackage.kt6;
import defpackage.mx4;
import defpackage.ph0;
import defpackage.ph8;
import defpackage.pj8;
import defpackage.sf;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.yc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public final class MultiParagraph {
    private final MultiParagraphIntrinsics a;
    private final int b;
    private final boolean c;
    private final float d;
    private final float e;
    private final int f;
    private final List g;
    private final List h;

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    private final void F(int i) {
        if (i < 0 || i >= b().j().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    private final void G(int i) {
        if (i < 0 || i > b().j().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void H(int i) {
        if (i < 0 || i >= this.f) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.f + ')').toString());
        }
    }

    private final a b() {
        return this.a.e();
    }

    public final long A(int i) {
        G(i);
        jo5 jo5Var = (jo5) this.h.get(i == b().length() ? kotlin.collections.i.n(this.h) : mx4.a(this.h, i));
        return jo5Var.k(jo5Var.e().f(jo5Var.p(i)));
    }

    public final void B(ph0 ph0Var, long j, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i) {
        ph0Var.t();
        List list = this.h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jo5 jo5Var = (jo5) list.get(i2);
            jo5Var.e().w(ph0Var, j, jo7Var, ph8Var, gv1Var, i);
            ph0Var.c(0.0f, jo5Var.e().getHeight());
        }
        ph0Var.k();
    }

    public final void D(ph0 ph0Var, yc0 yc0Var, float f, jo7 jo7Var, ph8 ph8Var, gv1 gv1Var, int i) {
        sf.a(this, ph0Var, yc0Var, f, jo7Var, ph8Var, gv1Var, i);
    }

    public final float[] a(final long j, final float[] fArr, int i) {
        F(i.l(j));
        G(i.k(j));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        mx4.d(this.h, j, new ss2() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(jo5 jo5Var) {
                long j2 = j;
                float[] fArr2 = fArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                long b = pj8.b(jo5Var.p(jo5Var.f() > i.l(j2) ? jo5Var.f() : i.l(j2)), jo5Var.p(jo5Var.b() < i.k(j2) ? jo5Var.b() : i.k(j2)));
                jo5Var.e().u(b, fArr2, ref$IntRef2.element);
                int j3 = ref$IntRef2.element + (i.j(b) * 4);
                for (int i2 = ref$IntRef2.element; i2 < j3; i2 += 4) {
                    int i3 = i2 + 1;
                    float f = fArr2[i3];
                    float f2 = ref$FloatRef2.element;
                    fArr2[i3] = f + f2;
                    int i4 = i2 + 3;
                    fArr2[i4] = fArr2[i4] + f2;
                }
                ref$IntRef2.element = j3;
                ref$FloatRef2.element += jo5Var.e().getHeight();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((jo5) obj);
                return ww8.a;
            }
        });
        return fArr;
    }

    public final ResolvedTextDirection c(int i) {
        G(i);
        jo5 jo5Var = (jo5) this.h.get(i == b().length() ? kotlin.collections.i.n(this.h) : mx4.a(this.h, i));
        return jo5Var.e().y(jo5Var.p(i));
    }

    public final kt6 d(int i) {
        F(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.a(this.h, i));
        return jo5Var.j(jo5Var.e().A(jo5Var.p(i)));
    }

    public final kt6 e(int i) {
        G(i);
        jo5 jo5Var = (jo5) this.h.get(i == b().length() ? kotlin.collections.i.n(this.h) : mx4.a(this.h, i));
        return jo5Var.j(jo5Var.e().e(jo5Var.p(i)));
    }

    public final boolean f() {
        return this.c;
    }

    public final float g() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        return ((jo5) this.h.get(0)).e().g();
    }

    public final float h() {
        return this.e;
    }

    public final float i(int i, boolean z) {
        G(i);
        jo5 jo5Var = (jo5) this.h.get(i == b().length() ? kotlin.collections.i.n(this.h) : mx4.a(this.h, i));
        return jo5Var.e().q(jo5Var.p(i), z);
    }

    public final MultiParagraphIntrinsics j() {
        return this.a;
    }

    public final float k() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        jo5 jo5Var = (jo5) kotlin.collections.i.w0(this.h);
        return jo5Var.n(jo5Var.e().v());
    }

    public final float l(int i) {
        H(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.b(this.h, i));
        return jo5Var.n(jo5Var.e().z(jo5Var.q(i)));
    }

    public final int m() {
        return this.f;
    }

    public final int n(int i, boolean z) {
        H(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.b(this.h, i));
        return jo5Var.l(jo5Var.e().k(jo5Var.q(i), z));
    }

    public final int o(int i) {
        jo5 jo5Var = (jo5) this.h.get(i >= b().length() ? kotlin.collections.i.n(this.h) : i < 0 ? 0 : mx4.a(this.h, i));
        return jo5Var.m(jo5Var.e().x(jo5Var.p(i)));
    }

    public final int p(float f) {
        jo5 jo5Var = (jo5) this.h.get(f <= 0.0f ? 0 : f >= this.e ? kotlin.collections.i.n(this.h) : mx4.c(this.h, f));
        return jo5Var.d() == 0 ? jo5Var.g() : jo5Var.m(jo5Var.e().o(jo5Var.r(f)));
    }

    public final float q(int i) {
        H(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.b(this.h, i));
        return jo5Var.e().s(jo5Var.q(i));
    }

    public final float r(int i) {
        H(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.b(this.h, i));
        return jo5Var.e().m(jo5Var.q(i));
    }

    public final int s(int i) {
        H(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.b(this.h, i));
        return jo5Var.l(jo5Var.e().j(jo5Var.q(i)));
    }

    public final float t(int i) {
        H(i);
        jo5 jo5Var = (jo5) this.h.get(mx4.b(this.h, i));
        return jo5Var.n(jo5Var.e().d(jo5Var.q(i)));
    }

    public final int u(long j) {
        jo5 jo5Var = (jo5) this.h.get(fd5.p(j) <= 0.0f ? 0 : fd5.p(j) >= this.e ? kotlin.collections.i.n(this.h) : mx4.c(this.h, fd5.p(j)));
        return jo5Var.d() == 0 ? jo5Var.f() : jo5Var.l(jo5Var.e().i(jo5Var.o(j)));
    }

    public final ResolvedTextDirection v(int i) {
        G(i);
        jo5 jo5Var = (jo5) this.h.get(i == b().length() ? kotlin.collections.i.n(this.h) : mx4.a(this.h, i));
        return jo5Var.e().c(jo5Var.p(i));
    }

    public final List w() {
        return this.h;
    }

    public final ip5 x(final int i, final int i2) {
        if (i >= 0 && i <= i2 && i2 <= b().j().length()) {
            if (i == i2) {
                return cg.a();
            }
            final ip5 a = cg.a();
            mx4.d(this.h, pj8.b(i, i2), new ss2() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(jo5 jo5Var) {
                    ip5.B(ip5.this, jo5Var.i(jo5Var.e().p(jo5Var.p(i), jo5Var.p(i2))), 0L, 2, null);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((jo5) obj);
                    return ww8.a;
                }
            });
            return a;
        }
        throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + b().j().length() + "), or start > end!").toString());
    }

    public final List y() {
        return this.g;
    }

    public final float z() {
        return this.d;
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        this.a = multiParagraphIntrinsics;
        this.b = i;
        if (fv0.p(j) != 0 || fv0.o(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List f = multiParagraphIntrinsics.f();
        int size = f.size();
        int i2 = 0;
        int i3 = 0;
        float f2 = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            ko5 ko5Var = (ko5) f.get(i4);
            io5 c = e.c(ko5Var.b(), iv0.b(0, fv0.n(j), 0, fv0.i(j) ? uo6.d(fv0.m(j) - e.d(f2), i2) : fv0.m(j), 5, null), this.b - i3, z);
            float height = f2 + c.getHeight();
            int l = i3 + c.l();
            List list = f;
            arrayList.add(new jo5(c, ko5Var.c(), ko5Var.a(), i3, l, f2, height));
            if (c.n() || (l == this.b && i4 != kotlin.collections.i.n(this.a.f()))) {
                z2 = true;
                i3 = l;
                f2 = height;
                break;
            } else {
                i4++;
                i3 = l;
                f2 = height;
                i2 = 0;
                f = list;
            }
        }
        z2 = false;
        this.e = f2;
        this.f = i3;
        this.c = z2;
        this.h = arrayList;
        this.d = fv0.n(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            jo5 jo5Var = (jo5) arrayList.get(i5);
            List B = jo5Var.e().B();
            ArrayList arrayList3 = new ArrayList(B.size());
            int size3 = B.size();
            for (int i6 = 0; i6 < size3; i6++) {
                kt6 kt6Var = (kt6) B.get(i6);
                arrayList3.add(kt6Var != null ? jo5Var.j(kt6Var) : null);
            }
            kotlin.collections.i.B(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.g().size()) {
            int size4 = this.a.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = kotlin.collections.i.F0(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }
}
