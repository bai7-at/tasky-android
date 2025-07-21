package defpackage;

import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.ef;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;

/* loaded from: classes3.dex */
public final class zse implements cle {
    final String a;
    final Class b;
    final zzgus c;
    final y1f d;

    zse(String str, Class cls, zzgus zzgusVar, y1f y1fVar) {
        this.d = y1fVar;
        this.a = str;
        this.b = cls;
        this.c = zzgusVar;
    }

    public static cle c(String str, Class cls, zzgus zzgusVar, y1f y1fVar) {
        return new zse(str, cls, zzgusVar, y1fVar);
    }

    @Override // defpackage.cle
    public final Object a(zzgyl zzgylVar) {
        return pte.a().c(ste.d().a(lue.a(this.a, zzgylVar, this.c, zzgvz.RAW, null), ale.a()), this.b);
    }

    @Override // defpackage.cle
    public final ef b(zzgyl zzgylVar) {
        gf L = hf.L();
        L.o(this.a);
        L.p(zzgylVar);
        L.n(zzgvz.RAW);
        sue e = ste.d().e(hte.b().a(ste.d().c(mue.a((hf) L.i())), null), lue.class, ale.a());
        cf L2 = ef.L();
        lue lueVar = (lue) e;
        L2.o(lueVar.f());
        L2.p(lueVar.d());
        L2.n(lueVar.b());
        return (ef) L2.i();
    }

    @Override // defpackage.cle
    public final Class zzb() {
        return this.b;
    }
}
