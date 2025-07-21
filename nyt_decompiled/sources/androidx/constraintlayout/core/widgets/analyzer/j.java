package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import defpackage.x73;

/* loaded from: classes.dex */
public class j extends WidgetRun {
    private static int[] k = new int[2];

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

    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.h.e = DependencyNode.Type.LEFT;
        this.i.e = DependencyNode.Type.RIGHT;
        this.f = 0;
    }

    private void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ba, code lost:
    
        if (r14 != 1) goto L135;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, defpackage.lm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.lm1 r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.j.a(lm1):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget L;
        ConstraintWidget L2;
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget.a) {
            this.e.d(constraintWidget.Y());
        }
        if (this.e.j) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (L = this.b.L()) != null && (L.A() == ConstraintWidget.DimensionBehaviour.FIXED || L.A() == dimensionBehaviour2)) {
                b(this.h, L.e.h, this.b.O.f());
                b(this.i, L.e.i, -this.b.Q.f());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour A = this.b.A();
            this.d = A;
            if (A != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (A == dimensionBehaviour3 && (L2 = this.b.L()) != null && (L2.A() == ConstraintWidget.DimensionBehaviour.FIXED || L2.A() == dimensionBehaviour3)) {
                    int Y = (L2.Y() - this.b.O.f()) - this.b.Q.f();
                    b(this.h, L2.e.h, this.b.O.f());
                    b(this.i, L2.e.i, -this.b.Q.f());
                    this.e.d(Y);
                    return;
                }
                if (this.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.e.d(this.b.Y());
                }
            }
        }
        e eVar = this.e;
        if (eVar.j) {
            ConstraintWidget constraintWidget2 = this.b;
            if (constraintWidget2.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.W;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f != null) {
                    if (constraintWidget2.k0()) {
                        this.h.f = this.b.W[0].f();
                        this.i.f = -this.b.W[1].f();
                        return;
                    }
                    DependencyNode h = h(this.b.W[0]);
                    if (h != null) {
                        b(this.h, h, this.b.W[0].f());
                    }
                    DependencyNode h2 = h(this.b.W[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.W[1].f());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode h3 = h(constraintAnchor);
                    if (h3 != null) {
                        b(this.h, h3, this.b.W[0].f());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f != null) {
                    DependencyNode h4 = h(constraintAnchor3);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.W[1].f());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof x73) || constraintWidget2.L() == null || this.b.o(ConstraintAnchor.Type.CENTER).f != null) {
                    return;
                }
                b(this.h, this.b.L().e.h, this.b.Z());
                b(this.i, this.h, this.e.g);
                return;
            }
        }
        if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.b;
            int i = constraintWidget3.w;
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
            } else if (i == 3) {
                if (constraintWidget3.x == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    l lVar = constraintWidget3.f;
                    lVar.h.a = this;
                    lVar.i.a = this;
                    eVar.a = this;
                    if (constraintWidget3.m0()) {
                        this.e.l.add(this.b.f.e);
                        this.b.f.e.k.add(this.e);
                        l lVar2 = this.b.f;
                        lVar2.e.a = this;
                        this.e.l.add(lVar2.h);
                        this.e.l.add(this.b.f.i);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                    } else if (this.b.k0()) {
                        this.b.f.e.l.add(this.e);
                        this.e.k.add(this.b.f.e);
                    } else {
                        this.b.f.e.l.add(this.e);
                    }
                } else {
                    e eVar4 = constraintWidget3.f.e;
                    eVar.l.add(eVar4);
                    eVar4.k.add(this.e);
                    this.b.f.h.k.add(this.e);
                    this.b.f.i.k.add(this.e);
                    e eVar5 = this.e;
                    eVar5.b = true;
                    eVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.W;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f != null) {
            if (constraintWidget4.k0()) {
                this.h.f = this.b.W[0].f();
                this.i.f = -this.b.W[1].f();
                return;
            }
            DependencyNode h5 = h(this.b.W[0]);
            DependencyNode h6 = h(this.b.W[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode h7 = h(constraintAnchor4);
            if (h7 != null) {
                b(this.h, h7, this.b.W[0].f());
                c(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f != null) {
            DependencyNode h8 = h(constraintAnchor6);
            if (h8 != null) {
                b(this.i, h8, -this.b.W[1].f());
                c(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof x73) || constraintWidget4.L() == null) {
            return;
        }
        b(this.h, this.b.L().e.h, this.b.Z());
        c(this.i, this.h, 1, this.e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.o1(dependencyNode.g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        return this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.w == 0;
    }

    void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.t();
    }
}
