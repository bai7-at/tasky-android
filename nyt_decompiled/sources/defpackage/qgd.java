package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzgad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qgd {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Executor f;
    private JSONObject g;

    qgd(Executor executor) {
        this.f = executor;
    }

    private final synchronized zzgad h(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(dyf.q().i().zzh().c())) {
                boolean matches = Pattern.matches((String) pla.c().a(mpa.W2), str);
                boolean matches2 = Pattern.matches((String) pla.c().a(mpa.X2), str);
                if (matches) {
                    hashMap = new HashMap(this.e);
                } else if (matches2) {
                    hashMap = new HashMap(this.d);
                }
                return zzgad.d(hashMap);
            }
            return zzgad.f();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List i(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle o = o(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        g(str2);
                        if (((sgd) this.a.get(str2)) != null) {
                            arrayList.add(new sgd(str2, str, o));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void j() {
        this.b.clear();
        this.a.clear();
        this.e.clear();
        this.d.clear();
        m();
        n();
        k();
    }

    private final synchronized void k() {
        JSONObject f;
        try {
            if (!((Boolean) bsa.b.e()).booleanValue()) {
                if (((Boolean) pla.c().a(mpa.M1)).booleanValue() && (f = dyf.q().i().zzh().f()) != null) {
                    JSONArray jSONArray = f.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                ugd ugdVar = new ugd(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.d.put(optString, ugdVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.e.put(optString, ugdVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            pzc.l("Malformed config loading JSON.", e);
        } finally {
        }
    }

    private final synchronized void l(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.c.put(str, map);
            List list2 = (List) map.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void m() {
        JSONArray optJSONArray;
        try {
            JSONObject f = dyf.q().i().zzh().f();
            if (f != null) {
                try {
                    JSONArray optJSONArray2 = f.optJSONArray("ad_unit_id_settings");
                    this.g = f.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) pla.c().a(mpa.ra)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.addAll(i(optJSONArray.getJSONObject(i2), optString));
                                }
                            }
                            l(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    pzc.l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void n() {
        JSONObject f;
        if (!((Boolean) bsa.g.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.L1)).booleanValue() && (f = dyf.q().i().zzh().f()) != null) {
                try {
                    JSONArray jSONArray = f.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle o = o(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.b.put(optString, new ugd(optString, optBoolean2, optBoolean, true, o));
                        }
                    }
                } catch (JSONException e) {
                    pzc.l("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private static final Bundle o(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        HashMap hashMap;
        try {
            Map b = b(str, str2);
            zzgad h = h(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : ((zzgad) b).entrySet()) {
                String str3 = (String) entry.getKey();
                if (h.containsKey(str3)) {
                    ugd ugdVar = (ugd) h.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new ugd(str3, ugdVar.b, ugdVar.c, ugdVar.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            yie g = h.entrySet().g();
            while (g.hasNext()) {
                Map.Entry entry2 = (Map.Entry) g.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((ugd) entry2.getValue()).d) {
                    hashMap.put(str4, (ugd) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Map b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(dyf.q().i().zzh().c()) && (map = (Map) this.c.get(str)) != null) {
                List<sgd> list = (List) map.get(str2);
                if (list == null) {
                    String a = tsc.a(this.g, str2, str);
                    if (((Boolean) pla.c().a(mpa.ra)).booleanValue()) {
                        a = a.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(a);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (sgd sgdVar : list) {
                        String str3 = sgdVar.a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(sgdVar.c);
                    }
                    return zzgad.d(hashMap);
                }
            }
            return zzgad.f();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(dyf.q().i().zzh().c())) {
            return zzgad.f();
        }
        return zzgad.d(this.b);
    }

    public final void e() {
        dyf.q().i().a(new Runnable() { // from class: lgd
            @Override // java.lang.Runnable
            public final void run() {
                qgd.this.f();
            }
        });
        this.f.execute(new kgd(this));
    }

    final /* synthetic */ void f() {
        this.f.execute(new kgd(this));
    }

    public final synchronized void g(String str) {
        if (!TextUtils.isEmpty(str) && !this.a.containsKey(str)) {
            this.a.put(str, new sgd(str, "", new Bundle()));
        }
    }
}
