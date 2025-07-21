package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.c29;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class StandardJsonAdapters {
    public static final JsonAdapter.e a = new c();
    static final JsonAdapter b = new d();
    static final JsonAdapter c = new e();
    static final JsonAdapter d = new f();
    static final JsonAdapter e = new g();
    static final JsonAdapter f = new h();
    static final JsonAdapter g = new i();
    static final JsonAdapter h = new j();
    static final JsonAdapter i = new k();
    static final JsonAdapter j = new a();

    static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
        private final T[] constants;
        private final Class<T> enumType;
        private final String[] nameStrings;
        private final JsonReader.b options;

        EnumJsonAdapter(Class<T> cls) {
            this.enumType = cls;
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

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Enum fromJson(JsonReader jsonReader) {
            int X = jsonReader.X(this.options);
            if (X != -1) {
                return this.constants[X];
            }
            String path = jsonReader.getPath();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.nameStrings) + " but was " + jsonReader.nextString() + " at path " + path);
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Enum r2) {
            hVar.K0(this.nameStrings[r2.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.enumType.getName() + ")";
        }
    }

    static final class ObjectJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<Boolean> booleanAdapter;
        private final JsonAdapter<Double> doubleAdapter;
        private final JsonAdapter<List> listJsonAdapter;
        private final JsonAdapter<Map> mapAdapter;
        private final com.squareup.moshi.i moshi;
        private final JsonAdapter<String> stringAdapter;

        ObjectJsonAdapter(com.squareup.moshi.i iVar) {
            this.moshi = iVar;
            this.listJsonAdapter = iVar.c(List.class);
            this.mapAdapter = iVar.c(Map.class);
            this.stringAdapter = iVar.c(String.class);
            this.doubleAdapter = iVar.c(Double.class);
            this.booleanAdapter = iVar.c(Boolean.class);
        }

        private Class a(Class cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            switch (b.a[jsonReader.r().ordinal()]) {
                case 1:
                    return this.listJsonAdapter.fromJson(jsonReader);
                case 2:
                    return this.mapAdapter.fromJson(jsonReader);
                case 3:
                    return this.stringAdapter.fromJson(jsonReader);
                case 4:
                    return this.doubleAdapter.fromJson(jsonReader);
                case 5:
                    return this.booleanAdapter.fromJson(jsonReader);
                case 6:
                    return jsonReader.l();
                default:
                    throw new IllegalStateException("Expected a value but was " + jsonReader.r() + " at path " + jsonReader.getPath());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo197toJson(com.squareup.moshi.h hVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.moshi.e(a(cls), c29.a).mo197toJson(hVar, obj);
            } else {
                hVar.d();
                hVar.l();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    class a extends JsonAdapter {
        a() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(JsonReader jsonReader) {
            return jsonReader.nextString();
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, String str) {
            hVar.K0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            a = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class c implements JsonAdapter.e {
        c() {
        }

        @Override // com.squareup.moshi.JsonAdapter.e
        public JsonAdapter create(Type type2, Set set, com.squareup.moshi.i iVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type2 == Boolean.TYPE) {
                return StandardJsonAdapters.b;
            }
            if (type2 == Byte.TYPE) {
                return StandardJsonAdapters.c;
            }
            if (type2 == Character.TYPE) {
                return StandardJsonAdapters.d;
            }
            if (type2 == Double.TYPE) {
                return StandardJsonAdapters.e;
            }
            if (type2 == Float.TYPE) {
                return StandardJsonAdapters.f;
            }
            if (type2 == Integer.TYPE) {
                return StandardJsonAdapters.g;
            }
            if (type2 == Long.TYPE) {
                return StandardJsonAdapters.h;
            }
            if (type2 == Short.TYPE) {
                return StandardJsonAdapters.i;
            }
            if (type2 == Boolean.class) {
                return StandardJsonAdapters.b.nullSafe();
            }
            if (type2 == Byte.class) {
                return StandardJsonAdapters.c.nullSafe();
            }
            if (type2 == Character.class) {
                return StandardJsonAdapters.d.nullSafe();
            }
            if (type2 == Double.class) {
                return StandardJsonAdapters.e.nullSafe();
            }
            if (type2 == Float.class) {
                return StandardJsonAdapters.f.nullSafe();
            }
            if (type2 == Integer.class) {
                return StandardJsonAdapters.g.nullSafe();
            }
            if (type2 == Long.class) {
                return StandardJsonAdapters.h.nullSafe();
            }
            if (type2 == Short.class) {
                return StandardJsonAdapters.i.nullSafe();
            }
            if (type2 == String.class) {
                return StandardJsonAdapters.j.nullSafe();
            }
            if (type2 == Object.class) {
                return new ObjectJsonAdapter(iVar).nullSafe();
            }
            Class g = com.squareup.moshi.j.g(type2);
            JsonAdapter d = c29.d(iVar, type2, g);
            if (d != null) {
                return d;
            }
            if (g.isEnum()) {
                return new EnumJsonAdapter(g).nullSafe();
            }
            return null;
        }
    }

    class d extends JsonAdapter {
        d() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(JsonReader jsonReader) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Boolean bool) {
            hVar.W0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    class e extends JsonAdapter {
        e() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(JsonReader jsonReader) {
            return Byte.valueOf((byte) StandardJsonAdapters.a(jsonReader, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Byte b) {
            hVar.F0(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    class f extends JsonAdapter {
        f() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            if (nextString.length() <= 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + nextString + '\"', jsonReader.getPath()));
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Character ch) {
            hVar.K0(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    class g extends JsonAdapter {
        g() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Double d) {
            hVar.w0(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    class h extends JsonAdapter {
        h() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(JsonReader jsonReader) {
            float nextDouble = (float) jsonReader.nextDouble();
            if (jsonReader.j() || !Float.isInfinite(nextDouble)) {
                return Float.valueOf(nextDouble);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + nextDouble + " at path " + jsonReader.getPath());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Float f) {
            f.getClass();
            hVar.H0(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    class i extends JsonAdapter {
        i() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(JsonReader jsonReader) {
            return Integer.valueOf(jsonReader.nextInt());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Integer num) {
            hVar.F0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    class j extends JsonAdapter {
        j() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(JsonReader jsonReader) {
            return Long.valueOf(jsonReader.nextLong());
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Long l) {
            hVar.F0(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    class k extends JsonAdapter {
        k() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(JsonReader jsonReader) {
            return Short.valueOf((short) StandardJsonAdapters.a(jsonReader, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo197toJson(com.squareup.moshi.h hVar, Short sh) {
            hVar.F0(sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    static int a(JsonReader jsonReader, String str, int i2, int i3) {
        int nextInt = jsonReader.nextInt();
        if (nextInt < i2 || nextInt > i3) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(nextInt), jsonReader.getPath()));
        }
        return nextInt;
    }
}
