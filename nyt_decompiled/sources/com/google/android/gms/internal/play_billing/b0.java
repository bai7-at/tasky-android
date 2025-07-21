package com.google.android.gms.internal.play_billing;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class b0 {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName(Constants.DEFAULT_ENCODING);
    static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final m f;

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        int i = m.a;
        l lVar = new l(bArr, 0, 0, false, null);
        try {
            lVar.c(0);
            f = lVar;
        } catch (zzci e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, b);
    }
}
