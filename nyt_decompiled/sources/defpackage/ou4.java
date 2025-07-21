package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.JsonSerializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ou4 {
    public static final boolean a(int i, long j, InternalLogger internalLogger, qs2 qs2Var) {
        zq3.h(internalLogger, "internalLogger");
        zq3.h(qs2Var, "block");
        long nanoTime = System.nanoTime() - j;
        int i2 = 1;
        boolean z = false;
        while (i2 <= i && !z) {
            if (System.nanoTime() - nanoTime >= j) {
                try {
                    z = ((Boolean) qs2Var.mo865invoke()).booleanValue();
                } catch (Exception e) {
                    InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.MiscUtilsKt$retryWithDelay$1
                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            return "Internal I/O operation failed";
                        }
                    }, e, false, null, 48, null);
                    z = false;
                }
                nanoTime = System.nanoTime();
                i2++;
            }
        }
        return z;
    }

    public static final JsonElement b(Iterable iterable) {
        zq3.h(iterable, "<this>");
        JsonArray jsonArray = new JsonArray();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            jsonArray.add(JsonSerializer.a.b(it2.next()));
        }
        return jsonArray;
    }

    public static final JsonElement c(JSONArray jSONArray) {
        zq3.h(jSONArray, "<this>");
        JsonArray jsonArray = new JsonArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            jsonArray.add(JsonSerializer.a.b(jSONArray.get(i)));
        }
        return jsonArray;
    }

    public static final JsonElement d(Map map) {
        zq3.h(map, "<this>");
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : map.entrySet()) {
            jsonObject.add(String.valueOf(entry.getKey()), JsonSerializer.a.b(entry.getValue()));
        }
        return jsonObject;
    }

    public static final JsonElement e(JSONObject jSONObject) {
        zq3.h(jSONObject, "<this>");
        JsonObject jsonObject = new JsonObject();
        Iterator<String> keys = jSONObject.keys();
        zq3.g(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jsonObject.add(next, JsonSerializer.a.b(jSONObject.get(next)));
        }
        return jsonObject;
    }
}
