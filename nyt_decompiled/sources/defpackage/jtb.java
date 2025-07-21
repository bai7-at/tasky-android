package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzfho;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jtb extends dqb {
    private final Context a;
    private final zzcei b;
    private final msc c;
    private final i9d d;
    private final qgd e;
    private final jxc f;
    private final ceb g;
    private final rsc h;
    private final eyc i;
    private final psa j;
    private final v7e k;
    private final q2e l;
    private final npa m;
    private boolean n = false;

    jtb(Context context, zzcei zzceiVar, msc mscVar, i9d i9dVar, qgd qgdVar, jxc jxcVar, ceb cebVar, rsc rscVar, eyc eycVar, psa psaVar, v7e v7eVar, q2e q2eVar, npa npaVar) {
        this.a = context;
        this.b = zzceiVar;
        this.c = mscVar;
        this.d = i9dVar;
        this.e = qgdVar;
        this.f = jxcVar;
        this.g = cebVar;
        this.h = rscVar;
        this.i = eycVar;
        this.j = psaVar;
        this.k = v7eVar;
        this.l = q2eVar;
        this.m = npaVar;
    }

    @Override // defpackage.jrb
    public final void I0(y5c y5cVar) {
        this.i.h(y5cVar, zzdzc.API);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // defpackage.jrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I4(java.lang.String r10, defpackage.ee3 r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.a
            defpackage.mpa.a(r0)
            zoa r0 = defpackage.mpa.X3
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            defpackage.dyf.r()     // Catch: android.os.RemoteException -> L21
            android.content.Context r0 = r9.a     // Catch: android.os.RemoteException -> L21
            java.lang.String r0 = defpackage.wxf.R(r0)     // Catch: android.os.RemoteException -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            kfb r2 = defpackage.dyf.q()
            r2.w(r0, r1)
        L2b:
            java.lang.String r0 = ""
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L36
            r6 = r10
            goto L37
        L36:
            r6 = r0
        L37:
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 == 0) goto L3e
            goto L8e
        L3e:
            zoa r10 = defpackage.mpa.R3
            kpa r0 = defpackage.pla.c()
            java.lang.Object r10 = r0.a(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            zoa r0 = defpackage.mpa.Q0
            kpa r1 = defpackage.pla.c()
            java.lang.Object r1 = r1.a(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r10 = r10 | r1
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            java.lang.Object r10 = defpackage.fc5.Q1(r11)
            java.lang.Runnable r10 = (java.lang.Runnable) r10
            htb r11 = new htb
            r11.<init>()
        L7a:
            r7 = r11
            goto L7f
        L7c:
            r11 = 0
            r2 = r10
            goto L7a
        L7f:
            if (r2 == 0) goto L8e
            android.content.Context r4 = r9.a
            com.google.android.gms.internal.ads.zzcei r5 = r9.b
            v7e r8 = r9.k
            ozc r3 = defpackage.dyf.c()
            r3.a(r4, r5, r6, r7, r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtb.I4(java.lang.String, ee3):void");
    }

    @Override // defpackage.jrb
    public final synchronized void R(String str) {
        mpa.a(this.a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) pla.c().a(mpa.R3)).booleanValue()) {
                dyf.c().a(this.a, this.b, str, null, this.k);
            }
        }
    }

    @Override // defpackage.jrb
    public final void S1(ee3 ee3Var, String str) {
        if (ee3Var == null) {
            fgb.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) fc5.Q1(ee3Var);
        if (context == null) {
            fgb.d("Context is null. Failed to open debug menu.");
            return;
        }
        rda rdaVar = new rda(context);
        rdaVar.n(str);
        rdaVar.o(this.b.zza);
        rdaVar.r();
    }

    @Override // defpackage.jrb
    public final void T2(h3b h3bVar) {
        this.l.f(h3bVar);
    }

    @Override // defpackage.jrb
    public final void W(String str) {
        if (((Boolean) pla.c().a(mpa.n9)).booleanValue()) {
            dyf.q().y(str);
        }
    }

    @Override // defpackage.jrb
    public final synchronized boolean a() {
        return dyf.t().e();
    }

    @Override // defpackage.jrb
    public final void b0(boolean z) {
        try {
            qde.j(this.a).o(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // defpackage.jrb
    public final void e2(mza mzaVar) {
        this.f.s(mzaVar);
    }

    @Override // defpackage.jrb
    public final synchronized void i5(float f) {
        dyf.t().d(f);
    }

    final /* synthetic */ void l() {
        this.j.a(new c6());
    }

    @Override // defpackage.jrb
    public final synchronized void s6(boolean z) {
        dyf.t().c(z);
    }

    @Override // defpackage.jrb
    public final void w5(zzff zzffVar) {
        this.g.n(this.a, zzffVar);
    }

    final void w6(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map e = dyf.q().i().zzh().e();
        if (e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                fgb.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.c.d()) {
            HashMap hashMap = new HashMap();
            Iterator it2 = e.values().iterator();
            while (it2.hasNext()) {
                for (a3b a3bVar : ((b3b) it2.next()).a) {
                    String str = a3bVar.k;
                    for (String str2 : a3bVar.c) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    j9d a = this.d.a(str3, jSONObject);
                    if (a != null) {
                        s2e s2eVar = (s2e) a.b;
                        if (!s2eVar.c() && s2eVar.b()) {
                            s2eVar.o(this.a, (kbd) a.c, (List) entry.getValue());
                            fgb.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfho e2) {
                    fgb.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                }
            }
        }
    }

    final void zzb() {
        if (dyf.q().i().j()) {
            String zzl = dyf.q().i().zzl();
            if (dyf.u().j(this.a, zzl, this.b.zza)) {
                return;
            }
            dyf.q().i().b(false);
            dyf.q().i().i("");
        }
    }

    final /* synthetic */ void zzd() {
        z2e.b(this.a, true);
    }

    @Override // defpackage.jrb
    public final synchronized float zze() {
        return dyf.t().a();
    }

    @Override // defpackage.jrb
    public final String zzf() {
        return this.b.zza;
    }

    @Override // defpackage.jrb
    public final List zzg() {
        return this.f.g();
    }

    @Override // defpackage.jrb
    public final void zzh(String str) {
        this.e.g(str);
    }

    @Override // defpackage.jrb
    public final void zzi() {
        this.f.l();
    }

    @Override // defpackage.jrb
    public final synchronized void zzk() {
        if (this.n) {
            fgb.g("Mobile ads is initialized already.");
            return;
        }
        mpa.a(this.a);
        this.m.a();
        dyf.q().u(this.a, this.b);
        dyf.e().i(this.a);
        this.n = true;
        this.f.r();
        this.e.e();
        if (((Boolean) pla.c().a(mpa.T3)).booleanValue()) {
            this.h.c();
        }
        this.i.g();
        if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
            pgb.a.execute(new Runnable() { // from class: etb
                @Override // java.lang.Runnable
                public final void run() {
                    jtb.this.zzb();
                }
            });
        }
        if (((Boolean) pla.c().a(mpa.ta)).booleanValue()) {
            pgb.a.execute(new Runnable() { // from class: gtb
                @Override // java.lang.Runnable
                public final void run() {
                    jtb.this.l();
                }
            });
        }
        if (((Boolean) pla.c().a(mpa.G2)).booleanValue()) {
            pgb.a.execute(new Runnable() { // from class: ftb
                @Override // java.lang.Runnable
                public final void run() {
                    jtb.this.zzd();
                }
            });
        }
    }
}
