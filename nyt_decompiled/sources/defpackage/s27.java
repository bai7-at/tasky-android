package defpackage;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class s27 {
    public static final s27 a = new s27();
    private static final DateTimeFormatter b = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    private s27() {
    }

    public static final String a(OffsetDateTime offsetDateTime) {
        zq3.h(offsetDateTime, "time");
        String format = offsetDateTime.format(b);
        zq3.g(format, "format(...)");
        return format;
    }

    public static final OffsetDateTime b(String str) {
        zq3.h(str, "timestamp");
        Object parse = b.parse(str, new q27());
        zq3.g(parse, "parse(...)");
        return (OffsetDateTime) parse;
    }
}
