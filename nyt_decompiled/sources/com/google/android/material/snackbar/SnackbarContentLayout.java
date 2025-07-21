package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bg6;
import defpackage.gx0;
import defpackage.hi;
import defpackage.hw4;
import defpackage.k99;
import defpackage.lc6;
import defpackage.qf4;
import defpackage.zd6;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements gx0 {
    private TextView a;
    private Button b;
    private final TimeInterpolator c;
    private int d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = hw4.g(context, lc6.motionEasingEmphasizedInterpolator, hi.b);
    }

    private static void d(View view, int i, int i2) {
        if (k99.R(view)) {
            k99.B0(view, k99.C(view), i, k99.B(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        d(this.a, i2, i3);
        return true;
    }

    @Override // defpackage.gx0
    public void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.a.animate().alpha(1.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        }
    }

    @Override // defpackage.gx0
    public void b(int i, int i2) {
        this.a.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.a.animate().alpha(0.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j).setInterpolator(this.c).setStartDelay(j2).start();
        }
    }

    void c(float f) {
        if (f != 1.0f) {
            this.b.setTextColor(qf4.j(qf4.d(this, lc6.colorSurface), this.b.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(bg6.snackbar_text);
        this.b = (Button) findViewById(bg6.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(zd6.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(zd6.design_snackbar_padding_vertical);
        Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.d = i;
    }
}
