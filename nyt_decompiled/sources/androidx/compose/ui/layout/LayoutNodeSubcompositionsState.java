package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.platform.y;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.es0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.i17;
import defpackage.ra8;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.wz3;
import defpackage.zq3;
import defpackage.zr0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements es0 {
    private final LayoutNode a;
    private androidx.compose.runtime.c b;
    private m c;
    private int d;
    private int e;
    private int n;
    private int r;
    private final HashMap f = new HashMap();
    private final HashMap g = new HashMap();
    private final c h = new c();
    private final b i = new b();
    private final HashMap j = new HashMap();
    private final m.a k = new m.a(null, 1, null);
    private final Map l = new LinkedHashMap();
    private final vy4 m = new vy4(new Object[16], 0);
    private final String s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    private final class b implements ra8, androidx.compose.ui.layout.f {
        private final /* synthetic */ c a;

        public b() {
            this.a = LayoutNodeSubcompositionsState.this.h;
        }

        @Override // defpackage.an2
        public long A(float f) {
            return this.a.A(f);
        }

        @Override // defpackage.fm1
        public long B(long j) {
            return this.a.B(j);
        }

        @Override // defpackage.an2
        public float F(long j) {
            return this.a.F(j);
        }

        @Override // defpackage.ra8
        public List H0(Object obj, gt2 gt2Var) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.g.get(obj);
            List E = layoutNode != null ? layoutNode.E() : null;
            return E != null ? E : LayoutNodeSubcompositionsState.this.F(obj, gt2Var);
        }

        @Override // androidx.compose.ui.layout.f
        public sg4 P(int i, int i2, Map map, ss2 ss2Var) {
            return this.a.P(i, i2, map, ss2Var);
        }

        @Override // defpackage.fm1
        public long Q(float f) {
            return this.a.Q(f);
        }

        @Override // defpackage.fm1
        public float X0(float f) {
            return this.a.X0(f);
        }

        @Override // defpackage.yq3
        public boolean Z() {
            return this.a.Z();
        }

        @Override // defpackage.an2
        public float c1() {
            return this.a.c1();
        }

        @Override // defpackage.fm1
        public float f1(float f) {
            return this.a.f1(f);
        }

        @Override // defpackage.fm1
        public float getDensity() {
            return this.a.getDensity();
        }

        @Override // defpackage.yq3
        public LayoutDirection getLayoutDirection() {
            return this.a.getLayoutDirection();
        }

        @Override // defpackage.fm1
        public int k1(long j) {
            return this.a.k1(j);
        }

        @Override // defpackage.fm1
        public int l0(float f) {
            return this.a.l0(f);
        }

        @Override // defpackage.fm1
        public float t0(long j) {
            return this.a.t0(j);
        }

        @Override // defpackage.fm1
        public float v(int i) {
            return this.a.v(i);
        }

        @Override // defpackage.fm1
        public long v1(long j) {
            return this.a.v1(j);
        }
    }

    private final class c implements ra8 {
        private LayoutDirection a = LayoutDirection.Rtl;
        private float b;
        private float c;

        public static final class a implements sg4 {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ Map c;
            final /* synthetic */ c d;
            final /* synthetic */ LayoutNodeSubcompositionsState e;
            final /* synthetic */ ss2 f;

            a(int i, int i2, Map map, c cVar, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, ss2 ss2Var) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = cVar;
                this.e = layoutNodeSubcompositionsState;
                this.f = ss2Var;
            }

            @Override // defpackage.sg4
            public void e() {
                androidx.compose.ui.node.i g2;
                if (!this.d.Z() || (g2 = this.e.a.N().g2()) == null) {
                    this.f.invoke(this.e.a.N().a1());
                } else {
                    this.f.invoke(g2.a1());
                }
            }

            @Override // defpackage.sg4
            public Map f() {
                return this.c;
            }

            @Override // defpackage.sg4
            public int getHeight() {
                return this.b;
            }

            @Override // defpackage.sg4
            public int getWidth() {
                return this.a;
            }
        }

        public c() {
        }

        @Override // defpackage.ra8
        public List H0(Object obj, gt2 gt2Var) {
            return LayoutNodeSubcompositionsState.this.K(obj, gt2Var);
        }

        @Override // androidx.compose.ui.layout.f
        public sg4 P(int i, int i2, Map map, ss2 ss2Var) {
            if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
                return new a(i, i2, map, this, LayoutNodeSubcompositionsState.this, ss2Var);
            }
            throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        @Override // defpackage.yq3
        public boolean Z() {
            return LayoutNodeSubcompositionsState.this.a.U() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.a.U() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // defpackage.an2
        public float c1() {
            return this.c;
        }

        public void d(float f) {
            this.b = f;
        }

        public void e(float f) {
            this.c = f;
        }

        public void f(LayoutDirection layoutDirection) {
            this.a = layoutDirection;
        }

        @Override // defpackage.fm1
        public float getDensity() {
            return this.b;
        }

        @Override // defpackage.yq3
        public LayoutDirection getLayoutDirection() {
            return this.a;
        }
    }

    public static final class d extends LayoutNode.d {
        final /* synthetic */ gt2 c;

        public static final class a implements sg4 {
            private final /* synthetic */ sg4 a;
            final /* synthetic */ LayoutNodeSubcompositionsState b;
            final /* synthetic */ int c;
            final /* synthetic */ sg4 d;

            public a(sg4 sg4Var, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, sg4 sg4Var2) {
                this.b = layoutNodeSubcompositionsState;
                this.c = i;
                this.d = sg4Var2;
                this.a = sg4Var;
            }

            @Override // defpackage.sg4
            public void e() {
                this.b.e = this.c;
                this.d.e();
                this.b.y();
            }

            @Override // defpackage.sg4
            public Map f() {
                return this.a.f();
            }

            @Override // defpackage.sg4
            public int getHeight() {
                return this.a.getHeight();
            }

            @Override // defpackage.sg4
            public int getWidth() {
                return this.a.getWidth();
            }
        }

        public static final class b implements sg4 {
            private final /* synthetic */ sg4 a;
            final /* synthetic */ LayoutNodeSubcompositionsState b;
            final /* synthetic */ int c;
            final /* synthetic */ sg4 d;

            public b(sg4 sg4Var, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, sg4 sg4Var2) {
                this.b = layoutNodeSubcompositionsState;
                this.c = i;
                this.d = sg4Var2;
                this.a = sg4Var;
            }

            @Override // defpackage.sg4
            public void e() {
                this.b.d = this.c;
                this.d.e();
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.b;
                layoutNodeSubcompositionsState.x(layoutNodeSubcompositionsState.d);
            }

            @Override // defpackage.sg4
            public Map f() {
                return this.a.f();
            }

            @Override // defpackage.sg4
            public int getHeight() {
                return this.a.getHeight();
            }

            @Override // defpackage.sg4
            public int getWidth() {
                return this.a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(gt2 gt2Var, String str) {
            super(str);
            this.c = gt2Var;
        }

        @Override // defpackage.rg4
        public sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
            LayoutNodeSubcompositionsState.this.h.f(fVar.getLayoutDirection());
            LayoutNodeSubcompositionsState.this.h.d(fVar.getDensity());
            LayoutNodeSubcompositionsState.this.h.e(fVar.c1());
            if (fVar.Z() || LayoutNodeSubcompositionsState.this.a.Y() == null) {
                LayoutNodeSubcompositionsState.this.d = 0;
                sg4 sg4Var = (sg4) this.c.invoke(LayoutNodeSubcompositionsState.this.h, fv0.b(j));
                return new b(sg4Var, LayoutNodeSubcompositionsState.this, LayoutNodeSubcompositionsState.this.d, sg4Var);
            }
            LayoutNodeSubcompositionsState.this.e = 0;
            sg4 sg4Var2 = (sg4) this.c.invoke(LayoutNodeSubcompositionsState.this.i, fv0.b(j));
            return new a(sg4Var2, LayoutNodeSubcompositionsState.this, LayoutNodeSubcompositionsState.this.e, sg4Var2);
        }
    }

    public static final class e implements SubcomposeLayoutState.a {
        e() {
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void dispose() {
        }
    }

    public static final class f implements SubcomposeLayoutState.a {
        final /* synthetic */ Object b;

        f(Object obj) {
            this.b = obj;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public int a() {
            List F;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.j.get(this.b);
            if (layoutNode == null || (F = layoutNode.F()) == null) {
                return 0;
            }
            return F.size();
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void b(int i, long j) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.j.get(this.b);
            if (layoutNode == null || !layoutNode.G0()) {
                return;
            }
            int size = layoutNode.F().size();
            if (i < 0 || i >= size) {
                throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
            }
            if (layoutNode.e()) {
                throw new IllegalArgumentException("Pre-measure called on node that is not placed");
            }
            LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.a;
            layoutNode2.n = true;
            wz3.b(layoutNode).n((LayoutNode) layoutNode.F().get(i), j);
            layoutNode2.n = false;
        }

        @Override // androidx.compose.ui.layout.SubcomposeLayoutState.a
        public void dispose() {
            LayoutNodeSubcompositionsState.this.B();
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.j.remove(this.b);
            if (layoutNode != null) {
                if (LayoutNodeSubcompositionsState.this.r <= 0) {
                    throw new IllegalStateException("No pre-composed items to dispose");
                }
                int indexOf = LayoutNodeSubcompositionsState.this.a.K().indexOf(layoutNode);
                if (indexOf < LayoutNodeSubcompositionsState.this.a.K().size() - LayoutNodeSubcompositionsState.this.r) {
                    throw new IllegalStateException("Item is not in pre-composed item range");
                }
                LayoutNodeSubcompositionsState.this.n++;
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                layoutNodeSubcompositionsState.r--;
                int size = (LayoutNodeSubcompositionsState.this.a.K().size() - LayoutNodeSubcompositionsState.this.r) - LayoutNodeSubcompositionsState.this.n;
                LayoutNodeSubcompositionsState.this.D(indexOf, size, 1);
                LayoutNodeSubcompositionsState.this.x(size);
            }
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, m mVar) {
        this.a = layoutNode;
        this.c = mVar;
    }

    private final Object A(int i) {
        Object obj = this.f.get((LayoutNode) this.a.K().get(i));
        zq3.e(obj);
        return ((a) obj).f();
    }

    private final void C(boolean z) {
        SubcomposeLayoutKt.a aVar;
        this.r = 0;
        this.j.clear();
        int size = this.a.K().size();
        if (this.n != size) {
            this.n = size;
            androidx.compose.runtime.snapshots.e c2 = androidx.compose.runtime.snapshots.e.e.c();
            try {
                androidx.compose.runtime.snapshots.e l = c2.l();
                for (int i = 0; i < size; i++) {
                    try {
                        LayoutNode layoutNode = (LayoutNode) this.a.K().get(i);
                        a aVar2 = (a) this.f.get(layoutNode);
                        if (aVar2 != null && aVar2.a()) {
                            H(layoutNode);
                            if (z) {
                                i17 b2 = aVar2.b();
                                if (b2 != null) {
                                    b2.deactivate();
                                }
                                aVar2.h(b0.e(Boolean.FALSE, null, 2, null));
                            } else {
                                aVar2.g(false);
                            }
                            aVar = SubcomposeLayoutKt.a;
                            aVar2.m(aVar);
                        }
                    } catch (Throwable th) {
                        c2.s(l);
                        throw th;
                    }
                }
                ww8 ww8Var = ww8.a;
                c2.s(l);
                c2.d();
                this.g.clear();
            } catch (Throwable th2) {
                c2.d();
                throw th2;
            }
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i, int i2, int i3) {
        LayoutNode layoutNode = this.a;
        layoutNode.n = true;
        this.a.T0(i, i2, i3);
        layoutNode.n = false;
    }

    static /* synthetic */ void E(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.D(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List F(Object obj, gt2 gt2Var) {
        if (this.m.q() < this.e) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        int q = this.m.q();
        int i = this.e;
        if (q == i) {
            this.m.b(obj);
        } else {
            this.m.B(i, obj);
        }
        this.e++;
        if (!this.j.containsKey(obj)) {
            this.l.put(obj, G(obj, gt2Var));
            if (this.a.U() == LayoutNode.LayoutState.LayingOut) {
                this.a.e1(true);
            } else {
                LayoutNode.h1(this.a, true, false, 2, null);
            }
        }
        LayoutNode layoutNode = (LayoutNode) this.j.get(obj);
        if (layoutNode == null) {
            return kotlin.collections.i.l();
        }
        List h1 = layoutNode.a0().h1();
        int size = h1.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LayoutNodeLayoutDelegate.MeasurePassDelegate) h1.get(i2)).F1();
        }
        return h1;
    }

    private final void H(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate.MeasurePassDelegate a0 = layoutNode.a0();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        a0.R1(usageByParent);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate X = layoutNode.X();
        if (X != null) {
            X.L1(usageByParent);
        }
    }

    private final void L(LayoutNode layoutNode, final a aVar) {
        androidx.compose.runtime.snapshots.e c2 = androidx.compose.runtime.snapshots.e.e.c();
        try {
            androidx.compose.runtime.snapshots.e l = c2.l();
            try {
                LayoutNode layoutNode2 = this.a;
                layoutNode2.n = true;
                final gt2 c3 = aVar.c();
                i17 b2 = aVar.b();
                androidx.compose.runtime.c cVar = this.b;
                if (cVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                aVar.i(N(b2, layoutNode, aVar.e(), cVar, zr0.c(-1750409193, true, new gt2() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) == 2 && composer.i()) {
                            composer.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-1750409193, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
                        }
                        boolean a2 = LayoutNodeSubcompositionsState.a.this.a();
                        gt2 gt2Var = c3;
                        composer.J(207, Boolean.valueOf(a2));
                        boolean a3 = composer.a(a2);
                        if (a2) {
                            gt2Var.invoke(composer, 0);
                        } else {
                            composer.g(a3);
                        }
                        composer.y();
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                })));
                aVar.l(false);
                layoutNode2.n = false;
                ww8 ww8Var = ww8.a;
            } finally {
                c2.s(l);
            }
        } finally {
            c2.d();
        }
    }

    private final void M(LayoutNode layoutNode, Object obj, gt2 gt2Var) {
        HashMap hashMap = this.f;
        Object obj2 = hashMap.get(layoutNode);
        if (obj2 == null) {
            obj2 = new a(obj, ComposableSingletons$SubcomposeLayoutKt.a.a(), null, 4, null);
            hashMap.put(layoutNode, obj2);
        }
        a aVar = (a) obj2;
        i17 b2 = aVar.b();
        boolean q = b2 != null ? b2.q() : true;
        if (aVar.c() != gt2Var || q || aVar.d()) {
            aVar.j(gt2Var);
            L(layoutNode, aVar);
            aVar.k(false);
        }
    }

    private final i17 N(i17 i17Var, LayoutNode layoutNode, boolean z, androidx.compose.runtime.c cVar, gt2 gt2Var) {
        if (i17Var == null || i17Var.isDisposed()) {
            i17Var = y.a(layoutNode, cVar);
        }
        if (z) {
            i17Var.s(gt2Var);
        } else {
            i17Var.d(gt2Var);
        }
        return i17Var;
    }

    private final LayoutNode O(Object obj) {
        int i;
        SubcomposeLayoutKt.a aVar;
        if (this.n == 0) {
            return null;
        }
        int size = this.a.K().size() - this.r;
        int i2 = size - this.n;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (zq3.c(A(i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object obj2 = this.f.get((LayoutNode) this.a.K().get(i3));
                zq3.e(obj2);
                a aVar2 = (a) obj2;
                Object f2 = aVar2.f();
                aVar = SubcomposeLayoutKt.a;
                if (f2 == aVar || this.c.b(obj, aVar2.f())) {
                    aVar2.m(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            D(i4, i2, 1);
        }
        this.n--;
        LayoutNode layoutNode = (LayoutNode) this.a.K().get(i2);
        Object obj3 = this.f.get(layoutNode);
        zq3.e(obj3);
        a aVar3 = (a) obj3;
        aVar3.h(b0.e(Boolean.TRUE, null, 2, null));
        aVar3.l(true);
        aVar3.k(true);
        return layoutNode;
    }

    private final LayoutNode v(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.a;
        layoutNode2.n = true;
        this.a.x0(i, layoutNode);
        layoutNode2.n = false;
        return layoutNode;
    }

    private final void w() {
        LayoutNode layoutNode = this.a;
        layoutNode.n = true;
        Iterator it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            i17 b2 = ((a) it2.next()).b();
            if (b2 != null) {
                b2.dispose();
            }
        }
        this.a.b1();
        layoutNode.n = false;
        this.f.clear();
        this.g.clear();
        this.r = 0;
        this.n = 0;
        this.j.clear();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        kotlin.collections.i.G(this.l.entrySet(), new ss2() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Map.Entry entry) {
                vy4 vy4Var;
                boolean z;
                Object key = entry.getKey();
                SubcomposeLayoutState.a aVar = (SubcomposeLayoutState.a) entry.getValue();
                vy4Var = LayoutNodeSubcompositionsState.this.m;
                int r = vy4Var.r(key);
                if (r < 0 || r >= LayoutNodeSubcompositionsState.this.e) {
                    aVar.dispose();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final void B() {
        int size = this.a.K().size();
        if (this.f.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.n) - this.r >= 0) {
            if (this.j.size() == this.r) {
                return;
            }
            throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.r + ". Map size " + this.j.size()).toString());
        }
        throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.n + ". Precomposed children " + this.r).toString());
    }

    public final SubcomposeLayoutState.a G(Object obj, gt2 gt2Var) {
        if (!this.a.G0()) {
            return new e();
        }
        B();
        if (!this.g.containsKey(obj)) {
            this.l.remove(obj);
            HashMap hashMap = this.j;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = O(obj);
                if (obj2 != null) {
                    D(this.a.K().indexOf(obj2), this.a.K().size(), 1);
                    this.r++;
                } else {
                    obj2 = v(this.a.K().size());
                    this.r++;
                }
                hashMap.put(obj, obj2);
            }
            M((LayoutNode) obj2, obj, gt2Var);
        }
        return new f(obj);
    }

    public final void I(androidx.compose.runtime.c cVar) {
        this.b = cVar;
    }

    public final void J(m mVar) {
        if (this.c != mVar) {
            this.c = mVar;
            C(false);
            LayoutNode.l1(this.a, false, false, 3, null);
        }
    }

    public final List K(Object obj, gt2 gt2Var) {
        B();
        LayoutNode.LayoutState U = this.a.U();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (U != layoutState && U != LayoutNode.LayoutState.LayingOut && U != LayoutNode.LayoutState.LookaheadMeasuring && U != LayoutNode.LayoutState.LookaheadLayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        HashMap hashMap = this.g;
        Object obj2 = hashMap.get(obj);
        if (obj2 == null) {
            obj2 = (LayoutNode) this.j.remove(obj);
            if (obj2 != null) {
                int i = this.r;
                if (i <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.r = i - 1;
            } else {
                obj2 = O(obj);
                if (obj2 == null) {
                    obj2 = v(this.d);
                }
            }
            hashMap.put(obj, obj2);
        }
        LayoutNode layoutNode = (LayoutNode) obj2;
        if (kotlin.collections.i.n0(this.a.K(), this.d) != layoutNode) {
            int indexOf = this.a.K().indexOf(layoutNode);
            int i2 = this.d;
            if (indexOf < i2) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i2 != indexOf) {
                E(this, indexOf, i2, 0, 4, null);
            }
        }
        this.d++;
        M(layoutNode, obj, gt2Var);
        return (U == layoutState || U == LayoutNode.LayoutState.LayingOut) ? layoutNode.E() : layoutNode.D();
    }

    @Override // defpackage.es0
    public void b() {
        w();
    }

    @Override // defpackage.es0
    public void d() {
        C(true);
    }

    @Override // defpackage.es0
    public void g() {
        C(false);
    }

    public final rg4 u(gt2 gt2Var) {
        return new d(gt2Var, this.s);
    }

    public final void x(int i) {
        boolean z = false;
        this.n = 0;
        int size = (this.a.K().size() - this.r) - 1;
        if (i <= size) {
            this.k.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.k.add(A(i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(this.k);
            androidx.compose.runtime.snapshots.e c2 = androidx.compose.runtime.snapshots.e.e.c();
            try {
                androidx.compose.runtime.snapshots.e l = c2.l();
                boolean z2 = false;
                while (size >= i) {
                    try {
                        LayoutNode layoutNode = (LayoutNode) this.a.K().get(size);
                        Object obj = this.f.get(layoutNode);
                        zq3.e(obj);
                        a aVar = (a) obj;
                        Object f2 = aVar.f();
                        if (this.k.contains(f2)) {
                            this.n++;
                            if (aVar.a()) {
                                H(layoutNode);
                                aVar.g(false);
                                z2 = true;
                            }
                        } else {
                            LayoutNode layoutNode2 = this.a;
                            layoutNode2.n = true;
                            this.f.remove(layoutNode);
                            i17 b2 = aVar.b();
                            if (b2 != null) {
                                b2.dispose();
                            }
                            this.a.c1(size, 1);
                            layoutNode2.n = false;
                        }
                        this.g.remove(f2);
                        size--;
                    } catch (Throwable th) {
                        c2.s(l);
                        throw th;
                    }
                }
                ww8 ww8Var = ww8.a;
                c2.s(l);
                c2.d();
                z = z2;
            } catch (Throwable th2) {
                c2.d();
                throw th2;
            }
        }
        if (z) {
            androidx.compose.runtime.snapshots.e.e.k();
        }
        B();
    }

    public final void z() {
        if (this.n != this.a.K().size()) {
            Iterator it2 = this.f.entrySet().iterator();
            while (it2.hasNext()) {
                ((a) ((Map.Entry) it2.next()).getValue()).k(true);
            }
            if (this.a.b0()) {
                return;
            }
            LayoutNode.l1(this.a, false, false, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private Object a;
        private gt2 b;
        private i17 c;
        private boolean d;
        private boolean e;
        private sy4 f;

        public a(Object obj, gt2 gt2Var, i17 i17Var) {
            this.a = obj;
            this.b = gt2Var;
            this.c = i17Var;
            this.f = b0.e(Boolean.TRUE, null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.f.getValue()).booleanValue();
        }

        public final i17 b() {
            return this.c;
        }

        public final gt2 c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        public final boolean e() {
            return this.e;
        }

        public final Object f() {
            return this.a;
        }

        public final void g(boolean z) {
            this.f.setValue(Boolean.valueOf(z));
        }

        public final void h(sy4 sy4Var) {
            this.f = sy4Var;
        }

        public final void i(i17 i17Var) {
            this.c = i17Var;
        }

        public final void j(gt2 gt2Var) {
            this.b = gt2Var;
        }

        public final void k(boolean z) {
            this.d = z;
        }

        public final void l(boolean z) {
            this.e = z;
        }

        public final void m(Object obj) {
            this.a = obj;
        }

        public /* synthetic */ a(Object obj, gt2 gt2Var, i17 i17Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, gt2Var, (i & 4) != 0 ? null : i17Var);
        }
    }
}
