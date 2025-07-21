package defpackage;

/* loaded from: classes3.dex */
public final class t0d implements v3f {
    private final l4f a;

    public t0d(l4f l4fVar) {
        this.a = l4fVar;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((gob) this.a).a().getPackageName();
        d4f.b(packageName);
        return packageName;
    }
}
