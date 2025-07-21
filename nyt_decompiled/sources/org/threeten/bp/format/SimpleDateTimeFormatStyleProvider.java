package org.threeten.bp.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.chrono.Chronology;

/* loaded from: classes5.dex */
final class SimpleDateTimeFormatStyleProvider extends DateTimeFormatStyleProvider {
    private static final ConcurrentMap<String, Object> FORMATTER_CACHE = new ConcurrentHashMap(16, 0.75f, 2);

    SimpleDateTimeFormatStyleProvider() {
    }

    private int convertStyle(FormatStyle formatStyle) {
        return formatStyle.ordinal();
    }

    @Override // org.threeten.bp.format.DateTimeFormatStyleProvider
    public Locale[] getAvailableLocales() {
        return DateFormat.getAvailableLocales();
    }

    @Override // org.threeten.bp.format.DateTimeFormatStyleProvider
    public DateTimeFormatter getFormatter(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }
        String str = chronology.getId() + '|' + locale.toString() + '|' + formatStyle + formatStyle2;
        ConcurrentMap<String, Object> concurrentMap = FORMATTER_CACHE;
        Object obj = concurrentMap.get(str);
        if (obj != null) {
            if (obj.equals("")) {
                throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
            }
            return (DateTimeFormatter) obj;
        }
        DateFormat dateTimeInstance = formatStyle != null ? formatStyle2 != null ? DateFormat.getDateTimeInstance(convertStyle(formatStyle), convertStyle(formatStyle2), locale) : DateFormat.getDateInstance(convertStyle(formatStyle), locale) : DateFormat.getTimeInstance(convertStyle(formatStyle2), locale);
        if (!(dateTimeInstance instanceof SimpleDateFormat)) {
            concurrentMap.putIfAbsent(str, "");
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        }
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(((SimpleDateFormat) dateTimeInstance).toPattern()).toFormatter(locale);
        concurrentMap.putIfAbsent(str, formatter);
        return formatter;
    }
}
