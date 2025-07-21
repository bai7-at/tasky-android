package defpackage;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.p6;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class alb extends mkb implements mib {
    private nib d;
    private String e;
    private boolean f;
    private boolean g;
    private ekb h;
    private long i;
    private long j;

    public alb(wib wibVar, vib vibVar) {
        super(wibVar);
        p6 p6Var = new p6(wibVar.getContext(), vibVar, (wib) this.c.get(), null);
        fgb.f("ExoPlayerAdapter initialized.");
        this.d = p6Var;
        p6Var.C(this);
    }

    protected static final String A(String str) {
        return "cache:".concat(String.valueOf(tfb.g(str)));
    }

    private static String B(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void C(long j) {
        wxf.l.postDelayed(new Runnable() { // from class: zkb
            @Override // java.lang.Runnable
            public final void run() {
                alb.this.z();
            }
        }, j);
    }

    @Override // defpackage.mib
    public final void a() {
        fgb.g("Precache onRenderedFirstFrame");
    }

    @Override // defpackage.mib
    public final void c(int i) {
    }

    @Override // defpackage.mib
    public final void d(int i, int i2) {
    }

    @Override // defpackage.mib
    public final void g(String str, Exception exc) {
        fgb.h("Precache exception", exc);
        dyf.q().v(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // defpackage.mib
    public final void h(final boolean z, final long j) {
        final wib wibVar = (wib) this.c.get();
        if (wibVar != null) {
            pgb.e.execute(new Runnable() { // from class: ykb
                @Override // java.lang.Runnable
                public final void run() {
                    wib.this.j0(z, j);
                }
            });
        }
    }

    @Override // defpackage.mib
    public final void j(String str, Exception exc) {
        fgb.h("Precache error", exc);
        dyf.q().v(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // defpackage.mkb
    public final void l() {
        synchronized (this) {
            this.f = true;
            notify();
            release();
        }
        String str = this.e;
        if (str != null) {
            m(this.e, A(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // defpackage.mkb
    public final void r(int i) {
        this.d.A(i);
    }

    @Override // defpackage.mkb, com.google.android.gms.common.api.Releasable
    public final void release() {
        nib nibVar = this.d;
        if (nibVar != null) {
            nibVar.C(null);
            this.d.y();
        }
    }

    @Override // defpackage.mkb
    public final void s(int i) {
        this.d.B(i);
    }

    @Override // defpackage.mkb
    public final void t(int i) {
        this.d.D(i);
    }

    @Override // defpackage.mkb
    public final void u(int i) {
        this.d.E(i);
    }

    @Override // defpackage.mkb
    public final boolean v(String str) {
        return w(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // defpackage.mkb
    public final boolean w(String str, String[] strArr) {
        String str2;
        String str3;
        alb albVar;
        long j;
        long j2;
        String str4;
        ?? r5;
        long j3;
        long j4;
        String str5;
        long j5;
        long j6;
        alb albVar2 = this;
        String str6 = str;
        albVar2.e = str6;
        String A = A(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            albVar2.d.w(uriArr, albVar2.b);
            wib wibVar = (wib) albVar2.c.get();
            if (wibVar != null) {
                wibVar.w(A, albVar2);
            }
            Clock b = dyf.b();
            long currentTimeMillis = b.currentTimeMillis();
            long longValue = ((Long) pla.c().a(mpa.y)).longValue();
            long longValue2 = ((Long) pla.c().a(mpa.x)).longValue() * 1000;
            long intValue = ((Integer) pla.c().a(mpa.w)).intValue();
            boolean booleanValue = ((Boolean) pla.c().a(mpa.Q1)).booleanValue();
            long j7 = -1;
            ?? r6 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (b.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (albVar2.f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (albVar2.g) {
                            break;
                        }
                        if (!albVar2.d.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long V = albVar2.d.V();
                        if (V > 0) {
                            long R = albVar2.d.R();
                            if (R != j7) {
                                try {
                                    j = r6;
                                    j6 = V;
                                    j2 = longValue2;
                                    j4 = longValue;
                                    str5 = A;
                                } catch (Throwable th) {
                                    th = th;
                                    str5 = A;
                                }
                                try {
                                    q(str, A, R, j6, R > 0, booleanValue ? albVar2.d.r() : -1L, booleanValue ? albVar2.d.T() : -1L, booleanValue ? albVar2.d.s() : -1L, nib.O(), nib.Q());
                                    j7 = R;
                                    j5 = V;
                                    str4 = j6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    albVar = this;
                                    str2 = str;
                                    str3 = str5;
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        fgb.g("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                                        dyf.q().v(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        albVar.m(str2, str3, "error", B("error", e));
                                        return false;
                                    }
                                }
                            } else {
                                j = r6;
                                j2 = longValue2;
                                j4 = longValue;
                                str5 = A;
                                j5 = V;
                                str4 = r6;
                            }
                            r5 = (R > j5 ? 1 : (R == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                o(str, str5, j5);
                            } else {
                                try {
                                    alb albVar3 = this;
                                    str4 = str;
                                    str3 = str5;
                                    if (albVar3.d.S() < j || R <= 0) {
                                        j3 = j4;
                                        r5 = albVar3;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    albVar = r5;
                                    str2 = str4;
                                    throw th;
                                }
                            }
                        } else {
                            j = r6;
                            j2 = longValue2;
                            str4 = str6;
                            str3 = A;
                            r5 = albVar2;
                            j3 = longValue;
                        }
                        try {
                            r5.wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str6;
                        str3 = A;
                        albVar = albVar2;
                    }
                }
                longValue = j3;
                albVar2 = r5;
                str6 = str4;
                A = str3;
                r6 = j;
                longValue2 = j2;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str6;
            str3 = A;
            albVar = albVar2;
        }
    }

    @Override // defpackage.mkb
    public final boolean x(String str, String[] strArr, ekb ekbVar) {
        this.e = str;
        this.h = ekbVar;
        String A = A(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.d.w(uriArr, this.b);
            wib wibVar = (wib) this.c.get();
            if (wibVar != null) {
                wibVar.w(A, this);
            }
            this.i = dyf.b().currentTimeMillis();
            this.j = -1L;
            C(0L);
            return true;
        } catch (Exception e) {
            fgb.g("Failed to preload url " + str + " Exception: " + e.getMessage());
            dyf.q().v(e, "VideoStreamExoPlayerCache.preload");
            release();
            m(str, A, "error", B("error", e));
            return false;
        }
    }

    public final nib y() {
        synchronized (this) {
            this.g = true;
            notify();
        }
        this.d.C(null);
        nib nibVar = this.d;
        this.d = null;
        return nibVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void z() {
        String str;
        alb albVar;
        alb albVar2;
        long longValue;
        long intValue;
        boolean booleanValue;
        alb albVar3;
        long j;
        long j2;
        String str2;
        alb albVar4;
        long j3;
        String A = A(this.e);
        try {
            longValue = ((Long) pla.c().a(mpa.x)).longValue() * 1000;
            intValue = ((Integer) pla.c().a(mpa.w)).intValue();
            booleanValue = ((Boolean) pla.c().a(mpa.Q1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
                albVar = booleanValue;
            }
        } catch (Exception e) {
            e = e;
            str = A;
            albVar = this;
        }
        synchronized (this) {
            try {
                if (dyf.b().currentTimeMillis() - this.i > longValue) {
                    throw new IOException("Timeout reached. Limit: " + longValue + " ms");
                }
                if (this.f) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.g) {
                    if (!this.d.M()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long V = this.d.V();
                    if (V > 0) {
                        long R = this.d.R();
                        if (R != this.j) {
                            try {
                                j2 = intValue;
                                str2 = A;
                                try {
                                    q(this.e, A, R, V, R > 0, booleanValue != 0 ? this.d.r() : -1L, booleanValue != 0 ? this.d.T() : -1L, booleanValue != 0 ? this.d.s() : -1L, nib.O(), nib.Q());
                                    albVar4 = this;
                                    j = R;
                                } catch (Throwable th2) {
                                    th = th2;
                                    albVar4 = this;
                                    str = str2;
                                    albVar = albVar4;
                                    try {
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        fgb.g("Failed to preload url " + albVar.e + " Exception: " + e.getMessage());
                                        dyf.q().v(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        albVar.m(albVar.e, str, "error", B("error", e));
                                        albVar2 = albVar;
                                        dyf.A().e(albVar2.h);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str2 = A;
                                albVar4 = this;
                            }
                            try {
                                albVar4.j = j;
                                j3 = V;
                                albVar4 = albVar4;
                            } catch (Throwable th4) {
                                th = th4;
                                str = str2;
                                albVar = albVar4;
                                throw th;
                            }
                        } else {
                            j = R;
                            j2 = intValue;
                            str2 = A;
                            albVar4 = this;
                            j3 = V;
                        }
                        if (j >= j3) {
                            albVar4.o(albVar4.e, str2, j3);
                            albVar2 = albVar4;
                        } else {
                            long S = albVar4.d.S();
                            albVar3 = albVar4;
                            if (S >= j2) {
                                albVar3 = albVar4;
                                if (j > 0) {
                                    albVar2 = albVar4;
                                }
                            }
                        }
                    } else {
                        albVar3 = this;
                    }
                    albVar3.C(((Long) pla.c().a(mpa.y)).longValue());
                    return;
                }
                albVar2 = this;
                dyf.A().e(albVar2.h);
            } catch (Throwable th5) {
                th = th5;
                str = A;
                albVar = this;
            }
        }
    }
}
