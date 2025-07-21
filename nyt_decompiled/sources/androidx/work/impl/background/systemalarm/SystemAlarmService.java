package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import defpackage.f44;
import defpackage.h94;
import defpackage.rc9;

/* loaded from: classes.dex */
public class SystemAlarmService extends f44 implements e.c {
    private static final String d = h94.i("SystemAlarmService");
    private e b;
    private boolean c;

    private void e() {
        e eVar = new e(this);
        this.b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.c = true;
        h94.e().a(d, "All commands completed in dispatcher");
        rc9.a();
        stopSelf();
    }

    @Override // defpackage.f44, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.c = false;
    }

    @Override // defpackage.f44, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.k();
    }

    @Override // defpackage.f44, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            h94.e().f(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.k();
            e();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.b(intent, i2);
        return 3;
    }
}
