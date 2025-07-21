package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public abstract class an9 {
    public static final byte[] a(String str) {
        zq3.h(str, "<this>");
        byte[] bytes = str.getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        zq3.h(bArr, "<this>");
        return new String(bArr, yj0.b);
    }
}
