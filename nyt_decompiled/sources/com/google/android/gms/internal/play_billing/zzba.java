package com.google.android.gms.internal.play_billing;

import defpackage.xaa;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzba implements Iterable, Serializable {
    public static final zzba a = new zzax(b0.d);
    private static final Comparator b;
    private static final j c;
    private int zzc = 0;

    static {
        int i = d.a;
        c = new j(null);
        b = new h();
    }

    zzba() {
    }

    static int o(int i, int i2, int i3) {
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

    public static zzba q(byte[] bArr, int i, int i2) {
        o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzax(bArr2);
    }

    public abstract byte a(int i);

    abstract byte c(int i);

    public abstract int e();

    public abstract boolean equals(Object obj);

    protected abstract int f(int i, int i2, int i3);

    public abstract zzba g(int i, int i2);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int e = e();
            i = f(e, 0, e);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new g(this);
    }

    protected abstract String j(Charset charset);

    abstract void k(xaa xaaVar);

    public abstract boolean n();

    protected final int p() {
        return this.zzc;
    }

    public final String t(Charset charset) {
        return e() == 0 ? "" : j(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? z0.a(this) : z0.a(g(0, 47)).concat("..."));
    }
}
