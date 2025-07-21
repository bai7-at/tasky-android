package defpackage;

import android.os.Looper;

/* loaded from: classes4.dex */
public abstract class gl8 {
    private static Thread a;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean b() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }
}
