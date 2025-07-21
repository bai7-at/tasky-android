package defpackage;

import com.google.android.gms.internal.ads.kg;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class hme {
    static final kg a;
    static final kg b;
    static final kg c;

    static {
        kg M = kg.M();
        a = M;
        b = M;
        c = M;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        mme.b();
        pwe.a();
        ume.a(true);
        ioe.a(true);
        if (hse.b()) {
            return;
        }
        one.a(true);
        voe.a(true);
        lpe.a(true);
        vpe.a(true);
        zpe.a(true);
        fre.a(true);
    }
}
