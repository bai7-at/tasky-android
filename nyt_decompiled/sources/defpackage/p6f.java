package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class p6f implements Runnable, cfa {
    protected boolean d;
    private final boolean e;
    private final boolean f;
    private final Executor g;
    private final tae h;
    private Context i;
    private final Context j;
    private zzcei k;
    private final zzcei l;
    private final boolean m;
    private int r;
    private final List a = new Vector();
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    final CountDownLatch n = new CountDownLatch(1);

    public p6f(Context context, zzcei zzceiVar) {
        this.i = context;
        this.j = context;
        this.k = zzceiVar;
        this.l = zzceiVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.g = newCachedThreadPool;
        boolean booleanValue = ((Boolean) pla.c().a(mpa.j2)).booleanValue();
        this.m = booleanValue;
        this.h = tae.a(context, newCachedThreadPool, booleanValue);
        this.e = ((Boolean) pla.c().a(mpa.f2)).booleanValue();
        this.f = ((Boolean) pla.c().a(mpa.k2)).booleanValue();
        if (((Boolean) pla.c().a(mpa.i2)).booleanValue()) {
            this.r = 2;
        } else {
            this.r = 1;
        }
        if (!((Boolean) pla.c().a(mpa.m3)).booleanValue()) {
            this.d = h();
        }
        if (((Boolean) pla.c().a(mpa.f3)).booleanValue()) {
            pgb.a.execute(this);
            return;
        }
        kia.b();
        if (tfb.w()) {
            pgb.a.execute(this);
        } else {
            run();
        }
    }

    private final cfa k() {
        return j() == 2 ? (cfa) this.c.get() : (cfa) this.b.get();
    }

    private final void l() {
        List list = this.a;
        cfa k = k();
        if (list.isEmpty() || k == null) {
            return;
        }
        for (Object[] objArr : this.a) {
            int length = objArr.length;
            if (length == 1) {
                k.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                k.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.a.clear();
    }

    private final void m(boolean z) {
        this.b.set(ffa.v(this.k.zza, n(this.i), z, this.r));
    }

    private static final Context n(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // defpackage.cfa
    public final void a(View view) {
        cfa k = k();
        if (k != null) {
            k.a(view);
        }
    }

    @Override // defpackage.cfa
    public final String b(Context context) {
        cfa k;
        if (!i() || (k = k()) == null) {
            return "";
        }
        l();
        return k.b(n(context));
    }

    @Override // defpackage.cfa
    public final String c(Context context, String str, View view) {
        return e(context, str, view, null);
    }

    @Override // defpackage.cfa
    public final void d(StackTraceElement[] stackTraceElementArr) {
        cfa k;
        if (!i() || (k = k()) == null) {
            return;
        }
        k.d(stackTraceElementArr);
    }

    @Override // defpackage.cfa
    public final String e(Context context, String str, View view, Activity activity) {
        if (!i()) {
            return "";
        }
        cfa k = k();
        if (((Boolean) pla.c().a(mpa.ha)).booleanValue()) {
            dyf.r();
            wxf.i(view, 4, null);
        }
        if (k == null) {
            return "";
        }
        l();
        return k.e(n(context), str, view, activity);
    }

    final /* synthetic */ void g(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zea.f(this.l.zza, n(this.j), z, this.m).m();
        } catch (NullPointerException e) {
            this.h.c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    protected final boolean h() {
        Context context = this.i;
        x0f x0fVar = new x0f(this);
        tae taeVar = this.h;
        return new ace(this.i, pbe.b(context, taeVar), x0fVar, ((Boolean) pla.c().a(mpa.g2)).booleanValue()).d(1);
    }

    public final boolean i() {
        try {
            this.n.await();
            return true;
        } catch (InterruptedException e) {
            fgb.h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    protected final int j() {
        if (!this.e || this.d) {
            return this.r;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) pla.c().a(mpa.m3)).booleanValue()) {
                this.d = h();
            }
            boolean z = this.k.zzd;
            final boolean z2 = false;
            if (!((Boolean) pla.c().a(mpa.W0)).booleanValue() && z) {
                z2 = true;
            }
            if (j() == 1) {
                m(z2);
                if (this.r == 2) {
                    this.g.execute(new Runnable() { // from class: fie
                        @Override // java.lang.Runnable
                        public final void run() {
                            p6f.this.g(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zea f = zea.f(this.k.zza, n(this.i), z2, this.m);
                    this.c.set(f);
                    if (this.f && !f.o()) {
                        this.r = 1;
                        m(z2);
                    }
                } catch (NullPointerException e) {
                    this.r = 1;
                    m(z2);
                    this.h.c(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
            this.n.countDown();
            this.i = null;
            this.k = null;
        } catch (Throwable th) {
            this.n.countDown();
            this.i = null;
            this.k = null;
            throw th;
        }
    }

    @Override // defpackage.cfa
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) pla.c().a(mpa.ga)).booleanValue()) {
            cfa k = k();
            if (((Boolean) pla.c().a(mpa.ha)).booleanValue()) {
                dyf.r();
                wxf.i(view, 2, null);
            }
            return k != null ? k.zzh(context, view, activity) : "";
        }
        if (!i()) {
            return "";
        }
        cfa k2 = k();
        if (((Boolean) pla.c().a(mpa.ha)).booleanValue()) {
            dyf.r();
            wxf.i(view, 2, null);
        }
        return k2 != null ? k2.zzh(context, view, activity) : "";
    }

    @Override // defpackage.cfa
    public final void zzk(MotionEvent motionEvent) {
        cfa k = k();
        if (k == null) {
            this.a.add(new Object[]{motionEvent});
        } else {
            l();
            k.zzk(motionEvent);
        }
    }

    @Override // defpackage.cfa
    public final void zzl(int i, int i2, int i3) {
        cfa k = k();
        if (k == null) {
            this.a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            l();
            k.zzl(i, i2, i3);
        }
    }
}
