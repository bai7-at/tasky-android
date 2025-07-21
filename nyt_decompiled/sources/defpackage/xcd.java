package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class xcd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public xcd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vcd zzb() {
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new vcd(kkeVar, (ScheduledExecutorService) this.b.zzb(), (x0c) this.c.zzb(), (odd) this.d.zzb(), (z7e) this.e.zzb());
    }
}
