package defpackage;

import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class a95 {
    public static String a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String b(String str) {
        return a(str).trim();
    }

    public static String c(String str, boolean z) {
        return z ? a(str) : b(str);
    }
}
