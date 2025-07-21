package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.lm1;

/* loaded from: classes.dex */
class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.e.f();
        constraintWidget.f.f();
        this.f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).u1();
    }

    private void q(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, defpackage.lm1
    public void a(lm1 lm1Var) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            this.h.d((int) ((((DependencyNode) dependencyNode.l.get(0)).g * ((androidx.constraintlayout.core.widgets.f) this.b).x1()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) this.b;
        int v1 = fVar.v1();
        int w1 = fVar.w1();
        fVar.x1();
        if (fVar.u1() == 1) {
            if (v1 != -1) {
                this.h.l.add(this.b.a0.e.h);
                this.b.a0.e.h.k.add(this.h);
                this.h.f = v1;
            } else if (w1 != -1) {
                this.h.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
                this.h.f = -w1;
            } else {
                DependencyNode dependencyNode = this.h;
                dependencyNode.b = true;
                dependencyNode.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (v1 != -1) {
            this.h.l.add(this.b.a0.f.h);
            this.b.a0.f.h.k.add(this.h);
            this.h.f = v1;
        } else if (w1 != -1) {
            this.h.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
            this.h.f = -w1;
        } else {
            DependencyNode dependencyNode2 = this.h;
            dependencyNode2.b = true;
            dependencyNode2.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        if (((androidx.constraintlayout.core.widgets.f) this.b).u1() == 1) {
            this.b.o1(this.h.g);
        } else {
            this.b.p1(this.h.g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        return false;
    }
}
