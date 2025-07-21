package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class j1d implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;

    public j1d(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7) {
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
        s1e a2 = ((n6c) this.b).a();
        g0d zzb = ((h0d) this.c).zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new i1d(a, a2, zzb, kkeVar, (ScheduledExecutorService) this.e.zzb(), (t6d) this.f.zzb(), (q7e) this.g.zzb());
    }
}
