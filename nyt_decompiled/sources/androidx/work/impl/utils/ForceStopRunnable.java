package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import defpackage.aj9;
import defpackage.dk9;
import defpackage.ek9;
import defpackage.h94;
import defpackage.lv0;
import defpackage.m09;
import defpackage.pj9;
import defpackage.r16;
import defpackage.ro2;
import defpackage.te8;
import defpackage.v36;
import defpackage.xj9;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    private static final String e = h94.i("ForceStopRunnable");
    private static final long f = TimeUnit.DAYS.toMillis(3650);
    private final Context a;
    private final pj9 b;
    private final r16 c;
    private int d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = h94.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            h94.e().j(a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, pj9 pj9Var) {
        this.a = context.getApplicationContext();
        this.b = pj9Var;
        this.c = pj9Var.q();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    public boolean a() {
        boolean i = te8.i(this.a, this.b.u());
        WorkDatabase u = this.b.u();
        ek9 i2 = u.i();
        xj9 h = u.h();
        u.beginTransaction();
        try {
            List<dk9> w = i2.w();
            boolean z = (w == null || w.isEmpty()) ? false : true;
            if (z) {
                for (dk9 dk9Var : w) {
                    i2.t(WorkInfo.State.ENQUEUED, dk9Var.a);
                    i2.d(dk9Var.a, -512);
                    i2.p(dk9Var.a, -1L);
                }
            }
            h.deleteAll();
            u.setTransactionSuccessful();
            u.endTransaction();
            return z || i;
        } catch (Throwable th) {
            u.endTransaction();
            throw th;
        }
    }

    public void b() {
        boolean a = a();
        if (h()) {
            h94.e().a(e, "Rescheduling Workers.");
            this.b.y();
            this.b.q().e(false);
        } else if (e()) {
            h94.e().a(e, "Application was force-stopped, rescheduling.");
            this.b.y();
            this.c.d(this.b.n().a().currentTimeMillis());
        } else if (a) {
            h94.e().a(e, "Found unfinished work, scheduling it.");
            androidx.work.impl.b.h(this.b.n(), this.b.u(), this.b.s());
        }
    }

    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i = Build.VERSION.SDK_INT;
            PendingIntent d = d(this.a, i >= 31 ? 570425344 : 536870912);
            if (i >= 30) {
                if (d != null) {
                    d.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a = this.c.a();
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        ApplicationExitInfo a2 = ro2.a(historicalProcessExitReasons.get(i2));
                        reason = a2.getReason();
                        if (reason == 10) {
                            timestamp = a2.getTimestamp();
                            if (timestamp >= a) {
                                return true;
                            }
                        }
                    }
                }
            } else if (d == null) {
                g(this.a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e2) {
            h94.e().l(e, "Ignoring exception", e2);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a n = this.b.n();
        if (TextUtils.isEmpty(n.c())) {
            h94.e().a(e, "The default process name was not specified.");
            return true;
        }
        boolean b = v36.b(this.a, n);
        h94.e().a(e, "Is default app process = " + b);
        return b;
    }

    public boolean h() {
        return this.b.q().b();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (f()) {
                while (true) {
                    try {
                        aj9.d(this.a);
                        h94.e().a(e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                            int i = this.d + 1;
                            this.d = i;
                            if (i >= 3) {
                                String str = m09.a(this.a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                h94 e3 = h94.e();
                                String str2 = e;
                                e3.d(str2, str, e2);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e2);
                                lv0 e4 = this.b.n().e();
                                if (e4 == null) {
                                    throw illegalStateException;
                                }
                                h94.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                e4.accept(illegalStateException);
                            } else {
                                h94.e().b(e, "Retrying after " + (i * 300), e2);
                                i(((long) this.d) * 300);
                            }
                        }
                    } catch (SQLiteException e5) {
                        h94.e().c(e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e5);
                        lv0 e6 = this.b.n().e();
                        if (e6 == null) {
                            throw illegalStateException2;
                        }
                        e6.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.b.x();
        }
    }
}
