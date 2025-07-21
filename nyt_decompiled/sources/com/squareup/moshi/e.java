package com.squareup.moshi;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.ad0;
import defpackage.pm8;
import defpackage.qd0;
import defpackage.wd5;
import defpackage.yt7;
import java.io.IOException;

/* loaded from: classes4.dex */
final class e extends h {
    private static final String[] m = new String[128];
    private final qd0 j;
    private String k = ":";
    private String l;

    class a implements yt7 {
        a() {
        }

        @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (e.this.P() != 9) {
                throw new AssertionError();
            }
            e eVar = e.this;
            int i = eVar.a;
            eVar.a = i - 1;
            int[] iArr = eVar.d;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
        }

        @Override // defpackage.yt7, java.io.Flushable
        public void flush() {
            e.this.j.flush();
        }

        @Override // defpackage.yt7
        public pm8 timeout() {
            return pm8.NONE;
        }

        @Override // defpackage.yt7
        public void write(ad0 ad0Var, long j) {
            e.this.j.write(ad0Var, j);
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    e(qd0 qd0Var) {
        if (qd0Var == null) {
            throw new NullPointerException("sink == null");
        }
        this.j = qd0Var;
        c0(6);
    }

    private void h1() {
        int P = P();
        if (P == 5) {
            this.j.D0(44);
        } else if (P != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        w1();
        e0(4);
    }

    private void u1() {
        int P = P();
        int i = 2;
        if (P != 1) {
            if (P != 2) {
                if (P == 4) {
                    this.j.V(this.k);
                    i = 5;
                } else {
                    if (P == 9) {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                    i = 7;
                    if (P != 6) {
                        if (P != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        if (!this.f) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                }
                e0(i);
            }
            this.j.D0(44);
        }
        w1();
        e0(i);
    }

    private h v1(int i, int i2, char c) {
        int P = P();
        if (P != i2 && P != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.l != null) {
            throw new IllegalStateException("Dangling name: " + this.l);
        }
        int i3 = this.a;
        int i4 = this.i;
        if (i3 == (~i4)) {
            this.i = ~i4;
            return this;
        }
        int i5 = i3 - 1;
        this.a = i5;
        this.c[i5] = null;
        int[] iArr = this.d;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (P == i2) {
            w1();
        }
        this.j.D0(c);
        return this;
    }

    private void w1() {
        if (this.e == null) {
            return;
        }
        this.j.D0(10);
        int i = this.a;
        for (int i2 = 1; i2 < i; i2++) {
            this.j.V(this.e);
        }
    }

    private h x1(int i, int i2, char c) {
        int i3 = this.a;
        int i4 = this.i;
        if (i3 == i4) {
            int[] iArr = this.b;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.i = ~i4;
                return this;
            }
        }
        u1();
        h();
        c0(i);
        this.d[this.a - 1] = 0;
        this.j.D0(c);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void y1(defpackage.qd0 r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = com.squareup.moshi.e.m
            r1 = 34
            r7.D0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.b0(r8, r4, r3)
        L2e:
            r7.V(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.b0(r8, r4, r2)
        L3b:
            r7.D0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.e.y1(qd0, java.lang.String):void");
    }

    private void z1() {
        if (this.l != null) {
            h1();
            y1(this.j, this.l);
            this.l = null;
        }
    }

    @Override // com.squareup.moshi.h
    public h C(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int P = P();
        if ((P != 3 && P != 5) || this.l != null || this.h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.l = str;
        this.c[this.a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h F0(long j) {
        if (this.h) {
            this.h = false;
            return C(Long.toString(j));
        }
        z1();
        u1();
        this.j.V(Long.toString(j));
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
        if (this.l != null) {
            if (!this.g) {
                this.l = null;
                return this;
            }
            z1();
        }
        u1();
        this.j.V(Constants.NULL_VERSION_ID);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h H0(Number number) {
        if (number == null) {
            return G();
        }
        String obj = number.toString();
        if (!this.f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.h) {
            this.h = false;
            return C(obj);
        }
        z1();
        u1();
        this.j.V(obj);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.h
    public h K0(String str) {
        if (str == null) {
            return G();
        }
        if (this.h) {
            this.h = false;
            return C(str);
        }
        z1();
        u1();
        y1(this.j, str);
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
        z1();
        u1();
        this.j.V(z ? "true" : "false");
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
        z1();
        u1();
        c0(9);
        return wd5.c(new a());
    }

    @Override // com.squareup.moshi.h
    public h a() {
        if (!this.h) {
            z1();
            return x1(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.j.close();
        int i = this.a;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.a = 0;
    }

    @Override // com.squareup.moshi.h
    public h d() {
        if (!this.h) {
            z1();
            return x1(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.h
    public void f0(String str) {
        super.f0(str);
        this.k = !str.isEmpty() ? ": " : ":";
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j.flush();
    }

    @Override // com.squareup.moshi.h
    public h i() {
        return v1(1, 2, ']');
    }

    @Override // com.squareup.moshi.h
    public h l() {
        this.h = false;
        return v1(3, 5, '}');
    }

    @Override // com.squareup.moshi.h
    public h w0(double d) {
        if (!this.f && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.h) {
            this.h = false;
            return C(Double.toString(d));
        }
        z1();
        u1();
        this.j.V(Double.toString(d));
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
