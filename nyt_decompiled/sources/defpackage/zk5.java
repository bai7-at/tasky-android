package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public abstract class zk5 {
    private static final char[] a = b();
    private static final byte[] b = a();
    private static final boolean[] c = c();

    private static byte[] a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 16; i++) {
            bArr["0123456789abcdef".charAt(i)] = (byte) i;
        }
        return bArr;
    }

    private static char[] b() {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | JceEncryptionConstants.SYMMETRIC_KEY_LENGTH] = "0123456789abcdef".charAt(i & 15);
        }
        return cArr;
    }

    private static boolean[] c() {
        boolean[] zArr = new boolean[Settings.DEFAULT_INITIAL_WINDOW_SIZE];
        int i = 0;
        while (i < 65535) {
            zArr[i] = (48 <= i && i <= 57) || (97 <= i && i <= 102);
            i++;
        }
        return zArr;
    }

    public static void d(byte b2, char[] cArr, int i) {
        int i2 = b2 & 255;
        char[] cArr2 = a;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    }

    public static boolean e(char c2) {
        return c[c2];
    }

    public static boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!e(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void g(long j, char[] cArr, int i) {
        d((byte) ((j >> 56) & 255), cArr, i);
        d((byte) ((j >> 48) & 255), cArr, i + 2);
        d((byte) ((j >> 40) & 255), cArr, i + 4);
        d((byte) ((j >> 32) & 255), cArr, i + 6);
        d((byte) ((j >> 24) & 255), cArr, i + 8);
        d((byte) ((j >> 16) & 255), cArr, i + 10);
        d((byte) ((j >> 8) & 255), cArr, i + 12);
        d((byte) (j & 255), cArr, i + 14);
    }
}
