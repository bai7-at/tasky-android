package com.google.android.gms.internal.ads;

import defpackage.yze;
import defpackage.zze;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzgyl implements Iterable, Serializable {
    public static final zzgyl a = new zzgyh(ai.d);
    private static final Comparator b;
    private static final ch c;
    private int zzc = 0;

    static {
        int i = ug.a;
        c = new ch(null);
        b = new zg();
    }

    zzgyl() {
    }

    public static bh B() {
        return new bh(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgyl C(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it2 = iterable.iterator();
            size = 0;
            while (it2.hasNext()) {
                it2.next();
                size++;
            }
        }
        return size == 0 ? a : f(iterable.iterator(), size);
    }

    public static zzgyl D(byte[] bArr, int i, int i2) {
        y(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgyh(bArr2);
    }

    public static zzgyl E(String str) {
        return new zzgyh(str.getBytes(ai.b));
    }

    static void H(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    private static zzgyl f(Iterator it2, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzgyl) it2.next();
        }
        int i2 = i >>> 1;
        zzgyl f = f(it2, i2);
        zzgyl f2 = f(it2, i - i2);
        if (Integer.MAX_VALUE - f.g() >= f2.g()) {
            return zzhbx.K(f, f2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + f.g() + "+" + f2.g());
    }

    static int y(int i, int i2, int i3) {
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

    @Override // java.lang.Iterable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public zze iterator() {
        return new yg(this);
    }

    public final String F(Charset charset) {
        return g() == 0 ? "" : u(charset);
    }

    public final void I(byte[] bArr, int i, int i2, int i3) {
        y(0, i3, g());
        y(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            j(bArr, 0, i2, i3);
        }
    }

    public final byte[] a() {
        int g = g();
        if (g == 0) {
            return ai.d;
        }
        byte[] bArr = new byte[g];
        j(bArr, 0, 0, g);
        return bArr;
    }

    public abstract byte c(int i);

    abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int g = g();
            i = o(g, 0, g);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    protected abstract void j(byte[] bArr, int i, int i2, int i3);

    protected abstract int k();

    protected abstract boolean n();

    protected abstract int o(int i, int i2, int i3);

    protected abstract int p(int i, int i2, int i3);

    public abstract zzgyl q(int i, int i2);

    public abstract gh t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? ej.a(this) : ej.a(q(0, 47)).concat("..."));
    }

    protected abstract String u(Charset charset);

    public abstract ByteBuffer v();

    abstract void w(yze yzeVar);

    public abstract boolean x();

    protected final int z() {
        return this.zzc;
    }
}
