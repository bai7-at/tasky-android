package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.a7;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.w6;
import com.google.android.gms.internal.ads.x6;
import com.google.android.gms.internal.ads.z6;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class v7e implements Runnable {
    public static final Object k = new Object();
    private static final Object l = new Object();
    private static final Object m = new Object();
    public static Boolean n;
    private final Context a;
    private final zzcei b;
    private int e;
    private final hsc f;
    private final List g;
    private final q5d i;
    private final eab j;
    private final z6 c = c7.M();
    private String d = "";
    private boolean h = false;

    public v7e(Context context, zzcei zzceiVar, hsc hscVar, q5d q5dVar, eab eabVar) {
        this.a = context;
        this.b = zzceiVar;
        this.f = hscVar;
        this.i = q5dVar;
        this.j = eabVar;
        if (((Boolean) pla.c().a(mpa.J8)).booleanValue()) {
            this.g = wxf.F();
        } else {
            this.g = zzgaa.t();
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (k) {
            try {
                if (n == null) {
                    if (((Boolean) jra.b.e()).booleanValue()) {
                        n = Boolean.valueOf(Math.random() < ((Double) jra.a.e()).doubleValue());
                    } else {
                        n = Boolean.FALSE;
                    }
                }
                booleanValue = n.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(final j7e j7eVar) {
        pgb.a.l(new Runnable() { // from class: u7e
            @Override // java.lang.Runnable
            public final void run() {
                v7e.this.c(j7eVar);
            }
        });
    }

    final /* synthetic */ void c(j7e j7eVar) {
        synchronized (m) {
            try {
                if (!this.h) {
                    this.h = true;
                    if (a()) {
                        try {
                            dyf.r();
                            this.d = wxf.R(this.a);
                        } catch (RemoteException e) {
                            dyf.q().w(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.e = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.a);
                        int intValue = ((Integer) pla.c().a(mpa.E8)).intValue();
                        if (((Boolean) pla.c().a(mpa.kb)).booleanValue()) {
                            long j = intValue;
                            pgb.d.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = intValue;
                            pgb.d.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && j7eVar != null) {
            synchronized (l) {
                try {
                    if (this.c.n() >= ((Integer) pla.c().a(mpa.F8)).intValue()) {
                        return;
                    }
                    w6 L = x6.L();
                    L.H(j7eVar.l());
                    L.D(j7eVar.k());
                    L.t(j7eVar.b());
                    L.J(3);
                    L.z(this.b.zza);
                    L.o(this.d);
                    L.x(Build.VERSION.RELEASE);
                    L.E(Build.VERSION.SDK_INT);
                    L.I(j7eVar.n());
                    L.w(j7eVar.a());
                    L.r(this.e);
                    L.G(j7eVar.m());
                    L.p(j7eVar.d());
                    L.s(j7eVar.f());
                    L.u(j7eVar.g());
                    L.v(this.f.c(j7eVar.g()));
                    L.y(j7eVar.h());
                    L.q(j7eVar.e());
                    L.F(j7eVar.j());
                    L.A(j7eVar.i());
                    L.B(j7eVar.c());
                    if (((Boolean) pla.c().a(mpa.J8)).booleanValue()) {
                        L.n(this.g);
                    }
                    z6 z6Var = this.c;
                    a7 L2 = b7.L();
                    L2.n(L);
                    z6Var.o(L2);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] i;
        if (a()) {
            Object obj = l;
            synchronized (obj) {
                try {
                    if (this.c.n() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            i = ((c7) this.c.i()).i();
                            this.c.p();
                        }
                        new p5d(this.a, this.b.zza, this.j, Binder.getCallingUid()).zza(new k5d((String) pla.c().a(mpa.D8), 60000, new HashMap(), i, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzead) && ((zzead) e).a() == 3) {
                            return;
                        }
                        dyf.q().v(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
