package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.fn6;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.qn8;
import defpackage.tv1;
import defpackage.uf4;
import defpackage.vf4;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    private static final int f = fn6.Widget_MaterialComponents_Toolbar;
    private static final ImageView.ScaleType[] g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer a;
    private boolean b;
    private boolean c;
    private ImageView.ScaleType d;
    private Boolean e;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.toolbarStyle);
    }

    private Drawable A(Drawable drawable) {
        if (drawable == null || this.a == null) {
            return drawable;
        }
        Drawable r = kv1.r(drawable.mutate());
        kv1.n(r, this.a.intValue());
        return r;
    }

    private void B() {
        ImageView b = qn8.b(this);
        if (b != null) {
            Boolean bool = this.e;
            if (bool != null) {
                b.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.d;
            if (scaleType != null) {
                b.setScaleType(scaleType);
            }
        }
    }

    private Pair w(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void x(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : tv1.f(background);
        if (valueOf != null) {
            uf4 uf4Var = new uf4();
            uf4Var.W(valueOf);
            uf4Var.M(context);
            uf4Var.V(k99.s(this));
            k99.p0(this, uf4Var);
        }
    }

    private void y(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void z() {
        if (this.b || this.c) {
            TextView e = qn8.e(this);
            TextView c = qn8.c(this);
            if (e == null && c == null) {
                return;
            }
            Pair w = w(e, c);
            if (this.b && e != null) {
                y(e, w);
            }
            if (!this.c || c == null) {
                return;
            }
            y(c, w);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.d;
    }

    public Integer getNavigationIconTint() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof androidx.appcompat.view.menu.e;
        if (z) {
            ((androidx.appcompat.view.menu.e) menu).d0();
        }
        super.inflateMenu(i);
        if (z) {
            ((androidx.appcompat.view.menu.e) menu).c0();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        vf4.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z();
        B();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        vf4.d(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z) {
            this.e = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.d != scaleType) {
            this.d = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(A(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.c != z) {
            this.c = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.b != z) {
            this.b = z;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f
            android.content.Context r8 = defpackage.bg4.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.nn6.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = defpackage.sk8.i(r0, r1, r2, r3, r4, r5)
            int r10 = defpackage.nn6.MaterialToolbar_navigationIconTint
            boolean r10 = r9.hasValue(r10)
            r0 = -1
            if (r10 == 0) goto L2b
            int r10 = defpackage.nn6.MaterialToolbar_navigationIconTint
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L2b:
            int r10 = defpackage.nn6.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.b = r10
            int r10 = defpackage.nn6.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.c = r10
            int r10 = defpackage.nn6.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r0)
            if (r10 < 0) goto L4c
            android.widget.ImageView$ScaleType[] r0 = com.google.android.material.appbar.MaterialToolbar.g
            int r1 = r0.length
            if (r10 >= r1) goto L4c
            r10 = r0[r10]
            r7.d = r10
        L4c:
            int r10 = defpackage.nn6.MaterialToolbar_logoAdjustViewBounds
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L60
            int r10 = defpackage.nn6.MaterialToolbar_logoAdjustViewBounds
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.e = r10
        L60:
            r9.recycle()
            r7.x(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
