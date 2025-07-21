package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzgad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fpd implements gqd {
    private final kke a;
    private final ScheduledExecutorService b;
    private final qgd c;
    private final Context d;
    private final s1e e;
    private final igd f;
    private final msc g;
    private final lxc h;
    final String i;

    fpd(kke kkeVar, ScheduledExecutorService scheduledExecutorService, String str, qgd qgdVar, Context context, s1e s1eVar, igd igdVar, msc mscVar, lxc lxcVar) {
        this.a = kkeVar;
        this.b = scheduledExecutorService;
        this.i = str;
        this.c = qgdVar;
        this.d = context;
        this.e = s1eVar;
        this.f = igdVar;
        this.g = mscVar;
        this.h = lxcVar;
    }

    public static /* synthetic */ j64 a(fpd fpdVar) {
        String lowerCase = ((Boolean) pla.c().a(mpa.ra)).booleanValue() ? fpdVar.e.f.toLowerCase(Locale.ROOT) : fpdVar.e.f;
        final Bundle b = ((Boolean) pla.c().a(mpa.D1)).booleanValue() ? fpdVar.h.b() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) pla.c().a(mpa.M1)).booleanValue()) {
            fpdVar.g(arrayList, fpdVar.c.a(fpdVar.i, lowerCase));
        } else {
            for (Map.Entry entry : ((zzgad) fpdVar.c.b(fpdVar.i, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(fpdVar.e(str, (List) entry.getValue(), fpdVar.d(str), true, true));
            }
            fpdVar.g(arrayList, fpdVar.c.c());
        }
        return zb.b(arrayList).a(new Callable() { // from class: apd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (j64 j64Var : arrayList) {
                    if (((JSONObject) j64Var.get()) != null) {
                        jSONArray.put(j64Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new gpd(jSONArray.toString(), b);
            }
        }, fpdVar.a);
    }

    private final Bundle d(String str) {
        Bundle bundle = this.e.d.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final vb e(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        vb C = vb.C(zb.k(new zje() { // from class: cpd
            @Override // defpackage.zje
            public final j64 zza() {
                return fpd.this.b(str, list, bundle, z, z2);
            }
        }, this.a));
        if (!((Boolean) pla.c().a(mpa.z1)).booleanValue()) {
            C = (vb) zb.o(C, ((Long) pla.c().a(mpa.s1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return (vb) zb.e(C, Throwable.class, new gge() { // from class: dpd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                fgb.d("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.a);
    }

    private final void f(o5b o5bVar, Bundle bundle, List list, tgd tgdVar) {
        o5bVar.c2(fc5.l3(this.d), this.i, bundle, (Bundle) list.get(0), this.e.e, tgdVar);
    }

    private final void g(List list, Map map) {
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            ugd ugdVar = (ugd) ((Map.Entry) it2.next()).getValue();
            String str = ugdVar.a;
            list.add(e(str, Collections.singletonList(ugdVar.e), d(str), ugdVar.b, ugdVar.c));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        defpackage.fgb.e("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ defpackage.j64 b(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            ugb r7 = new ugb
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            zoa r13 = defpackage.mpa.E1
            kpa r1 = defpackage.pla.c()
            java.lang.Object r13 = r1.a(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            igd r13 = r8.f
            r13.b(r9)
            igd r13 = r8.f
            o5b r13 = r13.a(r9)
            goto L34
        L26:
            msc r13 = r8.g     // Catch: android.os.RemoteException -> L2d
            o5b r13 = r13.b(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            defpackage.fgb.e(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            zoa r8 = defpackage.mpa.u1
            kpa r10 = defpackage.pla.c()
            java.lang.Object r8 = r10.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L4d
            defpackage.tgd.w6(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            tgd r6 = new tgd
            com.google.android.gms.common.util.Clock r0 = defpackage.dyf.b()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            zoa r9 = defpackage.mpa.z1
            kpa r0 = defpackage.pla.c()
            java.lang.Object r9 = r0.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.b
            epd r0 = new epd
            r0.<init>()
            zoa r1 = defpackage.mpa.s1
            kpa r2 = defpackage.pla.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            zoa r9 = defpackage.mpa.G1
            kpa r12 = defpackage.pla.c()
            java.lang.Object r9 = r12.a(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            kke r9 = r8.a
            bpd r12 = new bpd
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.l(r12)
            goto Lba
        Lb3:
            r8.f(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpd.b(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):j64");
    }

    final /* synthetic */ void c(o5b o5bVar, Bundle bundle, List list, tgd tgdVar, ugb ugbVar) {
        try {
            f(o5bVar, bundle, list, tgdVar);
        } catch (RemoteException e) {
            ugbVar.d(e);
        }
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 32;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        s1e s1eVar = this.e;
        if (s1eVar.q) {
            if (!Arrays.asList(((String) pla.c().a(mpa.F1)).split(",")).contains(ktd.a(ktd.b(s1eVar.d)))) {
                return zb.h(new gpd(new JSONArray().toString(), new Bundle()));
            }
        }
        return zb.k(new zje() { // from class: zod
            @Override // defpackage.zje
            public final j64 zza() {
                return fpd.a(fpd.this);
            }
        }, this.a);
    }
}
