package defpackage;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.t;
import kotlin.text.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pi3 {
    private static SharedPreferences b;
    public static final pi3 a = new pi3();
    private static final Set c = new CopyOnWriteArraySet();
    private static final Map d = new ConcurrentHashMap();

    private pi3() {
    }

    public static final boolean d() {
        if (c11.d(pi3.class)) {
            return false;
        }
        try {
            a.g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                zq3.z("sharedPreferences");
                throw null;
            }
            long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j != 0 && currentTimeMillis - j < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            zq3.z("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            c11.b(th, pi3.class);
            return false;
        }
    }

    public static final void e(Map map, Map map2) {
        if (c11.d(pi3.class)) {
            return;
        }
        try {
            zq3.h(map, "purchaseDetailsMap");
            zq3.h(map2, "skuDetailsMap");
            pi3 pi3Var = a;
            pi3Var.g();
            pi3Var.f(pi3Var.c(pi3Var.a(map), map2));
        } catch (Throwable th) {
            c11.b(th, pi3.class);
        }
    }

    private final void f(Map map) {
        if (c11.d(this)) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str2 != null) {
                    s20.f(str, str2, false);
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void g() {
        if (c11.d(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = w92.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = w92.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            zq3.g(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            b = sharedPreferences3;
            Set set = c;
            if (sharedPreferences3 == null) {
                zq3.z("sharedPreferences");
                throw null;
            }
            Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            set.addAll(stringSet == null ? new HashSet() : stringSet);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                List F0 = h.F0((String) it2.next(), new String[]{";"}, false, 2, 2, null);
                d.put(F0.get(0), Long.valueOf(Long.parseLong((String) F0.get(1))));
            }
            b();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final Map a(Map map) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(map, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : t.v(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (d.containsKey(string)) {
                            map.remove(str);
                        } else {
                            Set set = c;
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) string);
                            sb.append(';');
                            sb.append(currentTimeMillis);
                            set.add(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", c).apply();
                return new HashMap(map);
            }
            zq3.z("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final void b() {
        if (c11.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                zq3.z("sharedPreferences");
                throw null;
            }
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                SharedPreferences sharedPreferences2 = b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                    return;
                } else {
                    zq3.z("sharedPreferences");
                    throw null;
                }
            }
            if (currentTimeMillis - j > 604800) {
                for (Map.Entry entry : t.v(d).entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        c.remove(str + ';' + longValue);
                        d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = b;
                if (sharedPreferences3 == null) {
                    zq3.z("sharedPreferences");
                    throw null;
                }
                sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", c).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public final Map c(Map map, Map map2) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(map, "purchaseDetailsMap");
            zq3.h(map2, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            zq3.g(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            zq3.g(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }
}
