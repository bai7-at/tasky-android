package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class o7c implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public o7c(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        l7c zzb = ((n7c) this.a).zzb();
        Set zzb2 = ((j4f) this.b).zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new m7c(zzb, zzb2, kkeVar, (ScheduledExecutorService) this.d.zzb());
    }
}
