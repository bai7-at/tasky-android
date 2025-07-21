package defpackage;

import com.google.firebase.crashlytics.internal.settings.c;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zx6 {
    private final double a;
    private final double b;
    private final long c;
    private final int d;
    private final BlockingQueue e;
    private final ThreadPoolExecutor f;
    private final yr8 g;
    private final qe5 h;
    private int i;
    private long j;

    private final class b implements Runnable {
        private final g21 a;
        private final qg8 b;

        @Override // java.lang.Runnable
        public void run() {
            zx6.this.m(this.a, this.b);
            zx6.this.h.c();
            double f = zx6.this.f();
            m94.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(f / 1000.0d)) + " s for report: " + this.a.d());
            zx6.n(f);
        }

        private b(g21 g21Var, qg8 qg8Var) {
            this.a = g21Var;
            this.b = qg8Var;
        }
    }

    zx6(yr8 yr8Var, c cVar, qe5 qe5Var) {
        this(cVar.f, cVar.g, cVar.h * 1000, yr8Var, qe5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double f() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, g()));
    }

    private int g() {
        if (this.j == 0) {
            this.j = l();
        }
        int l = (int) ((l() - this.j) / this.c);
        int min = j() ? Math.min(100, this.i + l) : Math.max(0, this.i - l);
        if (this.i != min) {
            this.i = min;
            this.j = l();
        }
        return min;
    }

    private boolean i() {
        return this.e.size() < this.d;
    }

    private boolean j() {
        return this.e.size() == this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(qg8 qg8Var, g21 g21Var, Exception exc) {
        if (exc != null) {
            qg8Var.d(exc);
        } else {
            qg8Var.e(g21Var);
        }
    }

    private long l() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(final g21 g21Var, final qg8 qg8Var) {
        m94.f().b("Sending report through Google DataTransport: " + g21Var.d());
        this.g.a(b32.f(g21Var.b()), new ks8() { // from class: yx6
            @Override // defpackage.ks8
            public final void a(Exception exc) {
                zx6.k(qg8.this, g21Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    qg8 h(g21 g21Var, boolean z) {
        synchronized (this.e) {
            try {
                qg8 qg8Var = new qg8();
                if (!z) {
                    m(g21Var, qg8Var);
                    return qg8Var;
                }
                this.h.b();
                if (!i()) {
                    g();
                    m94.f().b("Dropping report due to queue being full: " + g21Var.d());
                    this.h.a();
                    qg8Var.e(g21Var);
                    return qg8Var;
                }
                m94.f().b("Enqueueing report: " + g21Var.d());
                m94.f().b("Queue size: " + this.e.size());
                this.f.execute(new b(g21Var, qg8Var));
                m94.f().b("Closing task for report: " + g21Var.d());
                qg8Var.e(g21Var);
                return qg8Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zx6(double d, double d2, long j, yr8 yr8Var, qe5 qe5Var) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.g = yr8Var;
        this.h = qe5Var;
        int i = (int) d;
        this.d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.e = arrayBlockingQueue;
        this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.i = 0;
        this.j = 0L;
    }
}
