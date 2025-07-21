package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class nd4 {
    public static final String a = new j93().c();
    public static final bv6 b;
    public static final bv6 c;
    public static final bv6 d;

    static {
        bv6 L = bv6.L();
        b = L;
        c = L;
        d = L;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        j93.m(true);
        w9.n(true);
        od4.e();
    }
}
