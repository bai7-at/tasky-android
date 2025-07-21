package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class yn5 {
    public static final yn5 a = new yn5();

    private yn5() {
    }

    public final boolean a(int i) {
        return Log.isLoggable("Paging", i);
    }

    public final void b(int i, String str, Throwable th) {
        zq3.h(str, "message");
        if (i == 2) {
            Log.v("Paging", str, th);
            return;
        }
        if (i == 3) {
            Log.d("Paging", str, th);
            return;
        }
        throw new IllegalArgumentException("debug level " + i + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
    }
}
