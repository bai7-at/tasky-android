package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import defpackage.ezd;
import defpackage.uid;

/* loaded from: classes3.dex */
final class c extends HandlerThread implements Handler.Callback {
    private uid a;
    private Handler b;
    private Error c;
    private RuntimeException d;
    private zzaak e;

    public c() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final zzaak a(int i) {
        boolean z;
        start();
        this.b = new Handler(getLooper(), this);
        this.a = new uid(this.b, null);
        synchronized (this) {
            z = false;
            this.b.obtainMessage(1, i, 0).sendToTarget();
            while (this.e == null && this.d == null && this.c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.c;
        if (error != null) {
            throw error;
        }
        zzaak zzaakVar = this.e;
        zzaakVar.getClass();
        return zzaakVar;
    }

    public final void b() {
        Handler handler = this.b;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        uid uidVar;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    uid uidVar2 = this.a;
                    if (uidVar2 == null) {
                        throw null;
                    }
                    uidVar2.b(i2);
                    this.e = new zzaak(this, this.a.a(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzet e) {
                    ezd.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    ezd.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    ezd.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    uidVar = this.a;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (uidVar == null) {
                    throw null;
                }
                uidVar.c();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
