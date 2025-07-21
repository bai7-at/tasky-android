package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d0c implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public d0c(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new yzb(((m3c) this.a).zzb(), ((c0c) this.b).a(), ((b0c) this.c).a(), (Executor) this.d.zzb());
    }
}
