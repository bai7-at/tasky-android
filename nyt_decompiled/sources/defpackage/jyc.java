package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class jyc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;

    public jyc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((gob) this.a).a();
        WeakReference a2 = ((hob) this.b).a();
        myc mycVar = (myc) this.c.zzb();
        zyc zycVar = new zyc();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        return new yyc(a, a2, mycVar, zycVar, kkeVar);
    }
}
