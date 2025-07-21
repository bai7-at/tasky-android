package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class i2d implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public i2d(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h2d zzb() {
        Map c = ((c4f) this.a).c();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new h2d(c, kkeVar, ((bac) this.c).zzb());
    }
}
