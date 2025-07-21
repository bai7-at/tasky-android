package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import defpackage.lm1;
import defpackage.y73;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    private androidx.constraintlayout.core.widgets.d a;
    private androidx.constraintlayout.core.widgets.d d;
    private boolean b = true;
    private boolean c = true;
    private ArrayList e = new ArrayList();
    private ArrayList f = new ArrayList();
    private b.InterfaceC0071b g = null;
    private b.a h = new b.a();
    ArrayList i = new ArrayList();

    public d(androidx.constraintlayout.core.widgets.d dVar) {
        this.a = dVar;
        this.d = dVar;
    }

    private void a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList arrayList, k kVar) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            if (widgetRun == dVar.e || widgetRun == dVar.f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(widgetRun, i2);
                arrayList.add(kVar);
            }
            widgetRun.c = kVar;
            kVar.a(widgetRun);
            for (lm1 lm1Var : widgetRun.h.k) {
                if (lm1Var instanceof DependencyNode) {
                    a((DependencyNode) lm1Var, i, 0, dependencyNode2, arrayList, kVar);
                }
            }
            for (lm1 lm1Var2 : widgetRun.i.k) {
                if (lm1Var2 instanceof DependencyNode) {
                    a((DependencyNode) lm1Var2, i, 1, dependencyNode2, arrayList, kVar);
                }
            }
            if (i == 1 && (widgetRun instanceof l)) {
                for (lm1 lm1Var3 : ((l) widgetRun).k.k) {
                    if (lm1Var3 instanceof DependencyNode) {
                        a((DependencyNode) lm1Var3, i, 2, dependencyNode2, arrayList, kVar);
                    }
                }
            }
            for (DependencyNode dependencyNode3 : widgetRun.h.l) {
                if (dependencyNode3 == dependencyNode2) {
                    kVar.b = true;
                }
                a(dependencyNode3, i, 0, dependencyNode2, arrayList, kVar);
            }
            for (DependencyNode dependencyNode4 : widgetRun.i.l) {
                if (dependencyNode4 == dependencyNode2) {
                    kVar.b = true;
                }
                a(dependencyNode4, i, 1, dependencyNode2, arrayList, kVar);
            }
            if (i == 1 && (widgetRun instanceof l)) {
                Iterator it2 = ((l) widgetRun).k.l.iterator();
                while (it2.hasNext()) {
                    a((DependencyNode) it2.next(), i, 2, dependencyNode2, arrayList, kVar);
                }
            }
        }
    }

    private boolean b(androidx.constraintlayout.core.widgets.d dVar) {
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        Iterator it2 = dVar.L0.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.Z;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (constraintWidget.X() == 8) {
                constraintWidget.a = true;
            } else {
                if (constraintWidget.B < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.w = 2;
                }
                if (constraintWidget.E < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.x = 2;
                }
                if (constraintWidget.v() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.w = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.x = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (constraintWidget.w == 0) {
                            constraintWidget.w = 3;
                        }
                        if (constraintWidget.x == 0) {
                            constraintWidget.x = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && constraintWidget.w == 1 && (constraintWidget.O.f == null || constraintWidget.Q.f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = dimensionBehaviour5;
                if (dimensionBehaviour6 == dimensionBehaviour8 && constraintWidget.x == 1 && (constraintWidget.P.f == null || constraintWidget.R.f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                j jVar = constraintWidget.e;
                jVar.d = dimensionBehaviour9;
                int i3 = constraintWidget.w;
                jVar.a = i3;
                l lVar = constraintWidget.f;
                lVar.d = dimensionBehaviour10;
                int i4 = constraintWidget.x;
                lVar.a = i4;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour9 == dimensionBehaviour11 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour10 == dimensionBehaviour11 || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int Y = constraintWidget.Y();
                    if (dimensionBehaviour9 == dimensionBehaviour11) {
                        i = (dVar.Y() - constraintWidget.O.g) - constraintWidget.Q.g;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i = Y;
                        dimensionBehaviour = dimensionBehaviour9;
                    }
                    int x = constraintWidget.x();
                    if (dimensionBehaviour10 == dimensionBehaviour11) {
                        i2 = (dVar.x() - constraintWidget.P.g) - constraintWidget.R.g;
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i2 = x;
                        dimensionBehaviour2 = dimensionBehaviour10;
                    }
                    l(constraintWidget, dimensionBehaviour, i, dimensionBehaviour2, i2);
                    constraintWidget.e.e.d(constraintWidget.Y());
                    constraintWidget.f.e.d(constraintWidget.x());
                    constraintWidget.a = true;
                } else {
                    if (dimensionBehaviour9 == dimensionBehaviour8 && (dimensionBehaviour10 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour10 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i3 == 3) {
                            if (dimensionBehaviour10 == dimensionBehaviour4) {
                                l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                            }
                            int x2 = constraintWidget.x();
                            int i5 = (int) ((x2 * constraintWidget.d0) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                            l(constraintWidget, dimensionBehaviour12, i5, dimensionBehaviour12, x2);
                            constraintWidget.e.e.d(constraintWidget.Y());
                            constraintWidget.f.e.d(constraintWidget.x());
                            constraintWidget.a = true;
                        } else if (i3 == 1) {
                            l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                            constraintWidget.e.e.m = constraintWidget.Y();
                        } else if (i3 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dVar.Z[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour13 == dimensionBehaviour14 || dimensionBehaviour13 == dimensionBehaviour11) {
                                l(constraintWidget, dimensionBehaviour14, (int) ((constraintWidget.B * dVar.Y()) + 0.5f), dimensionBehaviour10, constraintWidget.x());
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.x());
                                constraintWidget.a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.W;
                            if (constraintAnchorArr[0].f == null || constraintAnchorArr[1].f == null) {
                                l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour10, 0);
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.x());
                                constraintWidget.a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour10 == dimensionBehaviour8 && (dimensionBehaviour9 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i4 == 3) {
                            if (dimensionBehaviour9 == dimensionBehaviour3) {
                                l(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int Y2 = constraintWidget.Y();
                            float f = constraintWidget.d0;
                            if (constraintWidget.w() == -1) {
                                f = 1.0f / f;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            l(constraintWidget, dimensionBehaviour15, Y2, dimensionBehaviour15, (int) ((Y2 * f) + 0.5f));
                            constraintWidget.e.e.d(constraintWidget.Y());
                            constraintWidget.f.e.d(constraintWidget.x());
                            constraintWidget.a = true;
                        } else if (i4 == 1) {
                            l(constraintWidget, dimensionBehaviour9, 0, dimensionBehaviour3, 0);
                            constraintWidget.f.e.m = constraintWidget.x();
                        } else if (i4 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dVar.Z[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour17 || dimensionBehaviour16 == dimensionBehaviour11) {
                                l(constraintWidget, dimensionBehaviour9, constraintWidget.Y(), dimensionBehaviour17, (int) ((constraintWidget.E * dVar.x()) + 0.5f));
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.x());
                                constraintWidget.a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.W;
                            if (constraintAnchorArr2[2].f == null || constraintAnchorArr2[3].f == null) {
                                l(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour10, 0);
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.x());
                                constraintWidget.a = true;
                            }
                        }
                    }
                    if (dimensionBehaviour9 == dimensionBehaviour8 && dimensionBehaviour10 == dimensionBehaviour8) {
                        if (i3 == 1 || i4 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            l(constraintWidget, dimensionBehaviour18, 0, dimensionBehaviour18, 0);
                            constraintWidget.e.e.m = constraintWidget.Y();
                            constraintWidget.f.e.m = constraintWidget.x();
                        } else if (i4 == 2 && i3 == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.Z;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviourArr2[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour19 == dimensionBehaviour20 && dimensionBehaviourArr2[1] == dimensionBehaviour20) {
                                l(constraintWidget, dimensionBehaviour20, (int) ((constraintWidget.B * dVar.Y()) + 0.5f), dimensionBehaviour20, (int) ((constraintWidget.E * dVar.x()) + 0.5f));
                                constraintWidget.e.e.d(constraintWidget.Y());
                                constraintWidget.f.e.d(constraintWidget.x());
                                constraintWidget.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.core.widgets.d dVar, int i) {
        int size = this.i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((k) this.i.get(i2)).b(dVar, i));
        }
        return (int) j;
    }

    private void i(WidgetRun widgetRun, int i, ArrayList arrayList) {
        for (lm1 lm1Var : widgetRun.h.k) {
            if (lm1Var instanceof DependencyNode) {
                a((DependencyNode) lm1Var, i, 0, widgetRun.i, arrayList, null);
            } else if (lm1Var instanceof WidgetRun) {
                a(((WidgetRun) lm1Var).h, i, 0, widgetRun.i, arrayList, null);
            }
        }
        for (lm1 lm1Var2 : widgetRun.i.k) {
            if (lm1Var2 instanceof DependencyNode) {
                a((DependencyNode) lm1Var2, i, 1, widgetRun.h, arrayList, null);
            } else if (lm1Var2 instanceof WidgetRun) {
                a(((WidgetRun) lm1Var2).i, i, 1, widgetRun.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (lm1 lm1Var3 : ((l) widgetRun).k.k) {
                if (lm1Var3 instanceof DependencyNode) {
                    a((DependencyNode) lm1Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.a aVar = this.h;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(constraintWidget, aVar);
        constraintWidget.m1(this.h.e);
        constraintWidget.N0(this.h.f);
        constraintWidget.M0(this.h.h);
        constraintWidget.C0(this.h.g);
    }

    public void c() {
        d(this.e);
        this.i.clear();
        k.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        Iterator it2 = this.d.L0.iterator();
        HashSet hashSet = null;
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new h(constraintWidget));
            } else {
                if (constraintWidget.k0()) {
                    if (constraintWidget.c == null) {
                        constraintWidget.c = new c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.c);
                } else {
                    arrayList.add(constraintWidget.e);
                }
                if (constraintWidget.m0()) {
                    if (constraintWidget.d == null) {
                        constraintWidget.d = new c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.d);
                } else {
                    arrayList.add(constraintWidget.f);
                }
                if (constraintWidget instanceof y73) {
                    arrayList.add(new i(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((WidgetRun) it3.next()).f();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it4.next();
            if (widgetRun.b != this.d) {
                widgetRun.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.b || this.c) {
            Iterator it2 = this.a.L0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
                constraintWidget.n();
                constraintWidget.a = false;
                constraintWidget.e.r();
                constraintWidget.f.q();
            }
            this.a.n();
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            dVar.a = false;
            dVar.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.o1(0);
        this.a.p1(0);
        ConstraintWidget.DimensionBehaviour u = this.a.u(0);
        ConstraintWidget.DimensionBehaviour u2 = this.a.u(1);
        if (this.b) {
            c();
        }
        int Z = this.a.Z();
        int a0 = this.a.a0();
        this.a.e.h.d(Z);
        this.a.f.h.d(a0);
        m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (u == dimensionBehaviour || u2 == dimensionBehaviour) {
            if (z) {
                Iterator it3 = this.e.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (!((WidgetRun) it3.next()).m()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && u == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.a.R0(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                dVar2.m1(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                dVar3.e.e.d(dVar3.Y());
            }
            if (z && u2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.a.i1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.a;
                dVar4.N0(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.a;
                dVar5.f.e.d(dVar5.x());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.Z[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int Y = dVar6.Y() + Z;
            this.a.e.i.d(Y);
            this.a.e.e.d(Y - Z);
            m();
            androidx.constraintlayout.core.widgets.d dVar7 = this.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.Z[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int x = dVar7.x() + a0;
                this.a.f.i.d(x);
                this.a.f.e.d(x - a0);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it4 = this.e.iterator();
        while (it4.hasNext()) {
            WidgetRun widgetRun = (WidgetRun) it4.next();
            if (widgetRun.b != this.a || widgetRun.g) {
                widgetRun.e();
            }
        }
        Iterator it5 = this.e.iterator();
        while (true) {
            if (!it5.hasNext()) {
                z3 = true;
                break;
            }
            WidgetRun widgetRun2 = (WidgetRun) it5.next();
            if (z2 || widgetRun2.b != this.a) {
                if (!widgetRun2.h.j) {
                    break;
                }
                if (!widgetRun2.i.j) {
                    if (!(widgetRun2 instanceof h)) {
                        break;
                    }
                }
                if (!widgetRun2.e.j && !(widgetRun2 instanceof c) && !(widgetRun2 instanceof h)) {
                    break;
                }
            }
        }
        this.a.R0(u);
        this.a.i1(u2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            Iterator it2 = this.a.L0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
                constraintWidget.n();
                constraintWidget.a = false;
                j jVar = constraintWidget.e;
                jVar.e.j = false;
                jVar.g = false;
                jVar.r();
                l lVar = constraintWidget.f;
                lVar.e.j = false;
                lVar.g = false;
                lVar.q();
            }
            this.a.n();
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            dVar.a = false;
            j jVar2 = dVar.e;
            jVar2.e.j = false;
            jVar2.g = false;
            jVar2.r();
            l lVar2 = this.a.f;
            lVar2.e.j = false;
            lVar2.g = false;
            lVar2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.o1(0);
        this.a.p1(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour u = this.a.u(0);
        ConstraintWidget.DimensionBehaviour u2 = this.a.u(1);
        int Z = this.a.Z();
        int a0 = this.a.a0();
        if (z && (u == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || u2 == dimensionBehaviour)) {
            Iterator it2 = this.e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WidgetRun widgetRun = (WidgetRun) it2.next();
                if (widgetRun.f == i && !widgetRun.m()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && u == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.a.R0(ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.d dVar = this.a;
                    dVar.m1(e(dVar, 0));
                    androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                    dVar2.e.e.d(dVar2.Y());
                }
            } else if (z && u2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.a.i1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                dVar3.N0(e(dVar3, 1));
                androidx.constraintlayout.core.widgets.d dVar4 = this.a;
                dVar4.f.e.d(dVar4.x());
            }
        }
        if (i == 0) {
            androidx.constraintlayout.core.widgets.d dVar5 = this.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar5.Z[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int Y = dVar5.Y() + Z;
                this.a.e.i.d(Y);
                this.a.e.e.d(Y - Z);
                z2 = true;
            }
            z2 = false;
        } else {
            androidx.constraintlayout.core.widgets.d dVar6 = this.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar6.Z[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int x = dVar6.x() + a0;
                this.a.f.i.d(x);
                this.a.f.e.d(x - a0);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            WidgetRun widgetRun2 = (WidgetRun) it3.next();
            if (widgetRun2.f == i && (widgetRun2.b != this.a || widgetRun2.g)) {
                widgetRun2.e();
            }
        }
        Iterator it4 = this.e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = true;
                break;
            }
            WidgetRun widgetRun3 = (WidgetRun) it4.next();
            if (widgetRun3.f == i && (z2 || widgetRun3.b != this.a)) {
                if (!widgetRun3.h.j) {
                    break;
                }
                if (!widgetRun3.i.j) {
                    break;
                }
                if (!(widgetRun3 instanceof c) && !widgetRun3.e.j) {
                    break;
                }
            }
        }
        this.a.R0(u);
        this.a.i1(u2);
        return z3;
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public void m() {
        e eVar;
        Iterator it2 = this.a.L0.iterator();
        while (it2.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it2.next();
            if (!constraintWidget.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.Z;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.w;
                int i2 = constraintWidget.x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                e eVar2 = constraintWidget.e.e;
                boolean z3 = eVar2.j;
                e eVar3 = constraintWidget.f.e;
                boolean z4 = eVar3.j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    l(constraintWidget, dimensionBehaviour4, eVar2.g, dimensionBehaviour4, eVar3.g);
                    constraintWidget.a = true;
                } else if (z3 && z) {
                    l(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, eVar2.g, dimensionBehaviour3, eVar3.g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f.e.m = constraintWidget.x();
                    } else {
                        constraintWidget.f.e.d(constraintWidget.x());
                        constraintWidget.a = true;
                    }
                } else if (z4 && z2) {
                    l(constraintWidget, dimensionBehaviour3, eVar2.g, ConstraintWidget.DimensionBehaviour.FIXED, eVar3.g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.e.e.m = constraintWidget.Y();
                    } else {
                        constraintWidget.e.e.d(constraintWidget.Y());
                        constraintWidget.a = true;
                    }
                }
                if (constraintWidget.a && (eVar = constraintWidget.f.l) != null) {
                    eVar.d(constraintWidget.p());
                }
            }
        }
    }

    public void n(b.InterfaceC0071b interfaceC0071b) {
        this.g = interfaceC0071b;
    }
}
