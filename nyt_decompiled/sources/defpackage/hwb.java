package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class hwb implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;

    public hwb(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7) {
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
        Context a = ((gob) this.a).a();
        hie zzb = ((eob) this.b).zzb();
        c9d c9dVar = (c9d) this.c.zzb();
        zrc zrcVar = (zrc) this.d.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new gwb(a, zzb, c9dVar, zrcVar, kkeVar, (kke) this.f.zzb(), (ScheduledExecutorService) this.g.zzb());
    }
}
