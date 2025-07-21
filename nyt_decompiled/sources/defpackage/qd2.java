package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.GraphRequest;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.qd2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qd2 {
    public static final qd2 a = new qd2();
    private static final String b = zt6.b(qd2.class).d();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    private static final Map e = new ConcurrentHashMap();
    private static Long f;
    private static dw2 g;

    public interface a {
        void onCompleted();
    }

    private qd2() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", w92.A());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.c cVar = GraphRequest.n;
        z38 z38Var = z38.a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        GraphRequest x = cVar.x(null, format, null);
        x.H(bundle);
        JSONObject d2 = x.k().d();
        return d2 == null ? new JSONObject() : d2;
    }

    public static final boolean d(String str, String str2, boolean z) {
        Boolean bool;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Map e2 = a.e(str2);
        return (e2.containsKey(str) && (bool = (Boolean) e2.get(str)) != null) ? bool.booleanValue() : z;
    }

    private final boolean f(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < AbraPackageKt.MS_IN_HOUR;
    }

    public static final synchronized void h(a aVar) {
        synchronized (qd2.class) {
            if (aVar != null) {
                try {
                    d.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            final String m = w92.m();
            qd2 qd2Var = a;
            if (qd2Var.f(f) && e.containsKey(m)) {
                qd2Var.k();
                return;
            }
            final Context l = w92.l();
            z38 z38Var = z38.a;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m}, 1));
            zq3.g(format, "java.lang.String.format(format, *args)");
            if (l == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!g29.Y(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    g29.e0("FacebookSDK", e2);
                }
                if (jSONObject != null) {
                    j(m, jSONObject);
                }
            }
            Executor t = w92.t();
            if (t == null) {
                return;
            }
            if (c.compareAndSet(false, true)) {
                t.execute(new Runnable() { // from class: od2
                    @Override // java.lang.Runnable
                    public final void run() {
                        qd2.i(m, l, format);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, Context context, String str2) {
        zq3.h(str, "$applicationId");
        zq3.h(context, "$context");
        zq3.h(str2, "$gateKeepersKey");
        qd2 qd2Var = a;
        JSONObject c2 = qd2Var.c(str);
        if (c2.length() != 0) {
            j(str, c2);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, c2.toString()).apply();
            f = Long.valueOf(System.currentTimeMillis());
        }
        qd2Var.k();
        c.set(false);
    }

    public static final synchronized JSONObject j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (qd2.class) {
            try {
                zq3.h(str, "applicationId");
                jSONObject2 = (JSONObject) e.get(str);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                int i = 0;
                JSONObject jSONObject3 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        try {
                            JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                            jSONObject2.put(jSONObject4.getString(TransferTable.COLUMN_KEY), jSONObject4.getBoolean("value"));
                        } catch (JSONException e2) {
                            g29.e0("FacebookSDK", e2);
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                e.put(str, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVar = (a) concurrentLinkedQueue.poll();
            if (aVar != null) {
                handler.post(new Runnable() { // from class: pd2
                    @Override // java.lang.Runnable
                    public final void run() {
                        qd2.l(qd2.a.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.onCompleted();
    }

    public static final JSONObject m(String str, boolean z) {
        zq3.h(str, "applicationId");
        if (!z) {
            Map map = e;
            if (map.containsKey(str)) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject c2 = a.c(str);
        Context l = w92.l();
        z38 z38Var = z38.a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c2.toString()).apply();
        return j(str, c2);
    }

    public final Map e(String str) {
        g();
        if (str != null) {
            Map map = e;
            if (map.containsKey(str)) {
                dw2 dw2Var = g;
                List<cw2> a2 = dw2Var == null ? null : dw2Var.a(str);
                if (a2 != null) {
                    HashMap hashMap = new HashMap();
                    for (cw2 cw2Var : a2) {
                        hashMap.put(cw2Var.a(), Boolean.valueOf(cw2Var.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    zq3.g(next, TransferTable.COLUMN_KEY);
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                dw2 dw2Var2 = g;
                if (dw2Var2 == null) {
                    dw2Var2 = new dw2();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new cw2((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                dw2Var2.b(str, arrayList);
                g = dw2Var2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h(null);
    }
}
