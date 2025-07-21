package defpackage;

import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class n72 {
    private static final HashSet a = new HashSet();
    private static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (n72.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (n72.class) {
            str = b;
        }
        return str;
    }
}
