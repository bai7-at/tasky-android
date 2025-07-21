package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.util.crashreport.CrashReportManager;
import defpackage.a84;
import defpackage.ep8;
import defpackage.ur;
import defpackage.x64;
import defpackage.z19;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Loader implements x64 {
    public static final c d = h(false, -9223372036854775807L);
    public static final c e = h(true, -9223372036854775807L);
    public static final c f;
    public static final c g;
    private final ExecutorService a;
    private d b;
    private IOException c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public interface b {
        void e(e eVar, long j, long j2, boolean z);

        void k(e eVar, long j, long j2);

        c o(e eVar, long j, long j2, IOException iOException, int i);
    }

    public static final class c {
        private final int a;
        private final long b;

        public boolean c() {
            int i = this.a;
            return i == 0 || i == 1;
        }

        private c(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    private final class d extends Handler implements Runnable {
        public final int a;
        private final e b;
        private final long c;
        private b d;
        private IOException e;
        private int f;
        private Thread g;
        private boolean h;
        private volatile boolean i;

        public d(Looper looper, e eVar, b bVar, int i, long j) {
            super(looper);
            this.b = eVar;
            this.d = bVar;
            this.a = i;
            this.c = j;
        }

        private void b() {
            this.e = null;
            Loader.this.a.execute((Runnable) ur.e(Loader.this.b));
        }

        private void c() {
            Loader.this.b = null;
        }

        private long d() {
            return Math.min((this.f - 1) * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT, CrashReportManager.TIME_WINDOW);
        }

        public void a(boolean z) {
            this.i = z;
            this.e = null;
            if (hasMessages(0)) {
                this.h = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.h = true;
                        this.b.c();
                        Thread thread = this.g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) ur.e(this.d)).e(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public void e(int i) {
            IOException iOException = this.e;
            if (iOException != null && this.f > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            ur.g(Loader.this.b == null);
            Loader.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.i) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                b();
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.c;
            b bVar = (b) ur.e(this.d);
            if (this.h) {
                bVar.e(this.b, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    bVar.k(this.b, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    a84.e("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            c o = bVar.o(this.b, elapsedRealtime, j, iOException, i3);
            if (o.a == 3) {
                Loader.this.c = this.e;
            } else if (o.a != 2) {
                if (o.a == 1) {
                    this.f = 1;
                }
                f(o.b != -9223372036854775807L ? o.b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.h;
                    this.g = Thread.currentThread();
                }
                if (!z) {
                    ep8.a("load:" + this.b.getClass().getSimpleName());
                    try {
                        this.b.a();
                        ep8.c();
                    } catch (Throwable th) {
                        ep8.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.g = null;
                    Thread.interrupted();
                }
                if (this.i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e) {
                if (this.i) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (Error e2) {
                if (!this.i) {
                    a84.e("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.i) {
                    return;
                }
                a84.e("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.i) {
                    return;
                }
                a84.e("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new UnexpectedLoaderException(e4)).sendToTarget();
            }
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void q();
    }

    private static final class g implements Runnable {
        private final f a;

        public g(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.q();
        }
    }

    static {
        long j = -9223372036854775807L;
        f = new c(2, j);
        g = new c(3, j);
    }

    public Loader(String str) {
        this.a = z19.E0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z, long j) {
        return new c(z ? 1 : 0, j);
    }

    @Override // defpackage.x64
    public void a() {
        k(RecyclerView.UNDEFINED_DURATION);
    }

    public void f() {
        ((d) ur.i(this.b)).a(false);
    }

    public void g() {
        this.c = null;
    }

    public boolean i() {
        return this.c != null;
    }

    public boolean j() {
        return this.b != null;
    }

    public void k(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.b;
        if (dVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = dVar.a;
            }
            dVar.e(i);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public long n(e eVar, b bVar, int i) {
        Looper looper = (Looper) ur.i(Looper.myLooper());
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
