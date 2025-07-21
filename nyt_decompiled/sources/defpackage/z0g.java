package defpackage;

/* loaded from: classes3.dex */
final class z0g implements o6g {
    private final o6g a;
    private final v3c b;

    public z0g(o6g o6gVar, v3c v3cVar) {
        this.a = o6gVar;
        this.b = v3cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0g)) {
            return false;
        }
        z0g z0gVar = (z0g) obj;
        return this.a.equals(z0gVar.a) && this.b.equals(z0gVar.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }

    @Override // defpackage.w6g
    public final int zza(int i) {
        return this.a.zza(0);
    }

    @Override // defpackage.w6g
    public final int zzb(int i) {
        return this.a.zzb(i);
    }

    @Override // defpackage.w6g
    public final int zzc() {
        return this.a.zzc();
    }

    @Override // defpackage.w6g
    public final l6a zzd(int i) {
        return this.a.zzd(i);
    }

    @Override // defpackage.w6g
    public final v3c zze() {
        return this.b;
    }
}
