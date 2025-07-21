package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class hud implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public hud(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new fud(new o7b(), (ScheduledExecutorService) this.b.zzb(), ((gob) this.c).a());
    }
}
