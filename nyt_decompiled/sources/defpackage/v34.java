package defpackage;

import org.threeten.bp.Duration;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public abstract class v34 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(LocalDateTime localDateTime) {
        Duration between = Duration.between(LocalDateTime.now(), localDateTime);
        return localDateTime.atZone2(ZoneId.systemDefault()).format(DateTimeFormatter.RFC_1123_DATE_TIME) + " (" + ((between != null ? Long.valueOf(between.toHours()) : null) + "h:" + (between != null ? Integer.valueOf(between.toMinutesPart()) : null) + "m:" + (between != null ? Integer.valueOf(between.toSecondsPart()) : null) + "s") + ")";
    }
}
