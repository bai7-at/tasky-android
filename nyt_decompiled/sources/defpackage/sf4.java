package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.q;

/* loaded from: classes3.dex */
public class sf4 extends q {
    private static final int g = fn6.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public sf4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int d = qf4.d(this, lc6.colorControlActivated);
            int d2 = qf4.d(this, lc6.colorOnSurface);
            int d3 = qf4.d(this, lc6.colorSurface);
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = qf4.j(d3, d, 1.0f);
            iArr2[1] = qf4.j(d3, d2, 0.54f);
            iArr2[2] = qf4.j(d3, d2, 0.38f);
            iArr2[3] = qf4.j(d3, d2, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && jt0.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            jt0.d(this, getMaterialThemeColorsTintList());
        } else {
            jt0.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sf4(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = defpackage.sf4.g
            android.content.Context r8 = defpackage.bg4.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.nn6.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.sk8.i(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.nn6.MaterialRadioButton_buttonTint
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L2a
            int r10 = defpackage.nn6.MaterialRadioButton_buttonTint
            android.content.res.ColorStateList r8 = defpackage.tf4.a(r8, r9, r10)
            defpackage.jt0.d(r7, r8)
        L2a:
            int r8 = defpackage.nn6.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf4.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
