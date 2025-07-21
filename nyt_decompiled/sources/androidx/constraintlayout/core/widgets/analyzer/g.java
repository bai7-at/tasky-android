package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.y73;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g {
    public static m a(ConstraintWidget constraintWidget, int i, ArrayList arrayList, m mVar) {
        int u1;
        int i2 = i == 0 ? constraintWidget.I0 : constraintWidget.J0;
        if (i2 != -1 && (mVar == null || i2 != mVar.b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                m mVar2 = (m) arrayList.get(i3);
                if (mVar2.c() == i2) {
                    if (mVar != null) {
                        mVar.g(i, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if ((constraintWidget instanceof y73) && (u1 = ((y73) constraintWidget).u1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    m mVar3 = (m) arrayList.get(i4);
                    if (mVar3.c() == u1) {
                        mVar = mVar3;
                        break;
                    }
                    i4++;
                }
            }
            if (mVar == null) {
                mVar = new m(i);
            }
            arrayList.add(mVar);
        }
        if (mVar.a(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                fVar.t1().c(fVar.u1() == 0 ? 1 : 0, arrayList, mVar);
            }
            if (i == 0) {
                constraintWidget.I0 = mVar.c();
                constraintWidget.O.c(i, arrayList, mVar);
                constraintWidget.Q.c(i, arrayList, mVar);
            } else {
                constraintWidget.J0 = mVar.c();
                constraintWidget.P.c(i, arrayList, mVar);
                constraintWidget.S.c(i, arrayList, mVar);
                constraintWidget.R.c(i, arrayList, mVar);
            }
            constraintWidget.V.c(i, arrayList, mVar);
        }
        return mVar;
    }

    private static m b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) arrayList.get(i2);
            if (i == mVar.b) {
                return mVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(androidx.constraintlayout.core.widgets.d r16, androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0071b r17) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.g.c(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.analyzer.b$b):boolean");
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
