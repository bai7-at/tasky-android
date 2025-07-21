package com.squareup.moshi;

import defpackage.ad0;
import defpackage.np2;
import defpackage.qd0;
import defpackage.wd5;
import defpackage.yt7;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class g extends h {
    Object[] j = new Object[32];
    private String k;

    class a extends np2 {
        final /* synthetic */ ad0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(yt7 yt7Var, ad0 ad0Var) {
            super(yt7Var);
            this.a = ad0Var;
        }

        @Override // defpackage.np2, defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (g.this.P() == 9) {
                g gVar = g.this;
                Object[] objArr = gVar.j;
                int i = gVar.a;
                if (objArr[i] == null) {
                    gVar.a = i - 1;
                    Object L = JsonReader.m(this.a).L();
                    g gVar2 = g.this;
                    boolean z = gVar2.g;
                    gVar2.g = true;
                    try {
                        gVar2.h1(L);
                        g gVar3 = g.this;
                        gVar3.g = z;
                        int[] iArr = gVar3.d;
                        int i2 = gVar3.a - 1;
                        iArr[i2] = iArr[i2] + 1;
                        return;
                    } catch (Throwable th) {
                        g.this.g = z;
                        throw th;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    g() {
        c0(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g h1(Object obj) {
        String str;
        Object put;
        int P = P();
        int i = this.a;
        if (i == 1) {
            if (P != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.b[i - 1] = 7;
            this.j[i - 1] = obj;
        } else if (P != 3 || (str = this.k) == null) {
            if (P != 1) {
                if (P == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.j[i - 1]).add(obj);
        } else {
            if ((obj != null || this.g) && (put = ((Map) this.j[i - 1]).put(str, obj)) != null) {
                throw new IllegalArgumentException("Map key '" + this.k + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
            }
            this.k = null;
        }
        return this;
    }

    @Override // com.squareup.moshi.h
    public h C(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (P() != 3 || this.k != null || this.h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.k = str;
        this.c[this.a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h F0(long j) {
        if (this.h) {
            this.h = false;
            return C(Long.toString(j));
        }
        h1(Long.valueOf(j));
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h G() {
        if (this.h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        h1(null);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h H0(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return F0(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return w0(number.doubleValue());
        }
        if (number == null) {
            return G();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.h) {
            this.h = false;
            return C(bigDecimal.toString());
        }
        h1(bigDecimal);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h K0(String str) {
        if (this.h) {
            this.h = false;
            return C(str);
        }
        h1(str);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h W0(boolean z) {
        if (this.h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        h1(Boolean.valueOf(z));
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public qd0 X0() {
        if (this.h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        if (P() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        c0(9);
        ad0 ad0Var = new ad0();
        return wd5.c(new a(ad0Var, ad0Var));
    }

    @Override // com.squareup.moshi.h
    public h a() {
        if (this.h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i = this.a;
        int i2 = this.i;
        if (i == i2 && this.b[i - 1] == 1) {
            this.i = ~i2;
            return this;
        }
        h();
        ArrayList arrayList = new ArrayList();
        h1(arrayList);
        Object[] objArr = this.j;
        int i3 = this.a;
        objArr[i3] = arrayList;
        this.d[i3] = 0;
        c0(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.a;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.a = 0;
    }

    @Override // com.squareup.moshi.h
    public h d() {
        if (this.h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i = this.a;
        int i2 = this.i;
        if (i == i2 && this.b[i - 1] == 3) {
            this.i = ~i2;
            return this;
        }
        h();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        h1(linkedHashTreeMap);
        this.j[this.a] = linkedHashTreeMap;
        c0(3);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.h
    public h i() {
        if (P() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.a;
        int i2 = this.i;
        if (i == (~i2)) {
            this.i = ~i2;
            return this;
        }
        int i3 = i - 1;
        this.a = i3;
        this.j[i3] = null;
        int[] iArr = this.d;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h l() {
        if (P() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        int i = this.a;
        int i2 = this.i;
        if (i == (~i2)) {
            this.i = ~i2;
            return this;
        }
        this.h = false;
        int i3 = i - 1;
        this.a = i3;
        this.j[i3] = null;
        this.c[i3] = null;
        int[] iArr = this.d;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    public Object u1() {
        int i = this.a;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.j[0];
    }

    @Override // com.squareup.moshi.h
    public h w0(double d) {
        if (!this.f && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.h) {
            this.h = false;
            return C(Double.toString(d));
        }
        h1(Double.valueOf(d));
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
