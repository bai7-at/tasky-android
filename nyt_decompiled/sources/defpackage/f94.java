package defpackage;

import android.util.Log;
import com.datadog.android.log.Logger;
import com.datadog.android.log.internal.logger.DatadogLogHandler;
import java.util.Map;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class f94 implements h84 {
    public static final a d = new a(0 == true ? 1 : 0);
    private static final Regex e = new Regex("(\\$\\d+)+$");
    private static final String[] f;
    private static final String[] g;
    private final String a;
    private final boolean b;
    private final boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        String canonicalName = Logger.class.getCanonicalName();
        String canonicalName2 = h84.class.getCanonicalName();
        String canonicalName3 = h84.class.getCanonicalName();
        if (canonicalName3 != null) {
            str = canonicalName3 + "$DefaultImpls";
        }
        f = new String[]{canonicalName, canonicalName2, str, f94.class.getCanonicalName(), qt0.class.getCanonicalName(), ep0.class.getCanonicalName(), DatadogLogHandler.class.getCanonicalName()};
        g = new String[]{"com.datadog.android.timber", "timber.log"};
    }

    public f94(String str, boolean z, boolean z2) {
        zq3.h(str, "serviceName");
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    private final String d(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "";
        }
        return "\t| at ." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    private final String e(StackTraceElement stackTraceElement) {
        String T0;
        if (stackTraceElement == null) {
            T0 = this.a;
        } else {
            String className = stackTraceElement.getClassName();
            zq3.g(className, "stackTraceElement.className");
            T0 = h.T0(e.e(className, ""), '.', null, 2, null);
        }
        T0.length();
        return T0;
    }

    @Override // defpackage.h84
    public void a(int i, String str, Throwable th, Map map, Set set, Long l) {
        zq3.h(str, "message");
        zq3.h(map, "attributes");
        zq3.h(set, "tags");
        StackTraceElement c = c();
        String e2 = e(c);
        Log.println(i, e2, str + d(c));
        if (th != null) {
            Log.println(i, e2, Log.getStackTraceString(th));
        }
    }

    public final StackTraceElement b(StackTraceElement[] stackTraceElementArr) {
        zq3.h(stackTraceElementArr, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!d.W(f, stackTraceElement.getClassName())) {
                for (String str : g) {
                    String className = stackTraceElement.getClassName();
                    zq3.g(className, "element.className");
                    if (h.K(className, str, false, 2, null)) {
                        break;
                    }
                }
                return stackTraceElement;
            }
        }
        return null;
    }

    public final StackTraceElement c() {
        if (!this.c || !this.b) {
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        zq3.g(stackTrace, "stackTrace");
        return b(stackTrace);
    }

    public /* synthetic */ f94(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? false : z2);
    }
}
