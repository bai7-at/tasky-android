package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.s6;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class vdd implements v3f {
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

    public vdd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9, l4f l4fVar10, l4f l4fVar11, l4f l4fVar12) {
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
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final udd zzb() {
        Context a = ((gob) this.a).a();
        s6 s6Var = (s6) this.b.zzb();
        odd oddVar = (odd) this.c.zzb();
        y6c y6cVar = (y6c) this.d.zzb();
        z7e z7eVar = (z7e) this.e.zzb();
        d8e d8eVar = (d8e) this.f.zzb();
        x0c x0cVar = (x0c) this.g.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new udd(a, s6Var, oddVar, y6cVar, z7eVar, d8eVar, x0cVar, kkeVar, (ScheduledExecutorService) this.i.zzb(), (k9d) this.j.zzb(), (q7e) this.k.zzb(), ((xcd) this.l).zzb());
    }
}
