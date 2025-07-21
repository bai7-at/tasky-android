package com.google.android.gms.internal.pal;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.zx9;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class f0 {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName(Constants.DEFAULT_ENCODING);
    static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final p f;

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = p.n(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d2 = d(length, bArr, 0, length);
        if (d2 == 0) {
            return 1;
        }
        return d2;
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static int d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static Object g(Object obj, Object obj2) {
        return ((zx9) obj).p().G0((zx9) obj2).t0();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, b);
    }

    public static boolean i(byte[] bArr) {
        return t1.e(bArr);
    }
}
