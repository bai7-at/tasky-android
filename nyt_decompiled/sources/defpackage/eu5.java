package defpackage;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
abstract class eu5 {
    private static final Logger a = Logger.getLogger(eu5.class.getName());
    private static final dq5 b = b();

    private static final class b implements dq5 {
        private b() {
        }
    }

    static String a(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    private static dq5 b() {
        return new b();
    }

    static String c(String str) {
        return str == null ? "" : str;
    }

    static boolean d(String str) {
        return str == null || str.isEmpty();
    }
}
