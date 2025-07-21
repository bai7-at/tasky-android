package androidx.compose.foundation.gestures;

import defpackage.dy4;
import defpackage.it2;
import defpackage.ov4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vu1;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class DraggableElement extends ov4 {
    private final vu1 b;
    private final ss2 c;
    private final Orientation d;
    private final boolean e;
    private final dy4 f;
    private final qs2 g;
    private final it2 h;
    private final it2 i;
    private final boolean j;

    public DraggableElement(vu1 vu1Var, ss2 ss2Var, Orientation orientation, boolean z, dy4 dy4Var, qs2 qs2Var, it2 it2Var, it2 it2Var2, boolean z2) {
        this.b = vu1Var;
        this.c = ss2Var;
        this.d = orientation;
        this.e = z;
        this.f = dy4Var;
        this.g = qs2Var;
        this.h = it2Var;
        this.i = it2Var2;
        this.j = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return zq3.c(this.b, draggableElement.b) && zq3.c(this.c, draggableElement.c) && this.d == draggableElement.d && this.e == draggableElement.e && zq3.c(this.f, draggableElement.f) && zq3.c(this.g, draggableElement.g) && zq3.c(this.h, draggableElement.h) && zq3.c(this.i, draggableElement.i) && this.j == draggableElement.j;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = ((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31;
        dy4 dy4Var = this.f;
        return ((((((((hashCode + (dy4Var != null ? dy4Var.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.j);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public DraggableNode l() {
        return new DraggableNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(DraggableNode draggableNode) {
        draggableNode.R2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
