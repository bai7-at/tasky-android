package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class dbd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public dbd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new cbd((Context) this.a.zzb(), (Executor) this.b.zzb(), (bic) this.c.zzb(), (u0e) this.d.zzb());
    }
}
