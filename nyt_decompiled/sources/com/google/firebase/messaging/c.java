package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.a;
import defpackage.l95;
import defpackage.lg3;
import defpackage.vg8;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
class c {
    private final ExecutorService a;
    private final Context b;
    private final p c;

    public c(Context context, p pVar, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = pVar;
    }

    private boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(a.C0220a c0220a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService(TransferService.INTENT_KEY_NOTIFICATION)).notify(c0220a.b, c0220a.c, c0220a.a.c());
    }

    private lg3 d() {
        lg3 h = lg3.h(this.c.p("gcm.n.image"));
        if (h != null) {
            h.l(this.a);
        }
        return h;
    }

    private void e(l95.e eVar, lg3 lg3Var) {
        if (lg3Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) vg8.b(lg3Var.i(), 5L, TimeUnit.SECONDS);
            eVar.r(bitmap);
            eVar.A(new l95.b().j(bitmap).i(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            lg3Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            lg3Var.close();
        }
    }

    boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        lg3 d = d();
        a.C0220a f = a.f(this.b, this.c);
        e(f.a, d);
        c(f);
        return true;
    }
}
