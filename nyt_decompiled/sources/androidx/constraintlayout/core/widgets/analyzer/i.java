package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import defpackage.lm1;
import java.util.Iterator;

/* loaded from: classes.dex */
class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void q(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, defpackage.lm1
    public void a(lm1 lm1Var) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.b;
        int x1 = aVar.x1();
        Iterator it2 = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it2.hasNext()) {
            int i3 = ((DependencyNode) it2.next()).g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (x1 == 0 || x1 == 2) {
            this.h.d(i2 + aVar.y1());
        } else {
            this.h.d(i + aVar.y1());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.h.b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int x1 = aVar.x1();
            boolean w1 = aVar.w1();
            int i = 0;
            if (x1 == 0) {
                this.h.e = DependencyNode.Type.LEFT;
                while (i < aVar.M0) {
                    ConstraintWidget constraintWidget2 = aVar.L0[i];
                    if (w1 || constraintWidget2.X() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.e.h;
                        dependencyNode.k.add(this.h);
                        this.h.l.add(dependencyNode);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (x1 == 1) {
                this.h.e = DependencyNode.Type.RIGHT;
                while (i < aVar.M0) {
                    ConstraintWidget constraintWidget3 = aVar.L0[i];
                    if (w1 || constraintWidget3.X() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.e.i;
                        dependencyNode2.k.add(this.h);
                        this.h.l.add(dependencyNode2);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (x1 == 2) {
                this.h.e = DependencyNode.Type.TOP;
                while (i < aVar.M0) {
                    ConstraintWidget constraintWidget4 = aVar.L0[i];
                    if (w1 || constraintWidget4.X() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f.h;
                        dependencyNode3.k.add(this.h);
                        this.h.l.add(dependencyNode3);
                    }
                    i++;
                }
                q(this.b.f.h);
                q(this.b.f.i);
                return;
            }
            if (x1 != 3) {
                return;
            }
            this.h.e = DependencyNode.Type.BOTTOM;
            while (i < aVar.M0) {
                ConstraintWidget constraintWidget5 = aVar.L0[i];
                if (w1 || constraintWidget5.X() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.f.i;
                    dependencyNode4.k.add(this.h);
                    this.h.l.add(dependencyNode4);
                }
                i++;
            }
            q(this.b.f.h);
            q(this.b.f.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int x1 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).x1();
            if (x1 == 0 || x1 == 1) {
                this.b.o1(this.h.g);
            } else {
                this.b.p1(this.h.g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        return false;
    }
}
