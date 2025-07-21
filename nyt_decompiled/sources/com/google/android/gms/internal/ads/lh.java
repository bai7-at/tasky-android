package com.google.android.gms.internal.ads;

import defpackage.f0f;
import defpackage.w1f;
import defpackage.yze;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class lh extends yze {
    private static final Logger b = Logger.getLogger(lh.class.getName());
    private static final boolean c = mj.a();
    public static final /* synthetic */ int d = 0;
    mh a;

    /* synthetic */ lh(f0f f0fVar) {
    }

    public static int A(String str) {
        int length;
        try {
            length = qj.e(str);
        } catch (zzhdd unused) {
            length = str.getBytes(ai.b).length;
        }
        return B(length) + length;
    }

    public static int B(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int b(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static lh c(byte[] bArr, int i, int i2) {
        return new jh(bArr, 0, i2);
    }

    static int y(int i, w1f w1fVar, bj bjVar) {
        int B = B(i << 3);
        return B + B + ((rg) w1fVar).d(bjVar);
    }

    static int z(w1f w1fVar, bj bjVar) {
        int d2 = ((rg) w1fVar).d(bjVar);
        return B(d2) + d2;
    }

    @Override // defpackage.yze
    public abstract void a(byte[] bArr, int i, int i2);

    public final void d() {
        if (k() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void e(String str, zzhdd zzhddVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhddVar);
        byte[] bytes = str.getBytes(ai.b);
        try {
            int length = bytes.length;
            v(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(e);
        }
    }

    public abstract void g();

    public abstract void h(byte b2);

    public abstract void i(int i, boolean z);

    public abstract void j(int i, zzgyl zzgylVar);

    public abstract int k();

    public abstract void l(int i, int i2);

    public abstract void m(int i);

    public abstract void n(int i, long j);

    public abstract void o(long j);

    public abstract void p(int i, int i2);

    public abstract void q(int i);

    abstract void r(int i, w1f w1fVar, bj bjVar);

    public abstract void s(int i, String str);

    public abstract void t(int i, int i2);

    public abstract void u(int i, int i2);

    public abstract void v(int i);

    public abstract void w(int i, long j);

    public abstract void x(long j);
}
