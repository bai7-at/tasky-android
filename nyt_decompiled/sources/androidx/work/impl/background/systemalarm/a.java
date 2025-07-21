package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import defpackage.bf3;
import defpackage.ej9;
import defpackage.h94;
import defpackage.ke8;
import defpackage.le8;
import defpackage.ne8;

/* loaded from: classes.dex */
abstract class a {
    private static final String a = h94.i("Alarms");

    public static void a(Context context, WorkDatabase workDatabase, ej9 ej9Var) {
        le8 f = workDatabase.f();
        ke8 d = f.d(ej9Var);
        if (d != null) {
            b(context, ej9Var, d.c);
            h94.e().a(a, "Removing SystemIdInfo for workSpecId (" + ej9Var + ")");
            f.a(ej9Var);
        }
    }

    private static void b(Context context, ej9 ej9Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.c(context, ej9Var), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        h94.e().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + ej9Var + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, ej9 ej9Var, long j) {
        le8 f = workDatabase.f();
        ke8 d = f.d(ej9Var);
        if (d != null) {
            b(context, ej9Var, d.c);
            d(context, ej9Var, d.c, j);
        } else {
            int c = new bf3(workDatabase).c();
            f.e(ne8.a(ej9Var, c));
            d(context, ej9Var, c, j);
        }
    }

    private static void d(Context context, ej9 ej9Var, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.c(context, ej9Var), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
