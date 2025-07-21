package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class mq1 {
    private static byte[] a(String str, String str2) {
        if (!r48.b(str) || !r48.b(str2)) {
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(str2.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    public static String c(String str) {
        return r48.b(str) ? b(a("SHA-1", str)) : "";
    }
}
