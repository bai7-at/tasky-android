package defpackage;

import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.LoggingBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class k94 {
    public static final a e = new a(null);
    private static final HashMap f = new HashMap();
    private final LoggingBehavior a;
    private final String b;
    private StringBuilder c;
    private int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : k94.f.entrySet()) {
                str2 = h.F(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        public final void a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
            zq3.h(loggingBehavior, "behavior");
            zq3.h(str, "tag");
            zq3.h(str2, "string");
            if (w92.G(loggingBehavior)) {
                String f = f(str2);
                if (!h.K(str, "FacebookSDK.", false, 2, null)) {
                    str = zq3.q("FacebookSDK.", str);
                }
                Log.println(i, str, f);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(LoggingBehavior loggingBehavior, String str, String str2) {
            zq3.h(loggingBehavior, "behavior");
            zq3.h(str, "tag");
            zq3.h(str2, "string");
            a(loggingBehavior, 3, str, str2);
        }

        public final void c(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
            zq3.h(loggingBehavior, "behavior");
            zq3.h(str, "tag");
            zq3.h(str2, "format");
            zq3.h(objArr, "args");
            if (w92.G(loggingBehavior)) {
                z38 z38Var = z38.a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                zq3.g(format, "java.lang.String.format(format, *args)");
                a(loggingBehavior, 3, str, format);
            }
        }

        public final synchronized void d(String str) {
            zq3.h(str, "accessToken");
            w92 w92Var = w92.a;
            if (!w92.G(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String str, String str2) {
            zq3.h(str, "original");
            zq3.h(str2, "replace");
            k94.f.put(str, str2);
        }

        private a() {
        }
    }

    public k94(LoggingBehavior loggingBehavior, String str) {
        zq3.h(loggingBehavior, "behavior");
        zq3.h(str, "tag");
        this.d = 3;
        this.a = loggingBehavior;
        this.b = zq3.q("FacebookSDK.", v29.n(str, "tag"));
        this.c = new StringBuilder();
    }

    private final boolean g() {
        w92 w92Var = w92.a;
        return w92.G(this.a);
    }

    public final void b(String str) {
        zq3.h(str, "string");
        if (g()) {
            this.c.append(str);
        }
    }

    public final void c(String str, Object... objArr) {
        zq3.h(str, "format");
        zq3.h(objArr, "args");
        if (g()) {
            StringBuilder sb = this.c;
            z38 z38Var = z38.a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            zq3.g(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }

    public final void d(String str, Object obj) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    public final void e() {
        String sb = this.c.toString();
        zq3.g(sb, "contents.toString()");
        f(sb);
        this.c = new StringBuilder();
    }

    public final void f(String str) {
        zq3.h(str, "string");
        e.a(this.a, this.d, this.b, str);
    }
}
