package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class f extends ConstraintWidget {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private ConstraintAnchor P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i = 0; i < length; i++) {
            this.W[i] = this.P0;
        }
    }

    public void A1(int i) {
        if (i > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i;
        }
    }

    public void B1(float f) {
        if (f > -1.0f) {
            this.L0 = f;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void C1(int i) {
        if (this.Q0 == i) {
            return;
        }
        this.Q0 = i;
        this.X.clear();
        if (this.Q0 == 1) {
            this.P0 = this.O;
        } else {
            this.P0 = this.P;
        }
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.W[i2] = this.P0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z) {
        d dVar2 = (d) L();
        if (dVar2 == null) {
            return;
        }
        ConstraintAnchor o = dVar2.o(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor o2 = dVar2.o(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.a0;
        boolean z2 = constraintWidget != null && constraintWidget.Z[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.Q0 == 0) {
            o = dVar2.o(ConstraintAnchor.Type.TOP);
            o2 = dVar2.o(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.a0;
            z2 = constraintWidget2 != null && constraintWidget2.Z[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.n()) {
            SolverVariable q = dVar.q(this.P0);
            dVar.f(q, this.P0.e());
            if (this.M0 != -1) {
                if (z2) {
                    dVar.h(dVar.q(o2), q, 0, 5);
                }
            } else if (this.N0 != -1 && z2) {
                SolverVariable q2 = dVar.q(o2);
                dVar.h(q, dVar.q(o), 0, 5);
                dVar.h(q2, q, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            SolverVariable q3 = dVar.q(this.P0);
            dVar.e(q3, dVar.q(o), this.M0, 8);
            if (z2) {
                dVar.h(dVar.q(o2), q3, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                dVar.d(androidx.constraintlayout.core.d.s(dVar, dVar.q(this.P0), dVar.q(o2), this.L0));
                return;
            }
            return;
        }
        SolverVariable q4 = dVar.q(this.P0);
        SolverVariable q5 = dVar.q(o2);
        dVar.e(q4, q5, -this.N0, 8);
        if (z2) {
            dVar.h(q4, dVar.q(o), 0, 5);
            dVar.h(q5, q4, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor o(ConstraintAnchor.Type type2) {
        int i = a.a[type2.ordinal()];
        if (i == 1 || i == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean p0() {
        return this.S0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean q0() {
        return this.S0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void s1(androidx.constraintlayout.core.d dVar, boolean z) {
        if (L() == null) {
            return;
        }
        int y = dVar.y(this.P0);
        if (this.Q0 == 1) {
            o1(y);
            p1(0);
            N0(L().x());
            m1(0);
            return;
        }
        o1(0);
        p1(y);
        m1(L().Y());
        N0(0);
    }

    public ConstraintAnchor t1() {
        return this.P0;
    }

    public int u1() {
        return this.Q0;
    }

    public int v1() {
        return this.M0;
    }

    public int w1() {
        return this.N0;
    }

    public float x1() {
        return this.L0;
    }

    public void y1(int i) {
        this.P0.t(i);
        this.S0 = true;
    }

    public void z1(int i) {
        if (i > -1) {
            this.L0 = -1.0f;
            this.M0 = i;
            this.N0 = -1;
        }
    }
}
