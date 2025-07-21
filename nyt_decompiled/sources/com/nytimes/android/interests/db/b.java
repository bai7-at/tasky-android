package com.nytimes.android.interests.db;

import defpackage.at3;
import defpackage.zq3;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class b {
    public static final b a = new b();
    private static final DateTimeFormatter b = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    private b() {
    }

    public static final String a(Interest interest) {
        zq3.h(interest, "interest");
        return at3.d.b(Interest.Companion.serializer(), interest);
    }

    public static final Interest b(String str) {
        zq3.h(str, "interest");
        return (Interest) at3.d.c(Interest.Companion.serializer(), str);
    }
}
