package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class vlc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;
    private final l4f g;
    private final l4f h;
    private final l4f i;

    public vlc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6, l4f l4fVar7, l4f l4fVar8, l4f l4fVar9) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
        this.g = l4fVar7;
        this.h = l4fVar8;
        this.i = l4fVar9;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ulc zzb() {
        hie zzb = ((eob) this.a).zzb();
        s1e a = ((n6c) this.b).a();
        wkc wkcVar = (wkc) this.c.zzb();
        rkc a2 = ((klc) this.d).a();
        gmc gmcVar = (gmc) this.e.zzb();
        omc omcVar = (omc) this.f.zzb();
        Executor executor = (Executor) this.g.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new ulc(zzb, a, wkcVar, a2, gmcVar, omcVar, executor, kkeVar, (lkc) this.i.zzb());
    }
}
