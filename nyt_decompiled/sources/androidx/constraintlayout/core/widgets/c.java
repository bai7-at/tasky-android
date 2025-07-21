package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {
    protected ConstraintWidget a;
    protected ConstraintWidget b;
    protected ConstraintWidget c;
    protected ConstraintWidget d;
    protected ConstraintWidget e;
    protected ConstraintWidget f;
    protected ConstraintWidget g;
    protected ArrayList h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.a = constraintWidget;
        this.p = i;
        this.q = z;
    }

    private void b() {
        int i = this.p * 2;
        ConstraintWidget constraintWidget = this.a;
        this.o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z = false;
        while (!z) {
            this.i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.F0;
            int i2 = this.p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.E0[i2] = null;
            if (constraintWidget.X() != 8) {
                this.l++;
                ConstraintWidget.DimensionBehaviour u = constraintWidget.u(this.p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (u != dimensionBehaviour) {
                    this.m += constraintWidget.F(this.p);
                }
                int f = this.m + constraintWidget.W[i].f();
                this.m = f;
                int i3 = i + 1;
                this.m = f + constraintWidget.W[i3].f();
                int f2 = this.n + constraintWidget.W[i].f();
                this.n = f2;
                this.n = f2 + constraintWidget.W[i3].f();
                if (this.b == null) {
                    this.b = constraintWidget;
                }
                this.d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.Z;
                int i4 = this.p;
                if (dimensionBehaviourArr[i4] == dimensionBehaviour) {
                    int i5 = constraintWidget.y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f3 = constraintWidget.D0[i4];
                        if (f3 > 0.0f) {
                            this.k += f3;
                        }
                        if (c(constraintWidget, i4)) {
                            if (f3 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList();
                            }
                            this.h.add(constraintWidget);
                        }
                        if (this.f == null) {
                            this.f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.E0[this.p] = constraintWidget;
                        }
                        this.g = constraintWidget;
                    }
                    if (this.p == 0) {
                        if (constraintWidget.w != 0) {
                            this.o = false;
                        } else if (constraintWidget.z != 0 || constraintWidget.A != 0) {
                            this.o = false;
                        }
                    } else if (constraintWidget.x != 0) {
                        this.o = false;
                    } else if (constraintWidget.C != 0 || constraintWidget.D != 0) {
                        this.o = false;
                    }
                    if (constraintWidget.d0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.F0[this.p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.W[i + 1].f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.W[i].f;
                if (constraintAnchor2 != null && constraintAnchor2.d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.b;
        if (constraintWidget6 != null) {
            this.m -= constraintWidget6.W[i].f();
        }
        ConstraintWidget constraintWidget7 = this.d;
        if (constraintWidget7 != null) {
            this.m -= constraintWidget7.W[i + 1].f();
        }
        this.c = constraintWidget;
        if (this.p == 0 && this.q) {
            this.e = constraintWidget;
        } else {
            this.e = this.a;
        }
        this.t = this.s && this.r;
    }

    private static boolean c(ConstraintWidget constraintWidget, int i) {
        int i2;
        return constraintWidget.X() != 8 && constraintWidget.Z[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i2 = constraintWidget.y[i]) == 0 || i2 == 3);
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
