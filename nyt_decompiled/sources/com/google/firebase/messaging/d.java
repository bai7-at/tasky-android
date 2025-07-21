package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.d;
import com.google.firebase.messaging.i0;
import defpackage.gh4;
import defpackage.me5;
import defpackage.og8;
import defpackage.qg8;
import defpackage.vg8;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class d extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = f.b();
    private final Object lock = new Object();
    private int runningTasks = 0;

    class a implements i0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.i0.a
        public og8 a(Intent intent) {
            return d.this.f(intent);
        }
    }

    private void c(Intent intent) {
        if (intent != null) {
            g0.b(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Intent intent, og8 og8Var) {
        c(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Intent intent, qg8 qg8Var) {
        try {
            handleIntent(intent);
        } finally {
            qg8Var.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public og8 f(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return vg8.e(null);
        }
        final qg8 qg8Var = new qg8();
        this.executor.execute(new Runnable() { // from class: q12
            @Override // java.lang.Runnable
            public final void run() {
                d.this.e(intent, qg8Var);
            }
        });
        return qg8Var.a();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new i0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        og8 f = f(startCommandIntent);
        if (f.p()) {
            c(intent);
            return 2;
        }
        f.c(new gh4(), new me5() { // from class: p12
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var) {
                d.this.d(intent, og8Var);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
