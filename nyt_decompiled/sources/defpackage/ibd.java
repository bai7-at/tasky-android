package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class ibd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;

    public ibd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hbd zzb() {
        nzb nzbVar = (nzb) this.a.zzb();
        kad zzb = ((lad) this.b).zzb();
        y6c y6cVar = (y6c) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new hbd(nzbVar, zzb, y6cVar, scheduledExecutorService, kkeVar, (uuc) this.f.zzb());
    }
}
