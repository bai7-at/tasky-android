package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Writer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x0 {
    private static final x0 f = new x0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private x0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i = this.a;
        int[] iArr = this.b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.b = Arrays.copyOf(iArr, i2);
            this.c = Arrays.copyOf(this.c, i2);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static x0 e() {
        return f;
    }

    private static int h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    static x0 k(x0 x0Var, x0 x0Var2) {
        int i = x0Var.a + x0Var2.a;
        int[] copyOf = Arrays.copyOf(x0Var.b, i);
        System.arraycopy(x0Var2.b, 0, copyOf, x0Var.a, x0Var2.a);
        Object[] copyOf2 = Arrays.copyOf(x0Var.c, i);
        System.arraycopy(x0Var2.c, 0, copyOf2, x0Var.a, x0Var2.a);
        return new x0(i, copyOf, copyOf2, true);
    }

    static x0 l() {
        return new x0();
    }

    private static void p(int i, Object obj, Writer writer) {
        int a = WireFormat.a(i);
        int b = WireFormat.b(i);
        if (b == 0) {
            writer.u(a, ((Long) obj).longValue());
            return;
        }
        if (b == 1) {
            writer.s(a, ((Long) obj).longValue());
            return;
        }
        if (b == 2) {
            writer.M(a, (ByteString) obj);
            return;
        }
        if (b != 3) {
            if (b != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            writer.c(a, ((Integer) obj).intValue());
        } else if (writer.t() == Writer.FieldOrder.ASCENDING) {
            writer.x(a);
            ((x0) obj).q(writer);
            writer.C(a);
        } else {
            writer.C(a);
            ((x0) obj).q(writer);
            writer.x(a);
        }
    }

    void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        int i = this.a;
        return i == x0Var.a && c(this.b, x0Var.b, i) && d(this.c, x0Var.c, this.a);
    }

    public int f() {
        int O;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = WireFormat.a(i4);
            int b = WireFormat.b(i4);
            if (b == 0) {
                O = CodedOutputStream.O(a, ((Long) this.c[i3]).longValue());
            } else if (b == 1) {
                O = CodedOutputStream.n(a, ((Long) this.c[i3]).longValue());
            } else if (b == 2) {
                O = CodedOutputStream.f(a, (ByteString) this.c[i3]);
            } else if (b == 3) {
                O = (CodedOutputStream.L(a) * 2) + ((x0) this.c[i3]).f();
            } else {
                if (b != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                O = CodedOutputStream.l(a, ((Integer) this.c[i3]).intValue());
            }
            i2 += O;
        }
        this.d = i2;
        return i2;
    }

    public int g() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += CodedOutputStream.A(WireFormat.a(this.b[i3]), (ByteString) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + h(this.b, i)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            g0.c(sb, i, String.valueOf(WireFormat.a(this.b[i2])), this.c[i2]);
        }
    }

    void n(int i, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    void o(Writer writer) {
        if (writer.t() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                writer.b(WireFormat.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            writer.b(WireFormat.a(this.b[i2]), this.c[i2]);
        }
    }

    public void q(Writer writer) {
        if (this.a == 0) {
            return;
        }
        if (writer.t() == Writer.FieldOrder.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                p(this.b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            p(this.b[i2], this.c[i2], writer);
        }
    }

    private x0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
