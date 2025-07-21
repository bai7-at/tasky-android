package defpackage;

import org.threeten.bp.Instant;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class am3 {
    public static final am3 a = new am3();
    private static final DateTimeFormatter b = DateTimeFormatter.ISO_INSTANT;

    private am3() {
    }

    public static final String a(Instant instant) {
        if (instant != null) {
            return b.format(instant);
        }
        return null;
    }

    public static final Instant b(String str) {
        if (str != null) {
            return (Instant) b.parse(str, new zl3());
        }
        return null;
    }
}
