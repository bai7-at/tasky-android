package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: classes5.dex */
public abstract class qt3 {
    public static final JsonDecodingException a(Number number, String str, String str2) {
        zq3.h(number, "value");
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "output");
        return e(-1, k(number, str, str2));
    }

    public static final JsonEncodingException b(Number number, String str) {
        zq3.h(number, "value");
        zq3.h(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str, 0, 1, null)));
    }

    public static final JsonEncodingException c(Number number, String str, String str2) {
        zq3.h(number, "value");
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "output");
        return new JsonEncodingException(k(number, str, str2));
    }

    public static final JsonEncodingException d(SerialDescriptor serialDescriptor) {
        zq3.h(serialDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + serialDescriptor.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.d() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException e(int i, String str) {
        zq3.h(str, "message");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException f(int i, String str, CharSequence charSequence) {
        zq3.h(str, "message");
        zq3.h(charSequence, "input");
        return e(i, str + "\nJSON input: " + ((Object) h(charSequence, i)));
    }

    public static final JsonDecodingException g(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "input");
        return e(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) i(str2, 0, 1, null)));
    }

    private static final CharSequence h(CharSequence charSequence, int i) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        return (i2 <= 0 ? "" : ".....") + charSequence.subSequence(uo6.d(i2, 0), uo6.i(i3, charSequence.length())).toString() + (i3 >= charSequence.length() ? "" : ".....");
    }

    static /* synthetic */ CharSequence i(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return h(charSequence, i);
    }

    public static final Void j(g1 g1Var, Number number) {
        zq3.h(g1Var, "<this>");
        zq3.h(number, "result");
        g1.z(g1Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}
