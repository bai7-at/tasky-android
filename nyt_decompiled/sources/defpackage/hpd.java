package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class hpd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;
    private final l4f h;
    private final l4f i;

    public hpd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
        this.g = l4fVar7;
        this.h = l4fVar8;
        this.i = l4fVar9;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new fpd(kkeVar, (ScheduledExecutorService) this.b.zzb(), (String) this.c.zzb(), (qgd) this.d.zzb(), (Context) this.e.zzb(), ((n6c) this.f).a(), (igd) this.g.zzb(), (msc) this.h.zzb(), (lxc) this.i.zzb());
    }
}
