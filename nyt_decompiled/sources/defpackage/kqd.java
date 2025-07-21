package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kqd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public kqd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jqd zzb() {
        Context a = ((gob) this.a).a();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new jqd(a, kkeVar, ((j4f) this.c).zzb(), (q7e) this.d.zzb(), (zuc) this.e.zzb());
    }
}
