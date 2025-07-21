package com.google.android.material.datepicker;

import android.content.Context;
import defpackage.vj6;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
abstract class c {
    static String a(Context context, long j, boolean z, boolean z2, boolean z3) {
        String d = d(j);
        if (z) {
            d = String.format(context.getString(vj6.mtrl_picker_today_description), d);
        }
        return z2 ? String.format(context.getString(vj6.mtrl_picker_start_date_description), d) : z3 ? String.format(context.getString(vj6.mtrl_picker_end_date_description), d) : d;
    }

    static String b(long j) {
        return c(j, Locale.getDefault());
    }

    static String c(long j, Locale locale) {
        return l.d(locale).format(new Date(j));
    }

    static String d(long j) {
        return i(j) ? b(j) : g(j);
    }

    static String e(Context context, int i) {
        return l.g().get(1) == i ? String.format(context.getString(vj6.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i)) : String.format(context.getString(vj6.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    static String f(long j) {
        return l.k(Locale.getDefault()).format(new Date(j));
    }

    static String g(long j) {
        return h(j, Locale.getDefault());
    }

    static String h(long j, Locale locale) {
        return l.l(locale).format(new Date(j));
    }

    private static boolean i(long j) {
        Calendar g = l.g();
        Calendar i = l.i();
        i.setTimeInMillis(j);
        return g.get(1) == i.get(1);
    }
}
