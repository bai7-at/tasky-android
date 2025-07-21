package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public abstract class g {
    static boolean[] a = new boolean[3];

    static void a(d dVar, androidx.constraintlayout.core.d dVar2, ConstraintWidget constraintWidget) {
        constraintWidget.t = -1;
        constraintWidget.u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.Z[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.Z[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.O.g;
            int Y = dVar.Y() - constraintWidget.Q.g;
            ConstraintAnchor constraintAnchor = constraintWidget.O;
            constraintAnchor.i = dVar2.q(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.Q;
            constraintAnchor2.i = dVar2.q(constraintAnchor2);
            dVar2.f(constraintWidget.O.i, i);
            dVar2.f(constraintWidget.Q.i, Y);
            constraintWidget.t = 2;
            constraintWidget.Q0(i, Y);
        }
        if (dVar.Z[1] == dimensionBehaviour2 || constraintWidget.Z[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.P.g;
        int x = dVar.x() - constraintWidget.R.g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.P;
        constraintAnchor3.i = dVar2.q(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.R;
        constraintAnchor4.i = dVar2.q(constraintAnchor4);
        dVar2.f(constraintWidget.P.i, i2);
        dVar2.f(constraintWidget.R.i, x);
        if (constraintWidget.l0 > 0 || constraintWidget.X() == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.S;
            constraintAnchor5.i = dVar2.q(constraintAnchor5);
            dVar2.f(constraintWidget.S.i, constraintWidget.l0 + i2);
        }
        constraintWidget.u = 2;
        constraintWidget.h1(i2, x);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
