package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class gt9 implements Closeable, Flushable {
    private static final Pattern g = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] h = new String[128];
    private static final String[] i;
    private final Writer a;
    private int[] b = new int[32];
    private int c = 0;
    private final String d;
    private boolean e;
    private String f;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            h[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        i = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public gt9(Writer writer) {
        X(6);
        this.d = ":";
        this.a = writer;
    }

    private final int C() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final gt9 G(int i2, int i3, char c) {
        int C = C();
        if (C != i3 && C != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.c--;
        this.a.write(c);
        return this;
    }

    private final gt9 L(int i2, char c) {
        P();
        X(i2);
        this.a.write(c);
        return this;
    }

    private final void P() {
        int C = C();
        if (C == 1) {
            c0(2);
            return;
        }
        if (C == 2) {
            this.a.append(',');
            return;
        }
        if (C == 4) {
            this.a.append((CharSequence) this.d);
            c0(5);
            return;
        }
        if (C != 6) {
            if (C != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.e) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        c0(7);
    }

    private final void X(int i2) {
        int i3 = this.c;
        int[] iArr = this.b;
        if (i3 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i3 + i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr2[i4] = i2;
    }

    private final void c0(int i2) {
        this.b[this.c - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e0(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String[] r0 = defpackage.gt9.h
            java.io.Writer r1 = r8.a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r1) goto L3e
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1e
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L3b
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3b
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L34
            java.io.Writer r6 = r8.a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L34:
            java.io.Writer r4 = r8.a
            r4.write(r5)
            int r4 = r3 + 1
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            if (r4 >= r1) goto L46
            java.io.Writer r0 = r8.a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L46:
            java.io.Writer r8 = r8.a
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt9.e0(java.lang.String):void");
    }

    private final void f0() {
        if (this.f != null) {
            int C = C();
            if (C == 5) {
                this.a.write(44);
            } else if (C != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            c0(4);
            e0(this.f);
            this.f = null;
        }
    }

    public final gt9 a() {
        f0();
        L(1, '[');
        return this;
    }

    public final gt9 b() {
        f0();
        L(3, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.b[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public final gt9 d() {
        G(1, 2, ']');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final gt9 h() {
        G(3, 5, '}');
        return this;
    }

    public final gt9 i(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f != null) {
            throw new IllegalStateException();
        }
        if (this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f = str;
        return this;
    }

    public final gt9 j() {
        if (this.f != null) {
            f0();
        }
        P();
        this.a.write(Constants.NULL_VERSION_ID);
        return this;
    }

    public final gt9 l(Number number) {
        f0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !g.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        P();
        this.a.append((CharSequence) obj);
        return this;
    }

    public final gt9 m(String str) {
        if (str == null) {
            j();
            return this;
        }
        f0();
        P();
        e0(str);
        return this;
    }

    public final gt9 r(boolean z) {
        f0();
        P();
        this.a.write(true != z ? "false" : "true");
        return this;
    }

    public final void s(boolean z) {
        this.e = true;
    }
}
