package defpackage;

import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class hg9 extends ConstraintWidget {
    public ArrayList L0;

    public hg9() {
        this.L0 = new ArrayList();
    }

    public void a(ConstraintWidget constraintWidget) {
        this.L0.add(constraintWidget);
        if (constraintWidget.L() != null) {
            ((hg9) constraintWidget.L()).v1(constraintWidget);
        }
        constraintWidget.e1(this);
    }

    public ArrayList t1() {
        return this.L0;
    }

    public abstract void u1();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void v0() {
        this.L0.clear();
        super.v0();
    }

    public void v1(ConstraintWidget constraintWidget) {
        this.L0.remove(constraintWidget);
        constraintWidget.v0();
    }

    public void w1() {
        this.L0.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void y0(c cVar) {
        super.y0(cVar);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.L0.get(i)).y0(cVar);
        }
    }

    public hg9(int i, int i2) {
        super(i, i2);
        this.L0 = new ArrayList();
    }
}
