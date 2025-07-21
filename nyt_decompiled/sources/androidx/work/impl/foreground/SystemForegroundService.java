package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.a;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import defpackage.f44;
import defpackage.h94;

/* loaded from: classes.dex */
public class SystemForegroundService extends f44 implements a.b {
    private static final String e = h94.i("SystemFgService");
    private static SystemForegroundService f = null;
    private boolean b;
    androidx.work.impl.foreground.a c;
    NotificationManager d;

    static class a {
        static void a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    static class b {
        static void a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                h94.e().l(SystemForegroundService.e, "Unable to start foreground service", e);
            } catch (SecurityException e2) {
                h94.e().l(SystemForegroundService.e, "Unable to start foreground service", e2);
            }
        }
    }

    private void f() {
        this.d = (NotificationManager) getApplicationContext().getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.c = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i, Notification notification) {
        this.d.notify(i, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            b.a(this, i, notification, i2);
        } else {
            a.a(this, i, notification, i2);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i) {
        this.d.cancel(i);
    }

    @Override // defpackage.f44, android.app.Service
    public void onCreate() {
        super.onCreate();
        f = this;
        f();
    }

    @Override // defpackage.f44, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c.l();
    }

    @Override // defpackage.f44, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            h94.e().f(e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.l();
            f();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.c.m(intent);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.n(i, ProgressEvent.PART_COMPLETED_EVENT_CODE);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.b = true;
        h94.e().a(e, "Shutting down.");
        stopForeground(true);
        f = null;
        stopSelf();
    }

    public void onTimeout(int i, int i2) {
        this.c.n(i, i2);
    }
}
