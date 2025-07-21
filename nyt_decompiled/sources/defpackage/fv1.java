package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes.dex */
public interface fv1 extends fm1 {
    public static final a p = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final int b = b90.a.B();
        private static final int c = jh2.a.a();

        private a() {
        }

        public final int a() {
            return b;
        }

        public final int b() {
            return c;
        }
    }

    static /* synthetic */ void C0(fv1 fv1Var, sf3 sf3Var, long j, long j2, long j3, long j4, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long a2 = (i3 & 2) != 0 ? vm3.b.a() : j;
        long a3 = (i3 & 4) != 0 ? in3.a(sf3Var.getWidth(), sf3Var.getHeight()) : j2;
        fv1Var.O0(sf3Var, a2, a3, (i3 & 8) != 0 ? vm3.b.a() : j3, (i3 & 16) != 0 ? a3 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? qf2.a : gv1Var, (i3 & 128) != 0 ? null : qn0Var, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? p.a() : i, (i3 & 512) != 0 ? p.b() : i2);
    }

    static /* synthetic */ void K(fv1 fv1Var, long j, float f, long j2, float f2, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        fv1Var.D(j, (i2 & 2) != 0 ? zt7.h(fv1Var.b()) / 2.0f : f, (i2 & 4) != 0 ? fv1Var.t1() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? qf2.a : gv1Var, (i2 & 32) != 0 ? null : qn0Var, (i2 & 64) != 0 ? p.a() : i);
    }

    static /* synthetic */ void K0(fv1 fv1Var, long j, float f, float f2, boolean z, long j2, long j3, float f3, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long c = (i2 & 16) != 0 ? fd5.b.c() : j2;
        fv1Var.G(j, f, f2, z, c, (i2 & 32) != 0 ? fv1Var.Z0(fv1Var.b(), c) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? qf2.a : gv1Var, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : qn0Var, (i2 & 512) != 0 ? p.a() : i);
    }

    static /* synthetic */ void N0(fv1 fv1Var, yc0 yc0Var, long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long c = (i2 & 2) != 0 ? fd5.b.c() : j;
        fv1Var.q0(yc0Var, c, (i2 & 4) != 0 ? fv1Var.Z0(fv1Var.b(), c) : j2, (i2 & 8) != 0 ? f01.a.a() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? qf2.a : gv1Var, (i2 & 64) != 0 ? null : qn0Var, (i2 & 128) != 0 ? p.a() : i);
    }

    static /* synthetic */ void W0(fv1 fv1Var, sf3 sf3Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        fv1Var.q1(sf3Var, (i2 & 2) != 0 ? fd5.b.c() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? qf2.a : gv1Var, (i2 & 16) != 0 ? null : qn0Var, (i2 & 32) != 0 ? p.a() : i);
    }

    static /* synthetic */ void Y0(fv1 fv1Var, yc0 yc0Var, long j, long j2, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long c = (i2 & 2) != 0 ? fd5.b.c() : j;
        fv1Var.z1(yc0Var, c, (i2 & 4) != 0 ? fv1Var.Z0(fv1Var.b(), c) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? qf2.a : gv1Var, (i2 & 32) != 0 ? null : qn0Var, (i2 & 64) != 0 ? p.a() : i);
    }

    private default long Z0(long j, long j2) {
        return du7.a(zt7.i(j) - fd5.o(j2), zt7.g(j) - fd5.p(j2));
    }

    static /* synthetic */ void a0(fv1 fv1Var, long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long c = (i2 & 2) != 0 ? fd5.b.c() : j2;
        fv1Var.s1(j, c, (i2 & 4) != 0 ? fv1Var.Z0(fv1Var.b(), c) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? qf2.a : gv1Var, (i2 & 32) != 0 ? null : qn0Var, (i2 & 64) != 0 ? p.a() : i);
    }

    static /* synthetic */ void j1(fv1 fv1Var, long j, long j2, long j3, long j4, gv1 gv1Var, float f, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long c = (i2 & 2) != 0 ? fd5.b.c() : j2;
        fv1Var.n1(j, c, (i2 & 4) != 0 ? fv1Var.Z0(fv1Var.b(), c) : j3, (i2 & 8) != 0 ? f01.a.a() : j4, (i2 & 16) != 0 ? qf2.a : gv1Var, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : qn0Var, (i2 & 128) != 0 ? p.a() : i);
    }

    static /* synthetic */ void k0(fv1 fv1Var, ip5 ip5Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        fv1Var.T0(ip5Var, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? qf2.a : gv1Var, (i2 & 16) != 0 ? null : qn0Var, (i2 & 32) != 0 ? p.a() : i);
    }

    static /* synthetic */ void l1(fv1 fv1Var, yc0 yc0Var, long j, long j2, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        fv1Var.N(yc0Var, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? u48.e.a() : i, (i3 & 32) != 0 ? null : mp5Var, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : qn0Var, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? p.a() : i2);
    }

    static /* synthetic */ void s0(fv1 fv1Var, long j, long j2, long j3, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        fv1Var.y0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? u48.e.a() : i, (i3 & 32) != 0 ? null : mp5Var, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : qn0Var, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? p.a() : i2);
    }

    static /* synthetic */ void w0(fv1 fv1Var, ip5 ip5Var, yc0 yc0Var, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            gv1Var = qf2.a;
        }
        gv1 gv1Var2 = gv1Var;
        if ((i2 & 16) != 0) {
            qn0Var = null;
        }
        qn0 qn0Var2 = qn0Var;
        if ((i2 & 32) != 0) {
            i = p.a();
        }
        fv1Var.r1(ip5Var, yc0Var, f2, gv1Var2, qn0Var2, i);
    }

    void D(long j, float f, long j2, float f2, gv1 gv1Var, qn0 qn0Var, int i);

    void G(long j, float f, float f2, boolean z, long j2, long j3, float f3, gv1 gv1Var, qn0 qn0Var, int i);

    void N(yc0 yc0Var, long j, long j2, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2);

    void O0(sf3 sf3Var, long j, long j2, long j3, long j4, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2);

    void T0(ip5 ip5Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i);

    default long b() {
        return i1().b();
    }

    LayoutDirection getLayoutDirection();

    zu1 i1();

    void n1(long j, long j2, long j3, long j4, gv1 gv1Var, float f, qn0 qn0Var, int i);

    void q0(yc0 yc0Var, long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i);

    void q1(sf3 sf3Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i);

    void r1(ip5 ip5Var, yc0 yc0Var, float f, gv1 gv1Var, qn0 qn0Var, int i);

    void s1(long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i);

    default long t1() {
        return du7.b(i1().b());
    }

    void y0(long j, long j2, long j3, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2);

    void z1(yc0 yc0Var, long j, long j2, float f, gv1 gv1Var, qn0 qn0Var, int i);
}
