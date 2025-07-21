package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.zendesk.logger.Logger;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class um9 extends TypeAdapter {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    private boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private String b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(21);
        d(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        d(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        d(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        d(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        d(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        d(sb, gregorianCalendar.get(13), 2);
        sb.append('Z');
        return sb.toString();
    }

    private static int c(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private void d(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    private Date e(String str, ParsePosition parsePosition) {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int f = f(str, index, i5);
            if (a(str, i5, '-')) {
                i5 = index + 5;
            }
            int i6 = i5 + 2;
            int f2 = f(str, i5, i6);
            if (a(str, i6, '-')) {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int f3 = f(str, i6, i7);
            boolean a2 = a(str, i7, 'T');
            if (!a2 && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(f, f2 - 1, f3);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i8 = i6 + 5;
                int f4 = f(str, i6 + 3, i8);
                if (a(str, i8, ':')) {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                int f5 = f(str, i8, i9);
                if (a(str, i9, ':')) {
                    i9 = i8 + 3;
                }
                if (str.length() <= i9 || (charAt = str.charAt(i9)) == 'Z' || charAt == '+' || charAt == '-') {
                    i = 0;
                    i4 = 0;
                    i3 = f5;
                    i7 = i9;
                    i2 = f4;
                } else {
                    int i10 = i9 + 2;
                    i4 = f(str, i9, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a(str, i10, '.')) {
                        int i11 = i9 + 3;
                        int c = c(str, i9 + 4);
                        int min = Math.min(c, i9 + 6);
                        i = f(str, i11, min);
                        int i12 = min - i11;
                        if (i12 == 1) {
                            i *= 100;
                        } else if (i12 == 2) {
                            i *= 10;
                        }
                        i2 = f4;
                        i7 = c;
                    } else {
                        i2 = f4;
                        i7 = i10;
                        i = 0;
                    }
                    i3 = f5;
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i7) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i7);
            if (charAt2 != 'Z') {
                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(a);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, f);
            gregorianCalendar2.set(2, f2 - 1);
            gregorianCalendar2.set(5, f3);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i3);
            gregorianCalendar2.set(13, i4);
            gregorianCalendar2.set(14, i);
            parsePosition.setIndex(i7 + 1);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + "'";
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private int f(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public Date read2(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            return e(nextString, new ParsePosition(0));
        } catch (ParseException e) {
            Logger.c("ZendeskDateTypeAdapter", String.format(Locale.US, "Failed to parse Date from: %s", nextString), e, new Object[0]);
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(b(date));
        }
    }
}
