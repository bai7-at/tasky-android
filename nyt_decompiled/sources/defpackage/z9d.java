package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class z9d implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public z9d(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        yxb yxbVar = (yxb) this.b.zzb();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new y9d(context, yxbVar, kkeVar);
    }
}
