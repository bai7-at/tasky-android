package defpackage;

/* loaded from: classes3.dex */
public class fx9 implements gx9 {
    private final long a;
    private final ex9 b;

    public fx9(long j, long j2) {
        this.a = j;
        hx9 hx9Var = j2 == 0 ? hx9.c : new hx9(0L, j2);
        this.b = new ex9(hx9Var, hx9Var);
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        return this.b;
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.a;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return false;
    }
}
