package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.x0;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public interface ad {

    public static final class a {
        public final long a;
        public final g2 b;
        public final int c;
        public final o.b d;
        public final long e;
        public final g2 f;
        public final int g;
        public final o.b h;
        public final long i;
        public final long j;

        public a(long j, g2 g2Var, int i, o.b bVar, long j2, g2 g2Var2, int i2, o.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = g2Var;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = g2Var2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && hc5.a(this.b, aVar.b) && hc5.a(this.d, aVar.d) && hc5.a(this.f, aVar.f) && hc5.a(this.h, aVar.h);
        }

        public int hashCode() {
            return hc5.b(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    public static final class b {
        private final ik2 a;
        private final SparseArray b;

        public b(ik2 ik2Var, SparseArray sparseArray) {
            this.a = ik2Var;
            SparseArray sparseArray2 = new SparseArray(ik2Var.c());
            for (int i = 0; i < ik2Var.c(); i++) {
                int b = ik2Var.b(i);
                sparseArray2.append(b, (a) ur.e((a) sparseArray.get(b)));
            }
            this.b = sparseArray2;
        }

        public boolean a(int i) {
            return this.a.a(i);
        }

        public int b(int i) {
            return this.a.b(i);
        }

        public a c(int i) {
            return (a) ur.e((a) this.b.get(i));
        }

        public int d() {
            return this.a.c();
        }
    }

    default void A(a aVar, String str, long j) {
    }

    default void B(a aVar, x0 x0Var) {
    }

    void C(a aVar, v1.e eVar, v1.e eVar2, int i);

    default void E(a aVar) {
    }

    default void F(a aVar, String str) {
    }

    default void H(a aVar, int i) {
    }

    default void I(a aVar, t0 t0Var) {
    }

    default void J(a aVar) {
    }

    default void K(a aVar) {
    }

    default void L(a aVar, t0 t0Var) {
    }

    default void M(a aVar, String str, long j, long j2) {
    }

    default void N(a aVar, int i) {
    }

    default void O(a aVar, Exception exc) {
    }

    default void P(a aVar, int i) {
    }

    default void Q(a aVar, u1 u1Var) {
    }

    default void R(a aVar, String str, long j, long j2) {
    }

    default void S(a aVar, wc1 wc1Var) {
    }

    default void T(a aVar, boolean z, int i) {
    }

    default void U(a aVar, String str) {
    }

    default void V(a aVar, String str, long j) {
    }

    default void W(a aVar, wc1 wc1Var) {
    }

    default void X(a aVar, int i) {
    }

    default void Y(a aVar, Metadata metadata) {
    }

    default void Z(a aVar, v64 v64Var, pi4 pi4Var) {
    }

    default void a(a aVar) {
    }

    default void a0(a aVar, float f) {
    }

    default void b(a aVar, boolean z) {
    }

    default void b0(a aVar, int i, long j, long j2) {
    }

    default void c(a aVar, Exception exc) {
    }

    void c0(a aVar, int i, long j, long j2);

    default void d(a aVar, Exception exc) {
    }

    void d0(a aVar, pi4 pi4Var);

    default void e(a aVar, List list) {
    }

    default void e0(a aVar, j jVar) {
    }

    default void f(a aVar, boolean z) {
    }

    default void f0(a aVar, int i, boolean z) {
    }

    void g(a aVar, v64 v64Var, pi4 pi4Var, IOException iOException, boolean z);

    default void g0(a aVar) {
    }

    default void h(a aVar, long j, int i) {
    }

    default void h0(a aVar, int i, long j) {
    }

    default void i(a aVar, long j) {
    }

    default void i0(a aVar, t0 t0Var, yc1 yc1Var) {
    }

    default void j(a aVar, v64 v64Var, pi4 pi4Var) {
    }

    default void j0(a aVar, boolean z) {
    }

    default void k(a aVar) {
    }

    default void k0(a aVar, v1.b bVar) {
    }

    default void l(a aVar, pi4 pi4Var) {
    }

    default void l0(a aVar, boolean z, int i) {
    }

    default void m(a aVar, int i, int i2) {
    }

    default void m0(a aVar, w0 w0Var, int i) {
    }

    default void n0(a aVar, wc1 wc1Var) {
    }

    void o(a aVar, z89 z89Var);

    default void o0(a aVar, Exception exc) {
    }

    default void p(a aVar, int i, int i2, int i3, float f) {
    }

    default void p0(a aVar, boolean z) {
    }

    default void q(a aVar, PlaybackException playbackException) {
    }

    default void q0(a aVar, int i) {
    }

    default void r(a aVar, t0 t0Var, yc1 yc1Var) {
    }

    default void r0(a aVar) {
    }

    default void s(a aVar, Object obj, long j) {
    }

    void s0(v1 v1Var, b bVar);

    void t(a aVar, PlaybackException playbackException);

    void v(a aVar, wc1 wc1Var);

    default void w(a aVar, h2 h2Var) {
    }

    default void x(a aVar, c41 c41Var) {
    }

    default void y(a aVar, v64 v64Var, pi4 pi4Var) {
    }

    default void z(a aVar, int i) {
    }
}
