package defpackage;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class aj8 {
    public static final int g = 8;
    private final g a;
    private final MultiParagraph b;
    private final long c;
    private final float d;
    private final float e;
    private final List f;

    public /* synthetic */ aj8(g gVar, MultiParagraph multiParagraph, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, multiParagraph, j);
    }

    public static /* synthetic */ aj8 b(aj8 aj8Var, g gVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = aj8Var.a;
        }
        if ((i & 2) != 0) {
            j = aj8Var.c;
        }
        return aj8Var.a(gVar, j);
    }

    public static /* synthetic */ int p(aj8 aj8Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return aj8Var.o(i, z);
    }

    public final List A() {
        return this.f;
    }

    public final long B() {
        return this.c;
    }

    public final long C(int i) {
        return this.b.A(i);
    }

    public final aj8 a(g gVar, long j) {
        return new aj8(gVar, this.b, j, null);
    }

    public final ResolvedTextDirection c(int i) {
        return this.b.c(i);
    }

    public final kt6 d(int i) {
        return this.b.d(i);
    }

    public final kt6 e(int i) {
        return this.b.e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj8)) {
            return false;
        }
        aj8 aj8Var = (aj8) obj;
        return zq3.c(this.a, aj8Var.a) && zq3.c(this.b, aj8Var.b) && hn3.e(this.c, aj8Var.c) && this.d == aj8Var.d && this.e == aj8Var.e && zq3.c(this.f, aj8Var.f);
    }

    public final boolean f() {
        return this.b.f() || ((float) hn3.f(this.c)) < this.b.h();
    }

    public final boolean g() {
        return ((float) hn3.g(this.c)) < this.b.z();
    }

    public final float h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + hn3.h(this.c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.e)) * 31) + this.f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i, boolean z) {
        return this.b.i(i, z);
    }

    public final float k() {
        return this.e;
    }

    public final g l() {
        return this.a;
    }

    public final float m(int i) {
        return this.b.l(i);
    }

    public final int n() {
        return this.b.m();
    }

    public final int o(int i, boolean z) {
        return this.b.n(i, z);
    }

    public final int q(int i) {
        return this.b.o(i);
    }

    public final int r(float f) {
        return this.b.p(f);
    }

    public final float s(int i) {
        return this.b.q(i);
    }

    public final float t(int i) {
        return this.b.r(i);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) hn3.i(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }

    public final int u(int i) {
        return this.b.s(i);
    }

    public final float v(int i) {
        return this.b.t(i);
    }

    public final MultiParagraph w() {
        return this.b;
    }

    public final int x(long j) {
        return this.b.u(j);
    }

    public final ResolvedTextDirection y(int i) {
        return this.b.v(i);
    }

    public final ip5 z(int i, int i2) {
        return this.b.x(i, i2);
    }

    private aj8(g gVar, MultiParagraph multiParagraph, long j) {
        this.a = gVar;
        this.b = multiParagraph;
        this.c = j;
        this.d = multiParagraph.g();
        this.e = multiParagraph.k();
        this.f = multiParagraph.y();
    }
}
