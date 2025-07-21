package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class lob implements v3f {
    private final l4f a;
    private final l4f b;

    public lob(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        z5d z5dVar = (z5d) this.a.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        if (((Boolean) pla.c().a(mpa.Z1)).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.z8)).booleanValue()) {
                emptySet = Collections.singleton(new tfc(z5dVar, kkeVar));
                d4f.b(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        d4f.b(emptySet);
        return emptySet;
    }
}
