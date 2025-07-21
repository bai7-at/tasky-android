package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class tb1 {
    public static final long a = TimeUnit.HOURS.toMillis(4);
    private static Locale b = Locale.getDefault();
    private static a c = new a("h:mm a", b);
    private static a d = new a("MMMM d, yyyy", b);

    private static class a extends ThreadLocal {
        private final String a;
        private final Locale b;

        a(String str, Locale locale) {
            this.a = str;
            this.b = locale;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(this.a, this.b);
        }
    }

    public static long a(long j) {
        return TimeUnit.SECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    public static String b(long j) {
        Date date = new Date(j * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        simpleDateFormat.getTimeZone();
        return simpleDateFormat.format(date).toUpperCase();
    }

    public static boolean c(long j) {
        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean d(long j, long j2) {
        return new Date().getTime() - j > TimeUnit.MILLISECONDS.convert(j2, TimeUnit.DAYS);
    }

    public static void e(Locale locale) {
        b = locale;
        c = new a("h:mm a", locale);
        d = new a("MMMM d, yyyy", locale);
    }
}
