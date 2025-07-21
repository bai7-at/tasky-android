package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class kxc implements v3f {
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

    public kxc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9, l4f l4fVar10) {
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
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.a.zzb();
        Context a = ((gob) this.b).a();
        WeakReference a2 = ((hob) this.c).a();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new jxc(executor, a, a2, kkeVar, (msc) this.e.zzb(), (ScheduledExecutorService) this.f.zzb(), (jvc) this.g.zzb(), ((sob) this.h).a(), ((xec) this.i).zzb(), (v7e) this.j.zzb());
    }
}
