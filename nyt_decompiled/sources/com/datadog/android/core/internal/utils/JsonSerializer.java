package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.du8;
import defpackage.ou4;
import defpackage.qs2;
import defpackage.te4;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JsonSerializer {
    public static final JsonSerializer a = new JsonSerializer();

    private JsonSerializer() {
    }

    public final Map a(Map map, InternalLogger internalLogger) {
        zq3.h(map, "<this>");
        zq3.h(internalLogger, "internalLogger");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry entry : map.entrySet()) {
            try {
                Pair a2 = du8.a(entry.getKey(), a.b(entry.getValue()));
                linkedHashMap.put(a2.c(), a2.d());
            } catch (Exception e) {
                InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.JsonSerializer$safeMapValuesToJson$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        String format = String.format(Locale.US, "Error serializing value for key %s, value was dropped.", Arrays.copyOf(new Object[]{entry.getKey()}, 1));
                        zq3.g(format, "format(...)");
                        return format;
                    }
                }, e, false, null, 48, null);
            }
        }
        return linkedHashMap;
    }

    public final JsonElement b(Object obj) {
        if (zq3.c(obj, te4.a())) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            zq3.g(jsonNull, "INSTANCE");
            return jsonNull;
        }
        if (obj == null) {
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            zq3.g(jsonNull2, "INSTANCE");
            return jsonNull2;
        }
        JsonNull jsonNull3 = JsonNull.INSTANCE;
        if (zq3.c(obj, jsonNull3)) {
            zq3.g(jsonNull3, "INSTANCE");
            return jsonNull3;
        }
        if (obj instanceof Boolean) {
            return new JsonPrimitive((Boolean) obj);
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double)) {
            if (obj instanceof String) {
                return new JsonPrimitive((String) obj);
            }
            if (obj instanceof Date) {
                return new JsonPrimitive(Long.valueOf(((Date) obj).getTime()));
            }
            if (obj instanceof JsonArray) {
                return (JsonElement) obj;
            }
            if (obj instanceof Iterable) {
                return ou4.b((Iterable) obj);
            }
            if (obj instanceof Map) {
                return ou4.d((Map) obj);
            }
            if (!(obj instanceof JsonObject) && !(obj instanceof JsonPrimitive)) {
                return obj instanceof JSONObject ? ou4.e((JSONObject) obj) : obj instanceof JSONArray ? ou4.c((JSONArray) obj) : new JsonPrimitive(obj.toString());
            }
            return (JsonElement) obj;
        }
        return new JsonPrimitive((Number) obj);
    }
}
