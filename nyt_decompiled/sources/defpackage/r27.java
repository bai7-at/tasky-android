package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.room.common.CompositeState;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class r27 {
    public static final r27 a = new r27();
    private static final DateTimeFormatter b = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    private r27() {
    }

    public static final String a(OffsetDateTime offsetDateTime) {
        zq3.h(offsetDateTime, "time");
        String format = offsetDateTime.format(b);
        zq3.g(format, "format(...)");
        return format;
    }

    public static final CompositeState b(String str) {
        zq3.h(str, "value");
        return CompositeState.Companion.b(str);
    }

    public static final OffsetDateTime c(String str) {
        zq3.h(str, "timestamp");
        Object parse = b.parse(str, new q27());
        zq3.g(parse, "parse(...)");
        return (OffsetDateTime) parse;
    }

    public static final String d(CompositeState compositeState) {
        zq3.h(compositeState, TransferTable.COLUMN_STATE);
        return compositeState.getValue();
    }
}
