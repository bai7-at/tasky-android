package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class gtc implements v3f {
    private final l4f a;
    private final l4f b;

    public gtc(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        Set singleton = ((Boolean) pla.c().a(mpa.O4)).booleanValue() ? Collections.singleton(new tfc(((duc) this.b).zzb(), kkeVar)) : Collections.emptySet();
        d4f.b(singleton);
        return singleton;
    }
}
