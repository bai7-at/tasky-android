package defpackage;

/* loaded from: classes3.dex */
public final class ou9 implements gx9 {
    private final su9 a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public ou9(su9 su9Var, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = su9Var;
        this.b = j;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        hx9 hx9Var = new hx9(j, ru9.f(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new ex9(hx9Var, hx9Var);
    }

    public final long g(long j) {
        return this.a.a(j);
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.b;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
