package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.b;

/* loaded from: classes.dex */
public abstract class sk9 {
    private static final b c(Context context, String str, WorkerParameters workerParameters) {
        String str2;
        try {
            Object newInstance = d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            zq3.g(newInstance, "{\n                val co…Parameters)\n            }");
            return (b) newInstance;
        } catch (Throwable th) {
            h94 e = h94.e();
            str2 = tk9.a;
            e.d(str2, "Could not instantiate " + str, th);
            throw th;
        }
    }

    private static final Class d(String str) {
        String str2;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(b.class);
            zq3.g(asSubclass, "{\n                Class.…class.java)\n            }");
            return asSubclass;
        } catch (Throwable th) {
            h94 e = h94.e();
            str2 = tk9.a;
            e.d(str2, "Invalid class: " + str, th);
            throw th;
        }
    }

    public abstract b a(Context context, String str, WorkerParameters workerParameters);

    public final b b(Context context, String str, WorkerParameters workerParameters) {
        zq3.h(context, "appContext");
        zq3.h(str, "workerClassName");
        zq3.h(workerParameters, "workerParameters");
        b a = a(context, str, workerParameters);
        if (a == null) {
            a = c(context, str, workerParameters);
        }
        if (!a.isUsed()) {
            return a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
