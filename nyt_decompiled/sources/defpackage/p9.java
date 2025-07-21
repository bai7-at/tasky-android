package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class p9 {
    public static final String a = new aa().c();
    public static final String b = new oa().c();
    public static final String c = new sa().c();
    public static final String d = new ja().c();
    public static final String e = new ix3().c();
    public static final String f = new ox3().c();
    public static final String g = new cj0().c();
    public static final String h = new wl9().c();
    public static final bv6 i;
    public static final bv6 j;
    public static final bv6 k;

    static {
        bv6 L = bv6.L();
        i = L;
        j = L;
        k = L;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        nd4.b();
        aa.l(true);
        ja.l(true);
        oa.n(true);
        sa.m(true);
        cj0.l(true);
        ix3.l(true);
        ox3.l(true);
        wl9.l(true);
        q9.e();
    }
}
