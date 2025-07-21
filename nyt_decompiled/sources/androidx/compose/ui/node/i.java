package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cz3;
import defpackage.fb;
import defpackage.gb;
import defpackage.hn3;
import defpackage.in3;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.tb4;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i extends h implements qg4 {
    private final NodeCoordinator i;
    private Map k;
    private sg4 m;
    private long j = vm3.b.a();
    private final tb4 l = new tb4(this);
    private final Map n = new LinkedHashMap();

    public i(NodeCoordinator nodeCoordinator) {
        this.i = nodeCoordinator;
    }

    private final void L1(long j) {
        if (vm3.i(b1(), j)) {
            return;
        }
        O1(j);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate E = I1().S().E();
        if (E != null) {
            E.D1();
        }
        g1(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(sg4 sg4Var) {
        ww8 ww8Var;
        Map map;
        if (sg4Var != null) {
            P0(in3.a(sg4Var.getWidth(), sg4Var.getHeight()));
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            P0(hn3.b.a());
        }
        if (!zq3.c(this.m, sg4Var) && sg4Var != null && ((((map = this.k) != null && !map.isEmpty()) || !sg4Var.f().isEmpty()) && !zq3.c(sg4Var.f(), this.k))) {
            D1().f().m();
            Map map2 = this.k;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.k = map2;
            }
            map2.clear();
            map2.putAll(sg4Var.f());
        }
        this.m = sg4Var;
    }

    public gb D1() {
        gb B = this.i.f2().S().B();
        zq3.e(B);
        return B;
    }

    public final int E1(fb fbVar) {
        Integer num = (Integer) this.n.get(fbVar);
        return num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
    }

    protected final Map F1() {
        return this.n;
    }

    public cz3 G1() {
        return this.l;
    }

    public abstract int H(int i);

    public final NodeCoordinator H1() {
        return this.i;
    }

    public LayoutNode I1() {
        return this.i.f2();
    }

    public final tb4 J1() {
        return this.l;
    }

    protected void K1() {
        V0().e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.l
    public final void L0(long j, float f, ss2 ss2Var) {
        L1(j);
        if (p1()) {
            return;
        }
        K1();
    }

    public final void M1(long j) {
        long u0 = u0();
        L1(wm3.a(vm3.j(j) + vm3.j(u0), vm3.k(j) + vm3.k(u0)));
    }

    public final long N1(i iVar) {
        long a = vm3.b.a();
        while (!zq3.c(this, iVar)) {
            long b1 = this.b1();
            a = wm3.a(vm3.j(a) + vm3.j(b1), vm3.k(a) + vm3.k(b1));
            NodeCoordinator m2 = this.i.m2();
            zq3.e(m2);
            this = m2.g2();
            zq3.e(this);
        }
        return a;
    }

    public void O1(long j) {
        this.j = j;
    }

    public abstract int S(int i);

    @Override // androidx.compose.ui.node.h
    public h S0() {
        NodeCoordinator l2 = this.i.l2();
        if (l2 != null) {
            return l2.g2();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.h
    public boolean U0() {
        return this.m != null;
    }

    public abstract int V(int i);

    @Override // androidx.compose.ui.node.h
    public sg4 V0() {
        sg4 sg4Var = this.m;
        if (sg4Var != null) {
            return sg4Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.h, defpackage.yq3
    public boolean Z() {
        return true;
    }

    @Override // androidx.compose.ui.node.h
    public long b1() {
        return this.j;
    }

    @Override // defpackage.an2
    public float c1() {
        return this.i.c1();
    }

    @Override // defpackage.tg4, defpackage.xq3
    public Object d() {
        return this.i.d();
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.i.getDensity();
    }

    @Override // defpackage.yq3
    public LayoutDirection getLayoutDirection() {
        return this.i.getLayoutDirection();
    }

    public abstract int i(int i);

    @Override // androidx.compose.ui.node.h
    public void u1() {
        L0(b1(), 0.0f, null);
    }
}
