package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class ew8 {
    public static final UUID a = UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8");
    public static final UUID b = UUID.fromString("6ba7b811-9dad-11d1-80b4-00c04fd430c8");
    public static final UUID c = UUID.fromString("6ba7b812-9dad-11d1-80b4-00c04fd430c8");
    public static final UUID d = UUID.fromString("6ba7b814-9dad-11d1-80b4-00c04fd430c8");
    private static final Charset e = Charset.forName(Constants.DEFAULT_ENCODING);

    private static UUID a(byte[] bArr) {
        if (bArr.length < 16) {
            throw new AssertionError();
        }
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | (bArr[i] & 255);
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return new UUID(j2, j);
    }

    public static UUID b(UUID uuid, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            Objects.requireNonNull(uuid, "namespace is null");
            messageDigest.update(d(uuid));
            Objects.requireNonNull(bArr, "name is null");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            byte b2 = (byte) (digest[6] & 15);
            digest[6] = b2;
            digest[6] = (byte) (b2 | 80);
            byte b3 = (byte) (digest[8] & 63);
            digest[8] = b3;
            digest[8] = (byte) (b3 | 128);
            return a(digest);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("SHA-1 not supported", e2);
        }
    }

    public static UUID c(UUID uuid, String str) {
        Objects.requireNonNull(str, "name == null");
        return b(uuid, str.getBytes(e));
    }

    private static byte[] d(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (255 & (mostSignificantBits >> ((7 - i) * 8)));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            bArr[i2] = (byte) ((leastSignificantBits >> ((15 - i2) * 8)) & 255);
        }
        return bArr;
    }
}
