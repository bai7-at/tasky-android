package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import defpackage.lm1;
import defpackage.x73;

/* loaded from: classes.dex */
public class l extends WidgetRun {
    public DependencyNode k;
    e l;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.l = null;
        this.h.e = DependencyNode.Type.TOP;
        this.i.e = DependencyNode.Type.BOTTOM;
        dependencyNode.e = DependencyNode.Type.BASELINE;
        this.f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, defpackage.lm1
    public void a(lm1 lm1Var) {
        float f;
        float v;
        float f2;
        int i;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(lm1Var);
        } else if (i2 == 2) {
            o(lm1Var);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget = this.b;
            n(lm1Var, constraintWidget.P, constraintWidget.R, 1);
            return;
        }
        e eVar = this.e;
        if (eVar.c && !eVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.b;
            int i3 = constraintWidget2.x;
            if (i3 == 2) {
                ConstraintWidget L = constraintWidget2.L();
                if (L != null) {
                    if (L.f.e.j) {
                        this.e.d((int) ((r7.g * this.b.E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget2.e.e.j) {
                int w = constraintWidget2.w();
                if (w == -1) {
                    ConstraintWidget constraintWidget3 = this.b;
                    f = constraintWidget3.e.e.g;
                    v = constraintWidget3.v();
                } else if (w == 0) {
                    f2 = r7.e.e.g * this.b.v();
                    i = (int) (f2 + 0.5f);
                    this.e.d(i);
                } else if (w != 1) {
                    i = 0;
                    this.e.d(i);
                } else {
                    ConstraintWidget constraintWidget4 = this.b;
                    f = constraintWidget4.e.e.g;
                    v = constraintWidget4.v();
                }
                f2 = f / v;
                i = (int) (f2 + 0.5f);
                this.e.d(i);
            }
        }
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c) {
            DependencyNode dependencyNode2 = this.i;
            if (dependencyNode2.c) {
                if (dependencyNode.j && dependencyNode2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget5 = this.b;
                    if (constraintWidget5.w == 0 && !constraintWidget5.m0()) {
                        DependencyNode dependencyNode3 = (DependencyNode) this.h.l.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) this.i.l.get(0);
                        int i4 = dependencyNode3.g;
                        DependencyNode dependencyNode5 = this.h;
                        int i5 = i4 + dependencyNode5.f;
                        int i6 = dependencyNode4.g + this.i.f;
                        dependencyNode5.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    DependencyNode dependencyNode6 = (DependencyNode) this.h.l.get(0);
                    int i7 = (((DependencyNode) this.i.l.get(0)).g + this.i.f) - (dependencyNode6.g + this.h.f);
                    e eVar2 = this.e;
                    int i8 = eVar2.m;
                    if (i7 < i8) {
                        eVar2.d(i7);
                    } else {
                        eVar2.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    DependencyNode dependencyNode7 = (DependencyNode) this.h.l.get(0);
                    DependencyNode dependencyNode8 = (DependencyNode) this.i.l.get(0);
                    int i9 = dependencyNode7.g + this.h.f;
                    int i10 = dependencyNode8.g + this.i.f;
                    float T = this.b.T();
                    if (dependencyNode7 == dependencyNode8) {
                        i9 = dependencyNode7.g;
                        i10 = dependencyNode8.g;
                        T = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * T)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget L;
        ConstraintWidget L2;
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget.a) {
            this.e.d(constraintWidget.x());
        }
        if (!this.e.j) {
            this.d = this.b.V();
            if (this.b.b0()) {
                this.l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (L2 = this.b.L()) != null && L2.V() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int x = (L2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.h, L2.f.h, this.b.P.f());
                    b(this.i, L2.f.i, -this.b.R.f());
                    this.e.d(x);
                    return;
                }
                if (this.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.e.d(this.b.x());
                }
            }
        } else if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (L = this.b.L()) != null && L.V() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.h, L.f.h, this.b.P.f());
            b(this.i, L.f.i, -this.b.R.f());
            return;
        }
        e eVar = this.e;
        boolean z = eVar.j;
        if (z) {
            ConstraintWidget constraintWidget2 = this.b;
            if (constraintWidget2.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.W;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f != null) {
                    if (constraintWidget2.m0()) {
                        this.h.f = this.b.W[2].f();
                        this.i.f = -this.b.W[3].f();
                    } else {
                        DependencyNode h = h(this.b.W[2]);
                        if (h != null) {
                            b(this.h, h, this.b.W[2].f());
                        }
                        DependencyNode h2 = h(this.b.W[3]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.W[3].f());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.b0()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode h3 = h(constraintAnchor);
                    if (h3 != null) {
                        b(this.h, h3, this.b.W[2].f());
                        b(this.i, this.h, this.e.g);
                        if (this.b.b0()) {
                            b(this.k, this.h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f != null) {
                    DependencyNode h4 = h(constraintAnchor3);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.W[3].f());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.b0()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f != null) {
                    DependencyNode h5 = h(constraintAnchor4);
                    if (h5 != null) {
                        b(this.k, h5, 0);
                        b(this.h, this.k, -this.b.p());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof x73) || constraintWidget2.L() == null || this.b.o(ConstraintAnchor.Type.CENTER).f != null) {
                    return;
                }
                b(this.h, this.b.L().f.h, this.b.a0());
                b(this.i, this.h, this.e.g);
                if (this.b.b0()) {
                    b(this.k, this.h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z || this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            eVar.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.b;
            int i = constraintWidget3.x;
            if (i == 2) {
                ConstraintWidget L3 = constraintWidget3.L();
                if (L3 != null) {
                    e eVar2 = L3.f.e;
                    this.e.l.add(eVar2);
                    eVar2.k.add(this.e);
                    e eVar3 = this.e;
                    eVar3.b = true;
                    eVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3 && !constraintWidget3.m0()) {
                ConstraintWidget constraintWidget4 = this.b;
                if (constraintWidget4.w != 3) {
                    e eVar4 = constraintWidget4.e.e;
                    this.e.l.add(eVar4);
                    eVar4.k.add(this.e);
                    e eVar5 = this.e;
                    eVar5.b = true;
                    eVar5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.W;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f != null) {
            if (constraintWidget5.m0()) {
                this.h.f = this.b.W[2].f();
                this.i.f = -this.b.W[3].f();
            } else {
                DependencyNode h6 = h(this.b.W[2]);
                DependencyNode h7 = h(this.b.W[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = WidgetRun.RunType.CENTER;
            }
            if (this.b.b0()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h8 = h(constraintAnchor5);
            if (h8 != null) {
                b(this.h, h8, this.b.W[2].f());
                c(this.i, this.h, 1, this.e);
                if (this.b.b0()) {
                    c(this.k, this.h, 1, this.l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.b.v() > 0.0f) {
                    j jVar = this.b.e;
                    if (jVar.d == dimensionBehaviour3) {
                        jVar.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f != null) {
                DependencyNode h9 = h(constraintAnchor7);
                if (h9 != null) {
                    b(this.i, h9, -this.b.W[3].f());
                    c(this.h, this.i, -1, this.e);
                    if (this.b.b0()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f != null) {
                    DependencyNode h10 = h(constraintAnchor8);
                    if (h10 != null) {
                        b(this.k, h10, 0);
                        c(this.h, this.k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(constraintWidget5 instanceof x73) && constraintWidget5.L() != null) {
                    b(this.h, this.b.L().f.h, this.b.a0());
                    c(this.i, this.h, 1, this.e);
                    if (this.b.b0()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.b.v() > 0.0f) {
                        j jVar2 = this.b.e;
                        if (jVar2.d == dimensionBehaviour5) {
                            jVar2.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.p1(dependencyNode.g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.x == 0;
    }

    void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
