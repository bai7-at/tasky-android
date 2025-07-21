package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes3.dex */
final class ibf implements obf {
    final /* synthetic */ dpf a;

    ibf(dpf dpfVar) {
        this.a = dpfVar;
    }

    @Override // defpackage.obf
    public final ebf zza(Class cls) {
        try {
            return new hbf(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.obf
    public final ebf zzb() {
        dpf dpfVar = this.a;
        return new hbf(dpfVar, dpfVar.g());
    }

    @Override // defpackage.obf
    public final Class zzc() {
        return this.a.getClass();
    }

    @Override // defpackage.obf
    public final Class zzd() {
        return null;
    }

    @Override // defpackage.obf
    public final Set zze() {
        return this.a.j();
    }
}
