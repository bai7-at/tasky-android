package defpackage;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class twb implements v3f {
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
    private final l4f k;
    private final l4f l;
    private final l4f m;
    private final l4f n;
    private final l4f o;

    public twb(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9, l4f l4fVar10, l4f l4fVar11, l4f l4fVar12, l4f l4fVar13, l4f l4fVar14, l4f l4fVar15) {
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
        this.k = l4fVar11;
        this.l = l4fVar12;
        this.m = l4fVar13;
        this.n = l4fVar14;
        this.o = l4fVar15;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        Context a = ((gob) this.a).a();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new swb(a, kkeVar, (Executor) this.c.zzb(), (ScheduledExecutorService) this.d.zzb(), ((s1c) this.e).a(), ((l1c) this.f).a(), (z7e) this.g.zzb(), (d2e) this.h.zzb(), (View) this.i.zzb(), (wlb) this.j.zzb(), (gfa) this.k.zzb(), (zqa) this.l.zzb(), new bra(), (q7e) this.n.zzb(), ((k6c) this.o).a());
    }
}
