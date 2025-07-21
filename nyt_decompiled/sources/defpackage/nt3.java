package defpackage;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes5.dex */
public abstract class nt3 {
    private static final SerialDescriptor a = zj3.a("kotlinx.serialization.json.JsonUnquotedLiteral", he0.D(z38.a));

    public static final JsonPrimitive a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new ut3(bool, false, null, 4, null);
    }

    public static final JsonPrimitive b(Number number) {
        return number == null ? JsonNull.INSTANCE : new ut3(number, false, null, 4, null);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new ut3(str, true, null, 4, null);
    }

    private static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + zt6.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean e(JsonPrimitive jsonPrimitive) {
        zq3.h(jsonPrimitive, "<this>");
        return j48.d(jsonPrimitive.a());
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        zq3.h(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.a();
    }

    public static final double g(JsonPrimitive jsonPrimitive) {
        zq3.h(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.a());
    }

    public static final float h(JsonPrimitive jsonPrimitive) {
        zq3.h(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.a());
    }

    public static final int i(JsonPrimitive jsonPrimitive) {
        zq3.h(jsonPrimitive, "<this>");
        try {
            long o = new f48(jsonPrimitive.a()).o();
            if (-2147483648L <= o && o <= 2147483647L) {
                return (int) o;
            }
            throw new NumberFormatException(jsonPrimitive.a() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final JsonPrimitive j(JsonElement jsonElement) {
        zq3.h(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final SerialDescriptor k() {
        return a;
    }

    public static final long l(JsonPrimitive jsonPrimitive) {
        zq3.h(jsonPrimitive, "<this>");
        try {
            return new f48(jsonPrimitive.a()).o();
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }
}
