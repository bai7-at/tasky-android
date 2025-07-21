package defpackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class u31 {
    public static final String a(String str) {
        zq3.h(str, "input");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        String bigInteger = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
        zq3.g(bigInteger, "toString(...)");
        return h.p0(bigInteger, 32, '0');
    }
}
