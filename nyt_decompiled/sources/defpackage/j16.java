package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j16 {
    private static SharedPreferences c;
    public static final j16 a = new j16();
    private static final Map b = new LinkedHashMap();
    private static final AtomicBoolean d = new AtomicBoolean(false);

    private j16() {
    }

    public static final void a(String str, String str2) {
        if (c11.d(j16.class)) {
            return;
        }
        try {
            zq3.h(str, "pathID");
            zq3.h(str2, "predictedEvent");
            if (!d.get()) {
                a.c();
            }
            Map map = b;
            map.put(str, str2);
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences == null) {
                zq3.z("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            g29 g29Var = g29.a;
            edit.putString("SUGGESTED_EVENTS_HISTORY", g29.h0(t.v(map))).apply();
        } catch (Throwable th) {
            c11.b(th, j16.class);
        }
    }

    public static final String b(View view, String str) {
        if (c11.d(j16.class)) {
            return null;
        }
        try {
            zq3.h(view, "view");
            zq3.h(str, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = ba9.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            g29 g29Var = g29.a;
            return g29.C0(jSONObject.toString());
        } catch (Throwable th) {
            c11.b(th, j16.class);
            return null;
        }
    }

    private final void c() {
        String str = "";
        if (c11.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            zq3.g(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            c = sharedPreferences;
            Map map = b;
            g29 g29Var = g29.a;
            SharedPreferences sharedPreferences2 = c;
            if (sharedPreferences2 == null) {
                zq3.z("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(g29.d0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final String d(String str) {
        if (c11.d(j16.class)) {
            return null;
        }
        try {
            zq3.h(str, "pathID");
            Map map = b;
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, j16.class);
            return null;
        }
    }
}
