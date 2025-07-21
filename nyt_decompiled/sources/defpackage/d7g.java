package defpackage;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public abstract class d7g {
    private static final ThreadLocal a = new b7g();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
