package defpackage;

/* loaded from: classes3.dex */
public final class t3f implements v3f {
    private e4f a;

    public static void a(e4f e4fVar, e4f e4fVar2) {
        t3f t3fVar = (t3f) e4fVar;
        if (t3fVar.a != null) {
            throw new IllegalStateException();
        }
        t3fVar.a = e4fVar2;
    }

    @Override // defpackage.l4f
    public final Object zzb() {
        e4f e4fVar = this.a;
        if (e4fVar != null) {
            return e4fVar.zzb();
        }
        throw new IllegalStateException();
    }
}
