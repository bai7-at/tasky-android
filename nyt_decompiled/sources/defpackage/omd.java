package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class omd implements v3f {
    private final l4f a;
    private final l4f b;

    public omd(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((gob) this.a).a();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new nmd(a, kkeVar);
    }
}
