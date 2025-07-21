package defpackage;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public abstract class x38 {
    public static final Object a(qs2 qs2Var) {
        zq3.h(qs2Var, "operation");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return qs2Var.mo865invoke();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
