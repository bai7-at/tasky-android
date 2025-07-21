package com.nytimes.android.resourcedownloader.data;

import defpackage.zl3;
import org.threeten.bp.Instant;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class InstantConverter {
    public static final InstantConverter INSTANCE = new InstantConverter();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;

    private InstantConverter() {
    }

    public static final String fromInstant(Instant instant) {
        if (instant != null) {
            return formatter.format(instant);
        }
        return null;
    }

    public static final Instant toInstant(String str) {
        if (str != null) {
            return (Instant) formatter.parse(str, new zl3());
        }
        return null;
    }
}
