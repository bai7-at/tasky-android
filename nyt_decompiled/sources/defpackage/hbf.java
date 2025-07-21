package defpackage;

import com.google.android.gms.internal.pal.f7;
import com.google.android.gms.internal.pal.h7;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzadi;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
class hbf implements ebf {
    private final dpf a;
    private final Class b;

    public hbf(dpf dpfVar, Class cls) {
        if (!dpfVar.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dpfVar.toString(), cls.getName()));
        }
        this.a = dpfVar;
        this.b = cls;
    }

    private final fbf e() {
        return new fbf(this.a.a());
    }

    private final Object f(zx9 zx9Var) {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.e(zx9Var);
        return this.a.i(zx9Var, this.b);
    }

    @Override // defpackage.ebf
    public final Object a(zzaby zzabyVar) {
        try {
            return f(this.a.c(zzabyVar));
        } catch (zzadi e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.h().getName()), e);
        }
    }

    @Override // defpackage.ebf
    public final Object b(zx9 zx9Var) {
        String concat = "Expected proto of type ".concat(this.a.h().getName());
        if (this.a.h().isInstance(zx9Var)) {
            return f(zx9Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // defpackage.ebf
    public final h7 c(zzaby zzabyVar) {
        try {
            zx9 a = e().a(zzabyVar);
            f7 s = h7.s();
            s.l(this.a.d());
            s.m(a.z());
            s.k(this.a.b());
            return (h7) s.g();
        } catch (zzadi e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // defpackage.ebf
    public final zx9 d(zzaby zzabyVar) {
        try {
            return e().a(zzabyVar);
        } catch (zzadi e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.a().e().getName()), e);
        }
    }

    @Override // defpackage.ebf
    public final String zzf() {
        return this.a.d();
    }
}
