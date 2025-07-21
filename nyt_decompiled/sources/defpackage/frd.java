package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class frd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;

    public frd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
        this.g = l4fVar7;
    }

    public static drd a(bfb bfbVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new drd(bfbVar, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        bfb bfbVar = new bfb();
        Context a = ((gob) this.b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new drd(bfbVar, a, scheduledExecutorService, kkeVar, ((kud) this.e).zzb().intValue(), ((lud) this.f).zzb().booleanValue(), ((nud) this.g).zzb().booleanValue());
    }
}
