package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class zea implements cfa {
    private static zea u;
    private final Context a;
    private final xbe b;
    private final ace c;
    private final bce d;
    private final dga e;
    private final tae f;
    private final Executor g;
    private final zbe h;
    private final sga j;
    private final kga k;
    private final bga l;
    private volatile boolean r;
    private volatile boolean s;
    private final int t;
    volatile long m = 0;
    private final Object n = new Object();
    private final CountDownLatch i = new CountDownLatch(1);

    zea(Context context, tae taeVar, xbe xbeVar, ace aceVar, bce bceVar, dga dgaVar, Executor executor, oae oaeVar, int i, sga sgaVar, kga kgaVar, bga bgaVar) {
        this.s = false;
        this.a = context;
        this.f = taeVar;
        this.b = xbeVar;
        this.c = aceVar;
        this.d = bceVar;
        this.e = dgaVar;
        this.g = executor;
        this.t = i;
        this.j = sgaVar;
        this.k = kgaVar;
        this.l = bgaVar;
        this.s = false;
        this.h = new rea(this, oaeVar);
    }

    public static synchronized zea f(String str, Context context, boolean z, boolean z2) {
        zea g;
        synchronized (zea.class) {
            g = g(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return g;
    }

    public static synchronized zea g(String str, Context context, Executor executor, boolean z, boolean z2) {
        zea zeaVar;
        synchronized (zea.class) {
            try {
                if (u == null) {
                    uae a = vae.a();
                    a.a(str);
                    a.c(z);
                    vae d = a.d();
                    tae a2 = tae.a(context, executor, z2);
                    jfa c = ((Boolean) pla.c().a(mpa.i3)).booleanValue() ? jfa.c(context) : null;
                    sga d2 = ((Boolean) pla.c().a(mpa.j3)).booleanValue() ? sga.d(context, executor) : null;
                    kga kgaVar = ((Boolean) pla.c().a(mpa.x2)).booleanValue() ? new kga() : null;
                    bga bgaVar = ((Boolean) pla.c().a(mpa.z2)).booleanValue() ? new bga() : null;
                    obe e = obe.e(context, executor, a2, d);
                    cga cgaVar = new cga(context);
                    dga dgaVar = new dga(d, e, new qga(context, cgaVar), cgaVar, c, d2, kgaVar, bgaVar);
                    int b = pbe.b(context, a2);
                    oae oaeVar = new oae();
                    zea zeaVar2 = new zea(context, a2, new xbe(context, b), new ace(context, b, new qea(a2), ((Boolean) pla.c().a(mpa.g2)).booleanValue()), new bce(context, dgaVar, a2, oaeVar), dgaVar, executor, oaeVar, b, d2, kgaVar, bgaVar);
                    u = zeaVar2;
                    zeaVar2.l();
                    u.m();
                }
                zeaVar = u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zeaVar;
    }

    static /* bridge */ /* synthetic */ void k(zea zeaVar) {
        String str;
        String str2;
        int length;
        boolean a;
        long currentTimeMillis = System.currentTimeMillis();
        wbe q = zeaVar.q(1);
        if (q != null) {
            String U = q.a().U();
            str2 = q.a().T();
            str = U;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzfsk a2 = fbe.a(zeaVar.a, 1, zeaVar.t, str, str2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, zeaVar.f);
                byte[] bArr = a2.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zeaVar.f.d(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        d2 M = d2.M(zzgyl.D(bArr, 0, length), ph.a());
                        if (!M.N().U().isEmpty() && !M.N().T().isEmpty() && M.O().a().length != 0) {
                            wbe q2 = zeaVar.q(1);
                            if (q2 != null) {
                                g2 a3 = q2.a();
                                if (M.N().U().equals(a3.U())) {
                                    if (!M.N().T().equals(a3.T())) {
                                    }
                                }
                            }
                            zbe zbeVar = zeaVar.h;
                            int i = a2.zzc;
                            if (!((Boolean) pla.c().a(mpa.e2)).booleanValue()) {
                                a = zeaVar.b.a(M, zbeVar);
                            } else if (i == 3) {
                                a = zeaVar.c.a(M);
                            } else {
                                if (i == 4) {
                                    a = zeaVar.c.b(M, zbeVar);
                                }
                                zeaVar.f.d(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (a) {
                                wbe q3 = zeaVar.q(1);
                                if (q3 != null) {
                                    if (zeaVar.d.c(q3)) {
                                        zeaVar.s = true;
                                    }
                                    zeaVar.m = System.currentTimeMillis() / 1000;
                                }
                            }
                            zeaVar.f.d(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zeaVar.f.d(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zeaVar.f.d(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzhag e) {
                zeaVar.f.c(4002, System.currentTimeMillis() - currentTimeMillis, e);
            }
            zeaVar.i.countDown();
        } catch (Throwable th) {
            zeaVar.i.countDown();
            throw th;
        }
    }

    private final void p() {
        sga sgaVar = this.j;
        if (sgaVar != null) {
            sgaVar.h();
        }
    }

    private final wbe q(int i) {
        if (pbe.a(this.t)) {
            return ((Boolean) pla.c().a(mpa.e2)).booleanValue() ? this.c.c(1) : this.b.c(1);
        }
        return null;
    }

    @Override // defpackage.cfa
    public final void a(View view) {
        this.e.a(view);
    }

    @Override // defpackage.cfa
    public final String b(Context context) {
        p();
        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
            this.k.j();
        }
        m();
        wae a = this.d.a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = a.zzc(context, null);
        this.f.f(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // defpackage.cfa
    public final String c(Context context, String str, View view) {
        return e(context, str, view, null);
    }

    @Override // defpackage.cfa
    public final void d(StackTraceElement[] stackTraceElementArr) {
        bga bgaVar = this.l;
        if (bgaVar != null) {
            bgaVar.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // defpackage.cfa
    public final String e(Context context, String str, View view, Activity activity) {
        p();
        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
            this.k.i();
        }
        m();
        wae a = this.d.a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = a.zza(context, null, str, view, activity);
        this.f.f(CrashReportManager.TIME_WINDOW, System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    final synchronized void l() {
        long currentTimeMillis = System.currentTimeMillis();
        wbe q = q(1);
        if (q == null) {
            this.f.d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.d.c(q)) {
            this.s = true;
            this.i.countDown();
        }
    }

    public final void m() {
        if (this.r) {
            return;
        }
        synchronized (this.n) {
            try {
                if (!this.r) {
                    if ((System.currentTimeMillis() / 1000) - this.m < 3600) {
                        return;
                    }
                    wbe b = this.d.b();
                    if ((b == null || b.d(3600L)) && pbe.a(this.t)) {
                        this.g.execute(new yea(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean o() {
        return this.s;
    }

    @Override // defpackage.cfa
    public final String zzh(Context context, View view, Activity activity) {
        p();
        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
            this.k.k(context, view);
        }
        m();
        wae a = this.d.a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb = a.zzb(context, null, view, activity);
        this.f.f(5002, System.currentTimeMillis() - currentTimeMillis, zzb, null);
        return zzb;
    }

    @Override // defpackage.cfa
    public final void zzk(MotionEvent motionEvent) {
        wae a = this.d.a();
        if (a != null) {
            try {
                a.zzd(null, motionEvent);
            } catch (zzfso e) {
                this.f.c(e.a(), -1L, e);
            }
        }
    }

    @Override // defpackage.cfa
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) pla.c().a(mpa.pb)).booleanValue() || (displayMetrics = this.a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain);
        obtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain2);
        obtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain3);
        obtain3.recycle();
    }
}
