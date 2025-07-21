package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class l6e implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public l6e(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        l3f a = u3f.a(g4f.a(this.a));
        l3f a2 = u3f.a(g4f.a(this.b));
        Object n6eVar = ((Boolean) pla.c().a(mpa.A8)).booleanValue() ? new n6e((k6e) a.zzb(), (ScheduledExecutorService) this.c.zzb()) : (k6e) a2.zzb();
        d4f.b(n6eVar);
        return n6eVar;
    }
}
