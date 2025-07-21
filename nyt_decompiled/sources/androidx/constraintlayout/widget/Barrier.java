package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.xn6;

/* loaded from: classes.dex */
public class Barrier extends a {
    private int j;
    private int k;
    private androidx.constraintlayout.core.widgets.a l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(ConstraintWidget constraintWidget, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).C1(this.k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.l.w1();
    }

    public int getMargin() {
        return this.l.y1();
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.a
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, xn6.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == xn6.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.l.B1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == xn6.ConstraintLayout_Layout_barrierMargin) {
                    this.l.D1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.l;
        o();
    }

    @Override // androidx.constraintlayout.widget.a
    public void j(ConstraintWidget constraintWidget, boolean z) {
        p(constraintWidget, this.j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.B1(z);
    }

    public void setDpMargin(int i) {
        this.l.D1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.D1(i);
    }

    public void setType(int i) {
        this.j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
