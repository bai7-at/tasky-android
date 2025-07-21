package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import co.datadome.sdk.ChallengeActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.bh;
import com.google.android.gms.internal.ads.em;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.ol;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.tk;
import com.google.android.gms.internal.ads.tl;
import com.google.android.gms.internal.ads.uk;
import com.google.android.gms.internal.ads.ul;
import com.google.android.gms.internal.ads.vk;
import com.google.android.gms.internal.ads.vl;
import com.google.android.gms.internal.ads.wl;
import com.google.android.gms.internal.ads.yk;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzgyl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gdb implements kdb {
    private static final List m = Collections.synchronizedList(new ArrayList());
    public static final /* synthetic */ int n = 0;
    private final ik a;
    private final LinkedHashMap b;
    private final Context e;
    boolean f;
    private final zzcbp g;
    private final hdb l;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final Object h = new Object();
    private HashSet i = new HashSet();
    private boolean j = false;
    private boolean k = false;

    public gdb(Context context, zzcei zzceiVar, zzcbp zzcbpVar, String str, hdb hdbVar) {
        Preconditions.checkNotNull(zzcbpVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.l = hdbVar;
        this.g = zzcbpVar;
        Iterator it2 = zzcbpVar.zze.iterator();
        while (it2.hasNext()) {
            this.i.add(((String) it2.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove(ChallengeActivity.ARG_COOKIE.toLowerCase(Locale.ENGLISH));
        ik L = em.L();
        L.A(9);
        L.w(str);
        L.u(str);
        jk L2 = kk.L();
        String str2 = this.g.zza;
        if (str2 != null) {
            L2.n(str2);
        }
        L.t((kk) L2.i());
        vl L3 = wl.L();
        L3.p(Wrappers.packageManager(this.e).isCallerInstantApp());
        String str3 = zzceiVar.zza;
        if (str3 != null) {
            L3.n(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.e);
        if (apkVersion > 0) {
            L3.o(apkVersion);
        }
        L.s((wl) L3.i());
        this.a = L;
    }

    @Override // defpackage.kdb
    public final void a(String str, Map map, int i) {
        synchronized (this.h) {
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b.containsKey(str)) {
                if (i == 3) {
                    ((tl) this.b.get(str)).r(4);
                }
                return;
            }
            tl M = ul.M();
            int a = u2f.a(i);
            if (a != 0) {
                M.r(a);
            }
            M.o(this.b.size());
            M.q(str);
            vk L = yk.L();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        tk L2 = uk.L();
                        L2.n(zzgyl.E(str2));
                        L2.o(zzgyl.E(str3));
                        L.n((uk) L2.i());
                    }
                }
            }
            M.p((yk) L.i());
            this.b.put(str, M);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // defpackage.kdb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcbp r0 = r7.g
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r7.j
            if (r0 != 0) goto L95
            defpackage.dyf.r()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L14
            goto L6f
        L14:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L26
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L26
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L26
            if (r3 == 0) goto L28
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L26
            goto L29
        L26:
            r2 = move-exception
            goto L2f
        L28:
            r3 = r1
        L29:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2d
            goto L35
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r3 = r1
        L30:
            java.lang.String r4 = "Fail to capture the web view"
            defpackage.fgb.e(r4, r2)
        L35:
            if (r3 != 0) goto L6e
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            if (r2 == 0) goto L62
            if (r3 != 0) goto L44
            goto L62
        L44:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L60
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L60
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L60
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L60
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L60
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L60
            r1 = r4
            goto L6f
        L60:
            r8 = move-exception
            goto L68
        L62:
            java.lang.String r8 = "Width or height of view is zero"
            defpackage.fgb.g(r8)     // Catch: java.lang.RuntimeException -> L60
            goto L6f
        L68:
            java.lang.String r2 = "Fail to capture the webview"
            defpackage.fgb.e(r2, r8)
            goto L6f
        L6e:
            r1 = r3
        L6f:
            if (r1 != 0) goto L77
            java.lang.String r7 = "Failed to capture the webview bitmap."
            defpackage.jdb.a(r7)
            return
        L77:
            r7.j = r0
            cdb r8 = new cdb
            r8.<init>()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            java.lang.Thread r7 = r7.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r7 == r0) goto L90
            r8.run()
            return
        L90:
            kke r7 = defpackage.pgb.a
            r7.execute(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdb.b(android.view.View):void");
    }

    final /* synthetic */ j64 c(Map map) {
        tl tlVar;
        j64 m2;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.h) {
                            try {
                                int length = optJSONArray.length();
                                synchronized (this.h) {
                                    tlVar = (tl) this.b.get(str);
                                }
                                if (tlVar == null) {
                                    jdb.a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        tlVar.n(optJSONArray.getJSONObject(i).getString("threat_type"));
                                    }
                                    this.f = (length > 0) | this.f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) dsa.b.e()).booleanValue()) {
                    fgb.c("Failed to get SafeBrowsing metadata", e);
                }
                return zb.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f) {
            synchronized (this.h) {
                this.a.A(10);
            }
        }
        boolean z = this.f;
        if (!(z && this.g.zzg) && (!(this.k && this.g.zzf) && (z || !this.g.zzd))) {
            return zb.h(null);
        }
        synchronized (this.h) {
            try {
                Iterator it2 = this.b.values().iterator();
                while (it2.hasNext()) {
                    this.a.p((ul) ((tl) it2.next()).i());
                }
                this.a.n(this.c);
                this.a.o(this.d);
                if (jdb.b()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.a.y() + "\n  clickUrl: " + this.a.x() + "\n  resources: \n");
                    for (ul ulVar : this.a.z()) {
                        sb.append("    [");
                        sb.append(ulVar.L());
                        sb.append("] ");
                        sb.append(ulVar.O());
                    }
                    jdb.a(sb.toString());
                }
                j64 b = new yza(this.e).b(1, this.g.zzb, null, ((em) this.a.i()).i());
                if (jdb.b()) {
                    b.a(new Runnable() { // from class: ddb
                        @Override // java.lang.Runnable
                        public final void run() {
                            jdb.a("Pinged SB successfully.");
                        }
                    }, pgb.a);
                }
                m2 = zb.m(b, new gge() { // from class: edb
                    @Override // defpackage.gge
                    public final Object apply(Object obj) {
                        int i2 = gdb.n;
                        return null;
                    }
                }, pgb.f);
            } finally {
            }
        }
        return m2;
    }

    final /* synthetic */ void e(Bitmap bitmap) {
        bh B = zzgyl.B();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, B);
        synchronized (this.h) {
            ik ikVar = this.a;
            ol L = ql.L();
            L.n(B.b());
            L.o("image/png");
            L.p(2);
            ikVar.v((ql) L.i());
        }
    }

    @Override // defpackage.kdb
    public final zzcbp zza() {
        return this.g;
    }

    @Override // defpackage.kdb
    public final void zze() {
        synchronized (this.h) {
            this.b.keySet();
            j64 h = zb.h(Collections.emptyMap());
            ake akeVar = new ake() { // from class: bdb
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return gdb.this.c((Map) obj);
                }
            };
            kke kkeVar = pgb.f;
            j64 n2 = zb.n(h, akeVar, kkeVar);
            j64 o = zb.o(n2, 10L, TimeUnit.SECONDS, pgb.d);
            zb.r(n2, new fdb(this, o), kkeVar);
            m.add(o);
        }
    }

    @Override // defpackage.kdb
    public final void zzh(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    this.a.q();
                } else {
                    this.a.r(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kdb
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.g.zzc && !this.j;
    }
}
