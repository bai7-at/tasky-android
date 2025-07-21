package com.squareup.moshi;

import defpackage.ad0;
import defpackage.sd0;
import defpackage.tk5;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.ByteString;

/* loaded from: classes4.dex */
public abstract class JsonReader implements Closeable {
    int a;
    int[] b;
    String[] c;
    int[] d;
    boolean e;
    boolean f;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Token.values().length];
            a = iArr;
            try {
                iArr[Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {
        final String[] a;
        final tk5 b;

        private b(String[] strArr, tk5 tk5Var) {
            this.a = strArr;
            this.b = tk5Var;
        }

        public static b a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                ad0 ad0Var = new ad0();
                for (int i = 0; i < strArr.length; i++) {
                    e.y1(ad0Var, strArr[i]);
                    ad0Var.readByte();
                    byteStringArr[i] = ad0Var.a1();
                }
                return new b((String[]) strArr.clone(), tk5.p(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    JsonReader() {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
    }

    public static JsonReader m(sd0 sd0Var) {
        return new d(sd0Var);
    }

    public abstract void C();

    final void G(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public final Object L() {
        switch (a.a[r().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (hasNext()) {
                    arrayList.add(L());
                }
                d();
                return arrayList;
            case 2:
                LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
                b();
                while (hasNext()) {
                    String nextName = nextName();
                    Object L = L();
                    Object put = linkedHashTreeMap.put(nextName, L);
                    if (put != null) {
                        throw new JsonDataException("Map key '" + nextName + "' has multiple values at path " + getPath() + ": " + put + " and " + L);
                    }
                }
                h();
                return linkedHashTreeMap;
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return l();
            default:
                throw new IllegalStateException("Expected a value but was " + r() + " at path " + getPath());
        }
    }

    public abstract int P(b bVar);

    public abstract int X(b bVar);

    public abstract void a();

    public abstract void b();

    public final void c0(boolean z) {
        this.f = z;
    }

    public abstract void d();

    public final void e0(boolean z) {
        this.e = z;
    }

    public abstract void f0();

    public final String getPath() {
        return c.a(this.a, this.b, this.c, this.d);
    }

    public abstract void h();

    public abstract boolean hasNext();

    public final boolean i() {
        return this.f;
    }

    public final boolean j() {
        return this.e;
    }

    public abstract Object l();

    final JsonEncodingException m0(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract long nextLong();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token r();

    public abstract JsonReader s();

    public abstract void skipValue();

    final JsonDataException t0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    JsonReader(JsonReader jsonReader) {
        this.a = jsonReader.a;
        this.b = (int[]) jsonReader.b.clone();
        this.c = (String[]) jsonReader.c.clone();
        this.d = (int[]) jsonReader.d.clone();
        this.e = jsonReader.e;
        this.f = jsonReader.f;
    }
}
