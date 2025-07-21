package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import defpackage.if4;
import defpackage.lc6;
import defpackage.nn6;
import defpackage.tf4;

/* loaded from: classes3.dex */
final class b {
    final a a;
    final a b;
    final a c;
    final a d;
    final a e;
    final a f;
    final a g;
    final Paint h;

    b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(if4.d(context, lc6.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), nn6.MaterialCalendar);
        this.a = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_dayStyle, 0));
        this.g = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_dayInvalidStyle, 0));
        this.b = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_daySelectedStyle, 0));
        this.c = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = tf4.a(context, obtainStyledAttributes, nn6.MaterialCalendar_rangeFillColor);
        this.d = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_yearStyle, 0));
        this.e = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_yearSelectedStyle, 0));
        this.f = a.a(context, obtainStyledAttributes.getResourceId(nn6.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
