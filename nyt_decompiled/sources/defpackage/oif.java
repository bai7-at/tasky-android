package defpackage;

import com.google.android.gms.internal.pal.n8;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class oif {
    public static final String a;
    public static final n8 b;
    public static final n8 c;

    static {
        new lif();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        b = n8.t();
        c = n8.t();
        try {
            rdf.m(new uif());
            if (eif.b()) {
                return;
            }
            rdf.l(new lif(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
