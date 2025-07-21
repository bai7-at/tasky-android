package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class r02 implements ov3 {
    private static final r02 b = new r02();

    private r02() {
    }

    public static r02 c() {
        return b;
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
