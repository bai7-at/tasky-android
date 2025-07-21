package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class l0d implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public l0d(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        final gfa gfaVar = (gfa) this.a.zzb();
        final Context a = ((gob) this.b).a();
        kke kkeVar = pgb.a;
        d4f.b(kkeVar);
        j64 j = kkeVar.j(new Callable() { // from class: i0d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gfa.this.c().b(a);
            }
        });
        d4f.b(j);
        return j;
    }
}
