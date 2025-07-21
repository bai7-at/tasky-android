package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.d;
import defpackage.a85;
import defpackage.b80;
import defpackage.kt6;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class TwoDimensionalFocusSearchKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.l2() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode b = h.b(focusTargetNode);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    private static final boolean c(kt6 kt6Var, kt6 kt6Var2, kt6 kt6Var3, int i) {
        if (d(kt6Var3, i, kt6Var) || !d(kt6Var2, i, kt6Var)) {
            return false;
        }
        if (e(kt6Var3, i, kt6Var)) {
            d.a aVar = d.b;
            if (!d.l(i, aVar.d()) && !d.l(i, aVar.g()) && f(kt6Var2, i, kt6Var) >= g(kt6Var3, i, kt6Var)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(kt6 kt6Var, int i, kt6 kt6Var2) {
        d.a aVar = d.b;
        if (!(d.l(i, aVar.d()) ? true : d.l(i, aVar.g()))) {
            if (!(d.l(i, aVar.h()) ? true : d.l(i, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (kt6Var.j() > kt6Var2.i() && kt6Var.i() < kt6Var2.j()) {
                return true;
            }
        } else if (kt6Var.e() > kt6Var2.l() && kt6Var.l() < kt6Var2.e()) {
            return true;
        }
        return false;
    }

    private static final boolean e(kt6 kt6Var, int i, kt6 kt6Var2) {
        d.a aVar = d.b;
        if (d.l(i, aVar.d())) {
            if (kt6Var2.i() < kt6Var.j()) {
                return false;
            }
        } else if (d.l(i, aVar.g())) {
            if (kt6Var2.j() > kt6Var.i()) {
                return false;
            }
        } else if (d.l(i, aVar.h())) {
            if (kt6Var2.l() < kt6Var.e()) {
                return false;
            }
        } else {
            if (!d.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (kt6Var2.e() > kt6Var.l()) {
                return false;
            }
        }
        return true;
    }

    private static final float f(kt6 kt6Var, int i, kt6 kt6Var2) {
        float l;
        float e;
        float l2;
        float e2;
        float f;
        d.a aVar = d.b;
        if (!d.l(i, aVar.d())) {
            if (d.l(i, aVar.g())) {
                l = kt6Var.i();
                e = kt6Var2.j();
            } else if (d.l(i, aVar.h())) {
                l2 = kt6Var2.l();
                e2 = kt6Var.e();
            } else {
                if (!d.l(i, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                l = kt6Var.l();
                e = kt6Var2.e();
            }
            f = l - e;
            return Math.max(0.0f, f);
        }
        l2 = kt6Var2.i();
        e2 = kt6Var.j();
        f = l2 - e2;
        return Math.max(0.0f, f);
    }

    private static final float g(kt6 kt6Var, int i, kt6 kt6Var2) {
        float e;
        float e2;
        float l;
        float l2;
        float f;
        d.a aVar = d.b;
        if (!d.l(i, aVar.d())) {
            if (d.l(i, aVar.g())) {
                e = kt6Var.j();
                e2 = kt6Var2.j();
            } else if (d.l(i, aVar.h())) {
                l = kt6Var2.l();
                l2 = kt6Var.l();
            } else {
                if (!d.l(i, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                e = kt6Var.e();
                e2 = kt6Var2.e();
            }
            f = e - e2;
            return Math.max(1.0f, f);
        }
        l = kt6Var2.i();
        l2 = kt6Var.i();
        f = l - l2;
        return Math.max(1.0f, f);
    }

    private static final kt6 h(kt6 kt6Var) {
        return new kt6(kt6Var.j(), kt6Var.e(), kt6Var.j(), kt6Var.e());
    }

    private static final void i(ql1 ql1Var, vy4 vy4Var) {
        int a2 = a85.a(1024);
        if (!ql1Var.c0().L1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        vy4 vy4Var2 = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = ql1Var.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var2, ql1Var.c0());
        } else {
            vy4Var2.b(C1);
        }
        while (vy4Var2.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var2.y(vy4Var2.q() - 1);
            if ((cVar.B1() & a2) == 0) {
                rl1.c(vy4Var2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.G1() & a2) != 0) {
                        vy4 vy4Var3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                if (focusTargetNode.L1()) {
                                    if (focusTargetNode.j2().i()) {
                                        vy4Var.b(focusTargetNode);
                                    } else {
                                        i(focusTargetNode, vy4Var);
                                    }
                                }
                            } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var3 == null) {
                                                vy4Var3 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var3.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var3.b(f2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var3);
                        }
                    } else {
                        cVar = cVar.C1();
                    }
                }
            }
        }
    }

    private static final FocusTargetNode j(vy4 vy4Var, kt6 kt6Var, int i) {
        kt6 s;
        d.a aVar = d.b;
        if (d.l(i, aVar.d())) {
            s = kt6Var.s(kt6Var.n() + 1, 0.0f);
        } else if (d.l(i, aVar.g())) {
            s = kt6Var.s(-(kt6Var.n() + 1), 0.0f);
        } else if (d.l(i, aVar.h())) {
            s = kt6Var.s(0.0f, kt6Var.h() + 1);
        } else {
            if (!d.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            s = kt6Var.s(0.0f, -(kt6Var.h() + 1));
        }
        int q = vy4Var.q();
        FocusTargetNode focusTargetNode = null;
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) p[i2];
                if (h.g(focusTargetNode2)) {
                    kt6 d = h.d(focusTargetNode2);
                    if (m(d, s, kt6Var, i)) {
                        focusTargetNode = focusTargetNode2;
                        s = d;
                    }
                }
                i2++;
            } while (i2 < q);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i, ss2 ss2Var) {
        kt6 h;
        vy4 vy4Var = new vy4(new FocusTargetNode[16], 0);
        i(focusTargetNode, vy4Var);
        if (vy4Var.q() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (vy4Var.s() ? null : vy4Var.p()[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) ss2Var.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        d.a aVar = d.b;
        if (d.l(i, aVar.b())) {
            i = aVar.g();
        }
        if (d.l(i, aVar.g()) ? true : d.l(i, aVar.a())) {
            h = s(h.d(focusTargetNode));
        } else {
            if (!(d.l(i, aVar.d()) ? true : d.l(i, aVar.h()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            h = h(h.d(focusTargetNode));
        }
        FocusTargetNode j = j(vy4Var, h, i);
        if (j != null) {
            return ((Boolean) ss2Var.invoke(j)).booleanValue();
        }
        return false;
    }

    private static final boolean l(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final ss2 ss2Var) {
        if (r(focusTargetNode, focusTargetNode2, i, ss2Var)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.a.a(focusTargetNode, i, new ss2() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(b80.a aVar) {
                boolean r;
                r = TwoDimensionalFocusSearchKt.r(FocusTargetNode.this, focusTargetNode2, i, ss2Var);
                Boolean valueOf = Boolean.valueOf(r);
                if (r || !aVar.a()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(kt6 kt6Var, kt6 kt6Var2, kt6 kt6Var3, int i) {
        if (n(kt6Var, i, kt6Var3)) {
            return !n(kt6Var2, i, kt6Var3) || c(kt6Var3, kt6Var, kt6Var2, i) || (!c(kt6Var3, kt6Var2, kt6Var, i) && q(i, kt6Var3, kt6Var) < q(i, kt6Var3, kt6Var2));
        }
        return false;
    }

    private static final boolean n(kt6 kt6Var, int i, kt6 kt6Var2) {
        d.a aVar = d.b;
        if (d.l(i, aVar.d())) {
            if ((kt6Var2.j() <= kt6Var.j() && kt6Var2.i() < kt6Var.j()) || kt6Var2.i() <= kt6Var.i()) {
                return false;
            }
        } else if (d.l(i, aVar.g())) {
            if ((kt6Var2.i() >= kt6Var.i() && kt6Var2.j() > kt6Var.i()) || kt6Var2.j() >= kt6Var.j()) {
                return false;
            }
        } else if (d.l(i, aVar.h())) {
            if ((kt6Var2.e() <= kt6Var.e() && kt6Var2.l() < kt6Var.e()) || kt6Var2.l() <= kt6Var.l()) {
                return false;
            }
        } else {
            if (!d.l(i, aVar.a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if ((kt6Var2.l() >= kt6Var.l() && kt6Var2.e() > kt6Var.l()) || kt6Var2.e() >= kt6Var.e()) {
                return false;
            }
        }
        return true;
    }

    private static final float o(kt6 kt6Var, int i, kt6 kt6Var2) {
        float l;
        float e;
        float l2;
        float e2;
        float f;
        d.a aVar = d.b;
        if (!d.l(i, aVar.d())) {
            if (d.l(i, aVar.g())) {
                l = kt6Var.i();
                e = kt6Var2.j();
            } else if (d.l(i, aVar.h())) {
                l2 = kt6Var2.l();
                e2 = kt6Var.e();
            } else {
                if (!d.l(i, aVar.a())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                l = kt6Var.l();
                e = kt6Var2.e();
            }
            f = l - e;
            return Math.max(0.0f, f);
        }
        l2 = kt6Var2.i();
        e2 = kt6Var.j();
        f = l2 - e2;
        return Math.max(0.0f, f);
    }

    private static final float p(kt6 kt6Var, int i, kt6 kt6Var2) {
        float f;
        float i2;
        float i3;
        float n;
        d.a aVar = d.b;
        if (d.l(i, aVar.d()) ? true : d.l(i, aVar.g())) {
            f = 2;
            i2 = kt6Var2.l() + (kt6Var2.h() / f);
            i3 = kt6Var.l();
            n = kt6Var.h();
        } else {
            if (!(d.l(i, aVar.h()) ? true : d.l(i, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = 2;
            i2 = kt6Var2.i() + (kt6Var2.n() / f);
            i3 = kt6Var.i();
            n = kt6Var.n();
        }
        return i2 - (i3 + (n / f));
    }

    private static final long q(int i, kt6 kt6Var, kt6 kt6Var2) {
        long abs = (long) Math.abs(o(kt6Var2, i, kt6Var));
        long abs2 = (long) Math.abs(p(kt6Var2, i, kt6Var));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, ss2 ss2Var) {
        FocusTargetNode j;
        vy4 vy4Var = new vy4(new FocusTargetNode[16], 0);
        int a2 = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        vy4 vy4Var2 = new vy4(new Modifier.c[16], 0);
        Modifier.c C1 = focusTargetNode.c0().C1();
        if (C1 == null) {
            rl1.c(vy4Var2, focusTargetNode.c0());
        } else {
            vy4Var2.b(C1);
        }
        while (vy4Var2.t()) {
            Modifier.c cVar = (Modifier.c) vy4Var2.y(vy4Var2.q() - 1);
            if ((cVar.B1() & a2) == 0) {
                rl1.c(vy4Var2, cVar);
            } else {
                while (true) {
                    if (cVar == null) {
                        break;
                    }
                    if ((cVar.G1() & a2) != 0) {
                        vy4 vy4Var3 = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                vy4Var.b((FocusTargetNode) cVar);
                            } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                                int i2 = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var3 == null) {
                                                vy4Var3 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var3.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var3.b(f2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var3);
                        }
                    } else {
                        cVar = cVar.C1();
                    }
                }
            }
        }
        while (vy4Var.t() && (j = j(vy4Var, h.d(focusTargetNode2), i)) != null) {
            if (j.j2().i()) {
                return ((Boolean) ss2Var.invoke(j)).booleanValue();
            }
            if (l(j, focusTargetNode2, i, ss2Var)) {
                return true;
            }
            vy4Var.w(j);
        }
        return false;
    }

    private static final kt6 s(kt6 kt6Var) {
        return new kt6(kt6Var.i(), kt6Var.l(), kt6Var.i(), kt6Var.l());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i, ss2 ss2Var) {
        FocusStateImpl l2 = focusTargetNode.l2();
        int[] iArr = a.a;
        int i2 = iArr[l2.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(k(focusTargetNode, i, ss2Var));
            }
            if (i2 == 4) {
                return focusTargetNode.j2().i() ? (Boolean) ss2Var.invoke(focusTargetNode) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode f = h.f(focusTargetNode);
        if (f == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i3 = iArr[f.l2().ordinal()];
        if (i3 == 1) {
            Boolean t = t(f, i, ss2Var);
            return !zq3.c(t, Boolean.FALSE) ? t : Boolean.valueOf(l(focusTargetNode, b(f), i, ss2Var));
        }
        if (i3 == 2 || i3 == 3) {
            return Boolean.valueOf(l(focusTargetNode, f, i, ss2Var));
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }
}
