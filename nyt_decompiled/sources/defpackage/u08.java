package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u08 extends State {
    private final fm1 g;
    private long h;
    public LayoutDirection i;
    private final List j;
    private boolean k;
    private final Set l;

    public u08(fm1 fm1Var) {
        zq3.h(fm1Var, "density");
        this.g = fm1Var;
        this.h = iv0.b(0, 0, 0, 0, 15, null);
        this.j = new ArrayList();
        this.k = true;
        this.l = new LinkedHashSet();
    }

    @Override // androidx.constraintlayout.core.state.State
    public int c(Object obj) {
        return obj instanceof bu1 ? this.g.l0(((bu1) obj).n()) : super.c(obj);
    }

    @Override // androidx.constraintlayout.core.state.State
    public void h() {
        ConstraintWidget b;
        HashMap hashMap = this.a;
        zq3.g(hashMap, "mReferences");
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ut6 ut6Var = (ut6) ((Map.Entry) it2.next()).getValue();
            if (ut6Var != null && (b = ut6Var.b()) != null) {
                b.v0();
            }
        }
        this.a.clear();
        HashMap hashMap2 = this.a;
        zq3.g(hashMap2, "mReferences");
        hashMap2.put(State.f, this.d);
        this.j.clear();
        this.k = true;
        super.h();
    }

    public final LayoutDirection m() {
        LayoutDirection layoutDirection = this.i;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        zq3.z("layoutDirection");
        throw null;
    }

    public final long n() {
        return this.h;
    }

    public final boolean o(ConstraintWidget constraintWidget) {
        zq3.h(constraintWidget, "constraintWidget");
        if (this.k) {
            this.l.clear();
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ut6 ut6Var = (ut6) this.a.get(it2.next());
                ConstraintWidget b = ut6Var == null ? null : ut6Var.b();
                if (b != null) {
                    this.l.add(b);
                }
            }
            this.k = false;
        }
        return this.l.contains(constraintWidget);
    }

    public final void p(LayoutDirection layoutDirection) {
        zq3.h(layoutDirection, "<set-?>");
        this.i = layoutDirection;
    }

    public final void q(long j) {
        this.h = j;
    }
}
