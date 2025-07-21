package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class ts9 implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;
    private final l4f h;
    private final l4f i;
    private final l4f j;
    private final l4f k;

    public ts9(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9, l4f l4fVar10, l4f l4fVar11) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
        this.g = l4fVar7;
        this.h = l4fVar8;
        this.i = l4fVar9;
        this.j = l4fVar10;
        this.k = l4fVar11;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        aob aobVar = (aob) this.a.zzb();
        Context a = ((gob) this.b).a();
        gfa gfaVar = (gfa) this.c.zzb();
        t2e t2eVar = (t2e) this.d.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new qq9(aobVar, a, gfaVar, t2eVar, kkeVar, (ScheduledExecutorService) this.f.zzb(), (evc) this.g.zzb(), (d8e) this.h.zzb(), ((sob) this.i).a(), ((yqa) this.j).zzb(), (w1e) this.k.zzb());
    }
}
