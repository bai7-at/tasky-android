package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import defpackage.y73;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class h extends y73 {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected b.a Y0 = new b.a();
    b.InterfaceC0071b Z0 = null;

    public int A1() {
        return this.O0;
    }

    public int B1() {
        return this.T0;
    }

    public int C1() {
        return this.U0;
    }

    public int D1() {
        return this.N0;
    }

    public abstract void E1(int i, int i2, int i3, int i4);

    protected void F1(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.Z0 == null && L() != null) {
            this.Z0 = ((d) L()).L1();
        }
        b.a aVar = this.Y0;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.Z0.b(constraintWidget, aVar);
        constraintWidget.m1(this.Y0.e);
        constraintWidget.N0(this.Y0.f);
        constraintWidget.M0(this.Y0.h);
        constraintWidget.C0(this.Y0.g);
    }

    protected boolean G1() {
        ConstraintWidget constraintWidget = this.a0;
        b.InterfaceC0071b L1 = constraintWidget != null ? ((d) constraintWidget).L1() : null;
        if (L1 == null) {
            return false;
        }
        for (int i = 0; i < this.M0; i++) {
            ConstraintWidget constraintWidget2 = this.L0[i];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour u = constraintWidget2.u(0);
                ConstraintWidget.DimensionBehaviour u2 = constraintWidget2.u(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (u != dimensionBehaviour || constraintWidget2.w == 1 || u2 != dimensionBehaviour || constraintWidget2.x == 1) {
                    if (u == dimensionBehaviour) {
                        u = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (u2 == dimensionBehaviour) {
                        u2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    b.a aVar = this.Y0;
                    aVar.a = u;
                    aVar.b = u2;
                    aVar.c = constraintWidget2.Y();
                    this.Y0.d = constraintWidget2.x();
                    L1.b(constraintWidget2, this.Y0);
                    constraintWidget2.m1(this.Y0.e);
                    constraintWidget2.N0(this.Y0.f);
                    constraintWidget2.C0(this.Y0.g);
                }
            }
        }
        return true;
    }

    public boolean H1() {
        return this.V0;
    }

    protected void I1(boolean z) {
        this.V0 = z;
    }

    public void J1(int i, int i2) {
        this.W0 = i;
        this.X0 = i2;
    }

    public void K1(int i) {
        this.P0 = i;
        this.N0 = i;
        this.Q0 = i;
        this.O0 = i;
        this.R0 = i;
        this.S0 = i;
    }

    public void L1(int i) {
        this.O0 = i;
    }

    public void M1(int i) {
        this.S0 = i;
    }

    public void N1(int i) {
        this.P0 = i;
        this.T0 = i;
    }

    public void O1(int i) {
        this.Q0 = i;
        this.U0 = i;
    }

    public void P1(int i) {
        this.R0 = i;
        this.T0 = i;
        this.U0 = i;
    }

    public void Q1(int i) {
        this.N0 = i;
    }

    @Override // defpackage.y73, defpackage.x73
    public void c(d dVar) {
        w1();
    }

    public void v1(boolean z) {
        int i = this.R0;
        if (i > 0 || this.S0 > 0) {
            if (z) {
                this.T0 = this.S0;
                this.U0 = i;
            } else {
                this.T0 = i;
                this.U0 = this.S0;
            }
        }
    }

    public void w1() {
        for (int i = 0; i < this.M0; i++) {
            ConstraintWidget constraintWidget = this.L0[i];
            if (constraintWidget != null) {
                constraintWidget.W0(true);
            }
        }
    }

    public boolean x1(HashSet hashSet) {
        for (int i = 0; i < this.M0; i++) {
            if (hashSet.contains(this.L0[i])) {
                return true;
            }
        }
        return false;
    }

    public int y1() {
        return this.X0;
    }

    public int z1() {
        return this.W0;
    }
}
