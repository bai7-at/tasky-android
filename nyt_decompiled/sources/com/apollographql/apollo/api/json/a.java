package com.apollographql.apollo.api.json;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.sd0;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.apollographql.apollo.api.json.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0140a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonReader.Token.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    private static final Object a(JsonReader jsonReader) {
        try {
            try {
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (Exception unused) {
                    return jsonReader.j1();
                }
            } catch (Exception unused2) {
                return Long.valueOf(jsonReader.nextLong());
            }
        } catch (Exception unused3) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    public static final JsonReader b(sd0 sd0Var) {
        zq3.h(sd0Var, "<this>");
        return new b(sd0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonReader c(Map map) {
        zq3.h(map, "<this>");
        return new c(map, null, 2, 0 == true ? 1 : 0);
    }

    public static final Object d(JsonReader jsonReader) {
        zq3.h(jsonReader, "<this>");
        JsonReader.Token peek = jsonReader.peek();
        switch (C0140a.a[peek.ordinal()]) {
            case 1:
                return jsonReader.U0();
            case 2:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 3:
            case 4:
                return a(jsonReader);
            case 5:
                return jsonReader.nextString();
            case 6:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.nextName(), d(jsonReader));
                }
                jsonReader.endObject();
                return linkedHashMap;
            case 7:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(d(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            default:
                throw new IllegalStateException(("unknown token " + peek).toString());
        }
    }
}
