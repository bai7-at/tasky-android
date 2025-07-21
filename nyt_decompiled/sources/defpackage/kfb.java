package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.event.ProgressEvent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class kfb {
    private final Object a = new Object();
    private final c9f b;
    private final nfb c;
    private boolean d;
    private Context e;
    private zzcei f;
    private String g;
    private upa h;
    private Boolean i;
    private final AtomicInteger j;
    private final AtomicInteger k;
    private final jfb l;
    private final Object m;
    private j64 n;
    private final AtomicBoolean o;

    public kfb() {
        c9f c9fVar = new c9f();
        this.b = c9fVar;
        this.c = new nfb(kia.d(), c9fVar);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = new AtomicInteger(0);
        this.k = new AtomicInteger(0);
        this.l = new jfb(null);
        this.m = new Object();
        this.o = new AtomicBoolean();
    }

    public final int a() {
        return this.k.get();
    }

    public final int b() {
        return this.j.get();
    }

    public final Context d() {
        return this.e;
    }

    public final Resources e() {
        if (this.f.zzd) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) pla.c().a(mpa.qa)).booleanValue()) {
                return igb.a(this.e).getResources();
            }
            igb.a(this.e).getResources();
            return null;
        } catch (zzcef e) {
            fgb.h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final upa g() {
        upa upaVar;
        synchronized (this.a) {
            upaVar = this.h;
        }
        return upaVar;
    }

    public final nfb h() {
        return this.c;
    }

    public final hie i() {
        c9f c9fVar;
        synchronized (this.a) {
            c9fVar = this.b;
        }
        return c9fVar;
    }

    public final j64 k() {
        if (this.e != null) {
            if (!((Boolean) pla.c().a(mpa.B2)).booleanValue()) {
                synchronized (this.m) {
                    try {
                        j64 j64Var = this.n;
                        if (j64Var != null) {
                            return j64Var;
                        }
                        j64 j = pgb.a.j(new Callable() { // from class: ffb
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return kfb.this.o();
                            }
                        });
                        this.n = j;
                        return j;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zb.h(new ArrayList());
    }

    public final Boolean l() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.i;
        }
        return bool;
    }

    public final String n() {
        return this.g;
    }

    final /* synthetic */ ArrayList o() {
        Context a = gab.a(this.e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(a).getPackageInfo(a.getApplicationInfo().packageName, ProgressEvent.PART_FAILED_EVENT_CODE);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void q() {
        this.l.a();
    }

    public final void r() {
        this.j.decrementAndGet();
    }

    public final void s() {
        this.k.incrementAndGet();
    }

    public final void t() {
        this.j.incrementAndGet();
    }

    public final void u(Context context, zzcei zzceiVar) {
        upa upaVar;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = zzceiVar;
                    dyf.d().c(this.c);
                    this.b.r(this.e);
                    k8b.d(this.e, this.f);
                    dyf.g();
                    if (((Boolean) kra.c.e()).booleanValue()) {
                        upaVar = new upa();
                    } else {
                        pzc.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        upaVar = null;
                    }
                    this.h = upaVar;
                    if (upaVar != null) {
                        sgb.a(new gfb(this).b(), "AppState.registerCsiReporter");
                    }
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) pla.c().a(mpa.m8)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new hfb(this));
                        }
                    }
                    this.d = true;
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dyf.r().E(context, zzceiVar.zza);
    }

    public final void v(Throwable th, String str) {
        k8b.d(this.e, this.f).a(th, str, ((Double) esa.g.e()).floatValue());
    }

    public final void w(Throwable th, String str) {
        k8b.d(this.e, this.f).b(th, str);
    }

    public final void x(Boolean bool) {
        synchronized (this.a) {
            this.i = bool;
        }
    }

    public final void y(String str) {
        this.g = str;
    }

    public final boolean z(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) pla.c().a(mpa.m8)).booleanValue()) {
                return this.o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
