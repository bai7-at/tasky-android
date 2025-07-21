package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* loaded from: classes4.dex */
public class a63 implements TypeAdapterFactory {
    public static final a63 a = new a63();

    private static class a extends TypeAdapter {
        private final transient Class a;

        a(Class cls) {
            this.a = cls;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Enum read2(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Enum.valueOf(this.a, jsonReader.nextString());
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Enum r2) {
            if (r2 == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(r2.name());
            }
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new a(rawType);
    }
}
