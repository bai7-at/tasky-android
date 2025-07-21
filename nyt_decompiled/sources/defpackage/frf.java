package defpackage;

import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class frf implements lrf {
    private final String a;
    private final n7g b;
    private final zzaby c;
    private final zzvn d;
    private final Integer e;
    private final int f;

    private frf(String str, zzaby zzabyVar, zzvn zzvnVar, int i, Integer num) {
        this.a = str;
        this.b = vsf.a(str);
        this.c = zzabyVar;
        this.d = zzvnVar;
        this.f = i;
        this.e = num;
    }

    public static frf e(String str, zzaby zzabyVar, zzvn zzvnVar, int i, Integer num) {
        if (i == 5) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new frf(str, zzabyVar, zzvnVar, i, num);
    }

    public final zzvn a() {
        return this.d;
    }

    public final zzaby b() {
        return this.c;
    }

    public final Integer c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final int f() {
        return this.f;
    }

    @Override // defpackage.lrf
    public final n7g zzb() {
        return this.b;
    }
}
