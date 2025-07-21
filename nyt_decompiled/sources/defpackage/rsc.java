package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rsc {
    private final Map a = new ConcurrentHashMap();
    private JSONObject b;
    private final Executor c;
    private boolean d;
    private JSONObject e;

    public rsc(Executor executor) {
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        JSONObject f;
        Map map;
        try {
            this.d = true;
            efb zzh = dyf.q().i().zzh();
            if (zzh != null && (f = zzh.f()) != null) {
                this.b = ((Boolean) pla.c().a(mpa.U3)).booleanValue() ? f.optJSONObject("common_settings") : null;
                this.e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                if (this.a.containsKey(optString2)) {
                                    map = (Map) this.a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final JSONObject a() {
        if (((Boolean) pla.c().a(mpa.U3)).booleanValue()) {
            return this.b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) pla.c().a(mpa.T3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.d) {
            f();
        }
        Map map = (Map) this.a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = tsc.a(this.e, str, str2);
        if (a != null) {
            return (JSONObject) map.get(a);
        }
        return null;
    }

    public final void c() {
        dyf.q().i().a(new Runnable() { // from class: osc
            @Override // java.lang.Runnable
            public final void run() {
                rsc.this.e();
            }
        });
        this.c.execute(new Runnable() { // from class: psc
            @Override // java.lang.Runnable
            public final void run() {
                rsc.this.f();
            }
        });
    }

    final /* synthetic */ void e() {
        this.c.execute(new Runnable() { // from class: qsc
            @Override // java.lang.Runnable
            public final void run() {
                rsc.this.d();
            }
        });
    }
}
