package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes3.dex */
class k {
    private static final k c = new k(null, null);
    private final Long a;
    private final TimeZone b;

    private k(Long l, TimeZone timeZone) {
        this.a = l;
        this.b = timeZone;
    }

    static k c() {
        return c;
    }

    Calendar a() {
        return b(this.b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
