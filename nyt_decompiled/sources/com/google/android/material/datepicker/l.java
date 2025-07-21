package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class l {
    static AtomicReference a = new AtomicReference();

    static long a(long j) {
        Calendar i = i();
        i.setTimeInMillis(j);
        return c(i).getTimeInMillis();
    }

    private static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar j = j(calendar);
        Calendar i = i();
        i.set(j.get(1), j.get(2), j.get(5));
        return i;
    }

    static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static k e() {
        k kVar = (k) a.get();
        return kVar == null ? k.c() : kVar;
    }

    private static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar g() {
        Calendar a2 = e().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(f());
        return a2;
    }

    private static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return j(null);
    }

    static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
