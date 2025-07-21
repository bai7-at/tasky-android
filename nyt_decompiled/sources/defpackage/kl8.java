package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class kl8 {
    public static final String a(Throwable th) {
        zq3.h(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        zq3.g(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }
}
