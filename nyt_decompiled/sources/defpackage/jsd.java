package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class jsd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public jsd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
    }

    public static hsd a(String str, ima imaVar, kfb kfbVar, ScheduledExecutorService scheduledExecutorService, kke kkeVar) {
        return new hsd(str, imaVar, kfbVar, scheduledExecutorService, kkeVar);
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        String a = ((jud) this.a).a();
        ima imaVar = new ima();
        kfb kfbVar = (kfb) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new hsd(a, imaVar, kfbVar, scheduledExecutorService, kkeVar);
    }
}
