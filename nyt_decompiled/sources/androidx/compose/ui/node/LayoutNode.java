package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.a85;
import defpackage.ar3;
import defpackage.b85;
import defpackage.bj7;
import defpackage.ct0;
import defpackage.cz3;
import defpackage.dj7;
import defpackage.dy5;
import defpackage.ej7;
import defpackage.es0;
import defpackage.et0;
import defpackage.f13;
import defpackage.fm1;
import defpackage.fu1;
import defpackage.fv0;
import defpackage.gb;
import defpackage.jm5;
import defpackage.km5;
import defpackage.kv6;
import defpackage.kz3;
import defpackage.nu3;
import defpackage.ph0;
import defpackage.qs2;
import defpackage.r99;
import defpackage.rg4;
import defpackage.rl1;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.uz3;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.wz3;
import defpackage.xy4;
import defpackage.yq3;
import defpackage.z83;
import defpackage.zq3;
import defpackage.zy3;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class LayoutNode implements es0, kv6, km5, kz3, ComposeUiNode, m.b {
    public static final c j0 = new c(null);
    public static final int k0 = 8;
    private static final d l0 = new b();
    private static final qs2 m0 = new qs2() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LayoutNode mo865invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final r99 n0 = new a();
    private static final Comparator o0 = new Comparator() { // from class: tz3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int p;
            p = LayoutNode.p((LayoutNode) obj, (LayoutNode) obj2);
            return p;
        }
    };
    private r99 B;
    private et0 H;
    private UsageByParent L;
    private UsageByParent M;
    private boolean N;
    private final k Q;
    private final LayoutNodeLayoutDelegate S;
    private LayoutNodeSubcompositionsState X;
    private NodeCoordinator Y;
    private boolean Z;
    private final boolean a;
    private int b;
    private int c;
    private boolean d;
    private LayoutNode e;
    private Modifier e0;
    private int f;
    private ss2 f0;
    private final xy4 g;
    private ss2 g0;
    private vy4 h;
    private boolean h0;
    private boolean i;
    private boolean i0;
    private LayoutNode j;
    private m k;
    private AndroidViewHolder l;
    private int m;
    private boolean n;
    private bj7 r;
    private final vy4 s;
    private boolean t;
    private rg4 u;
    private final ar3 w;
    private fm1 x;
    private LayoutDirection y;

    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public static final class a implements r99 {
        a() {
        }

        @Override // defpackage.r99
        public long a() {
            return 300L;
        }

        @Override // defpackage.r99
        public long b() {
            return 40L;
        }

        @Override // defpackage.r99
        public long c() {
            return 400L;
        }

        @Override // defpackage.r99
        public long d() {
            return fu1.b.b();
        }

        @Override // defpackage.r99
        public float f() {
            return 16.0f;
        }
    }

    public static final class b extends d {
        b() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // defpackage.rg4
        public /* bridge */ /* synthetic */ sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
            return (sg4) n(fVar, list, j);
        }

        public Void n(androidx.compose.ui.layout.f fVar, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qs2 a() {
            return LayoutNode.m0;
        }

        public final Comparator b() {
            return LayoutNode.o0;
        }

        private c() {
        }
    }

    public static abstract class d implements rg4 {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // defpackage.rg4
        public /* bridge */ /* synthetic */ int a(yq3 yq3Var, List list, int i) {
            return ((Number) k(yq3Var, list, i)).intValue();
        }

        @Override // defpackage.rg4
        public /* bridge */ /* synthetic */ int e(yq3 yq3Var, List list, int i) {
            return ((Number) m(yq3Var, list, i)).intValue();
        }

        @Override // defpackage.rg4
        public /* bridge */ /* synthetic */ int g(yq3 yq3Var, List list, int i) {
            return ((Number) j(yq3Var, list, i)).intValue();
        }

        @Override // defpackage.rg4
        public /* bridge */ /* synthetic */ int i(yq3 yq3Var, List list, int i) {
            return ((Number) l(yq3Var, list, i)).intValue();
        }

        public Void j(yq3 yq3Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        public Void k(yq3 yq3Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        public Void l(yq3 yq3Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        public Void m(yq3 yq3Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public LayoutNode(boolean z, int i) {
        fm1 fm1Var;
        this.a = z;
        this.b = i;
        this.g = new xy4(new vy4(new LayoutNode[16], 0), new qs2() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m76invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m76invoke() {
                LayoutNode.this.S().K();
            }
        });
        this.s = new vy4(new LayoutNode[16], 0);
        this.t = true;
        this.u = l0;
        this.w = new ar3(this);
        fm1Var = wz3.a;
        this.x = fm1Var;
        this.y = LayoutDirection.Ltr;
        this.B = n0;
        this.H = et0.o.a();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.L = usageByParent;
        this.M = usageByParent;
        this.Q = new k(this);
        this.S = new LayoutNodeLayoutDelegate(this);
        this.Z = true;
        this.e0 = Modifier.a;
    }

    private final void F0() {
        LayoutNode layoutNode;
        if (this.f > 0) {
            this.i = true;
        }
        if (!this.a || (layoutNode = this.j) == null) {
            return;
        }
        layoutNode.F0();
    }

    public static /* synthetic */ boolean N0(LayoutNode layoutNode, fv0 fv0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            fv0Var = layoutNode.S.y();
        }
        return layoutNode.L0(fv0Var);
    }

    private final NodeCoordinator O() {
        if (this.Z) {
            NodeCoordinator N = N();
            NodeCoordinator m2 = i0().m2();
            this.Y = null;
            while (true) {
                if (zq3.c(N, m2)) {
                    break;
                }
                if ((N != null ? N.e2() : null) != null) {
                    this.Y = N;
                    break;
                }
                N = N != null ? N.m2() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this.Y;
        if (nodeCoordinator == null || nodeCoordinator.e2() != null) {
            return nodeCoordinator;
        }
        throw new IllegalStateException("layer was not set");
    }

    private final void U0(LayoutNode layoutNode) {
        if (layoutNode.S.s() > 0) {
            this.S.T(r0.s() - 1);
        }
        if (this.k != null) {
            layoutNode.y();
        }
        layoutNode.j = null;
        layoutNode.i0().O2(null);
        if (layoutNode.a) {
            this.f--;
            vy4 f = layoutNode.g.f();
            int q = f.q();
            if (q > 0) {
                Object[] p = f.p();
                int i = 0;
                do {
                    ((LayoutNode) p[i]).i0().O2(null);
                    i++;
                } while (i < q);
            }
        }
        F0();
        W0();
    }

    private final void V0() {
        C0();
        LayoutNode k02 = k0();
        if (k02 != null) {
            k02.A0();
        }
        B0();
    }

    private final void Y0() {
        if (this.i) {
            int i = 0;
            this.i = false;
            vy4 vy4Var = this.h;
            if (vy4Var == null) {
                vy4Var = new vy4(new LayoutNode[16], 0);
                this.h = vy4Var;
            }
            vy4Var.h();
            vy4 f = this.g.f();
            int q = f.q();
            if (q > 0) {
                Object[] p = f.p();
                do {
                    LayoutNode layoutNode = (LayoutNode) p[i];
                    if (layoutNode.a) {
                        vy4Var.c(vy4Var.q(), layoutNode.s0());
                    } else {
                        vy4Var.b(layoutNode);
                    }
                    i++;
                } while (i < q);
            }
            this.S.K();
        }
    }

    public static /* synthetic */ boolean a1(LayoutNode layoutNode, fv0 fv0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            fv0Var = layoutNode.S.x();
        }
        return layoutNode.Z0(fv0Var);
    }

    public static /* synthetic */ void f1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.e1(z);
    }

    public static /* synthetic */ void h1(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.g1(z, z2);
    }

    public static /* synthetic */ void j1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.i1(z);
    }

    public static /* synthetic */ void l1(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.k1(z, z2);
    }

    private final void n1() {
        this.Q.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.q0() == layoutNode2.q0() ? zq3.j(layoutNode.l0(), layoutNode2.l0()) : Float.compare(layoutNode.q0(), layoutNode2.q0());
    }

    private final float q0() {
        return a0().B1();
    }

    private final void t1(LayoutNode layoutNode) {
        if (zq3.c(layoutNode, this.e)) {
            return;
        }
        this.e = layoutNode;
        if (layoutNode != null) {
            this.S.q();
            NodeCoordinator l2 = N().l2();
            for (NodeCoordinator i0 = i0(); !zq3.c(i0, l2) && i0 != null; i0 = i0.l2()) {
                i0.W1();
            }
        }
        C0();
    }

    public static /* synthetic */ void u0(LayoutNode layoutNode, long j, z83 z83Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.t0(j, z83Var, z3, z2);
    }

    private final void v() {
        this.M = this.L;
        this.L = UsageByParent.NotUsed;
        vy4 s0 = s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i];
                if (layoutNode.L == UsageByParent.InLayoutBlock) {
                    layoutNode.v();
                }
                i++;
            } while (i < q);
        }
    }

    private final String w(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        vy4 s0 = s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i3 = 0;
            do {
                sb.append(((LayoutNode) p[i3]).w(i + 1));
                i3++;
            } while (i3 < q);
        }
        String sb2 = sb.toString();
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ String x(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.w(i);
    }

    private final void y0() {
        if (this.Q.p(a85.a(1024) | a85.a(ProgressEvent.PART_COMPLETED_EVENT_CODE) | a85.a(ProgressEvent.PART_FAILED_EVENT_CODE))) {
            for (Modifier.c k = this.Q.k(); k != null; k = k.C1()) {
                if (((a85.a(1024) & k.G1()) != 0) | ((a85.a(ProgressEvent.PART_COMPLETED_EVENT_CODE) & k.G1()) != 0) | ((a85.a(ProgressEvent.PART_FAILED_EVENT_CODE) & k.G1()) != 0)) {
                    b85.a(k);
                }
            }
        }
    }

    private final void z0() {
        int i;
        k kVar = this.Q;
        int a2 = a85.a(1024);
        i = kVar.i();
        if ((i & a2) != 0) {
            for (Modifier.c o = kVar.o(); o != null; o = o.I1()) {
                if ((o.G1() & a2) != 0) {
                    Modifier.c cVar = o;
                    vy4 vy4Var = null;
                    while (cVar != null) {
                        if (cVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                            if (focusTargetNode.l2().isFocused()) {
                                wz3.b(this).getFocusOwner().c(true, false);
                                focusTargetNode.n2();
                            }
                        } else if ((cVar.G1() & a2) != 0 && (cVar instanceof ul1)) {
                            int i2 = 0;
                            for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                if ((f2.G1() & a2) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar = f2;
                                    } else {
                                        if (vy4Var == null) {
                                            vy4Var = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            vy4Var.b(cVar);
                                            cVar = null;
                                        }
                                        vy4Var.b(f2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cVar = rl1.g(vy4Var);
                    }
                }
            }
        }
    }

    public final void A(ph0 ph0Var) {
        i0().T1(ph0Var);
    }

    public final void A0() {
        NodeCoordinator O = O();
        if (O != null) {
            O.v2();
            return;
        }
        LayoutNode k02 = k0();
        if (k02 != null) {
            k02.A0();
        }
    }

    public final boolean B() {
        AlignmentLines f;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.S;
        if (layoutNodeLayoutDelegate.r().f().k()) {
            return true;
        }
        gb B = layoutNodeLayoutDelegate.B();
        return (B == null || (f = B.f()) == null || !f.k()) ? false : true;
    }

    public final void B0() {
        NodeCoordinator i0 = i0();
        NodeCoordinator N = N();
        while (i0 != N) {
            zq3.f(i0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            androidx.compose.ui.node.d dVar = (androidx.compose.ui.node.d) i0;
            jm5 e2 = dVar.e2();
            if (e2 != null) {
                e2.invalidate();
            }
            i0 = dVar.l2();
        }
        jm5 e22 = N().e2();
        if (e22 != null) {
            e22.invalidate();
        }
    }

    public final boolean C() {
        return this.N;
    }

    public final void C0() {
        if (this.e != null) {
            h1(this, false, false, 3, null);
        } else {
            l1(this, false, false, 3, null);
        }
    }

    public final List D() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
        zq3.e(X);
        return X.a1();
    }

    public final void D0() {
        this.S.J();
    }

    public final List E() {
        return a0().h1();
    }

    public final void E0() {
        this.r = null;
        wz3.b(this).u();
    }

    public final List F() {
        return s0().g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, bj7] */
    public final bj7 G() {
        if (!this.Q.q(a85.a(8)) || this.r != null) {
            return this.r;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new bj7();
        wz3.b(this).getSnapshotObserver().j(this, new qs2() { // from class: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m77invoke();
                return ww8.a;
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
            /* JADX WARN: Type inference failed for: r5v7, types: [T, bj7] */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m77invoke() {
                int i;
                k h0 = LayoutNode.this.h0();
                int a2 = a85.a(8);
                Ref$ObjectRef<bj7> ref$ObjectRef2 = ref$ObjectRef;
                i = h0.i();
                if ((i & a2) != 0) {
                    for (Modifier.c o = h0.o(); o != null; o = o.I1()) {
                        if ((o.G1() & a2) != 0) {
                            ul1 ul1Var = o;
                            ?? r4 = 0;
                            while (ul1Var != 0) {
                                if (ul1Var instanceof ej7) {
                                    ej7 ej7Var = (ej7) ul1Var;
                                    if (ej7Var.O()) {
                                        ?? bj7Var = new bj7();
                                        ref$ObjectRef2.element = bj7Var;
                                        bj7Var.v(true);
                                    }
                                    if (ej7Var.x1()) {
                                        ref$ObjectRef2.element.w(true);
                                    }
                                    ej7Var.u0(ref$ObjectRef2.element);
                                } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                                    Modifier.c f2 = ul1Var.f2();
                                    int i2 = 0;
                                    ul1Var = ul1Var;
                                    r4 = r4;
                                    while (f2 != null) {
                                        if ((f2.G1() & a2) != 0) {
                                            i2++;
                                            r4 = r4;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                ul1Var = rl1.g(r4);
                            }
                        }
                    }
                }
            }
        });
        T t = ref$ObjectRef.element;
        this.r = (bj7) t;
        return (bj7) t;
    }

    public boolean G0() {
        return this.k != null;
    }

    public et0 H() {
        return this.H;
    }

    public boolean H0() {
        return this.i0;
    }

    public fm1 I() {
        return this.x;
    }

    public final boolean I0() {
        return a0().E1();
    }

    public final int J() {
        return this.m;
    }

    public final Boolean J0() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
        if (X != null) {
            return Boolean.valueOf(X.e());
        }
        return null;
    }

    public final List K() {
        return this.g.b();
    }

    public final boolean K0() {
        return this.d;
    }

    public final boolean L() {
        long d2 = N().d2();
        return fv0.l(d2) && fv0.k(d2);
    }

    public final boolean L0(fv0 fv0Var) {
        if (fv0Var == null || this.e == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
        zq3.e(X);
        return X.I1(fv0Var.t());
    }

    public int M() {
        return this.S.w();
    }

    @Override // defpackage.km5
    public boolean M0() {
        return G0();
    }

    public final NodeCoordinator N() {
        return this.Q.l();
    }

    public final void O0() {
        if (this.L == UsageByParent.NotUsed) {
            v();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
        zq3.e(X);
        X.J1();
    }

    public final AndroidViewHolder P() {
        return this.l;
    }

    public final void P0() {
        this.S.L();
    }

    public final ar3 Q() {
        return this.w;
    }

    public final void Q0() {
        this.S.M();
    }

    public final UsageByParent R() {
        return this.L;
    }

    public final void R0() {
        this.S.N();
    }

    public final LayoutNodeLayoutDelegate S() {
        return this.S;
    }

    public final void S0() {
        this.S.O();
    }

    public final boolean T() {
        return this.S.z();
    }

    public final void T0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.g.a(i > i2 ? i2 + i4 : (i2 + i3) - 2, (LayoutNode) this.g.g(i > i2 ? i + i4 : i));
        }
        W0();
        F0();
        C0();
    }

    public final LayoutState U() {
        return this.S.A();
    }

    public final boolean V() {
        return this.S.C();
    }

    public final boolean W() {
        return this.S.D();
    }

    public final void W0() {
        if (!this.a) {
            this.t = true;
            return;
        }
        LayoutNode k02 = k0();
        if (k02 != null) {
            k02.W0();
        }
    }

    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate X() {
        return this.S.E();
    }

    public final void X0(int i, int i2) {
        l.a placementScope;
        NodeCoordinator N;
        if (this.L == UsageByParent.NotUsed) {
            v();
        }
        LayoutNode k02 = k0();
        if (k02 == null || (N = k02.N()) == null || (placementScope = N.a1()) == null) {
            placementScope = wz3.b(this).getPlacementScope();
        }
        l.a.j(placementScope, a0(), i, i2, 0.0f, 4, null);
    }

    public final LayoutNode Y() {
        return this.e;
    }

    public final uz3 Z() {
        return wz3.b(this).getSharedDrawScope();
    }

    public final boolean Z0(fv0 fv0Var) {
        if (fv0Var == null) {
            return false;
        }
        if (this.L == UsageByParent.NotUsed) {
            u();
        }
        return a0().O1(fv0Var.t());
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void a(LayoutDirection layoutDirection) {
        if (this.y != layoutDirection) {
            this.y = layoutDirection;
            V0();
        }
    }

    public final LayoutNodeLayoutDelegate.MeasurePassDelegate a0() {
        return this.S.F();
    }

    @Override // defpackage.es0
    public void b() {
        AndroidViewHolder androidViewHolder = this.l;
        if (androidViewHolder != null) {
            androidViewHolder.b();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.X;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.b();
        }
        NodeCoordinator l2 = N().l2();
        for (NodeCoordinator i0 = i0(); !zq3.c(i0, l2) && i0 != null; i0 = i0.l2()) {
            i0.F2();
        }
    }

    public final boolean b0() {
        return this.S.G();
    }

    public final void b1() {
        int e2 = this.g.e();
        while (true) {
            e2--;
            if (-1 >= e2) {
                this.g.c();
                return;
            }
            U0((LayoutNode) this.g.d(e2));
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void c(int i) {
        this.c = i;
    }

    public rg4 c0() {
        return this.u;
    }

    public final void c1(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            U0((LayoutNode) this.g.g(i3));
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // defpackage.es0
    public void d() {
        AndroidViewHolder androidViewHolder = this.l;
        if (androidViewHolder != null) {
            androidViewHolder.d();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.X;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.d();
        }
        this.i0 = true;
        n1();
        if (G0()) {
            E0();
        }
    }

    public final UsageByParent d0() {
        return a0().w1();
    }

    public final void d1() {
        if (this.L == UsageByParent.NotUsed) {
            v();
        }
        a0().P1();
    }

    @Override // defpackage.kz3
    public boolean e() {
        return a0().e();
    }

    public final UsageByParent e0() {
        UsageByParent p1;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
        return (X == null || (p1 = X.p1()) == null) ? UsageByParent.NotUsed : p1;
    }

    public final void e1(boolean z) {
        m mVar;
        if (this.a || (mVar = this.k) == null) {
            return;
        }
        mVar.c(this, true, z);
    }

    @Override // defpackage.kv6
    public void f() {
        if (this.e != null) {
            h1(this, false, false, 1, null);
        } else {
            l1(this, false, false, 1, null);
        }
        fv0 x = this.S.x();
        if (x != null) {
            m mVar = this.k;
            if (mVar != null) {
                mVar.n(this, x.t());
                return;
            }
            return;
        }
        m mVar2 = this.k;
        if (mVar2 != null) {
            m.b(mVar2, false, 1, null);
        }
    }

    public Modifier f0() {
        return this.e0;
    }

    @Override // defpackage.es0
    public void g() {
        if (!G0()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.l;
        if (androidViewHolder != null) {
            androidViewHolder.g();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.X;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.g();
        }
        if (H0()) {
            this.i0 = false;
            E0();
        } else {
            n1();
        }
        x1(dj7.b());
        this.Q.s();
        this.Q.y();
        m1(this);
    }

    public final boolean g0() {
        return this.h0;
    }

    public final void g1(boolean z, boolean z2) {
        if (this.e == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        m mVar = this.k;
        if (mVar == null || this.n || this.a) {
            return;
        }
        mVar.p(this, true, z, z2);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
        zq3.e(X);
        X.w1(z);
    }

    @Override // defpackage.kz3
    public LayoutDirection getLayoutDirection() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void h(fm1 fm1Var) {
        int i;
        if (zq3.c(this.x, fm1Var)) {
            return;
        }
        this.x = fm1Var;
        V0();
        k kVar = this.Q;
        int a2 = a85.a(16);
        i = kVar.i();
        if ((i & a2) != 0) {
            for (Modifier.c k = kVar.k(); k != null; k = k.C1()) {
                if ((k.G1() & a2) != 0) {
                    ul1 ul1Var = k;
                    ?? r3 = 0;
                    while (ul1Var != 0) {
                        if (ul1Var instanceof dy5) {
                            ((dy5) ul1Var).a1();
                        } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                            Modifier.c f2 = ul1Var.f2();
                            int i2 = 0;
                            ul1Var = ul1Var;
                            r3 = r3;
                            while (f2 != null) {
                                if ((f2.G1() & a2) != 0) {
                                    i2++;
                                    r3 = r3;
                                    if (i2 == 1) {
                                        ul1Var = f2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (ul1Var != 0) {
                                            r3.b(ul1Var);
                                            ul1Var = 0;
                                        }
                                        r3.b(f2);
                                    }
                                }
                                f2 = f2.C1();
                                ul1Var = ul1Var;
                                r3 = r3;
                            }
                            if (i2 == 1) {
                            }
                        }
                        ul1Var = rl1.g(r3);
                    }
                }
                if ((k.B1() & a2) == 0) {
                    return;
                }
            }
        }
    }

    public final k h0() {
        return this.Q;
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
    @Override // androidx.compose.ui.node.m.b
    public void i() {
        NodeCoordinator N = N();
        int a2 = a85.a(128);
        boolean i = b85.i(a2);
        Modifier.c k2 = N.k2();
        if (!i && (k2 = k2.I1()) == null) {
            return;
        }
        for (Modifier.c q2 = N.q2(i); q2 != null && (q2.B1() & a2) != 0; q2 = q2.C1()) {
            if ((q2.G1() & a2) != 0) {
                ul1 ul1Var = q2;
                ?? r5 = 0;
                while (ul1Var != 0) {
                    if (ul1Var instanceof zy3) {
                        ((zy3) ul1Var).F0(N());
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

    public final NodeCoordinator i0() {
        return this.Q.n();
    }

    public final void i1(boolean z) {
        m mVar;
        if (this.a || (mVar = this.k) == null) {
            return;
        }
        m.d(mVar, this, false, z, 2, null);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void j(rg4 rg4Var) {
        if (zq3.c(this.u, rg4Var)) {
            return;
        }
        this.u = rg4Var;
        this.w.l(c0());
        C0();
    }

    public final m j0() {
        return this.k;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void k(Modifier modifier) {
        if (this.a && f0() != Modifier.a) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (H0()) {
            throw new IllegalArgumentException("modifier is updated when deactivated");
        }
        this.e0 = modifier;
        this.Q.E(modifier);
        this.S.W();
        if (this.Q.q(a85.a(512)) && this.e == null) {
            t1(this);
        }
    }

    public final LayoutNode k0() {
        LayoutNode layoutNode = this.j;
        while (layoutNode != null && layoutNode.a) {
            layoutNode = layoutNode.j;
        }
        return layoutNode;
    }

    public final void k1(boolean z, boolean z2) {
        m mVar;
        if (this.n || this.a || (mVar = this.k) == null) {
            return;
        }
        m.v(mVar, this, false, z, z2, 2, null);
        a0().C1(z);
    }

    @Override // defpackage.kz3
    public cz3 l() {
        return N();
    }

    public final int l0() {
        return a0().x1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void m(et0 et0Var) {
        int i;
        this.H = et0Var;
        h((fm1) et0Var.a(CompositionLocalsKt.e()));
        a((LayoutDirection) et0Var.a(CompositionLocalsKt.j()));
        n((r99) et0Var.a(CompositionLocalsKt.p()));
        k kVar = this.Q;
        int a2 = a85.a(32768);
        i = kVar.i();
        if ((i & a2) != 0) {
            for (Modifier.c k = kVar.k(); k != null; k = k.C1()) {
                if ((k.G1() & a2) != 0) {
                    ul1 ul1Var = k;
                    ?? r2 = 0;
                    while (ul1Var != 0) {
                        if (ul1Var instanceof ct0) {
                            Modifier.c c0 = ((ct0) ul1Var).c0();
                            if (c0.L1()) {
                                b85.e(c0);
                            } else {
                                c0.b2(true);
                            }
                        } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                            Modifier.c f2 = ul1Var.f2();
                            int i2 = 0;
                            ul1Var = ul1Var;
                            r2 = r2;
                            while (f2 != null) {
                                if ((f2.G1() & a2) != 0) {
                                    i2++;
                                    r2 = r2;
                                    if (i2 == 1) {
                                        ul1Var = f2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (ul1Var != 0) {
                                            r2.b(ul1Var);
                                            ul1Var = 0;
                                        }
                                        r2.b(f2);
                                    }
                                }
                                f2 = f2.C1();
                                ul1Var = ul1Var;
                                r2 = r2;
                            }
                            if (i2 == 1) {
                            }
                        }
                        ul1Var = rl1.g(r2);
                    }
                }
                if ((k.B1() & a2) == 0) {
                    return;
                }
            }
        }
    }

    public int m0() {
        return this.b;
    }

    public final void m1(LayoutNode layoutNode) {
        if (e.a[layoutNode.U().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.U());
        }
        if (layoutNode.W()) {
            h1(layoutNode, true, false, 2, null);
            return;
        }
        if (layoutNode.V()) {
            layoutNode.e1(true);
        }
        if (layoutNode.b0()) {
            l1(layoutNode, true, false, 2, null);
        } else if (layoutNode.T()) {
            layoutNode.i1(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void n(r99 r99Var) {
        int i;
        if (zq3.c(this.B, r99Var)) {
            return;
        }
        this.B = r99Var;
        k kVar = this.Q;
        int a2 = a85.a(16);
        i = kVar.i();
        if ((i & a2) != 0) {
            for (Modifier.c k = kVar.k(); k != null; k = k.C1()) {
                if ((k.G1() & a2) != 0) {
                    ul1 ul1Var = k;
                    ?? r3 = 0;
                    while (ul1Var != 0) {
                        if (ul1Var instanceof dy5) {
                            ((dy5) ul1Var).w1();
                        } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                            Modifier.c f2 = ul1Var.f2();
                            int i2 = 0;
                            ul1Var = ul1Var;
                            r3 = r3;
                            while (f2 != null) {
                                if ((f2.G1() & a2) != 0) {
                                    i2++;
                                    r3 = r3;
                                    if (i2 == 1) {
                                        ul1Var = f2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new vy4(new Modifier.c[16], 0);
                                        }
                                        if (ul1Var != 0) {
                                            r3.b(ul1Var);
                                            ul1Var = 0;
                                        }
                                        r3.b(f2);
                                    }
                                }
                                f2 = f2.C1();
                                ul1Var = ul1Var;
                                r3 = r3;
                            }
                            if (i2 == 1) {
                            }
                        }
                        ul1Var = rl1.g(r3);
                    }
                }
                if ((k.B1() & a2) == 0) {
                    return;
                }
            }
        }
    }

    public final LayoutNodeSubcompositionsState n0() {
        return this.X;
    }

    public r99 o0() {
        return this.B;
    }

    public final void o1() {
        vy4 s0 = s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i];
                UsageByParent usageByParent = layoutNode.M;
                layoutNode.L = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.o1();
                }
                i++;
            } while (i < q);
        }
    }

    public int p0() {
        return this.S.I();
    }

    public final void p1(boolean z) {
        this.N = z;
    }

    public final void q1(boolean z) {
        this.Z = z;
    }

    public final vy4 r0() {
        if (this.t) {
            this.s.h();
            vy4 vy4Var = this.s;
            vy4Var.c(vy4Var.q(), s0());
            this.s.D(o0);
            this.t = false;
        }
        return this.s;
    }

    public final void r1(AndroidViewHolder androidViewHolder) {
        this.l = androidViewHolder;
    }

    public final vy4 s0() {
        z1();
        if (this.f == 0) {
            return this.g.f();
        }
        vy4 vy4Var = this.h;
        zq3.e(vy4Var);
        return vy4Var;
    }

    public final void s1(UsageByParent usageByParent) {
        this.L = usageByParent;
    }

    public final void t(m mVar) {
        LayoutNode layoutNode;
        int i = 0;
        if (this.k != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + x(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode2 = this.j;
        if (layoutNode2 != null) {
            if (!zq3.c(layoutNode2 != null ? layoutNode2.k : null, mVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attaching to a different owner(");
                sb.append(mVar);
                sb.append(") than the parent's owner(");
                LayoutNode k02 = k0();
                sb.append(k02 != null ? k02.k : null);
                sb.append("). This tree: ");
                sb.append(x(this, 0, 1, null));
                sb.append(" Parent tree: ");
                LayoutNode layoutNode3 = this.j;
                sb.append(layoutNode3 != null ? x(layoutNode3, 0, 1, null) : null);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        LayoutNode k03 = k0();
        if (k03 == null) {
            a0().S1(true);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
            if (X != null) {
                X.N1(true);
            }
        }
        i0().O2(k03 != null ? k03.N() : null);
        this.k = mVar;
        this.m = (k03 != null ? k03.m : -1) + 1;
        if (this.Q.q(a85.a(8))) {
            E0();
        }
        mVar.m(this);
        if (this.d) {
            t1(this);
        } else {
            LayoutNode layoutNode4 = this.j;
            if (layoutNode4 == null || (layoutNode = layoutNode4.e) == null) {
                layoutNode = this.e;
            }
            t1(layoutNode);
        }
        if (!H0()) {
            this.Q.s();
        }
        vy4 f = this.g.f();
        int q = f.q();
        if (q > 0) {
            Object[] p = f.p();
            do {
                ((LayoutNode) p[i]).t(mVar);
                i++;
            } while (i < q);
        }
        if (!H0()) {
            this.Q.y();
        }
        C0();
        if (k03 != null) {
            k03.C0();
        }
        NodeCoordinator l2 = N().l2();
        for (NodeCoordinator i0 = i0(); !zq3.c(i0, l2) && i0 != null; i0 = i0.l2()) {
            i0.B2();
        }
        ss2 ss2Var = this.f0;
        if (ss2Var != null) {
            ss2Var.invoke(mVar);
        }
        this.S.W();
        if (H0()) {
            return;
        }
        y0();
    }

    public final void t0(long j, z83 z83Var, boolean z, boolean z2) {
        i0().t2(NodeCoordinator.S.a(), i0().Y1(j), z83Var, z, z2);
    }

    public String toString() {
        return nu3.a(this, null) + " children: " + F().size() + " measurePolicy: " + c0();
    }

    public final void u() {
        this.M = this.L;
        this.L = UsageByParent.NotUsed;
        vy4 s0 = s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i];
                if (layoutNode.L != UsageByParent.NotUsed) {
                    layoutNode.u();
                }
                i++;
            } while (i < q);
        }
    }

    public final void u1(boolean z) {
        this.h0 = z;
    }

    public final void v0(long j, z83 z83Var, boolean z, boolean z2) {
        i0().t2(NodeCoordinator.S.b(), i0().Y1(j), z83Var, true, z2);
    }

    public final void v1(ss2 ss2Var) {
        this.f0 = ss2Var;
    }

    public final void w1(ss2 ss2Var) {
        this.g0 = ss2Var;
    }

    public final void x0(int i, LayoutNode layoutNode) {
        if (layoutNode.j != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(layoutNode);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(x(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode.j;
            sb.append(layoutNode2 != null ? x(layoutNode2, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (layoutNode.k != null) {
            throw new IllegalStateException(("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + x(this, 0, 1, null) + " Other tree: " + x(layoutNode, 0, 1, null)).toString());
        }
        layoutNode.j = this;
        this.g.a(i, layoutNode);
        W0();
        if (layoutNode.a) {
            this.f++;
        }
        F0();
        m mVar = this.k;
        if (mVar != null) {
            layoutNode.t(mVar);
        }
        if (layoutNode.S.s() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.S;
            layoutNodeLayoutDelegate.T(layoutNodeLayoutDelegate.s() + 1);
        }
    }

    public void x1(int i) {
        this.b = i;
    }

    public final void y() {
        m mVar = this.k;
        if (mVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode k02 = k0();
            sb.append(k02 != null ? x(k02, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        z0();
        LayoutNode k03 = k0();
        if (k03 != null) {
            k03.A0();
            k03.C0();
            LayoutNodeLayoutDelegate.MeasurePassDelegate a0 = a0();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            a0.R1(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate X = X();
            if (X != null) {
                X.L1(usageByParent);
            }
        }
        this.S.S();
        ss2 ss2Var = this.g0;
        if (ss2Var != null) {
            ss2Var.invoke(mVar);
        }
        if (this.Q.q(a85.a(8))) {
            E0();
        }
        this.Q.z();
        this.n = true;
        vy4 f = this.g.f();
        int q = f.q();
        if (q > 0) {
            Object[] p = f.p();
            int i = 0;
            do {
                ((LayoutNode) p[i]).y();
                i++;
            } while (i < q);
        }
        this.n = false;
        this.Q.t();
        mVar.s(this);
        this.k = null;
        t1(null);
        this.m = 0;
        a0().L1();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X2 = X();
        if (X2 != null) {
            X2.G1();
        }
    }

    public final void y1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.X = layoutNodeSubcompositionsState;
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
    public final void z() {
        int i;
        if (U() != LayoutState.Idle || T() || b0() || H0() || !e()) {
            return;
        }
        k kVar = this.Q;
        int a2 = a85.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
        i = kVar.i();
        if ((i & a2) != 0) {
            for (Modifier.c k = kVar.k(); k != null; k = k.C1()) {
                if ((k.G1() & a2) != 0) {
                    ul1 ul1Var = k;
                    ?? r4 = 0;
                    while (ul1Var != 0) {
                        if (ul1Var instanceof f13) {
                            f13 f13Var = (f13) ul1Var;
                            f13Var.k(rl1.h(f13Var, a85.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH)));
                        } else if ((ul1Var.G1() & a2) != 0 && (ul1Var instanceof ul1)) {
                            Modifier.c f2 = ul1Var.f2();
                            int i2 = 0;
                            ul1Var = ul1Var;
                            r4 = r4;
                            while (f2 != null) {
                                if ((f2.G1() & a2) != 0) {
                                    i2++;
                                    r4 = r4;
                                    if (i2 == 1) {
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
                            if (i2 == 1) {
                            }
                        }
                        ul1Var = rl1.g(r4);
                    }
                }
                if ((k.B1() & a2) == 0) {
                    return;
                }
            }
        }
    }

    public final void z1() {
        if (this.f > 0) {
            Y0();
        }
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? dj7.b() : i);
    }
}
