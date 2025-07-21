package defpackage;

/* loaded from: classes3.dex */
public final class arc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public arc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        int i = ((n6c) this.c).a().o.a;
        if (i != 0) {
            return i + (-1) != 0 ? ((mfd) this.b).zzb() : ((mfd) this.a).zzb();
        }
        throw null;
    }
}
