package defpackage;

import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x07 {
    private static boolean b;
    public static final x07 a = new x07();
    private static final String c = x07.class.getCanonicalName();
    private static final List d = new ArrayList();
    private static final Set e = new CopyOnWriteArraySet();

    public static final class a {
        private String a;
        private Map b;

        public a(String str, Map map) {
            zq3.h(str, "eventName");
            zq3.h(map, "restrictiveParams");
            this.a = str;
            this.b = map;
        }

        public final String a() {
            return this.a;
        }

        public final Map b() {
            return this.b;
        }

        public final void c(Map map) {
            zq3.h(map, "<set-?>");
            this.b = map;
        }
    }

    private x07() {
    }

    public static final void a() {
        if (c11.d(x07.class)) {
            return;
        }
        try {
            b = true;
            a.c();
        } catch (Throwable th) {
            c11.b(th, x07.class);
        }
    }

    private final String b(String str, String str2) {
        if (c11.d(this)) {
            return null;
        }
        try {
            try {
                for (a aVar : new ArrayList(d)) {
                    if (aVar != null && zq3.c(str, aVar.a())) {
                        for (String str3 : aVar.b().keySet()) {
                            if (zq3.c(str2, str3)) {
                                return (String) aVar.b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                Log.w(c, "getMatchedRuleType failed", e2);
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final void c() {
        String h;
        if (c11.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.a;
            rd2 n = FetchedAppSettingsManager.n(w92.m(), false);
            if (n != null && (h = n.h()) != null && h.length() != 0) {
                JSONObject jSONObject = new JSONObject(h);
                d.clear();
                e.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        zq3.g(next, TransferTable.COLUMN_KEY);
                        a aVar = new a(next, new HashMap());
                        if (optJSONObject != null) {
                            aVar.c(g29.o(optJSONObject));
                            d.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            e.add(aVar.a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final boolean d(String str) {
        if (c11.d(this)) {
            return false;
        }
        try {
            return e.contains(str);
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }

    public static final String e(String str) {
        if (c11.d(x07.class)) {
            return null;
        }
        try {
            zq3.h(str, "eventName");
            return b ? a.d(str) ? "_removed_" : str : str;
        } catch (Throwable th) {
            c11.b(th, x07.class);
            return null;
        }
    }

    public static final void f(Map map, String str) {
        if (c11.d(x07.class)) {
            return;
        }
        try {
            zq3.h(map, "parameters");
            zq3.h(str, "eventName");
            if (b) {
                HashMap hashMap = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String b2 = a.b(str, str2);
                    if (b2 != null) {
                        hashMap.put(str2, b2);
                        map.remove(str2);
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            c11.b(th, x07.class);
        }
    }
}
