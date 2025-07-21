package com.google.android.gms.internal.play_billing;

import defpackage.oqa;
import defpackage.sbc;
import defpackage.xaa;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class o extends xaa {
    private static final Logger b = Logger.getLogger(o.class.getName());
    private static final boolean c = h1.C();
    public static final /* synthetic */ int d = 0;
    p a;

    /* synthetic */ o(oqa oqaVar) {
    }

    public static o A(byte[] bArr, int i, int i2) {
        return new n(bArr, 0, i2);
    }

    static int u(int i, sbc sbcVar, w0 w0Var) {
        int b2 = ((b) sbcVar).b(w0Var);
        int y = y(i << 3);
        return y + y + b2;
    }

    public static int v(int i) {
        if (i >= 0) {
            return y(i);
        }
        return 10;
    }

    static int w(sbc sbcVar, w0 w0Var) {
        int b2 = ((b) sbcVar).b(w0Var);
        return y(b2) + b2;
    }

    public static int x(String str) {
        int length;
        try {
            length = l1.c(str);
        } catch (zzeu unused) {
            length = str.getBytes(b0.b).length;
        }
        return y(length) + length;
    }

    public static int y(int i) {
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

    public static int z(long j) {
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
            j >>>= 14;
            i += 2;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void a() {
        if (d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void b(String str, zzeu zzeuVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzeuVar);
        byte[] bytes = str.getBytes(b0.b);
        try {
            int length = bytes.length;
            r(length);
            n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzbg(e);
        }
    }

    public abstract int d();

    public abstract void e(byte b2);

    public abstract void f(int i, boolean z);

    public abstract void g(int i, zzba zzbaVar);

    public abstract void h(int i, int i2);

    public abstract void i(int i);

    public abstract void j(int i, long j);

    public abstract void k(long j);

    public abstract void l(int i, int i2);

    public abstract void m(int i);

    public abstract void n(byte[] bArr, int i, int i2);

    public abstract void o(int i, String str);

    public abstract void p(int i, int i2);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, long j);

    public abstract void t(long j);
}
