package defpackage;

import com.google.android.gms.internal.pal.n8;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class ydf {
    public static final String a;
    public static final String b;
    public static final n8 c;
    public static final n8 d;
    public static final n8 e;

    static {
        new ief();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new tef();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new nff();
        new pef();
        new xff();
        new hgf();
        new sff();
        new lgf();
        n8 t = n8.t();
        c = t;
        d = t;
        e = t;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        rdf.m(new fef());
        cuf.a();
        rdf.l(new ief(), true);
        rdf.l(new tef(), true);
        if (eif.b()) {
            return;
        }
        rdf.l(new pef(), true);
        nff.k(true);
        rdf.l(new sff(), true);
        rdf.l(new xff(), true);
        rdf.l(new hgf(), true);
        rdf.l(new lgf(), true);
    }
}
