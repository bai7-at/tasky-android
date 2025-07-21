package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.BackwardsCompatNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.a85;
import defpackage.b85;
import defpackage.bj7;
import defpackage.bv1;
import defpackage.cj7;
import defpackage.cv1;
import defpackage.cy5;
import defpackage.cz3;
import defpackage.dv1;
import defpackage.dy5;
import defpackage.ej7;
import defpackage.f13;
import defpackage.fm1;
import defpackage.gv4;
import defpackage.hv4;
import defpackage.in3;
import defpackage.jv4;
import defpackage.kf5;
import defpackage.km5;
import defpackage.kv4;
import defpackage.lj7;
import defpackage.lv4;
import defpackage.lv6;
import defpackage.mv4;
import defpackage.nv4;
import defpackage.qg4;
import defpackage.ql2;
import defpackage.qs2;
import defpackage.qz3;
import defpackage.rl1;
import defpackage.s30;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.uo5;
import defpackage.ve5;
import defpackage.vo5;
import defpackage.vy4;
import defpackage.wl2;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yl2;
import defpackage.yq3;
import defpackage.yv0;
import defpackage.zd0;
import defpackage.zl2;
import defpackage.zq3;
import defpackage.zy3;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class BackwardsCompatNode extends Modifier.c implements c, cv1, ej7, dy5, kv4, nv4, vo5, zy3, f13, ql2, wl2, yl2, km5, zd0 {
    private Modifier.b n;
    private boolean r;
    private s30 s;
    private HashSet t;
    private cz3 u;

    public BackwardsCompatNode(Modifier.b bVar) {
        Y1(b85.f(bVar));
        this.n = bVar;
        this.r = true;
        this.t = new HashSet();
    }

    private final void g2(boolean z) {
        boolean d;
        boolean d2;
        boolean d3;
        if (!L1()) {
            throw new IllegalStateException("initializeModifier called on unattached node");
        }
        Modifier.b bVar = this.n;
        if ((a85.a(32) & G1()) != 0) {
            if (bVar instanceof hv4) {
                c2(new qs2() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m74invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m74invoke() {
                        BackwardsCompatNode.this.k2();
                    }
                });
            }
            if (bVar instanceof mv4) {
                l2((mv4) bVar);
            }
        }
        if ((a85.a(4) & G1()) != 0 && !z) {
            qz3.a(this);
        }
        if ((a85.a(2) & G1()) != 0) {
            d3 = BackwardsCompatNodeKt.d(this);
            if (d3) {
                NodeCoordinator D1 = D1();
                zq3.e(D1);
                ((d) D1).e3(this);
                D1.A2();
            }
            if (!z) {
                qz3.a(this);
                rl1.k(this).C0();
            }
        }
        if (bVar instanceof lv6) {
            ((lv6) bVar).g(rl1.k(this));
        }
        if ((a85.a(128) & G1()) != 0 && (bVar instanceof kf5)) {
            d2 = BackwardsCompatNodeKt.d(this);
            if (d2) {
                rl1.k(this).C0();
            }
        }
        if ((a85.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) & G1()) != 0 && (bVar instanceof ve5)) {
            d = BackwardsCompatNodeKt.d(this);
            if (d) {
                rl1.k(this).C0();
            }
        }
        if ((a85.a(16) & G1()) != 0 && (bVar instanceof cy5)) {
            ((cy5) bVar).q().f(D1());
        }
        if ((a85.a(8) & G1()) != 0) {
            rl1.l(this).u();
        }
    }

    private final void j2() {
        BackwardsCompatNodeKt.a aVar;
        if (!L1()) {
            throw new IllegalStateException("unInitializeModifier called on unattached node");
        }
        Modifier.b bVar = this.n;
        if ((a85.a(32) & G1()) != 0) {
            if (bVar instanceof mv4) {
                rl1.l(this).getModifierLocalManager().d(this, ((mv4) bVar).getKey());
            }
            if (bVar instanceof hv4) {
                aVar = BackwardsCompatNodeKt.a;
                ((hv4) bVar).c(aVar);
            }
        }
        if ((a85.a(8) & G1()) != 0) {
            rl1.l(this).u();
        }
    }

    private final void l2(mv4 mv4Var) {
        boolean d;
        s30 s30Var = this.s;
        if (s30Var != null && s30Var.a(mv4Var.getKey())) {
            s30Var.c(mv4Var);
            rl1.l(this).getModifierLocalManager().f(this, mv4Var.getKey());
            return;
        }
        this.s = new s30(mv4Var);
        d = BackwardsCompatNodeKt.d(this);
        if (d) {
            rl1.l(this).getModifierLocalManager().a(this, mv4Var.getKey());
        }
    }

    @Override // defpackage.zy3
    public void F0(cz3 cz3Var) {
        this.u = cz3Var;
    }

    @Override // defpackage.dy5
    public void L(androidx.compose.ui.input.pointer.c cVar, PointerEventPass pointerEventPass, long j) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((cy5) bVar).q().e(cVar, pointerEventPass, j);
    }

    @Override // defpackage.km5
    public boolean M0() {
        return L1();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        g2(true);
    }

    @Override // defpackage.wl2
    public void P0(FocusProperties focusProperties) {
        throw new IllegalStateException("applyFocusProperties called on wrong node");
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        j2();
    }

    @Override // defpackage.dy5
    public boolean S() {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((cy5) bVar).q().a();
    }

    @Override // defpackage.dy5
    public void U0() {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((cy5) bVar).q().d();
    }

    @Override // defpackage.kv4
    public jv4 V() {
        s30 s30Var = this.s;
        return s30Var != null ? s30Var : lv4.a();
    }

    @Override // defpackage.cv1
    public void V0() {
        this.r = true;
        dv1.a(this);
    }

    @Override // defpackage.zd0
    public long b() {
        return in3.c(rl1.h(this, a85.a(128)).a());
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.c) bVar).d(fVar, qg4Var, j);
    }

    @Override // defpackage.zy3
    public void e(long j) {
        Modifier.b bVar = this.n;
        if (bVar instanceof kf5) {
            ((kf5) bVar).e(j);
        }
    }

    public final Modifier.b e2() {
        return this.n;
    }

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.c) bVar).f(yq3Var, xq3Var, i);
    }

    public final HashSet f2() {
        return this.t;
    }

    @Override // defpackage.zd0
    public fm1 getDensity() {
        return rl1.k(this).I();
    }

    @Override // defpackage.zd0
    public LayoutDirection getLayoutDirection() {
        return rl1.k(this).getLayoutDirection();
    }

    @Override // defpackage.ql2
    public void h1(zl2 zl2Var) {
        throw new IllegalStateException("onFocusEvent called on wrong node");
    }

    public final void h2() {
        this.r = true;
        dv1.a(this);
    }

    @Override // defpackage.vo5
    public Object i(fm1 fm1Var, Object obj) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((uo5) bVar).i(fm1Var, obj);
    }

    public final void i2(Modifier.b bVar) {
        if (L1()) {
            j2();
        }
        this.n = bVar;
        Y1(b85.f(bVar));
        if (L1()) {
            g2(false);
        }
    }

    @Override // defpackage.f13
    public void k(cz3 cz3Var) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((ve5) bVar).k(cz3Var);
    }

    public final void k2() {
        ss2 ss2Var;
        if (L1()) {
            this.t.clear();
            OwnerSnapshotObserver snapshotObserver = rl1.l(this).getSnapshotObserver();
            ss2Var = BackwardsCompatNodeKt.c;
            snapshotObserver.i(this, ss2Var, new qs2() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m75invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m75invoke() {
                    Modifier.b e2 = BackwardsCompatNode.this.e2();
                    zq3.f(e2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((hv4) e2).c(BackwardsCompatNode.this);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.kv4, defpackage.nv4
    public Object l(gv4 gv4Var) {
        k h0;
        this.t.add(gv4Var);
        int a = a85.a(32);
        if (!c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = c0().I1();
        LayoutNode k = rl1.k(this);
        while (k != null) {
            if ((k.h0().k().B1() & a) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a) != 0) {
                        ul1 ul1Var = I1;
                        ?? r4 = 0;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof kv4) {
                                kv4 kv4Var = (kv4) ul1Var;
                                if (kv4Var.V().a(gv4Var)) {
                                    return kv4Var.V().b(gv4Var);
                                }
                            } else if ((ul1Var.G1() & a) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f2 = ul1Var.f2();
                                int i = 0;
                                ul1Var = ul1Var;
                                r4 = r4;
                                while (f2 != null) {
                                    if ((f2.G1() & a) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            ul1Var = f2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r4.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r4.b(f2);
                                        }
                                    }
                                    f2 = f2.C1();
                                    ul1Var = ul1Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = rl1.g(r4);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
        return gv4Var.a().mo865invoke();
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.c) bVar).m(yq3Var, xq3Var, i);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.c) bVar).o(yq3Var, xq3Var, i);
    }

    public String toString() {
        return this.n.toString();
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.c) bVar).u(yq3Var, xq3Var, i);
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        bj7 s = ((cj7) bVar).s();
        zq3.f(lj7Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((bj7) lj7Var).c(s);
    }

    @Override // defpackage.dy5
    public boolean u1() {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((cy5) bVar).q().c();
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        Modifier.b bVar = this.n;
        zq3.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((bv1) bVar).w(yv0Var);
    }
}
