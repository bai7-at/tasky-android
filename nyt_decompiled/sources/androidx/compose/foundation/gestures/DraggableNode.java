package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.a;
import defpackage.by0;
import defpackage.dy4;
import defpackage.e1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.mx5;
import defpackage.qs2;
import defpackage.qu1;
import defpackage.ss2;
import defpackage.vu1;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class DraggableNode extends AbstractDraggableNode {
    private vu1 Y;
    private Orientation Z;
    private qu1 e0;
    private final a f0;
    private final mx5 g0;

    public static final class a implements e1 {
        a() {
        }

        @Override // defpackage.e1
        public void a(long j) {
            float m;
            qu1 P2 = DraggableNode.this.P2();
            m = DraggableKt.m(j, DraggableNode.this.Z);
            P2.c(m);
        }
    }

    public DraggableNode(vu1 vu1Var, ss2 ss2Var, Orientation orientation, boolean z, dy4 dy4Var, qs2 qs2Var, it2 it2Var, it2 it2Var2, boolean z2) {
        super(ss2Var, z, dy4Var, qs2Var, it2Var, it2Var2, z2);
        qu1 qu1Var;
        this.Y = vu1Var;
        this.Z = orientation;
        qu1Var = DraggableKt.a;
        this.e0 = qu1Var;
        this.f0 = new a();
        this.g0 = DragGestureDetectorKt.j(this.Z);
    }

    public final qu1 P2() {
        return this.e0;
    }

    public final void Q2(qu1 qu1Var) {
        this.e0 = qu1Var;
    }

    public final void R2(vu1 vu1Var, ss2 ss2Var, Orientation orientation, boolean z, dy4 dy4Var, qs2 qs2Var, it2 it2Var, it2 it2Var2, boolean z2) {
        boolean z3;
        boolean z4 = true;
        if (zq3.c(this.Y, vu1Var)) {
            z3 = false;
        } else {
            this.Y = vu1Var;
            z3 = true;
        }
        F2(ss2Var);
        if (this.Z != orientation) {
            this.Z = orientation;
            z3 = true;
        }
        if (w2() != z) {
            G2(z);
            if (!z) {
                s2();
            }
            z3 = true;
        }
        if (!zq3.c(x2(), dy4Var)) {
            s2();
            H2(dy4Var);
        }
        L2(qs2Var);
        I2(it2Var);
        J2(it2Var2);
        if (A2() != z2) {
            K2(z2);
        } else {
            z4 = z3;
        }
        if (z4) {
            z2().z0();
        }
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public Object t2(gt2 gt2Var, by0 by0Var) {
        Object b = this.Y.b(MutatePriority.UserInput, new DraggableNode$drag$2(this, gt2Var, null), by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public Object u2(e1 e1Var, a.b bVar, by0 by0Var) {
        e1Var.a(bVar.a());
        return ww8.a;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public mx5 y2() {
        return this.g0;
    }
}
