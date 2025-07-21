package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdzc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eyc implements b0d, pxc {
    private final myc a;
    private final c0d b;
    private final qxc c;
    private final yxc d;
    private final oxc e;
    private final yyc f;
    private final String g;
    private final String h;
    private JSONObject m;
    private boolean p;
    private int q;
    private boolean r;
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private final Map k = new HashMap();
    private String l = "{}";
    private long n = Long.MAX_VALUE;
    private zzdyz o = zzdyz.NONE;
    private zzdzc s = zzdzc.UNKNOWN;
    private long t = 0;

    eyc(myc mycVar, c0d c0dVar, qxc qxcVar, Context context, zzcei zzceiVar, yxc yxcVar, yyc yycVar, String str) {
        this.a = mycVar;
        this.b = c0dVar;
        this.c = qxcVar;
        this.e = new oxc(context);
        this.g = zzceiVar.zza;
        this.h = str;
        this.d = yxcVar;
        this.f = yycVar;
        dyf.u().g(this);
    }

    private final synchronized JSONObject s() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.i.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (rxc rxcVar : (List) entry.getValue()) {
                    if (rxcVar.e()) {
                        jSONArray.put(rxcVar.b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void t() {
        this.r = true;
        this.d.c();
        this.a.c(this);
        this.b.d(this);
        this.c.d(this);
        this.f.z6(this);
        z(dyf.q().i().zzo());
    }

    private final void u() {
        dyf.q().i().u(d());
    }

    private final synchronized void v(zzdyz zzdyzVar, boolean z) {
        try {
            if (this.o != zzdyzVar) {
                if (p()) {
                    x();
                }
                this.o = zzdyzVar;
                if (p()) {
                    y();
                }
                if (z) {
                    u();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void w(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.p     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.p = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            zoa r2 = defpackage.mpa.c9     // Catch: java.lang.Throwable -> L27
            kpa r0 = defpackage.pla.c()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            fia r2 = defpackage.dyf.u()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.y()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.p()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.x()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.u()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyc.w(boolean, boolean):void");
    }

    private final synchronized void x() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            this.b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    private final synchronized void y() {
        zzdyz zzdyzVar = zzdyz.NONE;
        int ordinal = this.o.ordinal();
        if (ordinal == 1) {
            this.b.c();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.c.c();
        }
    }

    private final synchronized void z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            w(jSONObject.optBoolean("isTestMode", false), false);
            v((zzdyz) Enum.valueOf(zzdyz.class, jSONObject.optString("gesture", "NONE")), false);
            this.l = jSONObject.optString("networkExtras", "{}");
            this.n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzdyz a() {
        return this.o;
    }

    public final synchronized j64 b(String str) {
        ugb ugbVar;
        try {
            ugbVar = new ugb();
            if (this.j.containsKey(str)) {
                ugbVar.c((rxc) this.j.get(str));
            } else {
                if (!this.k.containsKey(str)) {
                    this.k.put(str, new ArrayList());
                }
                ((List) this.k.get(str)).add(ugbVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return ugbVar;
    }

    public final synchronized String c() {
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && p()) {
            if (this.n < dyf.b().currentTimeMillis() / 1000) {
                this.l = "{}";
                this.n = Long.MAX_VALUE;
                return "";
            }
            if (!this.l.equals("{}")) {
                return this.l;
            }
        }
        return "";
    }

    public final synchronized String d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.p);
            jSONObject.put("gesture", this.o);
            if (this.n > dyf.b().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.l);
                jSONObject.put("networkExtrasExpirationSecs", this.n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.h)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.h);
                }
                jSONObject.put("internalSdkVersion", this.g);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.d.a());
                if (((Boolean) pla.c().a(mpa.n9)).booleanValue()) {
                    String n = dyf.q().n();
                    if (!TextUtils.isEmpty(n)) {
                        jSONObject.put("plugin", n);
                    }
                }
                if (this.n < dyf.b().currentTimeMillis() / 1000) {
                    this.l = "{}";
                }
                jSONObject.put("networkExtras", this.l);
                jSONObject.put("adSlots", s());
                jSONObject.put("appInfo", this.e.a());
                String c = dyf.q().i().zzh().c();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject.put("cld", new JSONObject(c));
                }
                if (((Boolean) pla.c().a(mpa.d9)).booleanValue() && (jSONObject2 = this.m) != null) {
                    fgb.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.m);
                }
                if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
                    jSONObject.put("openAction", this.s);
                    jSONObject.put("gesture", this.o);
                }
                jSONObject.put("isGamRegisteredTestDevice", dyf.u().l());
                dyf.r();
                kia.b();
                jSONObject.put("isSimulator", tfb.t());
            } catch (JSONException e) {
                dyf.q().v(e, "Inspector.toJson");
                fgb.h("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void f(String str, rxc rxcVar) {
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue() && p()) {
            if (this.q >= ((Integer) pla.c().a(mpa.P8)).intValue()) {
                fgb.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.i.containsKey(str)) {
                this.i.put(str, new ArrayList());
            }
            this.q++;
            ((List) this.i.get(str)).add(rxcVar);
            if (((Boolean) pla.c().a(mpa.l9)).booleanValue()) {
                String a = rxcVar.a();
                this.j.put(a, rxcVar);
                if (this.k.containsKey(a)) {
                    List list = (List) this.k.get(a);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((ugb) it2.next()).c(rxcVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void g() {
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.c9)).booleanValue() && dyf.q().i().j()) {
                t();
                return;
            }
            String zzo = dyf.q().i().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    t();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void h(y5c y5cVar, zzdzc zzdzcVar) {
        if (!p()) {
            try {
                y5cVar.T1(w2e.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                fgb.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue()) {
            this.s = zzdzcVar;
            this.a.e(y5cVar, new nya(this), new gya(this.f));
            return;
        } else {
            try {
                y5cVar.T1(w2e.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                fgb.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void i(String str, long j) {
        this.l = str;
        this.n = j;
        u();
    }

    public final synchronized void j(long j) {
        this.t += j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.r
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.t()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.p
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.y()
            return
        L15:
            boolean r2 = r1.p()
            if (r2 != 0) goto L1e
            r1.x()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyc.k(boolean):void");
    }

    public final void l(zzdyz zzdyzVar) {
        v(zzdyzVar, true);
    }

    public final synchronized void m(JSONObject jSONObject) {
        this.m = jSONObject;
    }

    public final void n(boolean z) {
        if (!this.r && z) {
            t();
        }
        w(z, true);
    }

    public final boolean o() {
        return this.m != null;
    }

    public final synchronized boolean p() {
        if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
            return this.p || dyf.u().l();
        }
        return this.p;
    }

    public final synchronized boolean q() {
        return this.p;
    }

    public final boolean r() {
        return this.t < ((Long) pla.c().a(mpa.i9)).longValue();
    }
}
