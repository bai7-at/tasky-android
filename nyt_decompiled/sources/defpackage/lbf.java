package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes3.dex */
final class lbf implements obf {
    final /* synthetic */ crf a;
    final /* synthetic */ dpf b;

    lbf(crf crfVar, dpf dpfVar) {
        this.a = crfVar;
        this.b = dpfVar;
    }

    @Override // defpackage.obf
    public final ebf zza(Class cls) {
        try {
            return new odf(this.a, this.b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.obf
    public final ebf zzb() {
        crf crfVar = this.a;
        return new odf(crfVar, this.b, crfVar.g());
    }

    @Override // defpackage.obf
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // defpackage.obf
    public final Class zzd() {
        return this.b.getClass();
    }

    @Override // defpackage.obf
    public final Set zze() {
        return this.a.j();
    }
}
