package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes5.dex */
final class ci3 implements ap8 {
    private static final ci3[] c = e();
    static final ci3 d = f((byte) 0);
    static final ci3 e = f((byte) 1);
    private final String a;
    private final byte b;

    private ci3(byte b) {
        char[] cArr = new char[2];
        zk5.d(b, cArr, 0);
        this.a = new String(cArr);
        this.b = b;
    }

    private static ci3[] e() {
        ci3[] ci3VarArr = new ci3[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        for (int i = 0; i < 256; i++) {
            ci3VarArr[i] = new ci3((byte) i);
        }
        return ci3VarArr;
    }

    static ci3 f(byte b) {
        return c[b & 255];
    }

    @Override // defpackage.ap8
    public boolean b() {
        return (this.b & 1) != 0;
    }

    public String d() {
        return this.a;
    }

    public String toString() {
        return d();
    }
}
