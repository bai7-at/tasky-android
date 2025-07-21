package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.s8;
import defpackage.tc9;
import defpackage.wbf;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements wbf {
    private s8 a;

    private final s8 d() {
        if (this.a == null) {
            this.a = new s8(this);
        }
        return this.a;
    }

    @Override // defpackage.wbf
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.wbf
    public final void b(Intent intent) {
        tc9.b(intent);
    }

    @Override // defpackage.wbf
    public final void c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d().g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        d().a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
