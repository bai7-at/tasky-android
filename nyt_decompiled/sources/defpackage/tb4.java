package defpackage;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.i;
import defpackage.fd5;

/* loaded from: classes.dex */
public final class tb4 implements cz3 {
    private final i a;

    public tb4(i iVar) {
        this.a = iVar;
    }

    private final long c() {
        i a = ub4.a(this.a);
        cz3 G1 = a.G1();
        fd5.a aVar = fd5.b;
        return fd5.s(y(G1, aVar.c()), b().y(a.H1(), aVar.c()));
    }

    @Override // defpackage.cz3
    public long L(long j) {
        return b().L(fd5.t(j, c()));
    }

    @Override // defpackage.cz3
    public cz3 Y() {
        i g2;
        if (!m()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator m2 = b().f2().i0().m2();
        if (m2 == null || (g2 = m2.g2()) == null) {
            return null;
        }
        return g2.G1();
    }

    @Override // defpackage.cz3
    public long a() {
        i iVar = this.a;
        return in3.a(iVar.F0(), iVar.v0());
    }

    public final NodeCoordinator b() {
        return this.a.H1();
    }

    @Override // defpackage.cz3
    public long g0(long j) {
        return b().g0(fd5.t(j, c()));
    }

    @Override // defpackage.cz3
    public boolean m() {
        return b().m();
    }

    @Override // defpackage.cz3
    public void o(cz3 cz3Var, float[] fArr) {
        b().o(cz3Var, fArr);
    }

    @Override // defpackage.cz3
    public long u(long j) {
        return fd5.t(b().u(j), c());
    }

    @Override // defpackage.cz3
    public long y(cz3 cz3Var, long j) {
        if (!(cz3Var instanceof tb4)) {
            i a = ub4.a(this.a);
            return fd5.t(y(a.J1(), j), a.H1().b2().y(cz3Var, fd5.b.c()));
        }
        i iVar = ((tb4) cz3Var).a;
        iVar.H1().z2();
        i g2 = b().X1(iVar.H1()).g2();
        if (g2 != null) {
            long N1 = iVar.N1(g2);
            long a2 = wm3.a(dg4.d(fd5.o(j)), dg4.d(fd5.p(j)));
            long a3 = wm3.a(vm3.j(N1) + vm3.j(a2), vm3.k(N1) + vm3.k(a2));
            long N12 = this.a.N1(g2);
            long a4 = wm3.a(vm3.j(a3) - vm3.j(N12), vm3.k(a3) - vm3.k(N12));
            return hd5.a(vm3.j(a4), vm3.k(a4));
        }
        i a5 = ub4.a(iVar);
        long N13 = iVar.N1(a5);
        long b1 = a5.b1();
        long a6 = wm3.a(vm3.j(N13) + vm3.j(b1), vm3.k(N13) + vm3.k(b1));
        long a7 = wm3.a(dg4.d(fd5.o(j)), dg4.d(fd5.p(j)));
        long a8 = wm3.a(vm3.j(a6) + vm3.j(a7), vm3.k(a6) + vm3.k(a7));
        i iVar2 = this.a;
        long N14 = iVar2.N1(ub4.a(iVar2));
        long b12 = ub4.a(iVar2).b1();
        long a9 = wm3.a(vm3.j(N14) + vm3.j(b12), vm3.k(N14) + vm3.k(b12));
        long a10 = wm3.a(vm3.j(a8) - vm3.j(a9), vm3.k(a8) - vm3.k(a9));
        NodeCoordinator m2 = ub4.a(this.a).H1().m2();
        zq3.e(m2);
        NodeCoordinator m22 = a5.H1().m2();
        zq3.e(m22);
        return m2.y(m22, hd5.a(vm3.j(a10), vm3.k(a10)));
    }

    @Override // defpackage.cz3
    public kt6 z(cz3 cz3Var, boolean z) {
        return b().z(cz3Var, z);
    }
}
