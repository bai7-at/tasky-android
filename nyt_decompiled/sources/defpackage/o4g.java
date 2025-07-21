package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class o4g {
    private static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);

    public static byte[] a(String str, int i) {
        byte[] bytes = str.getBytes(a);
        int length = bytes.length;
        m4g m4gVar = new m4g(2, new byte[(length * 3) / 4]);
        if (!m4gVar.a(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i2 = m4gVar.b;
        byte[] bArr = m4gVar.a;
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
