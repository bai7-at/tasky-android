package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class z3d implements v3f {
    private final l4f a;
    private final l4f b;

    public z3d(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y3d zzb() {
        return new y3d(((gob) this.a).a(), (ScheduledExecutorService) this.b.zzb());
    }
}
