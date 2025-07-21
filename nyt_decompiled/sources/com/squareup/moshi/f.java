package com.squareup.moshi;

import com.amazonaws.services.s3.internal.Constants;
import com.squareup.moshi.JsonReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class f extends JsonReader {
    private static final Object h = new Object();
    private Object[] g;

    static final class a implements Iterator, Cloneable {
        final JsonReader.Token a;
        final Object[] b;
        int c;

        a(JsonReader.Token token, Object[] objArr, int i) {
            this.a = token;
            this.b = objArr;
            this.c = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.a, this.b, this.c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.b;
            int i = this.c;
            this.c = i + 1;
            return objArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    f(Object obj) {
        int[] iArr = this.b;
        int i = this.a;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.g = objArr;
        this.a = i + 1;
        objArr[i] = obj;
    }

    private void F0() {
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        Object[] objArr = this.g;
        objArr[i2] = null;
        this.b[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.d;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i - 2];
            if (obj instanceof Iterator) {
                Iterator it2 = (Iterator) obj;
                if (it2.hasNext()) {
                    w0(it2.next());
                }
            }
        }
    }

    private Object G0(Class cls, JsonReader.Token token) {
        int i = this.a;
        Object obj = i != 0 ? this.g[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw t0(obj, token);
    }

    private String H0(Map.Entry entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw t0(key, JsonReader.Token.NAME);
    }

    private void w0(Object obj) {
        int i = this.a;
        if (i == this.g.length) {
            if (i == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            int[] iArr = this.b;
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.g;
            this.g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.g;
        int i2 = this.a;
        this.a = i2 + 1;
        objArr2[i2] = obj;
    }

    @Override // com.squareup.moshi.JsonReader
    public void C() {
        if (hasNext()) {
            w0(nextName());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int P(JsonReader.b bVar) {
        Map.Entry entry = (Map.Entry) G0(Map.Entry.class, JsonReader.Token.NAME);
        String H0 = H0(entry);
        int length = bVar.a.length;
        for (int i = 0; i < length; i++) {
            if (bVar.a[i].equals(H0)) {
                this.g[this.a - 1] = entry.getValue();
                this.c[this.a - 2] = H0;
                return i;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public int X(JsonReader.b bVar) {
        int i = this.a;
        Object obj = i != 0 ? this.g[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (bVar.a[i2].equals(str)) {
                F0();
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void a() {
        List list = (List) G0(List.class, JsonReader.Token.BEGIN_ARRAY);
        a aVar = new a(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.g;
        int i = this.a;
        objArr[i - 1] = aVar;
        this.b[i - 1] = 1;
        this.d[i - 1] = 0;
        if (aVar.hasNext()) {
            w0(aVar.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public void b() {
        Map map = (Map) G0(Map.class, JsonReader.Token.BEGIN_OBJECT);
        a aVar = new a(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.g;
        int i = this.a;
        objArr[i - 1] = aVar;
        this.b[i - 1] = 3;
        if (aVar.hasNext()) {
            w0(aVar.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.g, 0, this.a, (Object) null);
        this.g[0] = h;
        this.b[0] = 8;
        this.a = 1;
    }

    @Override // com.squareup.moshi.JsonReader
    public void d() {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        a aVar = (a) G0(a.class, token);
        if (aVar.a != token || aVar.hasNext()) {
            throw t0(aVar, token);
        }
        F0();
    }

    @Override // com.squareup.moshi.JsonReader
    public void f0() {
        if (!this.f) {
            this.g[this.a - 1] = ((Map.Entry) G0(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.c[this.a - 2] = Constants.NULL_VERSION_ID;
            return;
        }
        JsonReader.Token r = r();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + r + " at " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public void h() {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        a aVar = (a) G0(a.class, token);
        if (aVar.a != token || aVar.hasNext()) {
            throw t0(aVar, token);
        }
        this.c[this.a - 1] = null;
        F0();
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            return false;
        }
        Object obj = this.g[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.JsonReader
    public Object l() {
        G0(Void.class, JsonReader.Token.NULL);
        F0();
        return null;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() {
        Boolean bool = (Boolean) G0(Boolean.class, JsonReader.Token.BOOLEAN);
        F0();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() {
        double parseDouble;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object G0 = G0(Object.class, token);
        if (G0 instanceof Number) {
            parseDouble = ((Number) G0).doubleValue();
        } else {
            if (!(G0 instanceof String)) {
                throw t0(G0, token);
            }
            try {
                parseDouble = Double.parseDouble((String) G0);
            } catch (NumberFormatException unused) {
                throw t0(G0, JsonReader.Token.NUMBER);
            }
        }
        if (this.e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            F0();
            return parseDouble;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() {
        int intValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object G0 = G0(Object.class, token);
        if (G0 instanceof Number) {
            intValueExact = ((Number) G0).intValue();
        } else {
            if (!(G0 instanceof String)) {
                throw t0(G0, token);
            }
            try {
                try {
                    intValueExact = Integer.parseInt((String) G0);
                } catch (NumberFormatException unused) {
                    throw t0(G0, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) G0).intValueExact();
            }
        }
        F0();
        return intValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() {
        long longValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object G0 = G0(Object.class, token);
        if (G0 instanceof Number) {
            longValueExact = ((Number) G0).longValue();
        } else {
            if (!(G0 instanceof String)) {
                throw t0(G0, token);
            }
            try {
                try {
                    longValueExact = Long.parseLong((String) G0);
                } catch (NumberFormatException unused) {
                    throw t0(G0, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) G0).longValueExact();
            }
        }
        F0();
        return longValueExact;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() {
        Map.Entry entry = (Map.Entry) G0(Map.Entry.class, JsonReader.Token.NAME);
        String H0 = H0(entry);
        this.g[this.a - 1] = entry.getValue();
        this.c[this.a - 2] = H0;
        return H0;
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() {
        int i = this.a;
        Object obj = i != 0 ? this.g[i - 1] : null;
        if (obj instanceof String) {
            F0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            F0();
            return obj.toString();
        }
        if (obj == h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw t0(obj, JsonReader.Token.STRING);
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token r() {
        int i = this.a;
        if (i == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.g[i - 1];
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw t0(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader s() {
        return new f(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() {
        if (this.f) {
            throw new JsonDataException("Cannot skip unexpected " + r() + " at " + getPath());
        }
        int i = this.a;
        if (i > 1) {
            this.c[i - 2] = Constants.NULL_VERSION_ID;
        }
        Object obj = i != 0 ? this.g[i - 1] : null;
        if (obj instanceof a) {
            throw new JsonDataException("Expected a value but was " + r() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.g;
            objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
        } else {
            if (i > 0) {
                F0();
                return;
            }
            throw new JsonDataException("Expected a value but was " + r() + " at path " + getPath());
        }
    }

    f(f fVar) {
        super(fVar);
        this.g = (Object[]) fVar.g.clone();
        for (int i = 0; i < this.a; i++) {
            Object[] objArr = this.g;
            Object obj = objArr[i];
            if (obj instanceof a) {
                objArr[i] = ((a) obj).clone();
            }
        }
    }
}
