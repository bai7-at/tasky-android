package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class lcc extends ldc implements cwa {
    public lcc(Set set) {
        super(set);
    }

    @Override // defpackage.cwa
    public final synchronized void zzb(final String str, final String str2) {
        G0(new kdc() { // from class: kcc
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((jl) obj).x(str, str2);
            }
        });
    }
}
