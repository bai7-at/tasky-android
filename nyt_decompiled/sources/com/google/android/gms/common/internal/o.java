package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class o implements ServiceConnection, zzt {
    private final Map a = new HashMap();
    private int b = 2;
    private boolean c;
    private IBinder d;
    private final zzo e;
    private ComponentName f;
    final /* synthetic */ q g;

    public o(q qVar, zzo zzoVar) {
        this.g = qVar;
        this.e = zzoVar;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f;
    }

    public final IBinder c() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            q qVar = this.g;
            connectionTracker = qVar.e;
            context = qVar.b;
            zzo zzoVar = this.e;
            context2 = qVar.b;
            boolean zza = connectionTracker.zza(context, str, zzoVar.zzb(context2), this, 4225, executor);
            this.c = zza;
            if (zza) {
                handler = this.g.c;
                Message obtainMessage = handler.obtainMessage(1, this.e);
                handler2 = this.g.c;
                j = this.g.g;
                handler2.sendMessageDelayed(obtainMessage, j);
            } else {
                this.b = 2;
                try {
                    q qVar2 = this.g;
                    connectionTracker2 = qVar2.e;
                    context3 = qVar2.b;
                    connectionTracker2.unbindService(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        handler = this.g.c;
        handler.removeMessages(1, this.e);
        q qVar = this.g;
        connectionTracker = qVar.e;
        context = qVar.b;
        connectionTracker.unbindService(context, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.a;
        synchronized (hashMap) {
            try {
                handler = this.g.c;
                handler.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it2 = this.a.values().iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.a;
        synchronized (hashMap) {
            try {
                handler = this.g.c;
                handler.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it2 = this.a.values().iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
