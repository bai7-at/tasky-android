package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.AuthenticationTokenClaims;
import java.io.IOException;
import java.util.Arrays;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class rd0 implements lu3 {
    public static final a h = new a(null);
    private static final String[] i;
    private final qd0 a;
    private final String b;
    private int c;
    private int[] d;
    private String[] e;
    private int[] f;
    private String g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte b) {
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(defpackage.qd0 r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r6 = "sink"
                defpackage.zq3.h(r7, r6)
                java.lang.String r6 = "value"
                defpackage.zq3.h(r8, r6)
                java.lang.String[] r6 = defpackage.rd0.a()
                r0 = 34
                r7.D0(r0)
                int r1 = r8.length()
                r2 = 0
                r3 = r2
            L19:
                if (r2 >= r1) goto L42
                char r4 = r8.charAt(r2)
                r5 = 128(0x80, float:1.8E-43)
                if (r4 >= r5) goto L28
                r4 = r6[r4]
                if (r4 != 0) goto L35
                goto L3f
            L28:
                r5 = 8232(0x2028, float:1.1535E-41)
                if (r4 != r5) goto L2f
                java.lang.String r4 = "\\u2028"
                goto L35
            L2f:
                r5 = 8233(0x2029, float:1.1537E-41)
                if (r4 != r5) goto L3f
                java.lang.String r4 = "\\u2029"
            L35:
                if (r3 >= r2) goto L3a
                r7.b0(r8, r3, r2)
            L3a:
                r7.V(r4)
                int r3 = r2 + 1
            L3f:
                int r2 = r2 + 1
                goto L19
            L42:
                if (r3 >= r1) goto L47
                r7.b0(r8, r3, r1)
            L47:
                r7.D0(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rd0.a.c(qd0, java.lang.String):void");
        }

        private a() {
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u00" + h.b((byte) i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        i = strArr;
    }

    public rd0(qd0 qd0Var, String str) {
        zq3.h(qd0Var, "sink");
        this.a = qd0Var;
        this.b = str;
        this.d = new int[64];
        this.e = new String[64];
        this.f = new int[64];
        s(6);
    }

    private final void C(int i2) {
        this.d[this.c - 1] = i2;
    }

    private final void L() {
        if (this.g != null) {
            b();
            a aVar = h;
            qd0 qd0Var = this.a;
            String str = this.g;
            zq3.e(str);
            aVar.c(qd0Var, str);
            this.g = null;
        }
    }

    private final void b() {
        int r = r();
        if (r == 5) {
            this.a.D0(44);
        } else if (r != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        l();
        C(4);
    }

    private final void d() {
        int r = r();
        if (r == 1) {
            C(2);
            l();
            return;
        }
        if (r == 2) {
            this.a.D0(44);
            l();
        } else if (r == 4) {
            this.a.V(i());
            C(5);
        } else if (r == 6) {
            C(7);
        } else {
            if (r == 7) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            throw new IllegalStateException("Nesting problem.");
        }
    }

    private final lu3 h(int i2, int i3, String str) {
        int r = r();
        if (r != i3 && r != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.g != null) {
            throw new IllegalStateException(("Dangling name: " + this.g).toString());
        }
        int i4 = this.c;
        int i5 = i4 - 1;
        this.c = i5;
        this.e[i5] = null;
        int[] iArr = this.f;
        int i6 = i4 - 2;
        iArr[i6] = iArr[i6] + 1;
        if (r == i3) {
            l();
        }
        this.a.V(str);
        return this;
    }

    private final String i() {
        String str = this.b;
        return (str == null || str.length() == 0) ? ":" : ": ";
    }

    private final void l() {
        if (this.b == null) {
            return;
        }
        this.a.D0(10);
        int i2 = this.c;
        for (int i3 = 1; i3 < i2; i3++) {
            this.a.V(this.b);
        }
    }

    private final lu3 m(int i2, String str) {
        d();
        s(i2);
        this.f[this.c - 1] = 0;
        this.a.V(str);
        return this;
    }

    private final int r() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.d[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void s(int i2) {
        int i3 = this.c;
        int[] iArr = this.d;
        if (i3 == iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            zq3.g(copyOf, "copyOf(...)");
            this.d = copyOf;
            String[] strArr = this.e;
            Object[] copyOf2 = Arrays.copyOf(strArr, strArr.length * 2);
            zq3.g(copyOf2, "copyOf(...)");
            this.e = (String[]) copyOf2;
            int[] iArr2 = this.f;
            int[] copyOf3 = Arrays.copyOf(iArr2, iArr2.length * 2);
            zq3.g(copyOf3, "copyOf(...)");
            this.f = copyOf3;
        }
        int[] iArr3 = this.d;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // defpackage.lu3
    public lu3 D(int i2) {
        return j(String.valueOf(i2));
    }

    @Override // defpackage.lu3
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public rd0 A(ay8 ay8Var) {
        zq3.h(ay8Var, "value");
        p1();
        return this;
    }

    @Override // defpackage.lu3
    public lu3 beginArray() {
        L();
        return m(1, "[");
    }

    @Override // defpackage.lu3
    public lu3 beginObject() {
        L();
        return m(3, "{");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.d[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    @Override // defpackage.lu3
    public lu3 endArray() {
        return h(1, 2, "]");
    }

    @Override // defpackage.lu3
    public lu3 endObject() {
        return h(3, 5, "}");
    }

    @Override // defpackage.lu3
    public String getPath() {
        return i.u0(eu3.a.a(this.c, this.d, this.e, this.f), InstructionFileId.DOT, null, null, 0, null, null, 62, null);
    }

    public final lu3 j(String str) {
        zq3.h(str, "value");
        L();
        d();
        this.a.V(str);
        int[] iArr = this.f;
        int i2 = this.c - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // defpackage.lu3
    public lu3 name(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        int i2 = this.c;
        if (i2 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.g != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.g = str;
        this.e[i2 - 1] = str;
        return this;
    }

    @Override // defpackage.lu3
    public lu3 p1() {
        return j(Constants.NULL_VERSION_ID);
    }

    @Override // defpackage.lu3
    public lu3 value(String str) {
        zq3.h(str, "value");
        L();
        d();
        h.c(this.a, str);
        int[] iArr = this.f;
        int i2 = this.c - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // defpackage.lu3
    public lu3 z0(zt3 zt3Var) {
        zq3.h(zt3Var, "value");
        return j(zt3Var.a());
    }

    @Override // defpackage.lu3
    public lu3 value(boolean z) {
        return j(z ? "true" : "false");
    }

    @Override // defpackage.lu3
    public lu3 value(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return j(String.valueOf(d));
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d).toString());
    }

    @Override // defpackage.lu3
    public lu3 value(long j) {
        return j(String.valueOf(j));
    }
}
