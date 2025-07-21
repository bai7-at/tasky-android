package defpackage;

/* loaded from: classes3.dex */
public final class sxd implements gyd {
    private d6c a;

    @Override // defpackage.gyd
    public final /* bridge */ /* synthetic */ j64 a(hyd hydVar, fyd fydVar, Object obj) {
        return c(hydVar, fydVar, null);
    }

    @Override // defpackage.gyd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized d6c zzd() {
        return this.a;
    }

    public final synchronized j64 c(hyd hydVar, fyd fydVar, d6c d6cVar) {
        g2c zzb;
        try {
            if (d6cVar != null) {
                this.a = d6cVar;
            } else {
                this.a = (d6c) fydVar.a(hydVar.b).zzh();
            }
            zzb = this.a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzb.i(zzb.j());
    }
}
