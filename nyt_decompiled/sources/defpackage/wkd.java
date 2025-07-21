package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class wkd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public wkd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((gob) this.a).a();
        kfb kfbVar = (kfb) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new ukd(a, kfbVar, scheduledExecutorService, kkeVar);
    }
}
