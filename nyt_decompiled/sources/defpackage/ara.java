package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class ara implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public ara(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        return new zqa(((gob) this.a).a(), (ScheduledExecutorService) this.b.zzb(), new bra(), (q7e) this.d.zzb());
    }
}
