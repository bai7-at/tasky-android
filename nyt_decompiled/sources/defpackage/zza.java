package defpackage;

import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class zza {
    private static final HashSet a = new HashSet();
    private static String b = "media3.common";

    public static synchronized String a() {
        String str;
        synchronized (zza.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void b(String str) {
        synchronized (zza.class) {
            if (a.add(str)) {
                b = b + ", " + str;
            }
        }
    }
}
