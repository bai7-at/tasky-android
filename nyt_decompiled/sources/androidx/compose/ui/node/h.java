package androidx.compose.ui.node;

import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.l;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fb;
import defpackage.gb;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h extends androidx.compose.ui.layout.l implements androidx.compose.ui.layout.f {
    private boolean f;
    private boolean g;
    private final l.a h = PlaceableKt.a(this);

    public static final class a implements sg4 {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ Map c;
        final /* synthetic */ ss2 d;
        final /* synthetic */ h e;

        a(int i, int i2, Map map, ss2 ss2Var, h hVar) {
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = ss2Var;
            this.e = hVar;
        }

        @Override // defpackage.sg4
        public void e() {
            this.d.invoke(this.e.a1());
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

    @Override // androidx.compose.ui.layout.f
    public sg4 P(int i, int i2, Map map, ss2 ss2Var) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            return new a(i, i2, map, ss2Var, this);
        }
        throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public abstract int R0(fb fbVar);

    public abstract h S0();

    public abstract boolean U0();

    public abstract sg4 V0();

    @Override // defpackage.yq3
    public boolean Z() {
        return false;
    }

    public final l.a a1() {
        return this.h;
    }

    public abstract long b1();

    @Override // defpackage.tg4
    public final int c0(fb fbVar) {
        int R0;
        return (U0() && (R0 = R0(fbVar)) != Integer.MIN_VALUE) ? R0 + vm3.k(u0()) : RecyclerView.UNDEFINED_DURATION;
    }

    protected final void g1(NodeCoordinator nodeCoordinator) {
        AlignmentLines f;
        NodeCoordinator l2 = nodeCoordinator.l2();
        if (!zq3.c(l2 != null ? l2.f2() : null, nodeCoordinator.f2())) {
            nodeCoordinator.a2().f().m();
            return;
        }
        gb l = nodeCoordinator.a2().l();
        if (l == null || (f = l.f()) == null) {
            return;
        }
        f.m();
    }

    public final boolean h1() {
        return this.g;
    }

    public final boolean p1() {
        return this.f;
    }

    public abstract void u1();

    public final void w1(boolean z) {
        this.g = z;
    }

    public final void x1(boolean z) {
        this.f = z;
    }
}
