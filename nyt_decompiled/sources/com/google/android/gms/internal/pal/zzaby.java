package com.google.android.gms.internal.pal;

import defpackage.st9;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzaby implements Iterable, Serializable {
    public static final zzaby a = new zzabv(f0.d);
    private static final Comparator b;
    private static final m c;
    private int zzc = 0;

    static {
        int i = f.a;
        c = new m(null);
        b = new k();
    }

    zzaby() {
    }

    static int q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static zzaby u(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static zzaby v(byte[] bArr, int i, int i2) {
        q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzabv(bArr2);
    }

    public static zzaby w(String str) {
        return new zzabv(str.getBytes(f0.b));
    }

    static zzaby x(byte[] bArr) {
        return new zzabv(bArr);
    }

    public final byte[] A() {
        int e = e();
        if (e == 0) {
            return f0.d;
        }
        byte[] bArr = new byte[e];
        f(bArr, 0, 0, e);
        return bArr;
    }

    public abstract byte a(int i);

    abstract byte c(int i);

    public abstract int e();

    public abstract boolean equals(Object obj);

    protected abstract void f(byte[] bArr, int i, int i2, int i3);

    protected abstract int g(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int e = e();
            i = g(e, 0, e);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new j(this);
    }

    public abstract zzaby j(int i, int i2);

    public abstract p k();

    protected abstract String n(Charset charset);

    abstract void o(st9 st9Var);

    public abstract boolean p();

    protected final int t() {
        return this.zzc;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? h1.a(this) : h1.a(j(0, 47)).concat("..."));
    }

    public final String y(Charset charset) {
        return e() == 0 ? "" : n(charset);
    }

    public final boolean z() {
        return e() == 0;
    }
}
