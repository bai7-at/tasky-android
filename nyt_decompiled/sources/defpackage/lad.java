package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class lad implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;
    private final l4f e;
    private final l4f f;

    public lad(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4, l4f l4fVar5, l4f l4fVar6) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
        this.e = l4fVar5;
        this.f = l4fVar6;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kad zzb() {
        return new kad((nzb) this.a.zzb(), (Context) this.b.zzb(), (Executor) this.c.zzb(), (urc) this.d.zzb(), ((n6c) this.e).a(), (gge) this.f.zzb());
    }
}
