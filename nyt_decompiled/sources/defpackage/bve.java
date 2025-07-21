package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.ads.zzgpl;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class bve {
    public static final Charset a = Charset.forName(Constants.DEFAULT_ENCODING);

    public static final tze a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzgpl("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return tze.b(bArr);
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
