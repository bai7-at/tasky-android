package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.s6;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzflg;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i5d extends e9b {
    private final Context a;
    private final zrd b;
    private final xrd c;
    private final t5d d;
    private final kke e;
    private final q5d f;
    private final eab g;

    i5d(Context context, zrd zrdVar, xrd xrdVar, q5d q5dVar, t5d t5dVar, kke kkeVar, eab eabVar) {
        this.a = context;
        this.b = zrdVar;
        this.c = xrdVar;
        this.f = q5dVar;
        this.d = t5dVar;
        this.e = kkeVar;
        this.g = eabVar;
    }

    private final void x6(j64 j64Var, i9b i9bVar) {
        zb.r(zb.n(vb.C(j64Var), new ake() { // from class: f5d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(v2e.a((InputStream) obj));
            }
        }, pgb.a), new h5d(this, i9bVar), pgb.f);
    }

    @Override // defpackage.f9b
    public final void D5(zzbym zzbymVar, i9b i9bVar) {
        x6(w6(zzbymVar, Binder.getCallingUid()), i9bVar);
    }

    @Override // defpackage.f9b
    public final void U0(zzbyi zzbyiVar, i9b i9bVar) {
        lrd lrdVar = new lrd(zzbyiVar, Binder.getCallingUid());
        zrd zrdVar = this.b;
        zrdVar.a(lrdVar);
        final asd zzb = zrdVar.zzb();
        s6 b = zzb.b();
        h5e a = b.b(zzflg.GMS_SIGNALS, zb.i()).f(new ake() { // from class: e5d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return asd.this.a().a(new JSONObject());
            }
        }).e(new f5e() { // from class: d5d
            @Override // defpackage.f5e
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                pzc.k("GMS AdRequest Signals: ");
                pzc.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).f(new ake() { // from class: c5d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).a();
        x6(a, i9bVar);
        if (((Boolean) vra.d.e()).booleanValue()) {
            final t5d t5dVar = this.d;
            Objects.requireNonNull(t5dVar);
            a.a(new Runnable() { // from class: g5d
                @Override // java.lang.Runnable
                public final void run() {
                    t5d.this.b();
                }
            }, this.e);
        }
    }

    public final j64 w6(zzbym zzbymVar, int i) {
        j64 h;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbymVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        final k5d k5dVar = new k5d(zzbymVar.zza, zzbymVar.zzb, hashMap, zzbymVar.zzd, "", zzbymVar.zze);
        xrd xrdVar = this.c;
        xrdVar.a(new bud(zzbymVar));
        boolean z = k5dVar.f;
        yrd zzb = xrdVar.zzb();
        if (z) {
            String str2 = zzbymVar.zza;
            String str3 = (String) csa.b.e();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it2 = dhe.c(dge.b(';')).d(str3).iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            h = zb.m(zzb.a().a(new JSONObject()), new gge() { // from class: a5d
                                @Override // defpackage.gge
                                public final Object apply(Object obj) {
                                    k5d k5dVar2 = k5d.this;
                                    t5d.a(k5dVar2.c, (JSONObject) obj);
                                    return k5dVar2;
                                }
                            }, this.e);
                            break;
                        }
                    }
                }
            }
        }
        h = zb.h(k5dVar);
        s6 b = zzb.b();
        return zb.n(b.b(zzflg.HTTP, h).e(new p5d(this.a, "", this.g, i)).a(), new ake() { // from class: b5d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                l5d l5dVar = (l5d) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", l5dVar.a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : l5dVar.b.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) l5dVar.b.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = l5dVar.c;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", l5dVar.d);
                    return zb.h(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    fgb.g("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.e);
    }
}
