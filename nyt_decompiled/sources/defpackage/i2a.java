package defpackage;

/* loaded from: classes3.dex */
final class i2a implements f2a {
    private final b9e a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public i2a(b2a b2aVar) {
        b9e b9eVar = b2aVar.b;
        this.a = b9eVar;
        b9eVar.k(12);
        this.c = b9eVar.E() & 255;
        this.b = b9eVar.E();
    }

    @Override // defpackage.f2a
    public final int zza() {
        return -1;
    }

    @Override // defpackage.f2a
    public final int zzb() {
        return this.b;
    }

    @Override // defpackage.f2a
    public final int zzc() {
        int i = this.c;
        if (i == 8) {
            return this.a.B();
        }
        if (i == 16) {
            return this.a.F();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int B = this.a.B();
        this.e = B;
        return (B & 240) >> 4;
    }
}
