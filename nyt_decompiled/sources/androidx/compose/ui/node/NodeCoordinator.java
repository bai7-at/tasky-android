package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a85;
import defpackage.ao5;
import defpackage.b85;
import defpackage.bj7;
import defpackage.cv1;
import defpackage.cz3;
import defpackage.du7;
import defpackage.dy5;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.gb;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.in3;
import defpackage.jm5;
import defpackage.kg4;
import defpackage.km5;
import defpackage.kt6;
import defpackage.my4;
import defpackage.ny4;
import defpackage.ph0;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rl1;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.tb4;
import defpackage.ul1;
import defpackage.vm3;
import defpackage.vo5;
import defpackage.vy4;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.wz3;
import defpackage.x75;
import defpackage.z83;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zy3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class NodeCoordinator extends h implements qg4, cz3, km5 {
    public static final c S = new c(null);
    private static final ss2 X = new ss2() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public final void b(NodeCoordinator nodeCoordinator) {
            b bVar;
            b bVar2;
            b bVar3;
            if (nodeCoordinator.M0()) {
                bVar = nodeCoordinator.H;
                if (bVar == null) {
                    NodeCoordinator.Z2(nodeCoordinator, false, 1, null);
                    return;
                }
                bVar2 = NodeCoordinator.e0;
                bVar2.b(bVar);
                NodeCoordinator.Z2(nodeCoordinator, false, 1, null);
                bVar3 = NodeCoordinator.e0;
                if (bVar3.c(bVar)) {
                    return;
                }
                LayoutNode f2 = nodeCoordinator.f2();
                LayoutNodeLayoutDelegate S2 = f2.S();
                if (S2.s() > 0) {
                    if (S2.t() || S2.u()) {
                        LayoutNode.j1(f2, false, 1, null);
                    }
                    S2.F().I1();
                }
                m j0 = f2.j0();
                if (j0 != null) {
                    j0.f(f2);
                }
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((NodeCoordinator) obj);
            return ww8.a;
        }
    };
    private static final ss2 Y = new ss2() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void b(NodeCoordinator nodeCoordinator) {
            jm5 e2 = nodeCoordinator.e2();
            if (e2 != null) {
                e2.invalidate();
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((NodeCoordinator) obj);
            return ww8.a;
        }
    };
    private static final androidx.compose.ui.graphics.d Z = new androidx.compose.ui.graphics.d();
    private static final androidx.compose.ui.node.b e0 = new androidx.compose.ui.node.b();
    private static final float[] f0 = kg4.c(null, 1, null);
    private static final d g0 = new a();
    private static final d h0 = new b();
    private my4 B;
    private androidx.compose.ui.node.b H;
    private boolean N;
    private jm5 Q;
    private final LayoutNode i;
    private NodeCoordinator j;
    private NodeCoordinator k;
    private boolean l;
    private boolean m;
    private ss2 n;
    private sg4 u;
    private Map w;
    private float y;
    private fm1 r = f2().I();
    private LayoutDirection s = f2().getLayoutDirection();
    private float t = 0.8f;
    private long x = vm3.b.a();
    private final ss2 L = new ss2() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
        {
            super(1);
        }

        public final void b(final ph0 ph0Var) {
            OwnerSnapshotObserver j2;
            ss2 ss2Var;
            if (!NodeCoordinator.this.f2().e()) {
                NodeCoordinator.this.N = true;
                return;
            }
            j2 = NodeCoordinator.this.j2();
            NodeCoordinator nodeCoordinator = NodeCoordinator.this;
            ss2Var = NodeCoordinator.Y;
            final NodeCoordinator nodeCoordinator2 = NodeCoordinator.this;
            j2.i(nodeCoordinator, ss2Var, new qs2() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m84invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m84invoke() {
                    NodeCoordinator.this.V1(ph0Var);
                }
            });
            NodeCoordinator.this.N = false;
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ph0) obj);
            return ww8.a;
        }
    };
    private final qs2 M = new qs2() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m87invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
            NodeCoordinator m2 = NodeCoordinator.this.m2();
            if (m2 != null) {
                m2.v2();
            }
        }
    };

    public static final class a implements d {
        a() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public int a() {
            return a85.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [vy4] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [vy4] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$c] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$c] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$c] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean b(Modifier.c cVar) {
            int a = a85.a(16);
            ?? r2 = 0;
            while (cVar != 0) {
                if (cVar instanceof dy5) {
                    if (((dy5) cVar).S()) {
                        return true;
                    }
                } else if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                    Modifier.c f2 = cVar.f2();
                    int i = 0;
                    r2 = r2;
                    cVar = cVar;
                    while (f2 != null) {
                        if ((f2.G1() & a) != 0) {
                            i++;
                            r2 = r2;
                            if (i == 1) {
                                cVar = f2;
                            } else {
                                if (r2 == 0) {
                                    r2 = new vy4(new Modifier.c[16], 0);
                                }
                                if (cVar != 0) {
                                    r2.b(cVar);
                                    cVar = 0;
                                }
                                r2.b(f2);
                            }
                        }
                        f2 = f2.C1();
                        r2 = r2;
                        cVar = cVar;
                    }
                    if (i == 1) {
                    }
                }
                cVar = rl1.g(r2);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public void c(LayoutNode layoutNode, long j, z83 z83Var, boolean z, boolean z2) {
            layoutNode.t0(j, z83Var, z, z2);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean d(LayoutNode layoutNode) {
            return true;
        }
    }

    public static final class b implements d {
        b() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public int a() {
            return a85.a(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean b(Modifier.c cVar) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public void c(LayoutNode layoutNode, long j, z83 z83Var, boolean z, boolean z2) {
            layoutNode.v0(j, z83Var, z, z2);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.d
        public boolean d(LayoutNode layoutNode) {
            bj7 G = layoutNode.G();
            boolean z = false;
            if (G != null && G.q()) {
                z = true;
            }
            return !z;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return NodeCoordinator.g0;
        }

        public final d b() {
            return NodeCoordinator.h0;
        }

        private c() {
        }
    }

    public interface d {
        int a();

        boolean b(Modifier.c cVar);

        void c(LayoutNode layoutNode, long j, z83 z83Var, boolean z, boolean z2);

        boolean d(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.i = layoutNode;
    }

    private final void H2(long j, float f, ss2 ss2Var) {
        X2(this, ss2Var, false, 2, null);
        if (!vm3.i(b1(), j)) {
            M2(j);
            f2().S().F().I1();
            jm5 jm5Var = this.Q;
            if (jm5Var != null) {
                jm5Var.j(j);
            } else {
                NodeCoordinator nodeCoordinator = this.k;
                if (nodeCoordinator != null) {
                    nodeCoordinator.v2();
                }
            }
            g1(this);
            m j0 = f2().j0();
            if (j0 != null) {
                j0.g(f2());
            }
        }
        this.y = f;
    }

    public static /* synthetic */ void K2(NodeCoordinator nodeCoordinator, my4 my4Var, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.J2(my4Var, z, z2);
    }

    private final void P1(NodeCoordinator nodeCoordinator, my4 my4Var, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.k;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.P1(nodeCoordinator, my4Var, z);
        }
        Z1(my4Var, z);
    }

    private final long Q1(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.k;
        return (nodeCoordinator2 == null || zq3.c(nodeCoordinator, nodeCoordinator2)) ? Y1(j) : Y1(nodeCoordinator2.Q1(nodeCoordinator, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(final Modifier.c cVar, final d dVar, final long j, final z83 z83Var, final boolean z, final boolean z2, final float f) {
        Modifier.c b2;
        if (cVar == null) {
            u2(dVar, j, z83Var, z, z2);
        } else if (dVar.b(cVar)) {
            z83Var.A(cVar, f, z2, new qs2() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m88invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m88invoke() {
                    Modifier.c b3;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    b3 = x75.b(cVar, dVar.a(), a85.a(2));
                    nodeCoordinator.Q2(b3, dVar, j, z83Var, z, z2, f);
                }
            });
        } else {
            b2 = x75.b(cVar, dVar.a(), a85.a(2));
            Q2(b2, dVar, j, z83Var, z, z2, f);
        }
    }

    private final NodeCoordinator R2(cz3 cz3Var) {
        NodeCoordinator b2;
        tb4 tb4Var = cz3Var instanceof tb4 ? (tb4) cz3Var : null;
        if (tb4Var != null && (b2 = tb4Var.b()) != null) {
            return b2;
        }
        zq3.f(cz3Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) cz3Var;
    }

    private final void U2(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (zq3.c(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.k;
        zq3.e(nodeCoordinator2);
        nodeCoordinator2.U2(nodeCoordinator, fArr);
        if (!vm3.i(b1(), vm3.b.a())) {
            float[] fArr2 = f0;
            kg4.h(fArr2);
            kg4.n(fArr2, -vm3.j(b1()), -vm3.k(b1()), 0.0f, 4, null);
            kg4.k(fArr, fArr2);
        }
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.i(fArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1(ph0 ph0Var) {
        Modifier.c p2 = p2(a85.a(4));
        if (p2 == null) {
            G2(ph0Var);
        } else {
            f2().Z().d(ph0Var, in3.c(a()), this, p2);
        }
    }

    private final void V2(NodeCoordinator nodeCoordinator, float[] fArr) {
        while (!zq3.c(this, nodeCoordinator)) {
            jm5 jm5Var = this.Q;
            if (jm5Var != null) {
                jm5Var.a(fArr);
            }
            if (!vm3.i(this.b1(), vm3.b.a())) {
                float[] fArr2 = f0;
                kg4.h(fArr2);
                kg4.n(fArr2, vm3.j(r0), vm3.k(r0), 0.0f, 4, null);
                kg4.k(fArr, fArr2);
            }
            this = this.k;
            zq3.e(this);
        }
    }

    public static /* synthetic */ void X2(NodeCoordinator nodeCoordinator, ss2 ss2Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.W2(ss2Var, z);
    }

    private final void Y2(boolean z) {
        m j0;
        jm5 jm5Var = this.Q;
        if (jm5Var == null) {
            if (this.n != null) {
                throw new IllegalStateException("null layer with a non-null layerBlock");
            }
            return;
        }
        final ss2 ss2Var = this.n;
        if (ss2Var == null) {
            throw new IllegalStateException("updateLayerParameters requires a non-null layerBlock");
        }
        androidx.compose.ui.graphics.d dVar = Z;
        dVar.w();
        dVar.y(f2().I());
        dVar.z(in3.c(a()));
        j2().i(this, X, new qs2() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m89invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m89invoke() {
                androidx.compose.ui.graphics.d dVar2;
                ss2 ss2Var2 = ss2.this;
                dVar2 = NodeCoordinator.Z;
                ss2Var2.invoke(dVar2);
            }
        });
        androidx.compose.ui.node.b bVar = this.H;
        if (bVar == null) {
            bVar = new androidx.compose.ui.node.b();
            this.H = bVar;
        }
        bVar.a(dVar);
        jm5Var.e(dVar, f2().getLayoutDirection(), f2().I());
        this.m = dVar.f();
        this.t = dVar.d();
        if (!z || (j0 = f2().j0()) == null) {
            return;
        }
        j0.g(f2());
    }

    private final void Z1(my4 my4Var, boolean z) {
        float j = vm3.j(b1());
        my4Var.i(my4Var.b() - j);
        my4Var.j(my4Var.c() - j);
        float k = vm3.k(b1());
        my4Var.k(my4Var.d() - k);
        my4Var.h(my4Var.a() - k);
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.b(my4Var, true);
            if (this.m && z) {
                my4Var.e(0.0f, 0.0f, hn3.g(a()), hn3.f(a()));
                my4Var.f();
            }
        }
    }

    static /* synthetic */ void Z2(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.Y2(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver j2() {
        return wz3.b(f2()).getSnapshotObserver();
    }

    private final boolean o2(int i) {
        Modifier.c q2 = q2(b85.i(i));
        return q2 != null && rl1.e(q2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.c q2(boolean z) {
        Modifier.c k2;
        if (f2().i0() == this) {
            return f2().h0().k();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.k;
            if (nodeCoordinator != null && (k2 = nodeCoordinator.k2()) != null) {
                return k2.C1();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.k;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.k2();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r2(final Modifier.c cVar, final d dVar, final long j, final z83 z83Var, final boolean z, final boolean z2) {
        if (cVar == null) {
            u2(dVar, j, z83Var, z, z2);
        } else {
            z83Var.u(cVar, z2, new qs2() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m85invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m85invoke() {
                    Modifier.c b2;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    b2 = x75.b(cVar, dVar.a(), a85.a(2));
                    nodeCoordinator.r2(b2, dVar, j, z83Var, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(final Modifier.c cVar, final d dVar, final long j, final z83 z83Var, final boolean z, final boolean z2, final float f) {
        if (cVar == null) {
            u2(dVar, j, z83Var, z, z2);
        } else {
            z83Var.v(cVar, f, z2, new qs2() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m86invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m86invoke() {
                    Modifier.c b2;
                    NodeCoordinator nodeCoordinator = NodeCoordinator.this;
                    b2 = x75.b(cVar, dVar.a(), a85.a(2));
                    nodeCoordinator.s2(b2, dVar, j, z83Var, z, z2, f);
                }
            });
        }
    }

    private final long y2(long j) {
        float o = fd5.o(j);
        float max = Math.max(0.0f, o < 0.0f ? -o : o - B0());
        float p = fd5.p(j);
        return hd5.a(max, Math.max(0.0f, p < 0.0f ? -p : p - x0()));
    }

    public void A2() {
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.invalidate();
        }
    }

    public final void B2() {
        W2(this.n, true);
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    protected void C2(int i, int i2) {
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.d(in3.a(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.k;
            if (nodeCoordinator != null) {
                nodeCoordinator.v2();
            }
        }
        P0(in3.a(i, i2));
        Y2(false);
        int a2 = a85.a(4);
        boolean i3 = b85.i(a2);
        Modifier.c k2 = k2();
        if (i3 || (k2 = k2.I1()) != null) {
            for (Modifier.c q2 = q2(i3); q2 != null && (q2.B1() & a2) != 0; q2 = q2.C1()) {
                if ((q2.G1() & a2) != 0) {
                    ul1 ul1Var = q2;
                    ?? r4 = 0;
                    while (ul1Var != 0) {
                        if (ul1Var instanceof cv1) {
                            ((cv1) ul1Var).V0();
                        } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                            Modifier.c f2 = ul1Var.f2();
                            int i4 = 0;
                            ul1Var = ul1Var;
                            r4 = r4;
                            while (f2 != null) {
                                if ((f2.G1() & a2) != 0) {
                                    i4++;
                                    r4 = r4;
                                    if (i4 == 1) {
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
                            if (i4 == 1) {
                            }
                        }
                        ul1Var = rl1.g(r4);
                    }
                }
                if (q2 == k2) {
                    break;
                }
            }
        }
        m j0 = f2().j0();
        if (j0 != null) {
            j0.g(f2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void D2() {
        Modifier.c I1;
        if (o2(a85.a(128))) {
            androidx.compose.runtime.snapshots.e c2 = androidx.compose.runtime.snapshots.e.e.c();
            try {
                androidx.compose.runtime.snapshots.e l = c2.l();
                try {
                    int a2 = a85.a(128);
                    boolean i = b85.i(a2);
                    if (i) {
                        I1 = k2();
                    } else {
                        I1 = k2().I1();
                        if (I1 == null) {
                            ww8 ww8Var = ww8.a;
                            c2.s(l);
                        }
                    }
                    for (Modifier.c q2 = q2(i); q2 != null && (q2.B1() & a2) != 0; q2 = q2.C1()) {
                        if ((q2.G1() & a2) != 0) {
                            ul1 ul1Var = q2;
                            ?? r8 = 0;
                            while (ul1Var != 0) {
                                if (ul1Var instanceof zy3) {
                                    ((zy3) ul1Var).e(z0());
                                } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i2 = 0;
                                    ul1Var = ul1Var;
                                    r8 = r8;
                                    while (f2 != null) {
                                        if ((f2.G1() & a2) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
                                                ul1Var = f2;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new vy4(new Modifier.c[16], 0);
                                                }
                                                if (ul1Var != 0) {
                                                    r8.b(ul1Var);
                                                    ul1Var = 0;
                                                }
                                                r8.b(f2);
                                            }
                                        }
                                        f2 = f2.C1();
                                        ul1Var = ul1Var;
                                        r8 = r8;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ul1Var = rl1.g(r8);
                            }
                        }
                        if (q2 == I1) {
                            break;
                        }
                    }
                    ww8 ww8Var2 = ww8.a;
                    c2.s(l);
                } catch (Throwable th) {
                    c2.s(l);
                    throw th;
                }
            } finally {
                c2.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void E2() {
        int a2 = a85.a(128);
        boolean i = b85.i(a2);
        Modifier.c k2 = k2();
        if (!i && (k2 = k2.I1()) == null) {
            return;
        }
        for (Modifier.c q2 = q2(i); q2 != null && (q2.B1() & a2) != 0; q2 = q2.C1()) {
            if ((q2.G1() & a2) != 0) {
                ul1 ul1Var = q2;
                ?? r5 = 0;
                while (ul1Var != 0) {
                    if (ul1Var instanceof zy3) {
                        ((zy3) ul1Var).F0(this);
                    } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                        Modifier.c f2 = ul1Var.f2();
                        int i2 = 0;
                        ul1Var = ul1Var;
                        r5 = r5;
                        while (f2 != null) {
                            if ((f2.G1() & a2) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    ul1Var = f2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new vy4(new Modifier.c[16], 0);
                                    }
                                    if (ul1Var != 0) {
                                        r5.b(ul1Var);
                                        ul1Var = 0;
                                    }
                                    r5.b(f2);
                                }
                            }
                            f2 = f2.C1();
                            ul1Var = ul1Var;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    ul1Var = rl1.g(r5);
                }
            }
            if (q2 == k2) {
                return;
            }
        }
    }

    public final void F2() {
        this.l = true;
        this.M.mo865invoke();
        if (this.Q != null) {
            X2(this, null, false, 2, null);
        }
    }

    public abstract void G2(ph0 ph0Var);

    public final void I2(long j, float f, ss2 ss2Var) {
        long u0 = u0();
        H2(wm3.a(vm3.j(j) + vm3.j(u0), vm3.k(j) + vm3.k(u0)), f, ss2Var);
    }

    public final void J2(my4 my4Var, boolean z, boolean z2) {
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            if (this.m) {
                if (z2) {
                    long h2 = h2();
                    float i = zt7.i(h2) / 2.0f;
                    float g = zt7.g(h2) / 2.0f;
                    my4Var.e(-i, -g, hn3.g(a()) + i, hn3.f(a()) + g);
                } else if (z) {
                    my4Var.e(0.0f, 0.0f, hn3.g(a()), hn3.f(a()));
                }
                if (my4Var.f()) {
                    return;
                }
            }
            jm5Var.b(my4Var, false);
        }
        float j = vm3.j(b1());
        my4Var.i(my4Var.b() + j);
        my4Var.j(my4Var.c() + j);
        float k = vm3.k(b1());
        my4Var.k(my4Var.d() + k);
        my4Var.h(my4Var.a() + k);
    }

    @Override // defpackage.cz3
    public long L(long j) {
        return wz3.b(f2()).e(g0(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.l
    public void L0(long j, float f, ss2 ss2Var) {
        H2(j, f, ss2Var);
    }

    public void L2(sg4 sg4Var) {
        sg4 sg4Var2 = this.u;
        if (sg4Var != sg4Var2) {
            this.u = sg4Var;
            if (sg4Var2 == null || sg4Var.getWidth() != sg4Var2.getWidth() || sg4Var.getHeight() != sg4Var2.getHeight()) {
                C2(sg4Var.getWidth(), sg4Var.getHeight());
            }
            Map map = this.w;
            if (((map == null || map.isEmpty()) && sg4Var.f().isEmpty()) || zq3.c(sg4Var.f(), this.w)) {
                return;
            }
            a2().f().m();
            Map map2 = this.w;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.w = map2;
            }
            map2.clear();
            map2.putAll(sg4Var.f());
        }
    }

    @Override // defpackage.km5
    public boolean M0() {
        return (this.Q == null || this.l || !f2().G0()) ? false : true;
    }

    protected void M2(long j) {
        this.x = j;
    }

    public final void N2(NodeCoordinator nodeCoordinator) {
        this.j = nodeCoordinator;
    }

    public final void O2(NodeCoordinator nodeCoordinator) {
        this.k = nodeCoordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean P2() {
        Modifier.c q2 = q2(b85.i(a85.a(16)));
        if (q2 != null && q2.L1()) {
            int a2 = a85.a(16);
            if (!q2.c0().L1()) {
                throw new IllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.c c0 = q2.c0();
            if ((c0.B1() & a2) != 0) {
                for (Modifier.c C1 = c0.C1(); C1 != null; C1 = C1.C1()) {
                    if ((C1.G1() & a2) != 0) {
                        ul1 ul1Var = C1;
                        ?? r5 = 0;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof dy5) {
                                if (((dy5) ul1Var).u1()) {
                                    return true;
                                }
                            } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f2 = ul1Var.f2();
                                int i = 0;
                                ul1Var = ul1Var;
                                r5 = r5;
                                while (f2 != null) {
                                    if ((f2.G1() & a2) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            ul1Var = f2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r5.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r5.b(f2);
                                        }
                                    }
                                    f2 = f2.C1();
                                    ul1Var = ul1Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = rl1.g(r5);
                        }
                    }
                }
            }
        }
        return false;
    }

    protected final long R1(long j) {
        return du7.a(Math.max(0.0f, (zt7.i(j) - B0()) / 2.0f), Math.max(0.0f, (zt7.g(j) - x0()) / 2.0f));
    }

    @Override // androidx.compose.ui.node.h
    public h S0() {
        return this.j;
    }

    protected final float S1(long j, long j2) {
        if (B0() >= zt7.i(j2) && x0() >= zt7.g(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long R1 = R1(j2);
        float i = zt7.i(R1);
        float g = zt7.g(R1);
        long y2 = y2(j);
        if ((i > 0.0f || g > 0.0f) && fd5.o(y2) <= i && fd5.p(y2) <= g) {
            return fd5.n(y2);
        }
        return Float.POSITIVE_INFINITY;
    }

    public long S2(long j) {
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            j = jm5Var.c(j, false);
        }
        return wm3.c(j, b1());
    }

    public final void T1(ph0 ph0Var) {
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.h(ph0Var);
            return;
        }
        float j = vm3.j(b1());
        float k = vm3.k(b1());
        ph0Var.c(j, k);
        V1(ph0Var);
        ph0Var.c(-j, -k);
    }

    public final kt6 T2() {
        if (!m()) {
            return kt6.e.a();
        }
        cz3 d2 = ez3.d(this);
        my4 i2 = i2();
        long R1 = R1(h2());
        i2.i(-zt7.i(R1));
        i2.k(-zt7.g(R1));
        i2.j(B0() + zt7.i(R1));
        i2.h(x0() + zt7.g(R1));
        while (this != d2) {
            this.J2(i2, false, true);
            if (i2.f()) {
                return kt6.e.a();
            }
            this = this.k;
            zq3.e(this);
        }
        return ny4.a(i2);
    }

    @Override // androidx.compose.ui.node.h
    public boolean U0() {
        return this.u != null;
    }

    protected final void U1(ph0 ph0Var, ao5 ao5Var) {
        ph0Var.o(new kt6(0.5f, 0.5f, hn3.g(z0()) - 0.5f, hn3.f(z0()) - 0.5f), ao5Var);
    }

    @Override // androidx.compose.ui.node.h
    public sg4 V0() {
        sg4 sg4Var = this.u;
        if (sg4Var != null) {
            return sg4Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public abstract void W1();

    public final void W2(ss2 ss2Var, boolean z) {
        m j0;
        LayoutNode f2 = f2();
        boolean z2 = (!z && this.n == ss2Var && zq3.c(this.r, f2.I()) && this.s == f2.getLayoutDirection()) ? false : true;
        this.n = ss2Var;
        this.r = f2.I();
        this.s = f2.getLayoutDirection();
        if (!f2.G0() || ss2Var == null) {
            jm5 jm5Var = this.Q;
            if (jm5Var != null) {
                jm5Var.destroy();
                f2.q1(true);
                this.M.mo865invoke();
                if (m() && (j0 = f2.j0()) != null) {
                    j0.g(f2);
                }
            }
            this.Q = null;
            this.N = false;
            return;
        }
        if (this.Q != null) {
            if (z2) {
                Z2(this, false, 1, null);
                return;
            }
            return;
        }
        jm5 q = wz3.b(f2).q(this.L, this.M);
        q.d(z0());
        q.j(b1());
        this.Q = q;
        Z2(this, false, 1, null);
        f2.q1(true);
        this.M.mo865invoke();
    }

    public final NodeCoordinator X1(NodeCoordinator nodeCoordinator) {
        LayoutNode f2 = nodeCoordinator.f2();
        LayoutNode f22 = f2();
        if (f2 == f22) {
            Modifier.c k2 = nodeCoordinator.k2();
            Modifier.c k22 = k2();
            int a2 = a85.a(2);
            if (!k22.c0().L1()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.c I1 = k22.c0().I1(); I1 != null; I1 = I1.I1()) {
                if ((I1.G1() & a2) != 0 && I1 == k2) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (f2.J() > f22.J()) {
            f2 = f2.k0();
            zq3.e(f2);
        }
        while (f22.J() > f2.J()) {
            f22 = f22.k0();
            zq3.e(f22);
        }
        while (f2 != f22) {
            f2 = f2.k0();
            f22 = f22.k0();
            if (f2 == null || f22 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return f22 == f2() ? this : f2 == nodeCoordinator.f2() ? nodeCoordinator : f2.N();
    }

    @Override // defpackage.cz3
    public final cz3 Y() {
        if (!m()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        z2();
        return f2().i0().k;
    }

    public long Y1(long j) {
        long b2 = wm3.b(j, b1());
        jm5 jm5Var = this.Q;
        return jm5Var != null ? jm5Var.c(b2, true) : b2;
    }

    @Override // defpackage.cz3
    public final long a() {
        return z0();
    }

    public gb a2() {
        return f2().S().r();
    }

    protected final boolean a3(long j) {
        if (!hd5.b(j)) {
            return false;
        }
        jm5 jm5Var = this.Q;
        return jm5Var == null || !this.m || jm5Var.g(j);
    }

    @Override // androidx.compose.ui.node.h
    public long b1() {
        return this.x;
    }

    public cz3 b2() {
        return this;
    }

    @Override // defpackage.an2
    public float c1() {
        return f2().I().c1();
    }

    public final boolean c2() {
        return this.N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.tg4, defpackage.xq3
    public Object d() {
        if (!f2().h0().q(a85.a(64))) {
            return null;
        }
        k2();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Modifier.c o = f2().h0().o(); o != null; o = o.I1()) {
            if ((a85.a(64) & o.G1()) != 0) {
                int a2 = a85.a(64);
                ?? r6 = 0;
                ul1 ul1Var = o;
                while (ul1Var != 0) {
                    if (ul1Var instanceof vo5) {
                        ref$ObjectRef.element = ((vo5) ul1Var).i(f2().I(), ref$ObjectRef.element);
                    } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                        Modifier.c f2 = ul1Var.f2();
                        int i = 0;
                        ul1Var = ul1Var;
                        r6 = r6;
                        while (f2 != null) {
                            if ((f2.G1() & a2) != 0) {
                                i++;
                                r6 = r6;
                                if (i == 1) {
                                    ul1Var = f2;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new vy4(new Modifier.c[16], 0);
                                    }
                                    if (ul1Var != 0) {
                                        r6.b(ul1Var);
                                        ul1Var = 0;
                                    }
                                    r6.b(f2);
                                }
                            }
                            f2 = f2.C1();
                            ul1Var = ul1Var;
                            r6 = r6;
                        }
                        if (i == 1) {
                        }
                    }
                    ul1Var = rl1.g(r6);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    public final long d2() {
        return E0();
    }

    public final jm5 e2() {
        return this.Q;
    }

    public LayoutNode f2() {
        return this.i;
    }

    @Override // defpackage.cz3
    public long g0(long j) {
        if (!m()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        z2();
        while (this != null) {
            j = this.S2(j);
            this = this.k;
        }
        return j;
    }

    public abstract i g2();

    @Override // defpackage.fm1
    public float getDensity() {
        return f2().I().getDensity();
    }

    @Override // defpackage.yq3
    public LayoutDirection getLayoutDirection() {
        return f2().getLayoutDirection();
    }

    public final long h2() {
        return this.r.v1(f2().o0().d());
    }

    protected final my4 i2() {
        my4 my4Var = this.B;
        if (my4Var != null) {
            return my4Var;
        }
        my4 my4Var2 = new my4(0.0f, 0.0f, 0.0f, 0.0f);
        this.B = my4Var2;
        return my4Var2;
    }

    public abstract Modifier.c k2();

    public final NodeCoordinator l2() {
        return this.j;
    }

    @Override // defpackage.cz3
    public boolean m() {
        return k2().L1();
    }

    public final NodeCoordinator m2() {
        return this.k;
    }

    public final float n2() {
        return this.y;
    }

    @Override // defpackage.cz3
    public void o(cz3 cz3Var, float[] fArr) {
        NodeCoordinator R2 = R2(cz3Var);
        R2.z2();
        NodeCoordinator X1 = X1(R2);
        kg4.h(fArr);
        R2.V2(X1, fArr);
        U2(X1, fArr);
    }

    public final Modifier.c p2(int i) {
        boolean i2 = b85.i(i);
        Modifier.c k2 = k2();
        if (!i2 && (k2 = k2.I1()) == null) {
            return null;
        }
        for (Modifier.c q2 = q2(i2); q2 != null && (q2.B1() & i) != 0; q2 = q2.C1()) {
            if ((q2.G1() & i) != 0) {
                return q2;
            }
            if (q2 == k2) {
                return null;
            }
        }
        return null;
    }

    public final void t2(d dVar, long j, z83 z83Var, boolean z, boolean z2) {
        Modifier.c p2 = p2(dVar.a());
        if (!a3(j)) {
            if (z) {
                float S1 = S1(j, h2());
                if (Float.isInfinite(S1) || Float.isNaN(S1) || !z83Var.x(S1, false)) {
                    return;
                }
                s2(p2, dVar, j, z83Var, z, false, S1);
                return;
            }
            return;
        }
        if (p2 == null) {
            u2(dVar, j, z83Var, z, z2);
            return;
        }
        if (w2(j)) {
            r2(p2, dVar, j, z83Var, z, z2);
            return;
        }
        float S12 = !z ? Float.POSITIVE_INFINITY : S1(j, h2());
        if (Float.isInfinite(S12) || Float.isNaN(S12) || !z83Var.x(S12, z2)) {
            Q2(p2, dVar, j, z83Var, z, z2, S12);
        } else {
            s2(p2, dVar, j, z83Var, z, z2, S12);
        }
    }

    @Override // defpackage.cz3
    public long u(long j) {
        if (!m()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cz3 d2 = ez3.d(this);
        return y(d2, fd5.s(wz3.b(f2()).o(j), ez3.e(d2)));
    }

    @Override // androidx.compose.ui.node.h
    public void u1() {
        L0(b1(), this.y, this.n);
    }

    public void u2(d dVar, long j, z83 z83Var, boolean z, boolean z2) {
        NodeCoordinator nodeCoordinator = this.j;
        if (nodeCoordinator != null) {
            nodeCoordinator.t2(dVar, nodeCoordinator.Y1(j), z83Var, z, z2);
        }
    }

    public void v2() {
        jm5 jm5Var = this.Q;
        if (jm5Var != null) {
            jm5Var.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.k;
        if (nodeCoordinator != null) {
            nodeCoordinator.v2();
        }
    }

    protected final boolean w2(long j) {
        float o = fd5.o(j);
        float p = fd5.p(j);
        return o >= 0.0f && p >= 0.0f && o < ((float) B0()) && p < ((float) x0());
    }

    public final boolean x2() {
        if (this.Q != null && this.t <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.k;
        if (nodeCoordinator != null) {
            return nodeCoordinator.x2();
        }
        return false;
    }

    @Override // defpackage.cz3
    public long y(cz3 cz3Var, long j) {
        if (cz3Var instanceof tb4) {
            return fd5.w(cz3Var.y(this, fd5.w(j)));
        }
        NodeCoordinator R2 = R2(cz3Var);
        R2.z2();
        NodeCoordinator X1 = X1(R2);
        while (R2 != X1) {
            j = R2.S2(j);
            R2 = R2.k;
            zq3.e(R2);
        }
        return Q1(X1, j);
    }

    @Override // defpackage.cz3
    public kt6 z(cz3 cz3Var, boolean z) {
        if (!m()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!cz3Var.m()) {
            throw new IllegalStateException(("LayoutCoordinates " + cz3Var + " is not attached!").toString());
        }
        NodeCoordinator R2 = R2(cz3Var);
        R2.z2();
        NodeCoordinator X1 = X1(R2);
        my4 i2 = i2();
        i2.i(0.0f);
        i2.k(0.0f);
        i2.j(hn3.g(cz3Var.a()));
        i2.h(hn3.f(cz3Var.a()));
        while (R2 != X1) {
            K2(R2, i2, z, false, 4, null);
            if (i2.f()) {
                return kt6.e.a();
            }
            R2 = R2.k;
            zq3.e(R2);
        }
        P1(X1, i2, z);
        return ny4.a(i2);
    }

    public final void z2() {
        f2().S().P();
    }
}
