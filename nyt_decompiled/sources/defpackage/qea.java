package defpackage;

/* loaded from: classes3.dex */
final class qea implements qbe {
    final /* synthetic */ tae a;

    qea(tae taeVar) {
        this.a = taeVar;
    }

    @Override // defpackage.qbe
    public final void zza(int i, long j) {
        this.a.d(i, System.currentTimeMillis() - j);
    }

    @Override // defpackage.qbe
    public final void zzb(int i, long j, String str) {
        this.a.e(i, System.currentTimeMillis() - j, str);
    }
}
