package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.h;
import defpackage.ec9;
import defpackage.xn6;

/* loaded from: classes.dex */
public class Flow extends ec9 {
    private e l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ec9, androidx.constraintlayout.widget.a
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.l = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, xn6.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == xn6.ConstraintLayout_Layout_android_orientation) {
                    this.l.F2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_padding) {
                    this.l.K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_paddingStart) {
                    this.l.P1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_paddingEnd) {
                    this.l.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_paddingLeft) {
                    this.l.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_paddingTop) {
                    this.l.Q1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_paddingRight) {
                    this.l.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_android_paddingBottom) {
                    this.l.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_wrapMode) {
                    this.l.K2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.l.z2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.l.J2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.l.t2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.l.B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.l.v2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.l.D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.l.x2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == xn6.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.l.s2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == xn6.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.l.A2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == xn6.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.l.u2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == xn6.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.l.C2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == xn6.ConstraintLayout_Layout_flow_verticalBias) {
                    this.l.H2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == xn6.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.l.w2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == xn6.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.l.G2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == xn6.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.l.y2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_verticalGap) {
                    this.l.I2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == xn6.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.l.E2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.l;
        o();
    }

    @Override // androidx.constraintlayout.widget.a
    public void j(ConstraintWidget constraintWidget, boolean z) {
        this.l.v1(z);
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    protected void onMeasure(int i, int i2) {
        p(this.l, i, i2);
    }

    @Override // defpackage.ec9
    public void p(h hVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (hVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            hVar.E1(mode, size, mode2, size2);
            setMeasuredDimension(hVar.z1(), hVar.y1());
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.l.s2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.t2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.u2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.v2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.w2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.x2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.y2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.z2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.A2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.B2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.C2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.D2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.E2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.F2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.l.K1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.L1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.N1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.O1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.Q1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.G2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.H2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.I2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.J2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.K2(i);
        requestLayout();
    }
}
