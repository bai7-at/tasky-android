package com.airbnb.lottie.parser.moshi;

import defpackage.ad0;
import defpackage.sd0;
import defpackage.tk5;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] g = new String[128];
    int a;
    int[] b = new int[32];
    String[] c = new String[32];
    int[] d = new int[32];
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

    public static final class a {
        final String[] a;
        final tk5 b;

        private a(String[] strArr, tk5 tk5Var) {
            this.a = strArr;
            this.b = tk5Var;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                ad0 ad0Var = new ad0();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.C(ad0Var, strArr[i]);
                    ad0Var.readByte();
                    byteStringArr[i] = ad0Var.a1();
                }
                return new a((String[]) strArr.clone(), tk5.p(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    JsonReader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void C(defpackage.qd0 r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.g
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.C(qd0, java.lang.String):void");
    }

    public static JsonReader j(sd0 sd0Var) {
        return new b(sd0Var);
    }

    final JsonEncodingException G(String str) {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public abstract void b();

    public abstract void d();

    public final String getPath() {
        return com.airbnb.lottie.parser.moshi.a.a(this.a, this.b, this.c, this.d);
    }

    public abstract void h();

    public abstract boolean hasNext();

    public abstract void i();

    public abstract Token l();

    final void m(int i) {
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

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract int r(a aVar);

    public abstract void s();

    public abstract void skipValue();
}
