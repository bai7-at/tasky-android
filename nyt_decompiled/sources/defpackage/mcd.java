package defpackage;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mcd implements gcd {
    private final xic a;
    private final kke b;
    private final nnc c;
    private final t2e d;
    private final lqc e;

    public mcd(xic xicVar, kke kkeVar, nnc nncVar, t2e t2eVar, lqc lqcVar) {
        this.a = xicVar;
        this.b = kkeVar;
        this.c = nncVar;
        this.d = t2eVar;
        this.e = lqcVar;
    }

    private final j64 g(final g1e g1eVar, final v0e v0eVar, final JSONObject jSONObject) {
        nnc nncVar = this.c;
        final j64 a = this.d.a();
        final j64 a2 = nncVar.a(g1eVar, v0eVar, jSONObject);
        return zb.c(a, a2).a(new Callable() { // from class: hcd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mcd.this.c(a2, a, g1eVar, v0eVar, jSONObject);
            }
        }, this.b);
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        return zb.n(zb.n(this.d.a(), new ake() { // from class: jcd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return mcd.this.e(v0eVar, (cqc) obj);
            }
        }, this.b), new ake() { // from class: kcd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return mcd.this.f(g1eVar, v0eVar, (JSONArray) obj);
            }
        }, this.b);
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        z0e z0eVar = v0eVar.t;
        return (z0eVar == null || z0eVar.c == null) ? false : true;
    }

    final /* synthetic */ jkc c(j64 j64Var, j64 j64Var2, g1e g1eVar, v0e v0eVar, JSONObject jSONObject) {
        rkc rkcVar = (rkc) j64Var.get();
        cqc cqcVar = (cqc) j64Var2.get();
        skc c = this.a.c(new k1c(g1eVar, v0eVar, null), new dlc(rkcVar), new mjc(jSONObject, cqcVar));
        c.j().b();
        c.k().a(cqcVar);
        c.i().a(rkcVar.f0());
        c.l().a(this.e);
        return c.h();
    }

    final /* synthetic */ j64 d(cqc cqcVar, JSONObject jSONObject) {
        this.d.b(zb.h(cqcVar));
        if (jSONObject.optBoolean("success")) {
            return zb.h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbrm("process json failed");
    }

    final /* synthetic */ j64 e(v0e v0eVar, final cqc cqcVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) pla.c().a(mpa.w8)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", v0eVar.t.c);
        jSONObject2.put("sdk_params", jSONObject);
        return zb.n(cqcVar.d("google.afma.nativeAds.preProcessJson", jSONObject2), new ake() { // from class: icd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return mcd.this.d(cqcVar, (JSONObject) obj);
            }
        }, this.b);
    }

    final /* synthetic */ j64 f(g1e g1eVar, v0e v0eVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zb.g(new zzead(3));
        }
        if (g1eVar.a.a.k <= 1) {
            return zb.m(g(g1eVar, v0eVar, jSONArray.getJSONObject(0)), new gge() { // from class: lcd
                @Override // defpackage.gge
                public final Object apply(Object obj) {
                    return Collections.singletonList(zb.h((jkc) obj));
                }
            }, this.b);
        }
        int length = jSONArray.length();
        this.d.c(Math.min(length, g1eVar.a.a.k));
        ArrayList arrayList = new ArrayList(g1eVar.a.a.k);
        for (int i = 0; i < g1eVar.a.a.k; i++) {
            if (i < length) {
                arrayList.add(g(g1eVar, v0eVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zb.g(new zzead(3)));
            }
        }
        return zb.h(arrayList);
    }
}
