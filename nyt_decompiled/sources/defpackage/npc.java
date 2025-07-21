package defpackage;

/* loaded from: classes3.dex */
public final class npc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public npc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new mpc(((m1c) this.a).a(), (jkc) this.b.zzb(), ((klc) this.c).a(), (zuc) this.d.zzb());
    }
}
