package com.google.android.gms.internal.icing;

import defpackage.u6b;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzcf implements Iterable<Byte>, Serializable {
    public static final zzcf a = new zzcd(b0.c);
    private static final Comparator b;
    private static final l c;
    private int zza = 0;

    static {
        int i = h.a;
        c = new l(null);
        b = new j();
    }

    zzcf() {
    }

    public static zzcf o(String str) {
        return new zzcd(str.getBytes(b0.a));
    }

    static int t(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("End index: ");
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public abstract byte a(int i);

    abstract byte c(int i);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract zzcf f(int i, int i2);

    abstract void g(u6b u6bVar);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int e = e();
            i = n(e, 0, e);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new i(this);
    }

    protected abstract String j(Charset charset);

    public abstract boolean k();

    protected abstract int n(int i, int i2, int i3);

    public final String p(Charset charset) {
        return e() == 0 ? "" : j(charset);
    }

    protected final int q() {
        return this.zza;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? c1.a(this) : String.valueOf(c1.a(f(0, 47))).concat("..."));
    }
}
