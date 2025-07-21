package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.m;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class y73 extends ConstraintWidget implements x73 {
    public ConstraintWidget[] L0 = new ConstraintWidget[4];
    public int M0 = 0;

    @Override // defpackage.x73
    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.M0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.L0;
        if (i > constraintWidgetArr.length) {
            this.L0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.L0;
        int i2 = this.M0;
        constraintWidgetArr2[i2] = constraintWidget;
        this.M0 = i2 + 1;
    }

    @Override // defpackage.x73
    public void b() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    public void c(d dVar) {
    }

    public void t1(ArrayList arrayList, int i, m mVar) {
        for (int i2 = 0; i2 < this.M0; i2++) {
            mVar.a(this.L0[i2]);
        }
        for (int i3 = 0; i3 < this.M0; i3++) {
            g.a(this.L0[i3], i, arrayList, mVar);
        }
    }

    public int u1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.M0; i4++) {
            ConstraintWidget constraintWidget = this.L0[i4];
            if (i == 0 && (i3 = constraintWidget.I0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = constraintWidget.J0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
