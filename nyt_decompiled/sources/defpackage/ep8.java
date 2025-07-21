package defpackage;

import android.os.Trace;

/* loaded from: classes2.dex */
public abstract class ep8 {
    public static void a(String str) {
        if (z19.a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (z19.a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
