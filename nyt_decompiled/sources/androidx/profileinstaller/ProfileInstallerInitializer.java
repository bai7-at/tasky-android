package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.e;
import com.comscore.util.crashreport.CrashReportManager;
import defpackage.uj3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements uj3 {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.f
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: o46
            @Override // java.lang.Runnable
            public final void run() {
                e.i(context);
            }
        });
    }

    @Override // defpackage.uj3
    public List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.uj3
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c b(Context context) {
        g(context.getApplicationContext());
        return new c();
    }

    void g(final Context context) {
        a.c(new Runnable() { // from class: m46
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.i(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void i(final Context context) {
        b.a(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n46
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.l(context);
            }
        }, new Random().nextInt(Math.max(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, 1)) + CrashReportManager.TIME_WINDOW);
    }
}
