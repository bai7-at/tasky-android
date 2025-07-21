package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class ljb {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            fgb.e("Unexpected exception.", th);
            k8b.c(context).b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
