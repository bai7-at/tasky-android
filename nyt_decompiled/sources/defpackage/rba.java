package defpackage;

import com.amazonaws.services.s3.Headers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class rba {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                gba.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            gba.c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static faa b(qaa qaaVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = qaaVar.c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a = str != null ? a(str) : 0L;
        String str2 = (String) map.get(Headers.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = (String) map.get(Headers.EXPIRES);
        long a2 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get(Headers.LAST_MODIFIED);
        long a3 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get(Headers.ETAG);
        if (i != 0) {
            j4 = currentTimeMillis + (j2 * 1000);
            j3 = z ? j4 : (j * 1000) + j4;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        faa faaVar = new faa();
        faaVar.a = qaaVar.b;
        faaVar.b = str5;
        faaVar.f = j4;
        faaVar.e = j3;
        faaVar.c = a;
        faaVar.d = a3;
        faaVar.g = map;
        faaVar.h = qaaVar.d;
        return faaVar;
    }

    static String c(long j) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
