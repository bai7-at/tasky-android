package com.google.android.gms.internal.measurement;

import defpackage.c8f;
import defpackage.cef;
import defpackage.m9f;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class b2 extends c8f {
    private static final Logger b = Logger.getLogger(b2.class.getName());
    private static final boolean c = s3.C();
    c2 a;

    /* synthetic */ b2(m9f m9fVar) {
    }

    static int A(cef cefVar, h3 h3Var) {
        p1 p1Var = (p1) cefVar;
        int b2 = p1Var.b();
        if (b2 == -1) {
            b2 = h3Var.zza(p1Var);
            p1Var.d(b2);
        }
        return a(b2) + b2;
    }

    public static int B(String str) {
        int length;
        try {
            length = w3.c(str);
        } catch (zzmz unused) {
            length = str.getBytes(l2.b).length;
        }
        return a(length) + length;
    }

    public static int C(int i) {
        return a(i << 3);
    }

    public static int a(int i) {
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

    public static int b(long j) {
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

    public static b2 c(byte[] bArr) {
        return new a2(bArr, 0, bArr.length);
    }

    public static int x(zzjb zzjbVar) {
        int e = zzjbVar.e();
        return a(e) + e;
    }

    static int y(int i, cef cefVar, h3 h3Var) {
        int a = a(i << 3);
        int i2 = a + a;
        p1 p1Var = (p1) cefVar;
        int b2 = p1Var.b();
        if (b2 == -1) {
            b2 = h3Var.zza(p1Var);
            p1Var.d(b2);
        }
        return i2 + b2;
    }

    public static int z(int i) {
        if (i >= 0) {
            return a(i);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void e(String str, zzmz zzmzVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmzVar);
        byte[] bytes = str.getBytes(l2.b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjh(e);
        }
    }

    public abstract int g();

    public abstract void h(byte b2);

    public abstract void i(int i, boolean z);

    public abstract void j(int i, zzjb zzjbVar);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, long j);

    public abstract void n(long j);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(byte[] bArr, int i, int i2);

    public abstract void r(int i, String str);

    public abstract void s(int i, int i2);

    public abstract void t(int i, int i2);

    public abstract void u(int i);

    public abstract void v(int i, long j);

    public abstract void w(long j);
}
