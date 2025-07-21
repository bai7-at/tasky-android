package defpackage;

/* loaded from: classes2.dex */
final class x0f implements qbe {
    final /* synthetic */ p6f a;

    x0f(p6f p6fVar) {
        this.a = p6fVar;
    }

    @Override // defpackage.qbe
    public final void zza(int i, long j) {
        tae taeVar;
        taeVar = this.a.h;
        taeVar.d(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.qbe
    public final void zzb(int i, long j, String str) {
        tae taeVar;
        taeVar = this.a.h;
        taeVar.e(i, System.currentTimeMillis() - j, str);
    }
}
