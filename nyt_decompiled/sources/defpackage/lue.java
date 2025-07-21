package defpackage;

import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class lue implements sue {
    private final String a;
    private final tze b;
    private final zzgyl c;
    private final zzgus d;
    private final zzgvz e;
    private final Integer f;

    private lue(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) {
        this.a = str;
        this.b = bve.a(str);
        this.c = zzgylVar;
        this.d = zzgusVar;
        this.e = zzgvzVar;
        this.f = num;
    }

    public static lue a(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) {
        if (zzgvzVar == zzgvz.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new lue(str, zzgylVar, zzgusVar, zzgvzVar, num);
    }

    public final zzgus b() {
        return this.d;
    }

    public final zzgvz c() {
        return this.e;
    }

    public final zzgyl d() {
        return this.c;
    }

    public final Integer e() {
        return this.f;
    }

    public final String f() {
        return this.a;
    }

    @Override // defpackage.sue
    public final tze zzd() {
        return this.b;
    }
}
