package defpackage;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u80 extends Painter {
    private final sf3 g;
    private final long h;
    private final long i;
    private int j;
    private final long k;
    private float l;
    private qn0 m;

    public /* synthetic */ u80(sf3 sf3Var, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sf3Var, j, j2);
    }

    private final long o(long j, long j2) {
        if (vm3.j(j) < 0 || vm3.k(j) < 0 || hn3.g(j2) < 0 || hn3.f(j2) < 0 || hn3.g(j2) > this.g.getWidth() || hn3.f(j2) > this.g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j2;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(qn0 qn0Var) {
        this.m = qn0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return zq3.c(this.g, u80Var.g) && vm3.i(this.h, u80Var.h) && hn3.e(this.i, u80Var.i) && jh2.d(this.j, u80Var.j);
    }

    public int hashCode() {
        return (((((this.g.hashCode() * 31) + vm3.l(this.h)) * 31) + hn3.h(this.i)) * 31) + jh2.e(this.j);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        return in3.c(this.k);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        fv1.C0(fv1Var, this.g, this.h, this.i, 0L, in3.a(dg4.d(zt7.i(fv1Var.b())), dg4.d(zt7.g(fv1Var.b()))), this.l, null, this.m, 0, this.j, 328, null);
    }

    public final void n(int i) {
        this.j = i;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + ((Object) vm3.m(this.h)) + ", srcSize=" + ((Object) hn3.i(this.i)) + ", filterQuality=" + ((Object) jh2.f(this.j)) + ')';
    }

    public /* synthetic */ u80(sf3 sf3Var, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sf3Var, (i & 2) != 0 ? vm3.b.a() : j, (i & 4) != 0 ? in3.a(sf3Var.getWidth(), sf3Var.getHeight()) : j2, null);
    }

    private u80(sf3 sf3Var, long j, long j2) {
        this.g = sf3Var;
        this.h = j;
        this.i = j2;
        this.j = jh2.a.a();
        this.k = o(j, j2);
        this.l = 1.0f;
    }
}
