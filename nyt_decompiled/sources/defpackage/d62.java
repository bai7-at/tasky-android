package defpackage;

import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public class d62 {
    private final StringBuffer a = new StringBuffer();
    private StackTraceElement[] b;

    public void a(String str) {
        this.a.append(str);
    }

    public void b() {
        this.a.setLength(0);
    }

    public void c(String str) {
        this.a.append(str);
    }

    public void d() {
        Exception exc = new Exception(this.a.toString());
        StackTraceElement[] stackTraceElementArr = this.b;
        if (stackTraceElementArr != null) {
            exc.setStackTrace(stackTraceElementArr);
        }
        NYTLogger.h(exc);
        b();
    }
}
