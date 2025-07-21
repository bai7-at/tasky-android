package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzeml;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nnc {
    private final kke a;
    private final doc b;
    private final ioc c;

    public nnc(kke kkeVar, doc docVar, ioc iocVar) {
        this.a = kkeVar;
        this.b = docVar;
        this.c = iocVar;
    }

    public final j64 a(final g1e g1eVar, final v0e v0eVar, final JSONObject jSONObject) {
        j64 n;
        final j64 j = this.a.j(new Callable() { // from class: lnc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rkc rkcVar = new rkc();
                JSONObject jSONObject2 = jSONObject;
                rkcVar.B(jSONObject2.optInt("template_id", -1));
                rkcVar.k(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                g1e g1eVar2 = g1eVar;
                rkcVar.v(optString);
                s1e s1eVar = g1eVar2.a.a;
                if (!s1eVar.g.contains(Integer.toString(rkcVar.P()))) {
                    throw new zzeml(1, "Invalid template ID: " + rkcVar.P());
                }
                if (rkcVar.P() == 3) {
                    if (rkcVar.a() == null) {
                        throw new zzeml(1, "No custom template id for custom template ad response.");
                    }
                    if (!s1eVar.h.contains(rkcVar.a())) {
                        throw new zzeml(1, "Unexpected custom template id in the response.");
                    }
                }
                v0e v0eVar2 = v0eVar;
                rkcVar.y(jSONObject2.optDouble("rating", -1.0d));
                String optString2 = jSONObject2.optString("headline", null);
                if (v0eVar2.N) {
                    dyf.r();
                    optString2 = wxf.Z() + " : " + optString2;
                }
                rkcVar.z("headline", optString2);
                rkcVar.z("body", jSONObject2.optString("body", null));
                rkcVar.z("call_to_action", jSONObject2.optString("call_to_action", null));
                rkcVar.z("store", jSONObject2.optString("store", null));
                rkcVar.z("price", jSONObject2.optString("price", null));
                rkcVar.z("advertiser", jSONObject2.optString("advertiser", null));
                return rkcVar;
            }
        });
        final j64 f = this.b.f(jSONObject, "images");
        y0e y0eVar = g1eVar.b.b;
        doc docVar = this.b;
        final j64 g = docVar.g(jSONObject, "images", v0eVar, y0eVar);
        final j64 e = docVar.e(jSONObject, "secondary_image");
        final j64 e2 = docVar.e(jSONObject, "app_icon");
        final j64 d = docVar.d(jSONObject, "attribution");
        final j64 h = this.b.h(jSONObject, v0eVar, g1eVar.b.b);
        final j64 a = this.c.a(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                n = zb.h(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    n = zb.h(null);
                } else {
                    final doc docVar2 = this.b;
                    n = zb.n(zb.h(null), new ake() { // from class: pnc
                        @Override // defpackage.ake
                        public final j64 zza(Object obj) {
                            return doc.this.c(optString, obj);
                        }
                    }, pgb.e);
                }
            }
        } else {
            n = zb.h(null);
        }
        final j64 j64Var = n;
        ArrayList arrayList = new ArrayList();
        arrayList.add(j);
        arrayList.add(f);
        arrayList.add(g);
        arrayList.add(e);
        arrayList.add(e2);
        arrayList.add(d);
        arrayList.add(h);
        arrayList.add(a);
        if (!((Boolean) pla.c().a(mpa.a5)).booleanValue()) {
            arrayList.add(j64Var);
        }
        return zb.a(arrayList).a(new Callable() { // from class: mnc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rkc rkcVar = (rkc) j.get();
                rkcVar.p((List) f.get());
                rkcVar.m((mta) e2.get());
                rkcVar.q((mta) e.get());
                rkcVar.j((fta) d.get());
                JSONObject jSONObject2 = jSONObject;
                rkcVar.s(doc.j(jSONObject2));
                rkcVar.l(doc.i(jSONObject2));
                wlb wlbVar = (wlb) h.get();
                if (wlbVar != null) {
                    rkcVar.E(wlbVar);
                    rkcVar.D(wlbVar.h());
                    rkcVar.C(wlbVar.zzq());
                }
                wlb wlbVar2 = (wlb) g.get();
                if (wlbVar2 != null) {
                    rkcVar.o(wlbVar2);
                    rkcVar.F(wlbVar2.h());
                }
                j64 j64Var2 = j64Var;
                if (((Boolean) pla.c().a(mpa.a5)).booleanValue()) {
                    rkcVar.u(j64Var2);
                    rkcVar.x(new ugb());
                } else {
                    wlb wlbVar3 = (wlb) j64Var2.get();
                    if (wlbVar3 != null) {
                        rkcVar.t(wlbVar3);
                    }
                }
                for (hoc hocVar : (List) a.get()) {
                    if (hocVar.a != 1) {
                        rkcVar.n(hocVar.b, hocVar.d);
                    } else {
                        rkcVar.z(hocVar.b, hocVar.c);
                    }
                }
                return rkcVar;
            }
        }, this.a);
    }
}
