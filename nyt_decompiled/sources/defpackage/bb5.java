package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* loaded from: classes3.dex */
public class bb5 extends TypeAdapter {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public Number read2(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i = a.a[peek.ordinal()];
        if (i == 1) {
            return Integer.valueOf(jsonReader.nextBoolean() ? 1 : 0);
        }
        if (i == 2) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 3) {
            return Integer.valueOf(jsonReader.nextInt());
        }
        if (i == 4) {
            return Integer.valueOf(Integer.parseInt(jsonReader.nextString()));
        }
        throw new IllegalStateException("Expected NUMBER but was " + peek);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Number number) {
        if (number == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(number);
        }
    }
}
