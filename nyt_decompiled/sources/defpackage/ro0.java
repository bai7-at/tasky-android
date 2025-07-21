package defpackage;

import androidx.compose.runtime.y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ro0 {
    private final sy4 a;
    private final sy4 b;
    private final sy4 c;
    private final sy4 d;
    private final sy4 e;
    private final sy4 f;
    private final sy4 g;
    private final sy4 h;
    private final sy4 i;
    private final sy4 j;
    private final sy4 k;
    private final sy4 l;
    private final sy4 m;

    public /* synthetic */ ro0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    public final void A(long j) {
        this.d.setValue(nn0.j(j));
    }

    public final void B(long j) {
        this.f.setValue(nn0.j(j));
    }

    public final ro0 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        return new ro0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z, null);
    }

    public final long c() {
        return ((nn0) this.e.getValue()).B();
    }

    public final long d() {
        return ((nn0) this.g.getValue()).B();
    }

    public final long e() {
        return ((nn0) this.j.getValue()).B();
    }

    public final long f() {
        return ((nn0) this.l.getValue()).B();
    }

    public final long g() {
        return ((nn0) this.h.getValue()).B();
    }

    public final long h() {
        return ((nn0) this.i.getValue()).B();
    }

    public final long i() {
        return ((nn0) this.k.getValue()).B();
    }

    public final long j() {
        return ((nn0) this.a.getValue()).B();
    }

    public final long k() {
        return ((nn0) this.b.getValue()).B();
    }

    public final long l() {
        return ((nn0) this.c.getValue()).B();
    }

    public final long m() {
        return ((nn0) this.d.getValue()).B();
    }

    public final long n() {
        return ((nn0) this.f.getValue()).B();
    }

    public final boolean o() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final void p(long j) {
        this.e.setValue(nn0.j(j));
    }

    public final void q(long j) {
        this.g.setValue(nn0.j(j));
    }

    public final void r(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void s(long j) {
        this.j.setValue(nn0.j(j));
    }

    public final void t(long j) {
        this.l.setValue(nn0.j(j));
    }

    public String toString() {
        return "Colors(primary=" + ((Object) nn0.A(j())) + ", primaryVariant=" + ((Object) nn0.A(k())) + ", secondary=" + ((Object) nn0.A(l())) + ", secondaryVariant=" + ((Object) nn0.A(m())) + ", background=" + ((Object) nn0.A(c())) + ", surface=" + ((Object) nn0.A(n())) + ", error=" + ((Object) nn0.A(d())) + ", onPrimary=" + ((Object) nn0.A(g())) + ", onSecondary=" + ((Object) nn0.A(h())) + ", onBackground=" + ((Object) nn0.A(e())) + ", onSurface=" + ((Object) nn0.A(i())) + ", onError=" + ((Object) nn0.A(f())) + ", isLight=" + o() + ')';
    }

    public final void u(long j) {
        this.h.setValue(nn0.j(j));
    }

    public final void v(long j) {
        this.i.setValue(nn0.j(j));
    }

    public final void w(long j) {
        this.k.setValue(nn0.j(j));
    }

    public final void x(long j) {
        this.a.setValue(nn0.j(j));
    }

    public final void y(long j) {
        this.b.setValue(nn0.j(j));
    }

    public final void z(long j) {
        this.c.setValue(nn0.j(j));
    }

    private ro0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.a = y.i(nn0.j(j), y.q());
        this.b = y.i(nn0.j(j2), y.q());
        this.c = y.i(nn0.j(j3), y.q());
        this.d = y.i(nn0.j(j4), y.q());
        this.e = y.i(nn0.j(j5), y.q());
        this.f = y.i(nn0.j(j6), y.q());
        this.g = y.i(nn0.j(j7), y.q());
        this.h = y.i(nn0.j(j8), y.q());
        this.i = y.i(nn0.j(j9), y.q());
        this.j = y.i(nn0.j(j10), y.q());
        this.k = y.i(nn0.j(j11), y.q());
        this.l = y.i(nn0.j(j12), y.q());
        this.m = y.i(Boolean.valueOf(z), y.q());
    }
}
