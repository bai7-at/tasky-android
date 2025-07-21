package defpackage;

import com.datadog.android.core.internal.utils.JsonSerializer;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.d;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class j09 {
    public static final a e = new a(null);
    private static final String[] f = {"id", AuthenticationTokenClaims.JSON_KEY_NAME, "email"};
    private final String a;
    private final String b;
    private final String c;
    private final Map d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j09 a(String str) {
            zq3.h(str, "jsonString");
            try {
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                zq3.g(asJsonObject, "jsonObject");
                return b(asJsonObject);
            } catch (IllegalStateException e) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e);
            }
        }

        public final j09 b(JsonObject jsonObject) {
            zq3.h(jsonObject, "jsonObject");
            try {
                JsonElement jsonElement = jsonObject.get("id");
                String asString = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get(AuthenticationTokenClaims.JSON_KEY_NAME);
                String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("email");
                String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    if (!d.W(c(), entry.getKey())) {
                        String key = entry.getKey();
                        zq3.g(key, "entry.key");
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                return new j09(asString, asString2, asString3, linkedHashMap);
            } catch (IllegalStateException e) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e);
            } catch (NullPointerException e2) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e2);
            } catch (NumberFormatException e3) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e3);
            }
        }

        public final String[] c() {
            return j09.f;
        }

        private a() {
        }
    }

    public j09(String str, String str2, String str3, Map map) {
        zq3.h(map, "additionalProperties");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final Map b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j09)) {
            return false;
        }
        j09 j09Var = (j09) obj;
        return zq3.c(this.a, j09Var.a) && zq3.c(this.b, j09Var.b) && zq3.c(this.c, j09Var.c) && zq3.c(this.d, j09Var.d);
    }

    public final JsonElement f() {
        JsonObject jsonObject = new JsonObject();
        String str = this.a;
        if (str != null) {
            jsonObject.addProperty("id", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            jsonObject.addProperty(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jsonObject.addProperty("email", str3);
        }
        for (Map.Entry entry : this.d.entrySet()) {
            String str4 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!d.W(f, str4)) {
                jsonObject.add(str4, JsonSerializer.a.b(value));
            }
        }
        return jsonObject;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "UserInfo(id=" + this.a + ", name=" + this.b + ", email=" + this.c + ", additionalProperties=" + this.d + ")";
    }

    public /* synthetic */ j09(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? t.i() : map);
    }
}
