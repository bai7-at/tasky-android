package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class on1 {
    public static final String a = new wa().c();
    public static final bv6 b = bv6.L();
    public static final bv6 c = bv6.L();

    static {
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
        wa.n(true);
        pn1.e();
    }
}
