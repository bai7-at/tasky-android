package com.google.android.gms.internal.icing;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.i4d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class b0 {
    static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);
    static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final o e;

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        n nVar = new n(bArr, 0, 0, false, null);
        try {
            nVar.a(0);
            e = nVar;
        } catch (zzdj e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean c(byte[] bArr) {
        return n1.a(bArr);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int f(boolean z) {
        return z ? 1231 : 1237;
    }

    static int g(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object h(Object obj, Object obj2) {
        return ((i4d) obj).k().f0((i4d) obj2).zzl();
    }
}
