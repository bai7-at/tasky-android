package com.nytimes.android.abra.utilities;

import com.facebook.AuthenticationTokenClaims;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import defpackage.iv3;
import defpackage.lp6;
import defpackage.sd0;
import defpackage.tl1;
import defpackage.ul8;
import defpackage.zq3;
import defpackage.zt6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.h;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JsonExtensionsKt {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.f(new MutablePropertyReference1Impl(JsonExtensionsKt.class, "source", "getSource(Lcom/google/gson/JsonObject;)Lokio/ByteString;", 1))};
    private static final lp6 source$delegate = tl1.a.a();

    public static final int getAbraVersion(String str) {
        zq3.h(str, "<this>");
        try {
            return new JSONObject(str).optInt(".ver", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final ByteString getSource(JsonObject jsonObject) {
        zq3.h(jsonObject, "<this>");
        return (ByteString) source$delegate.getValue(jsonObject, $$delegatedProperties[0]);
    }

    public static final boolean isBooleanStrict(String str) {
        zq3.h(str, "<this>");
        return h.b1(str) != null;
    }

    public static final boolean isJsonObject(String str) {
        zq3.h(str, "<this>");
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static final Boolean maybeAsBoolean(JsonObject jsonObject, String str) {
        JsonPrimitive primitive;
        zq3.h(jsonObject, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        JsonElement tryGet = tryGet(jsonObject, str);
        if (tryGet == null || (primitive = toPrimitive(tryGet)) == null) {
            return null;
        }
        Boolean strictBoolean = strictBoolean(primitive);
        if (strictBoolean != null) {
            return strictBoolean;
        }
        String asString = primitive.getAsString();
        zq3.g(asString, "getAsString(...)");
        return ExtensionsKt.toExactBoolean(asString);
    }

    public static final Number maybeAsNumber(JsonObject jsonObject, String str) {
        JsonPrimitive primitive;
        zq3.h(jsonObject, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            JsonElement tryGet = tryGet(jsonObject, str);
            if (tryGet == null || (primitive = toPrimitive(tryGet)) == null) {
                return null;
            }
            Number strictNumber = strictNumber(primitive);
            if (strictNumber != null) {
                return strictNumber;
            }
            String asString = primitive.getAsString();
            zq3.g(asString, "getAsString(...)");
            return Long.valueOf(Long.parseLong(asString));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String maybeAsString(JsonObject jsonObject, String str) {
        JsonPrimitive primitive;
        zq3.h(jsonObject, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            JsonElement tryGet = tryGet(jsonObject, str);
            if (tryGet == null || (primitive = toPrimitive(tryGet)) == null) {
                return null;
            }
            return strictString(primitive);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final JsonObject parseJsonObject(JsonParser jsonParser, sd0 sd0Var) {
        zq3.h(jsonParser, "<this>");
        zq3.h(sd0Var, "src");
        ByteString a1 = sd0Var.a1();
        JsonObject asJsonObject = jsonParser.parse(a1.K()).getAsJsonObject();
        zq3.e(asJsonObject);
        setSource(asJsonObject, a1);
        try {
            sd0Var.close();
        } catch (IOException e) {
            ul8.a.f(e, "Error closing source.", new Object[0]);
        }
        return asJsonObject;
    }

    public static final void setSource(JsonObject jsonObject, ByteString byteString) {
        zq3.h(jsonObject, "<this>");
        zq3.h(byteString, "<set-?>");
        source$delegate.a(jsonObject, $$delegatedProperties[0], byteString);
    }

    private static final Boolean strictBoolean(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isBoolean()) {
            return Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        return null;
    }

    private static final Number strictNumber(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isNumber()) {
            return Long.valueOf(jsonPrimitive.getAsNumber().longValue());
        }
        return null;
    }

    private static final String strictString(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getAsString();
        }
        return null;
    }

    public static final String toJsonString(Map<String, String> map) {
        zq3.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!h.d0(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            arrayList.add((isJsonObject(str2) || isBooleanStrict(str2)) ? "\"" + str + "\": " + str2 : "\"" + str + "\": \"" + str2 + "\"");
        }
        return i.u0(arrayList, ",", "{", "}", 0, null, null, 56, null);
    }

    private static final JsonPrimitive toPrimitive(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsJsonPrimitive();
        }
        return null;
    }

    public static final JsonElement tryGet(JsonObject jsonObject, String str) {
        zq3.h(jsonObject, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        try {
            JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement != null) {
                return jsonElement.getAsJsonPrimitive();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
