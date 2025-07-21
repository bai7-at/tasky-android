package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import defpackage.dzc;
import defpackage.og8;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class n {
    private static n e;
    private final Context a;
    private final ScheduledExecutorService b;
    private i c = new i(this, null);
    private int d = 1;

    n(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized n b(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (e == null) {
                    dzc.a();
                    e = new n(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                nVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    private final synchronized int f() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    private final synchronized og8 g(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(lVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.c.g(lVar)) {
                i iVar = new i(this, null);
                this.c = iVar;
                iVar.g(lVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lVar.b.a();
    }

    public final og8 c(int i, Bundle bundle) {
        return g(new k(f(), 2, bundle));
    }

    public final og8 d(int i, Bundle bundle) {
        return g(new m(f(), 1, bundle));
    }
}
