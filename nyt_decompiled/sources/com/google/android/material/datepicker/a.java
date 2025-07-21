package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import defpackage.h16;
import defpackage.k99;
import defpackage.nn6;
import defpackage.oo7;
import defpackage.tf4;
import defpackage.uf4;

/* loaded from: classes3.dex */
final class a {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final oo7 f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, oo7 oo7Var, Rect rect) {
        h16.d(rect.left);
        h16.d(rect.top);
        h16.d(rect.right);
        h16.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = oo7Var;
    }

    static a a(Context context, int i) {
        h16.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, nn6.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(nn6.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(nn6.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(nn6.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(nn6.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = tf4.a(context, obtainStyledAttributes, nn6.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = tf4.a(context, obtainStyledAttributes, nn6.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = tf4.a(context, obtainStyledAttributes, nn6.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(nn6.MaterialCalendarItem_itemStrokeWidth, 0);
        oo7 m = oo7.b(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(nn6.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a, a2, a3, dimensionPixelSize, m, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        uf4 uf4Var = new uf4();
        uf4 uf4Var2 = new uf4();
        uf4Var.setShapeAppearanceModel(this.f);
        uf4Var2.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        uf4Var.W(colorStateList);
        uf4Var.d0(this.e, this.d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), uf4Var, uf4Var2);
        Rect rect = this.a;
        k99.p0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
