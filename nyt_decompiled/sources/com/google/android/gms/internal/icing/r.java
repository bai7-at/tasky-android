package com.google.android.gms.internal.icing;

import defpackage.i4d;
import defpackage.u6b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class r extends u6b {
    private static final Logger b = Logger.getLogger(r.class.getName());
    private static final boolean c = k1.f();
    s a;

    /* synthetic */ r(p pVar) {
    }

    public static int A(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int B(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int C(String str) {
        int length;
        try {
            length = n1.c(str);
        } catch (zzfq unused) {
            length = str.getBytes(b0.a).length;
        }
        return A(length) + length;
    }

    public static int a(zzcf zzcfVar) {
        int e = zzcfVar.e();
        return A(e) + e;
    }

    static int b(i4d i4dVar, y0 y0Var) {
        f fVar = (f) i4dVar;
        int c2 = fVar.c();
        if (c2 == -1) {
            c2 = y0Var.b(fVar);
            fVar.d(c2);
        }
        return A(c2) + c2;
    }

    static int e(int i, i4d i4dVar, y0 y0Var) {
        int A = A(i << 3);
        int i2 = A + A;
        f fVar = (f) i4dVar;
        int c2 = fVar.c();
        if (c2 == -1) {
            c2 = y0Var.b(fVar);
            fVar.d(c2);
        }
        return i2 + c2;
    }

    public static r x(byte[] bArr) {
        return new q(bArr, 0, bArr.length);
    }

    public static int y(int i) {
        return A(i << 3);
    }

    public static int z(int i) {
        if (i >= 0) {
            return A(i);
        }
        return 10;
    }

    public final void c() {
        if (w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d(String str, zzfq zzfqVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzfqVar);
        byte[] bytes = str.getBytes(b0.a);
        try {
            int length = bytes.length;
            r(length);
            v(bytes, 0, length);
        } catch (zzcl e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcl(e2);
        }
    }

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, int i2);

    public abstract void j(int i, int i2);

    public abstract void k(int i, long j);

    public abstract void l(int i, long j);

    public abstract void m(int i, boolean z);

    public abstract void n(int i, String str);

    public abstract void o(int i, zzcf zzcfVar);

    public abstract void p(byte b2);

    public abstract void q(int i);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(long j);

    public abstract void u(long j);

    public abstract void v(byte[] bArr, int i, int i2);

    public abstract int w();
}
