package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import defpackage.c29;
import java.lang.Enum;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
    final T[] constants;
    final Class<T> enumType;
    final T fallbackValue;
    final String[] nameStrings;
    final JsonReader.b options;
    final boolean useFallbackValue;

    EnumJsonAdapter(Class<T> cls, T t, boolean z) {
        this.enumType = cls;
        this.fallbackValue = t;
        this.useFallbackValue = z;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.constants = enumConstants;
            this.nameStrings = new String[enumConstants.length];
            int i = 0;
            while (true) {
                T[] tArr = this.constants;
                if (i >= tArr.length) {
                    this.options = JsonReader.b.a(this.nameStrings);
                    return;
                } else {
                    String name = tArr[i].name();
                    this.nameStrings[i] = c29.n(name, cls.getField(name));
                    i++;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in " + cls.getName(), e);
        }
    }

    public static EnumJsonAdapter a(Class cls) {
        return new EnumJsonAdapter(cls, null, false);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Enum fromJson(JsonReader jsonReader) {
        int X = jsonReader.X(this.options);
        if (X != -1) {
            return this.constants[X];
        }
        String path = jsonReader.getPath();
        if (this.useFallbackValue) {
            if (jsonReader.r() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                return this.fallbackValue;
            }
            throw new JsonDataException("Expected a string but was " + jsonReader.r() + " at path " + path);
        }
        throw new JsonDataException("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + jsonReader.nextString() + " at path " + path);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Enum r2) {
        if (r2 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.K0(this.nameStrings[r2.ordinal()]);
    }

    public EnumJsonAdapter d(Enum r3) {
        return new EnumJsonAdapter(this.enumType, r3, true);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + ")";
    }
}
