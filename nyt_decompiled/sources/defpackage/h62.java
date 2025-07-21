package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class h62 {
    public static void a(Throwable th, Throwable th2) {
        zq3.h(th, "<this>");
        zq3.h(th2, "exception");
        if (th != th2) {
            mu5.a.a(th, th2);
        }
    }

    public static String b(Throwable th) {
        zq3.h(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        zq3.g(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
