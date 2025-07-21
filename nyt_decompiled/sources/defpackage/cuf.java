package defpackage;

import com.google.android.gms.internal.pal.n8;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class cuf {
    public static final n8 a;
    public static final n8 b;
    public static final n8 c;

    static {
        new auf();
        n8 t = n8.t();
        a = t;
        b = t;
        c = t;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        rdf.m(new muf());
        rdf.l(new auf(), true);
        if (eif.b()) {
            return;
        }
        rdf.l(new gtf(), true);
        utf.a();
    }
}
