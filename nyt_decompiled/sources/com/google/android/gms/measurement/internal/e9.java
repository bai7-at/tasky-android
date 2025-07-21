package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import defpackage.j2b;
import defpackage.p3b;

/* loaded from: classes3.dex */
public final class e9 extends g9 {
    private final AlarmManager d;
    private n e;
    private Integer f;

    protected e9(r9 r9Var) {
        super(r9Var);
        this.d = (AlarmManager) this.a.zzau().getSystemService("alarm");
    }

    private final int k() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(this.a.zzau().getPackageName())).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent l() {
        Context zzau = this.a.zzau();
        return PendingIntent.getBroadcast(zzau, 0, new Intent().setClassName(zzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), j2b.a);
    }

    private final n m() {
        if (this.e == null) {
            this.e = new d9(this, this.b.a0());
        }
        return this.e;
    }

    private final void n() {
        JobScheduler jobScheduler = (JobScheduler) this.a.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(k());
        }
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(l());
        }
        n();
        return false;
    }

    public final void i() {
        d();
        this.a.o().u().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(l());
        }
        m().b();
        n();
    }

    public final void j(long j) {
        d();
        this.a.q();
        Context zzau = this.a.zzau();
        if (!x9.X(zzau)) {
            this.a.o().m().a("Receiver not registered/enabled");
        }
        if (!x9.Y(zzau, false)) {
            this.a.o().m().a("Service not registered/enabled");
        }
        i();
        this.a.o().u().b("Scheduling upload, millis", Long.valueOf(j));
        this.a.p().elapsedRealtime();
        this.a.y();
        if (j < Math.max(0L, ((Long) m3.y.a(null)).longValue()) && !m().e()) {
            m().d(j);
        }
        this.a.q();
        Context zzau2 = this.a.zzau();
        ComponentName componentName = new ComponentName(zzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int k = k();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        p3b.a(zzau2, new JobInfo.Builder(k, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
