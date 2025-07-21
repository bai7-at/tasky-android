package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.y73;

/* loaded from: classes.dex */
public class a extends y73 {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    protected void A1() {
        for (int i = 0; i < this.M0; i++) {
            ConstraintWidget constraintWidget = this.L0[i];
            if (this.O0 || constraintWidget.h()) {
                int i2 = this.N0;
                if (i2 == 0 || i2 == 1) {
                    constraintWidget.U0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    constraintWidget.U0(1, true);
                }
            }
        }
    }

    public void B1(boolean z) {
        this.O0 = z;
    }

    public void C1(int i) {
        this.N0 = i;
    }

    public void D1(int i) {
        this.P0 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        ConstraintAnchor[] constraintAnchorArr2 = this.W;
        constraintAnchorArr2[0] = this.O;
        constraintAnchorArr2[2] = this.P;
        constraintAnchorArr2[1] = this.Q;
        constraintAnchorArr2[3] = this.R;
        int i4 = 0;
        while (true) {
            constraintAnchorArr = this.W;
            if (i4 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i4];
            constraintAnchor.i = dVar.q(constraintAnchor);
            i4++;
        }
        int i5 = this.N0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i5];
        if (!this.Q0) {
            v1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i6 = this.N0;
            if (i6 == 0 || i6 == 1) {
                dVar.f(this.O.i, this.f0);
                dVar.f(this.Q.i, this.f0);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    dVar.f(this.P.i, this.g0);
                    dVar.f(this.R.i, this.g0);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.M0; i7++) {
            ConstraintWidget constraintWidget = this.L0[i7];
            if ((this.O0 || constraintWidget.h()) && ((((i2 = this.N0) == 0 || i2 == 1) && constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.O.f != null && constraintWidget.Q.f != null) || (((i3 = this.N0) == 2 || i3 == 3) && constraintWidget.V() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.P.f != null && constraintWidget.R.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.O.l() || this.Q.l();
        boolean z4 = this.P.l() || this.R.l();
        int i8 = !(!z2 && (((i = this.N0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.M0; i9++) {
            ConstraintWidget constraintWidget2 = this.L0[i9];
            if (this.O0 || constraintWidget2.h()) {
                SolverVariable q = dVar.q(constraintWidget2.W[this.N0]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.W;
                int i10 = this.N0;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i10];
                constraintAnchor3.i = q;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
                int i11 = (constraintAnchor4 == null || constraintAnchor4.d != this) ? 0 : constraintAnchor3.g;
                if (i10 == 0 || i10 == 2) {
                    dVar.i(constraintAnchor2.i, q, this.P0 - i11, z2);
                } else {
                    dVar.g(constraintAnchor2.i, q, this.P0 + i11, z2);
                }
                dVar.e(constraintAnchor2.i, q, this.P0 + i11, i8);
            }
        }
        int i12 = this.N0;
        if (i12 == 0) {
            dVar.e(this.Q.i, this.O.i, 0, 8);
            dVar.e(this.O.i, this.a0.Q.i, 0, 4);
            dVar.e(this.O.i, this.a0.O.i, 0, 0);
            return;
        }
        if (i12 == 1) {
            dVar.e(this.O.i, this.Q.i, 0, 8);
            dVar.e(this.O.i, this.a0.O.i, 0, 4);
            dVar.e(this.O.i, this.a0.Q.i, 0, 0);
        } else if (i12 == 2) {
            dVar.e(this.R.i, this.P.i, 0, 8);
            dVar.e(this.P.i, this.a0.R.i, 0, 4);
            dVar.e(this.P.i, this.a0.P.i, 0, 0);
        } else if (i12 == 3) {
            dVar.e(this.P.i, this.R.i, 0, 8);
            dVar.e(this.P.i, this.a0.P.i, 0, 4);
            dVar.e(this.P.i, this.a0.R.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean p0() {
        return this.Q0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean q0() {
        return this.Q0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i = 0; i < this.M0; i++) {
            ConstraintWidget constraintWidget = this.L0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.t();
        }
        return str + "}";
    }

    public boolean v1() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.M0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.L0[i4];
            if ((this.O0 || constraintWidget.h()) && ((((i2 = this.N0) == 0 || i2 == 1) && !constraintWidget.p0()) || (((i3 = this.N0) == 2 || i3 == 3) && !constraintWidget.q0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.M0; i6++) {
            ConstraintWidget constraintWidget2 = this.L0[i6];
            if (this.O0 || constraintWidget2.h()) {
                if (!z2) {
                    int i7 = this.N0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.o(ConstraintAnchor.Type.LEFT).e();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.o(ConstraintAnchor.Type.RIGHT).e();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.o(ConstraintAnchor.Type.TOP).e();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.o(ConstraintAnchor.Type.BOTTOM).e();
                    }
                    z2 = true;
                }
                int i8 = this.N0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.o(ConstraintAnchor.Type.LEFT).e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.o(ConstraintAnchor.Type.RIGHT).e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.o(ConstraintAnchor.Type.TOP).e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.o(ConstraintAnchor.Type.BOTTOM).e());
                }
            }
        }
        int i9 = i5 + this.P0;
        int i10 = this.N0;
        if (i10 == 0 || i10 == 1) {
            H0(i9, i9);
        } else {
            K0(i9, i9);
        }
        this.Q0 = true;
        return true;
    }

    public boolean w1() {
        return this.O0;
    }

    public int x1() {
        return this.N0;
    }

    public int y1() {
        return this.P0;
    }

    public int z1() {
        int i = this.N0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }
}
