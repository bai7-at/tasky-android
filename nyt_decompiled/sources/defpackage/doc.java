package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.util.Mimetypes;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzgaa;
import com.nytimes.android.api.cms.AssetConstants;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class doc {
    private final Context a;
    private final jnc b;
    private final gfa c;
    private final zzcei d;
    private final iq9 e;
    private final ina f;
    private final Executor g;
    private final zzbjb h;
    private final voc i;
    private final urc j;
    private final ScheduledExecutorService k;
    private final lqc l;
    private final zuc m;
    private final k6e n;
    private final d8e o;
    private final a8d p;
    private final l8d q;
    private final w1e r;

    public doc(Context context, jnc jncVar, gfa gfaVar, zzcei zzceiVar, iq9 iq9Var, ina inaVar, Executor executor, s1e s1eVar, voc vocVar, urc urcVar, ScheduledExecutorService scheduledExecutorService, zuc zucVar, k6e k6eVar, d8e d8eVar, a8d a8dVar, lqc lqcVar, l8d l8dVar, w1e w1eVar) {
        this.a = context;
        this.b = jncVar;
        this.c = gfaVar;
        this.d = zzceiVar;
        this.e = iq9Var;
        this.f = inaVar;
        this.g = executor;
        this.h = s1eVar.i;
        this.i = vocVar;
        this.j = urcVar;
        this.k = scheduledExecutorService;
        this.m = zucVar;
        this.n = k6eVar;
        this.o = d8eVar;
        this.p = a8dVar;
        this.l = lqcVar;
        this.q = l8dVar;
        this.r = w1eVar;
    }

    public static final ecd i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(optJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzgaa.t();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgaa.t();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            ecd r = r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return zzgaa.p(arrayList);
    }

    private final zzq k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.H0();
            }
            i = 0;
        }
        return new zzq(this.a, new s7(i, i2));
    }

    private static j64 l(j64 j64Var, Object obj) {
        final Object obj2 = null;
        return zb.f(j64Var, Exception.class, new ake(obj2) { // from class: boc
            @Override // defpackage.ake
            public final j64 zza(Object obj3) {
                pzc.l("Error during loading assets.", (Exception) obj3);
                return zb.h(null);
            }
        }, pgb.f);
    }

    private static j64 m(boolean z, final j64 j64Var, Object obj) {
        return z ? zb.n(j64Var, new ake() { // from class: coc
            @Override // defpackage.ake
            public final j64 zza(Object obj2) {
                return obj2 != null ? j64.this : zb.g(new zzeml(1, "Retrieve required value in native ad response failed."));
            }
        }, pgb.f) : l(j64Var, null);
    }

    private final j64 n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zb.h(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zb.h(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zb.h(new usa(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m(jSONObject.optBoolean("require"), zb.m(this.b.b(optString, optDouble, optBoolean), new gge() { // from class: qnc
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return new usa(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.g), null);
    }

    private final j64 o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zb.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(n(jSONArray.optJSONObject(i), z));
        }
        return zb.m(zb.d(arrayList), new gge() { // from class: vnc
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (usa usaVar : (List) obj) {
                    if (usaVar != null) {
                        arrayList2.add(usaVar);
                    }
                }
                return arrayList2;
            }
        }, this.g);
    }

    private final j64 p(JSONObject jSONObject, v0e v0eVar, y0e y0eVar) {
        final j64 b = this.i.b(jSONObject.optString("base_url"), jSONObject.optString(AssetConstants.HTML), v0eVar, y0eVar, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zb.n(b, new ake() { // from class: rnc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                wlb wlbVar = (wlb) obj;
                if (wlbVar == null || wlbVar.zzq() == null) {
                    throw new zzeml(1, "Retrieve video view in html5 ad response failed.");
                }
                return j64.this;
            }
        }, pgb.f);
    }

    private static Integer q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(QueryKeys.EXTERNAL_REFERRER), jSONObject2.getInt(QueryKeys.ACCOUNT_ID), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final ecd r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new ecd(optString, optString2);
    }

    final /* synthetic */ rsa a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = q(jSONObject, "bg_color");
        Integer q2 = q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
        return new rsa(optString, list, q, q2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.h.zze, optBoolean);
    }

    final /* synthetic */ j64 b(zzq zzqVar, v0e v0eVar, y0e y0eVar, String str, String str2, Object obj) {
        wlb a = this.j.a(zzqVar, v0eVar, y0eVar);
        final tgb e = tgb.e(a);
        iqc b = this.l.b();
        a.zzN().q0(b, b, b, b, b, false, null, new ela(this.a, null, null), null, null, this.p, this.o, this.m, this.n, null, b, null, null, null);
        if (((Boolean) pla.c().a(mpa.F3)).booleanValue()) {
            a.e0("/getNativeAdViewSignals", txa.s);
        }
        a.e0("/getNativeClickMeta", txa.t);
        a.zzN().N(new mnb() { // from class: unc
            @Override // defpackage.mnb
            public final void a(boolean z, int i, String str3, String str4) {
                tgb tgbVar = tgb.this;
                if (z) {
                    tgbVar.f();
                    return;
                }
                tgbVar.d(new zzeml(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        a.J0(str, str2, null);
        return e;
    }

    final /* synthetic */ j64 c(String str, Object obj) {
        dyf.B();
        wlb a = imb.a(this.a, unb.a(), "native-omid", false, false, this.c, null, this.d, null, null, this.e, this.f, null, null, this.q, this.r);
        final tgb e = tgb.e(a);
        a.zzN().N(new mnb() { // from class: wnc
            @Override // defpackage.mnb
            public final void a(boolean z, int i, String str2, String str3) {
                tgb.this.f();
            }
        });
        if (((Boolean) pla.c().a(mpa.X4)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), Mimetypes.MIMETYPE_HTML, "base64");
        } else {
            a.loadData(str, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING);
        }
        return e;
    }

    public final j64 d(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zb.h(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(AssetConstants.IMAGE_TYPE);
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m(optJSONObject.optBoolean("require"), zb.m(o(optJSONArray, false, true), new gge() { // from class: aoc
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return doc.this.a(optJSONObject, (List) obj);
            }
        }, this.g), null);
    }

    public final j64 e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.h.zzb);
    }

    public final j64 f(JSONObject jSONObject, String str) {
        zzbjb zzbjbVar = this.h;
        return o(jSONObject.optJSONArray("images"), zzbjbVar.zzb, zzbjbVar.zzd);
    }

    public final j64 g(JSONObject jSONObject, String str, final v0e v0eVar, final y0e y0eVar) {
        if (!((Boolean) pla.c().a(mpa.K9)).booleanValue()) {
            return zb.h(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zb.h(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zb.h(null);
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString(AssetConstants.HTML);
        final zzq k = k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zb.h(null);
        }
        final j64 n = zb.n(zb.h(null), new ake() { // from class: snc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return doc.this.b(k, v0eVar, y0eVar, optString, optString2, obj);
            }
        }, pgb.e);
        return zb.n(n, new ake() { // from class: tnc
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                if (((wlb) obj) != null) {
                    return j64.this;
                }
                throw new zzeml(1, "Retrieve Web View from image ad response failed.");
            }
        }, pgb.f);
    }

    public final j64 h(JSONObject jSONObject, v0e v0eVar, y0e y0eVar) {
        j64 a;
        JSONObject g = t6b.g(jSONObject, "html_containers", "instream");
        if (g != null) {
            return p(g, v0eVar, y0eVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(AssetConstants.VIDEO_TYPE);
        if (optJSONObject == null) {
            return zb.h(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) pla.c().a(mpa.J9)).booleanValue() && optJSONObject.has(AssetConstants.HTML)) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                fgb.g("Required field 'vast_xml' or 'html' is missing");
                return zb.h(null);
            }
        } else if (!z) {
            a = this.i.a(optJSONObject);
            return l(zb.o(a, ((Integer) pla.c().a(mpa.G3)).intValue(), TimeUnit.SECONDS, this.k), null);
        }
        a = p(optJSONObject, v0eVar, y0eVar);
        return l(zb.o(a, ((Integer) pla.c().a(mpa.G3)).intValue(), TimeUnit.SECONDS, this.k), null);
    }
}
