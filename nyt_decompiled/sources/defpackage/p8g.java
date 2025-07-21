package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.gms.internal.ads.zzzj;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class p8g extends Handler implements Runnable {
    private final r8g a;
    private final long b;
    private k8g c;
    private IOException d;
    private int e;
    private Thread f;
    private boolean g;
    private volatile boolean h;
    final /* synthetic */ w8g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8g(w8g w8gVar, Looper looper, r8g r8gVar, k8g k8gVar, int i, long j) {
        super(looper);
        this.i = w8gVar;
        this.a = r8gVar;
        this.c = k8gVar;
        this.b = j;
    }

    private final void d() {
        ExecutorService executorService;
        p8g p8gVar;
        this.d = null;
        w8g w8gVar = this.i;
        executorService = w8gVar.a;
        p8gVar = w8gVar.b;
        p8gVar.getClass();
        executorService.execute(p8gVar);
    }

    public final void a(boolean z) {
        this.h = z;
        this.d = null;
        if (hasMessages(0)) {
            this.g = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.g = true;
                    this.a.zzg();
                    Thread thread = this.f;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.i.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k8g k8gVar = this.c;
            k8gVar.getClass();
            k8gVar.k(this.a, elapsedRealtime, elapsedRealtime - this.b, true);
            this.c = null;
        }
    }

    public final void b(int i) {
        IOException iOException = this.d;
        if (iOException != null && this.e > i) {
            throw iOException;
        }
    }

    public final void c(long j) {
        p8g p8gVar;
        p8gVar = this.i.b;
        wad.f(p8gVar == null);
        this.i.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.h) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            d();
            return;
        }
        if (i4 == 3) {
            throw ((Error) message.obj);
        }
        this.i.b = null;
        long j2 = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - j2;
        k8g k8gVar = this.c;
        k8gVar.getClass();
        if (this.g) {
            k8gVar.k(this.a, elapsedRealtime, j3, false);
            return;
        }
        int i5 = message.what;
        if (i5 == 1) {
            try {
                k8gVar.d(this.a, elapsedRealtime, j3);
                return;
            } catch (RuntimeException e) {
                ezd.d("LoadTask", "Unexpected exception handling load completed", e);
                this.i.c = new zzzj(e);
                return;
            }
        }
        if (i5 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.d = iOException;
        int i6 = this.e + 1;
        this.e = i6;
        n8g g = k8gVar.g(this.a, elapsedRealtime, j3, iOException, i6);
        i = g.a;
        if (i == 3) {
            this.i.c = this.d;
            return;
        }
        i2 = g.a;
        if (i2 != 2) {
            i3 = g.a;
            if (i3 == 1) {
                this.e = 1;
            }
            j = g.b;
            c(j != -9223372036854775807L ? g.b : Math.min((this.e - 1) * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, CrashReportManager.TIME_WINDOW));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.g;
                this.f = Thread.currentThread();
            }
            if (!z) {
                String str = "load:" + this.a.getClass().getSimpleName();
                int i = khe.a;
                Trace.beginSection(str);
                try {
                    this.a.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f = null;
                Thread.interrupted();
            }
            if (this.h) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.h) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Error e2) {
            if (!this.h) {
                ezd.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.h) {
                return;
            }
            ezd.d("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(2, new zzzj(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.h) {
                return;
            }
            ezd.d("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(2, new zzzj(e4)).sendToTarget();
        }
    }
}
