package defpackage;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class y {
    public static final y a = new y();
    private static final int b = Process.myUid();
    private static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    private static String d = "";
    private static final Runnable e = new Runnable() { // from class: x
        @Override // java.lang.Runnable
        public final void run() {
            y.b();
        }
    };

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        if (c11.d(y.class)) {
            return;
        }
        try {
            Object systemService = w92.l().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            c11.b(th, y.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (c11.d(y.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == b) {
                    Thread thread = Looper.getMainLooper().getThread();
                    zq3.g(thread, "getMainLooper().thread");
                    String g = km3.g(thread);
                    if (!zq3.c(g, d) && km3.j(thread)) {
                        d = g;
                        InstrumentData.a aVar = InstrumentData.a.a;
                        InstrumentData.a.a(processErrorStateInfo.shortMsg, g).g();
                    }
                }
            }
        } catch (Throwable th) {
            c11.b(th, y.class);
        }
    }

    public static final void d() {
        if (c11.d(y.class)) {
            return;
        }
        try {
            c.scheduleAtFixedRate(e, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            c11.b(th, y.class);
        }
    }
}
