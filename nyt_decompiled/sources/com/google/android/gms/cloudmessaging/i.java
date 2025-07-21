package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.cdf;
import defpackage.ysd;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class i implements ServiceConnection {
    j c;
    final /* synthetic */ n f;
    int a = 0;
    final Messenger b = new Messenger(new ysd(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.c
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            i iVar = i.this;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (iVar) {
                try {
                    l lVar = (l) iVar.e.get(i);
                    if (lVar == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    iVar.e.remove(i);
                    iVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        lVar.c(new zzq(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    lVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    /* synthetic */ i(n nVar, cdf cdfVar) {
        this.f = nVar;
    }

    final synchronized void a(int i, String str) {
        b(i, str, null);
    }

    final synchronized void b(int i, String str, Throwable th) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.f.a;
            connectionTracker.unbindService(context, this);
            zzq zzqVar = new zzq(i, str, th);
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                ((l) it2.next()).c(zzqVar);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                ((l) this.e.valueAt(i3)).c(zzqVar);
            }
            this.e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f.b;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.e
            @Override // java.lang.Runnable
            public final void run() {
                final l lVar;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final i iVar = i.this;
                while (true) {
                    synchronized (iVar) {
                        try {
                            if (iVar.a != 2) {
                                return;
                            }
                            if (iVar.d.isEmpty()) {
                                iVar.f();
                                return;
                            }
                            lVar = (l) iVar.d.poll();
                            iVar.e.put(lVar.a, lVar);
                            scheduledExecutorService2 = iVar.f.b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i.this.e(lVar.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(lVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    context = iVar.f.a;
                    Messenger messenger = iVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = lVar.c;
                    obtain.arg1 = lVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.d);
                    obtain.setData(bundle);
                    try {
                        iVar.c.a(obtain);
                    } catch (RemoteException e) {
                        iVar.a(2, e.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i) {
        l lVar = (l) this.e.get(i);
        if (lVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            lVar.c(new zzq(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        Context context;
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                context = this.f.a;
                connectionTracker.unbindService(context, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(l lVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(lVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(lVar);
            c();
            return true;
        }
        this.d.add(lVar);
        Preconditions.checkState(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.f.a;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.f.b;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f.b;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.g
            @Override // java.lang.Runnable
            public final void run() {
                i iVar = i.this;
                IBinder iBinder2 = iBinder;
                synchronized (iVar) {
                    if (iBinder2 == null) {
                        iVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        iVar.c = new j(iBinder2);
                        iVar.a = 2;
                        iVar.c();
                    } catch (RemoteException e) {
                        iVar.a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f.b;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.d
            @Override // java.lang.Runnable
            public final void run() {
                i.this.a(2, "Service disconnected");
            }
        });
    }
}
