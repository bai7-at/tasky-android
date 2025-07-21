package com.apollographql.apollo.api.json;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.JsonDataException;
import defpackage.r29;
import defpackage.zq3;
import defpackage.zt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class c implements JsonReader {
    public static final a j = new a(null);
    private final Object a;
    private final List b;
    private JsonReader.Token c;
    private Object d;
    private Object[] e;
    private Map[] f;
    private Iterator[] g;
    private int[] h;
    private int i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(JsonReader jsonReader) {
            zq3.h(jsonReader, "<this>");
            if (jsonReader instanceof c) {
                return (c) jsonReader;
            }
            JsonReader.Token peek = jsonReader.peek();
            if (peek == JsonReader.Token.BEGIN_OBJECT) {
                List path = jsonReader.getPath();
                Object d = com.apollographql.apollo.api.json.a.d(jsonReader);
                zq3.f(d, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return new c((Map) d, path);
            }
            throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + peek + "` json token").toString());
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.END_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JsonReader.Token.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public c(Object obj, List list) {
        zq3.h(list, "pathRoot");
        this.a = obj;
        this.b = list;
        this.e = new Object[64];
        this.f = new Map[64];
        this.g = new Iterator[64];
        this.h = new int[64];
        this.c = b(obj);
        this.d = obj;
    }

    private final void a() {
        int i = this.i;
        if (i == 0) {
            this.c = JsonReader.Token.END_DOCUMENT;
            return;
        }
        Iterator it2 = this.g[i - 1];
        zq3.e(it2);
        Object[] objArr = this.e;
        int i2 = this.i;
        if (objArr[i2 - 1] instanceof Integer) {
            int i3 = i2 - 1;
            Object obj = objArr[i2 - 1];
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i3] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it2.hasNext()) {
            this.c = this.e[this.i + (-1)] instanceof Integer ? JsonReader.Token.END_ARRAY : JsonReader.Token.END_OBJECT;
            return;
        }
        Object next = it2.next();
        this.d = next;
        this.c = next instanceof Map.Entry ? JsonReader.Token.NAME : b(next);
    }

    private final JsonReader.Token b(Object obj) {
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Integer) {
            return JsonReader.Token.NUMBER;
        }
        if (obj instanceof Long) {
            return JsonReader.Token.LONG;
        }
        if (!(obj instanceof Double) && !(obj instanceof zt3)) {
            return obj instanceof String ? JsonReader.Token.STRING : obj instanceof Boolean ? JsonReader.Token.BOOLEAN : JsonReader.Token.ANY;
        }
        return JsonReader.Token.NUMBER;
    }

    private final int l(String str, List list) {
        int i = this.h[this.i - 1];
        if (i >= list.size() || !zq3.c(list.get(i), str)) {
            int indexOf = list.indexOf(str);
            if (indexOf != -1) {
                this.h[this.i - 1] = indexOf + 1;
            }
            return indexOf;
        }
        int[] iArr = this.h;
        int i2 = this.i;
        iArr[i2 - 1] = iArr[i2 - 1] + 1;
        return i;
    }

    private final String m() {
        return i.u0(getPath(), InstructionFileId.DOT, null, null, 0, null, null, 62, null);
    }

    private final void r() {
        int i = this.i;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            zq3.g(copyOf, "copyOf(...)");
            this.e = copyOf;
            Map[] mapArr = this.f;
            Object[] copyOf2 = Arrays.copyOf(mapArr, mapArr.length * 2);
            zq3.g(copyOf2, "copyOf(...)");
            this.f = (Map[]) copyOf2;
            int[] iArr = this.h;
            int[] copyOf3 = Arrays.copyOf(iArr, iArr.length * 2);
            zq3.g(copyOf3, "copyOf(...)");
            this.h = copyOf3;
            Iterator[] itArr = this.g;
            Object[] copyOf4 = Arrays.copyOf(itArr, itArr.length * 2);
            zq3.g(copyOf4, "copyOf(...)");
            this.g = (Iterator[]) copyOf4;
        }
        this.i++;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public Void U0() {
        if (peek() == JsonReader.Token.NULL) {
            a();
            return null;
        }
        throw new JsonDataException("Expected NULL but was " + peek() + " at path " + m());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c beginArray() {
        if (peek() != JsonReader.Token.BEGIN_ARRAY) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + m());
        }
        Object obj = this.d;
        zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        r();
        this.e[this.i - 1] = -1;
        this.g[this.i - 1] = ((List) obj).iterator();
        a();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public List getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.e[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public c beginObject() {
        if (peek() != JsonReader.Token.BEGIN_OBJECT) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + m());
        }
        r();
        Map[] mapArr = this.f;
        int i = this.i - 1;
        Object obj = this.d;
        zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        mapArr[i] = obj;
        q();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean hasNext() {
        int i = b.a[peek().ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c endArray() {
        if (peek() == JsonReader.Token.END_ARRAY) {
            int i = this.i - 1;
            this.i = i;
            this.g[i] = null;
            this.e[i] = null;
            a();
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + m());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c endObject() {
        int i = this.i - 1;
        this.i = i;
        this.g[i] = null;
        this.e[i] = null;
        this.f[i] = null;
        a();
        return this;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public zt3 j1() {
        zt3 zt3Var;
        int i = b.a[peek().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Number but was " + peek() + " at path " + m());
        }
        Object obj = this.d;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            zt3Var = new zt3(obj.toString());
        } else if (obj instanceof String) {
            zt3Var = new zt3((String) obj);
        } else {
            if (!(obj instanceof zt3)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            zt3Var = (zt3) obj;
        }
        a();
        return zt3Var;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public int l1(List list) {
        zq3.h(list, "names");
        while (hasNext()) {
            int l = l(nextName(), list);
            if (l != -1) {
                return l;
            }
            skipValue();
        }
        return -1;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public boolean nextBoolean() {
        if (peek() == JsonReader.Token.BOOLEAN) {
            Object obj = this.d;
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            a();
            return bool.booleanValue();
        }
        throw new JsonDataException("Expected BOOLEAN but was " + peek() + " at path " + m());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public double nextDouble() {
        double parseDouble;
        int i = b.a[peek().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Double but was " + peek() + " at path " + m());
        }
        Object obj = this.d;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseDouble = r29.c(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof zt3)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            parseDouble = Double.parseDouble(((zt3) obj).a());
        }
        a();
        return parseDouble;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public int nextInt() {
        int parseInt;
        int i = b.a[peek().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected an Int but was " + peek() + " at path " + m());
        }
        Object obj = this.d;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseInt = r29.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseInt = r29.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseInt = Integer.parseInt((String) obj);
        } else {
            if (!(obj instanceof zt3)) {
                throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
            }
            parseInt = Integer.parseInt(((zt3) obj).a());
        }
        a();
        return parseInt;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public long nextLong() {
        long parseLong;
        int i = b.a[peek().ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            throw new JsonDataException("Expected a Long but was " + peek() + " at path " + m());
        }
        Object obj = this.d;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            parseLong = r29.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof zt3)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            parseLong = Long.parseLong(((zt3) obj).a());
        }
        a();
        return parseLong;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextName() {
        if (peek() != JsonReader.Token.NAME) {
            throw new JsonDataException("Expected NAME but was " + peek() + " at path " + m());
        }
        Object obj = this.d;
        zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.e[this.i - 1] = entry.getKey();
        this.d = entry.getValue();
        this.c = b(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public String nextString() {
        String a2;
        Object obj = this.d;
        if (obj instanceof Integer) {
            a2 = String.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            a2 = String.valueOf(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            a2 = String.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            a2 = (String) obj;
        } else if (obj == null) {
            a2 = Constants.NULL_VERSION_ID;
        } else {
            if (!(obj instanceof zt3)) {
                throw new IllegalStateException(("Expected a String but got " + obj + " instead").toString());
            }
            a2 = ((zt3) obj).a();
        }
        a();
        return a2;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public JsonReader.Token peek() {
        return this.c;
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void q() {
        Map[] mapArr = this.f;
        int i = this.i;
        Map map = mapArr[i - 1];
        this.e[i - 1] = null;
        zq3.e(map);
        this.g[i - 1] = map.entrySet().iterator();
        this.h[this.i - 1] = 0;
        a();
    }

    public final Object s() {
        Object obj = this.d;
        if (obj != null) {
            a();
            return obj;
        }
        throw new JsonDataException("Expected a non-null value at path " + m());
    }

    @Override // com.apollographql.apollo.api.json.JsonReader
    public void skipValue() {
        a();
    }

    public /* synthetic */ c(Object obj, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? i.l() : list);
    }
}
