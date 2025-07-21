package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class bvd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;

    public bvd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
        this.g = l4fVar7;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        kfb kfbVar = (kfb) this.a.zzb();
        boolean booleanValue = ((mud) this.b).zzb().booleanValue();
        boolean booleanValue2 = ((nud) this.c).zzb().booleanValue();
        zeb zebVar = new zeb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new zud(kfbVar, booleanValue, booleanValue2, zebVar, kkeVar, ((jud) this.f).a(), (ScheduledExecutorService) this.g.zzb());
    }
}
