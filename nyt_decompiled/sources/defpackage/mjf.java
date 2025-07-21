package defpackage;

import com.google.android.gms.internal.pal.n8;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class mjf {
    public static final n8 a;
    public static final n8 b;
    public static final n8 c;

    static {
        new jjf();
        new djf();
        a = n8.t();
        b = n8.t();
        c = n8.t();
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        rdf.m(new sjf());
        rdf.m(new bkf());
        ydf.a();
        if (eif.b()) {
            return;
        }
        rdf.k(new djf(), new jjf(), true);
        rdf.k(new lmf(), new rmf(), true);
    }
}
