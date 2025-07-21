package com.zendesk.logger;

import android.util.Log;
import com.amazonaws.util.DateUtils;
import defpackage.r48;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public abstract class Logger {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");
    private static final List b = new ArrayList();
    private static c c;
    private static boolean d;

    public enum Priority {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Priority(int i) {
            this.priority = i;
        }
    }

    static class a implements c {
        a() {
        }

        private boolean b(String str) {
            return r48.b(str) && (str.endsWith("Provider") || str.endsWith("Service"));
        }

        @Override // com.zendesk.logger.Logger.c
        public void a(Priority priority, String str, String str2, Throwable th) {
            Priority priority2;
            String a = com.zendesk.logger.a.a(str);
            if (b(str) && (priority2 = Priority.ERROR) == priority) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US);
                simpleDateFormat.setTimeZone(Logger.a);
                Log.println(priority2.priority, a, "Time in UTC: " + simpleDateFormat.format(new Date()));
            }
            if (th != null) {
                str2 = str2 + r48.b + Log.getStackTraceString(th);
            }
            Iterator it2 = com.zendesk.logger.a.c(str2, 4000).iterator();
            while (it2.hasNext()) {
                Log.println(priority == null ? Priority.INFO.priority : priority.priority, a, (String) it2.next());
            }
        }
    }

    static class b implements c {
        b() {
        }

        @Override // com.zendesk.logger.Logger.c
        public void a(Priority priority, String str, String str2, Throwable th) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("[");
            sb.append(new SimpleDateFormat(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN, Locale.US).format(new Date()));
            sb.append("]");
            sb.append(" ");
            sb.append(priority == null ? com.zendesk.logger.a.b(Priority.INFO.priority) : com.zendesk.logger.a.b(priority.priority));
            sb.append("/");
            if (!r48.b(str)) {
                str = "UNKNOWN";
            }
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            PrintStream printStream = System.out;
            printStream.println(sb.toString());
            if (th != null) {
                th.printStackTrace(printStream);
            }
        }
    }

    public interface c {
        void a(Priority priority, String str, String str2, Throwable th);
    }

    static {
        try {
            Class.forName("android.os.Build");
            c = new a();
        } catch (ClassNotFoundException unused) {
            if (c == null) {
                c = new b();
            }
        } catch (Throwable th) {
            if (c == null) {
                c = new b();
            }
            throw th;
        }
        d = false;
    }

    public static void b(String str, String str2, Object... objArr) {
        g(Priority.DEBUG, str, str2, null, objArr);
    }

    public static void c(String str, String str2, Throwable th, Object... objArr) {
        g(Priority.ERROR, str, str2, th, objArr);
    }

    public static void d(String str, String str2, Object... objArr) {
        g(Priority.ERROR, str, str2, null, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        g(Priority.INFO, str, str2, null, objArr);
    }

    public static boolean f() {
        return d;
    }

    private static void g(Priority priority, String str, String str2, Throwable th, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        if (d) {
            c.a(priority, str, str2, th);
            Iterator it2 = b.iterator();
            while (it2.hasNext()) {
                ((c) it2.next()).a(priority, str, str2, th);
            }
        }
    }

    public static void h(String str, String str2, Throwable th, Object... objArr) {
        g(Priority.WARN, str, str2, th, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        g(Priority.WARN, str, str2, null, objArr);
    }
}
