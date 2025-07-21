package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jxc {
    private final Context f;
    private final WeakReference g;
    private final msc h;
    private final Executor i;
    private final Executor j;
    private final ScheduledExecutorService k;
    private final jvc l;
    private final zzcei m;
    private final wec o;
    private final v7e p;
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final ugb e = new ugb();
    private final Map n = new ConcurrentHashMap();
    private boolean q = true;
    private final long d = dyf.b().elapsedRealtime();

    public jxc(Executor executor, Context context, WeakReference weakReference, Executor executor2, msc mscVar, ScheduledExecutorService scheduledExecutorService, jvc jvcVar, zzcei zzceiVar, wec wecVar, v7e v7eVar) {
        this.h = mscVar;
        this.f = context;
        this.g = weakReference;
        this.i = executor2;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = jvcVar;
        this.m = zzceiVar;
        this.o = wecVar;
        this.p = v7eVar;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void j(final jxc jxcVar, String str) {
        int i = 5;
        final f7e a = e7e.a(jxcVar.f, 5);
        a.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final f7e a2 = e7e.a(jxcVar.f, i);
                a2.zzh();
                a2.I(next);
                final Object obj = new Object();
                final ugb ugbVar = new ugb();
                j64 o = zb.o(ugbVar, ((Long) pla.c().a(mpa.O1)).longValue(), TimeUnit.SECONDS, jxcVar.k);
                jxcVar.l.c(next);
                jxcVar.o.s(next);
                final long elapsedRealtime = dyf.b().elapsedRealtime();
                o.a(new Runnable() { // from class: xwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        jxc.this.q(obj, ugbVar, next, elapsedRealtime, a2);
                    }
                }, jxcVar.i);
                arrayList.add(o);
                final ixc ixcVar = new ixc(jxcVar, obj, next, elapsedRealtime, a2, ugbVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbpn(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                jxcVar.v(next, false, "", 0);
                try {
                    try {
                        final s2e c = jxcVar.h.c(next, new JSONObject());
                        jxcVar.j.execute(new Runnable() { // from class: exc
                            @Override // java.lang.Runnable
                            public final void run() {
                                jxc.this.n(next, ixcVar, c, arrayList2);
                            }
                        });
                    } catch (RemoteException e) {
                        fgb.e("", e);
                    }
                } catch (zzfho unused2) {
                    ixcVar.b("Failed to create Adapter.");
                }
                i = 5;
            }
            zb.a(arrayList).a(new Callable() { // from class: bxc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    jxc.this.f(a);
                    return null;
                }
            }, jxcVar.i);
        } catch (JSONException e2) {
            pzc.l("Malformed CLD response", e2);
            jxcVar.o.a("MalformedJson");
            jxcVar.l.a("MalformedJson");
            jxcVar.e.d(e2);
            dyf.q().w(e2, "AdapterInitializer.updateAdapterStatus");
            v7e v7eVar = jxcVar.p;
            a.d(e2);
            a.S(false);
            v7eVar.b(a.zzl());
        }
    }

    private final synchronized j64 u() {
        String c = dyf.q().i().zzh().c();
        if (!TextUtils.isEmpty(c)) {
            return zb.h(c);
        }
        final ugb ugbVar = new ugb();
        dyf.q().i().a(new Runnable() { // from class: cxc
            @Override // java.lang.Runnable
            public final void run() {
                jxc.this.o(ugbVar);
            }
        });
        return ugbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str, boolean z, String str2, int i) {
        this.n.put(str, new zzbpd(str, z, i, str2));
    }

    final /* synthetic */ Object f(f7e f7eVar) {
        this.e.c(Boolean.TRUE);
        f7eVar.S(true);
        this.p.b(f7eVar.zzl());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.n.keySet()) {
            zzbpd zzbpdVar = (zzbpd) this.n.get(str);
            arrayList.add(new zzbpd(str, zzbpdVar.zzb, zzbpdVar.zzc, zzbpdVar.zzd));
        }
        return arrayList;
    }

    public final void l() {
        this.q = false;
    }

    final /* synthetic */ void m() {
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (dyf.b().elapsedRealtime() - this.d));
                this.l.b("com.google.android.gms.ads.MobileAds", "timeout");
                this.o.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.e.d(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void n(String str, jza jzaVar, s2e s2eVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    jzaVar.zzf();
                    return;
                }
                Context context = (Context) this.g.get();
                if (context == null) {
                    context = this.f;
                }
                s2eVar.n(context, jzaVar, list);
            } catch (RemoteException e) {
                fgb.e("", e);
            }
        } catch (RemoteException e2) {
            throw new zzfxz(e2);
        } catch (zzfho unused) {
            jzaVar.b("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void o(final ugb ugbVar) {
        this.i.execute(new Runnable() { // from class: wwc
            @Override // java.lang.Runnable
            public final void run() {
                String c = dyf.q().i().zzh().c();
                boolean isEmpty = TextUtils.isEmpty(c);
                ugb ugbVar2 = ugbVar;
                if (isEmpty) {
                    ugbVar2.d(new Exception());
                } else {
                    ugbVar2.c(c);
                }
            }
        });
    }

    final /* synthetic */ void p() {
        this.l.e();
        this.o.zze();
        this.b = true;
    }

    final /* synthetic */ void q(Object obj, ugb ugbVar, String str, long j, f7e f7eVar) {
        synchronized (obj) {
            try {
                if (!ugbVar.isDone()) {
                    v(str, false, "Timeout.", (int) (dyf.b().elapsedRealtime() - j));
                    this.l.b(str, "timeout");
                    this.o.zzb(str, "timeout");
                    v7e v7eVar = this.p;
                    f7eVar.s("Timeout");
                    f7eVar.S(false);
                    v7eVar.b(f7eVar.zzl());
                    ugbVar.c(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (!((Boolean) bsa.a.e()).booleanValue()) {
            if (this.m.zzc >= ((Integer) pla.c().a(mpa.N1)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return;
                        }
                        this.l.f();
                        this.o.zzf();
                        this.e.a(new Runnable() { // from class: fxc
                            @Override // java.lang.Runnable
                            public final void run() {
                                jxc.this.p();
                            }
                        }, this.i);
                        this.a = true;
                        j64 u = u();
                        this.k.schedule(new Runnable() { // from class: vwc
                            @Override // java.lang.Runnable
                            public final void run() {
                                jxc.this.m();
                            }
                        }, ((Long) pla.c().a(mpa.P1)).longValue(), TimeUnit.SECONDS);
                        zb.r(u, new hxc(this), this.i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.e.c(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final void s(final mza mzaVar) {
        this.e.a(new Runnable() { // from class: dxc
            @Override // java.lang.Runnable
            public final void run() {
                jxc jxcVar = jxc.this;
                try {
                    mzaVar.P2(jxcVar.g());
                } catch (RemoteException e) {
                    fgb.e("", e);
                }
            }
        }, this.j);
    }

    public final boolean t() {
        return this.b;
    }
}
