package defpackage;

import com.google.android.gms.internal.pal.s7;
import com.google.android.gms.internal.pal.t7;
import com.google.android.gms.internal.pal.zzadi;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class acf {
    private final t7 a;
    private final gvf b = gvf.b;

    private acf(t7 t7Var) {
        this.a = t7Var;
    }

    static final acf a(t7 t7Var) {
        if (t7Var == null || t7Var.s() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new acf(t7Var);
    }

    public static final acf b(bcf bcfVar) {
        try {
            t7 zzb = bcfVar.zzb();
            for (s7 s7Var : zzb.x()) {
                if (s7Var.t().t() == zzvn.UNKNOWN_KEYMATERIAL || s7Var.t().t() == zzvn.SYMMETRIC || s7Var.t().t() == zzvn.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", s7Var.t().t().name(), s7Var.t().x()));
                }
            }
            return a(zzb);
        } catch (zzadi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public final Object c(Class cls) {
        Class e = rdf.e(cls);
        if (e == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        vdf.b(this.a);
        lcf lcfVar = new lcf(e, null);
        lcfVar.c(this.b);
        for (s7 s7Var : this.a.x()) {
            if (s7Var.E() == 3) {
                Object f = rdf.f(s7Var.t(), e);
                if (s7Var.s() == this.a.t()) {
                    lcfVar.a(f, s7Var);
                } else {
                    lcfVar.b(f, s7Var);
                }
            }
        }
        return rdf.i(lcfVar.d(), cls);
    }

    public final String toString() {
        return vdf.a(this.a).toString();
    }
}
