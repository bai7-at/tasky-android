package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import defpackage.og8;
import defpackage.qg8;
import defpackage.vm;
import defpackage.wm;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e implements vm {
    private static vm e;
    private final Context a;
    private boolean b;
    private final ScheduledExecutorService c;
    private final ExecutorService d;

    e(Context context) {
        this.b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = newSingleThreadScheduledExecutor;
        this.d = Executors.newSingleThreadExecutor();
        this.a = context;
        if (this.b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new d(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.b = true;
    }

    static synchronized vm d(Context context) {
        vm vmVar;
        synchronized (e.class) {
            try {
                Preconditions.checkNotNull(context, "Context must not be null");
                if (e == null) {
                    e = new e(context.getApplicationContext());
                }
                vmVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vmVar;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) {
        if (g(context).edit().putLong("app_set_id_last_used_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }

    protected final long a() {
        long j = g(this.a).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    @Override // defpackage.vm
    public final og8 b() {
        final qg8 qg8Var = new qg8();
        this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.e(qg8Var);
            }
        });
        return qg8Var.a();
    }

    final /* synthetic */ void e(qg8 qg8Var) {
        String string = g(this.a).getString("app_set_id", null);
        long a = a();
        if (string == null || DefaultClock.getInstance().currentTimeMillis() > a) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new zzk("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new zzk("Failed to store the app set ID creation time.");
                }
            } catch (zzk e2) {
                qg8Var.b(e2);
                return;
            }
        } else {
            try {
                h(this.a);
            } catch (zzk e3) {
                qg8Var.b(e3);
                return;
            }
        }
        qg8Var.c(new wm(string, 1));
    }
}
